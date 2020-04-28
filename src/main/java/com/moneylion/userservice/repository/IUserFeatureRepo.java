package com.moneylion.userservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.moneylion.userservice.model.UserFeature;

public interface IUserFeatureRepo extends CrudRepository<UserFeature, String> {

}
