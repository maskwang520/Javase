package com.serilizeabledemo.transiententity;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.serilizeabledemo.entity.Gender;

public class Person implements Serializable {
	transient int age;
	String name;
	Gender gender;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Person(int age, String name, Gender gender) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}
	//��ʱ����ͨ������������������age�������л��ͷ�����
	//˳�����ȵ���Ĭ�ϵ����л���ʽ���ٰ�ageд��ȥ��
	//�����ӷ���ǩ��һ����
	private void writeObject(ObjectOutputStream out) throws IOException {  
        out.defaultWriteObject();  
        out.writeInt(age);  
    }  
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {  
	        in.defaultReadObject();  
	        age = in.readInt();  
	    }  
	
}