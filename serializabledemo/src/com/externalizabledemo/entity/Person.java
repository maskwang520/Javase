package com.externalizabledemo.entity;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.serilizeabledemo.entity.Gender;
/**
 * JDK中提供了另一个序列化接口--Externalizable，
 * 使用该接口之后，之前基于Serializable接口的序列化机制就将失效
 * @author maskwang
 *
 */
public class Person implements Externalizable {
	private String name;
	private int age;
	Gender gender;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Person(String name, int age, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
    
	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	//所以在这里下面两个方法没用的
	private void writeObject(ObjectOutputStream out) throws IOException {  
        out.defaultWriteObject();  
        out.writeInt(age);  
    }  
 
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {  
        in.defaultReadObject();  
        age = in.readInt();  
    }  

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(age);
		out.writeObject(name);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		age=in.readInt();
		name=(String) in.readObject();
		
	}

}
