package com.moneylion.userservice.service;

import java.util.HashMap;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.moneylion.userservice.model.UserFeature;
import com.moneylion.userservice.model.UserFeatureMap;
import com.moneylion.userservice.repository.IUserFeatureRepo;

@Service
public class UserFeatureServiceImpl {

	@Autowired
	IUserFeatureRepo userFeatureRepo;

	public HttpStatus updateFeature(UserFeatureMap userFeatureMap) {

		UserFeature userFeature = null;
		HashMap<String, Boolean> featureAccessMap = null;
		Optional<UserFeature> userFeatureFromDb = userFeatureRepo.findById(userFeatureMap.getEmail());
		if (!userFeatureFromDb.isPresent()) {
			userFeature = new UserFeature();
			userFeature.setEmail(userFeatureMap.getEmail());
			featureAccessMap = new HashMap<>();
		} else {
			userFeature = userFeatureFromDb.get();
			featureAccessMap = userFeature.getFeatureAccessMap();
			if (isSameAccess(featureAccessMap, userFeatureMap.getFeatureName(), userFeatureMap.getEnable())) {
				return HttpStatus.NOT_MODIFIED;
			}
		}

		featureAccessMap.put(userFeatureMap.getFeatureName(), userFeatureMap.getEnable());
		userFeature.setFeatureAccessMap(featureAccessMap);
		UserFeature res = userFeatureRepo.save(userFeature);

		if (null != res)
			return HttpStatus.OK;

		return HttpStatus.NOT_MODIFIED;
	}

	private boolean isSameAccess(HashMap<String, Boolean> featureAccessMap, String featureName, boolean enable) {
		return featureAccessMap.containsKey(featureName) && featureAccessMap.get(featureName) == enable;
	}

	public String getFeatureStatus(String email, String featureName) {
		Optional<UserFeature> userFeatureFromDb = userFeatureRepo.findById(email);
		JSONObject response = new JSONObject();
		boolean hasAccess = false;

		if (userFeatureFromDb.isPresent()) {
			HashMap<String, Boolean> userFeatureMap = userFeatureFromDb.get().getFeatureAccessMap();
			hasAccess = userFeatureMap.get(featureName.toUpperCase()) != null
					? userFeatureMap.get(featureName.toUpperCase())
					: false;
		}
		response.put("canAccess", hasAccess);
		return response.toString();
	}

	public Object getAllUserAccessMap() {
		// TODO Auto-generated method stub
		return userFeatureRepo.findAll();
	}

}
