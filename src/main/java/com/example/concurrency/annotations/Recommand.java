package com.example.concurrency.annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//推荐写法
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)//注解作用的范围
public @interface Recommand {
}
