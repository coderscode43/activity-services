package com.fitness.activityservice.dto;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Field;

import com.fitness.activityservice.modals.ActivityType;

import lombok.Data;

@Data
public class ActivityRequest {

	private String userId;
	private ActivityType type;
	private Integer duration;
	private Integer caloriesBurned;
	private LocalDateTime startTime;
	@Field("metrics")
	private Map<String, Object> additionalMetrics;
}
