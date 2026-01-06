package com.fitness.activityservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fitness.activityservice.modals.Activity;

@Repository
public interface ActivityRepository extends MongoRepository<Activity, String> {

}
