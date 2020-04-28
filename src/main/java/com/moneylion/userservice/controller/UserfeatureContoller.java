package com.moneylion.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.moneylion.userservice.model.UserFeatureMap;
import com.moneylion.userservice.service.UserFeatureServiceImpl;

@RestController
@RequestMapping("/feature")
public class UserfeatureContoller {

	@Autowired
	private UserFeatureServiceImpl userFeatureService;

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody ResponseEntity<String> getUserFeature(@RequestParam("email") String email,
			@RequestParam("featureName") String featureName) {
		return new ResponseEntity<>(userFeatureService.getFeatureStatus(email.toUpperCase(), featureName.toUpperCase()), HttpStatus.OK);
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody ResponseEntity<String> addBot(@RequestBody UserFeatureMap userFeature) {
		return new ResponseEntity<>("", userFeatureService.updateFeature(userFeature));
	}
	
	@GetMapping(value="/all",produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody ResponseEntity<Object> getUserFeature() {
		return new ResponseEntity<>(userFeatureService.getAllUserAccessMap(), HttpStatus.OK);
	}

}
