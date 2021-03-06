package com.readresolvedemo.entity;

import java.io.ObjectStreamException;
import java.io.Serializable;

import com.serilizeabledemo.entity.Gender;
/**
 * 为了能在序列化过程仍能保持单例的特性，在Person类中添加一个readResolve()方法，
 * 在该方法中直接返回Person的单例对象
 * @author maskwang
 *
 */
public class Person implements Serializable {
	private static class InstanceHolder {
		private static final Person instatnce = new Person("John", 31, Gender.Male);
	}

	public static Person getInstance() {
		return InstanceHolder.instatnce;
	}

	private String name;

	private int age;

	private Gender gender;

	private Person() {
		System.out.println("none-arg constructor");
	}

	private Person(String name, Integer age, Gender gender) {
		System.out.println("arg constructor");
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	 private Object readResolve() throws ObjectStreamException {  
	        return InstanceHolder.instatnce;  
	    }  
}
