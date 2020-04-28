package com.moneylion.userservice.model;

import java.util.HashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserFeature {

	@Column
	@Id
	String email;
	@Column
	HashMap<String, Boolean> featureAccessMap;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public HashMap<String, Boolean> getFeatureAccessMap() {
		return featureAccessMap;
	}

	public void setFeatureAccessMap(HashMap<String, Boolean> featureAccessMap) {
		this.featureAccessMap = featureAccessMap;
	}

}
