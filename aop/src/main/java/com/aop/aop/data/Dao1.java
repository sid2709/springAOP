package com.aop.aop.data;

import org.springframework.stereotype.Repository;

import com.aop.aop.aspect.TrackTime;

@Repository
public class Dao1 {

	@TrackTime
	public String retrieveSomething() {
		return "Dao1";
	}
	
}
