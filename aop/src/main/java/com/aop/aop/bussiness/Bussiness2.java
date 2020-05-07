package com.aop.aop.bussiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aop.aop.data.Dao2;

@Service
public class Bussiness2 {

	@Autowired
	Dao2 dao2;
	
	public String calculateSomething() {
		return dao2.retrieveSomething();
	}
	
}
