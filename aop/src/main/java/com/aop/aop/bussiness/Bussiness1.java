package com.aop.aop.bussiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aop.aop.data.Dao1;

@Service
public class Bussiness1 {

	@Autowired
	Dao1 dao1;
	
	public String calculateSomething() {
		return dao1.retrieveSomething();
	}
	
}
