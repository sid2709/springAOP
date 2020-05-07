package com.aop.aop.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//where to use...in class or methods
@Target(ElementType.METHOD)
//when to use...runtime/after excution/before Exceution
@Retention(RetentionPolicy.RUNTIME)
public @interface TrackTime {

}
