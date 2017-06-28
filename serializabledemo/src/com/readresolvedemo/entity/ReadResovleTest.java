package com.readresolvedemo.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;
/**
 * 想获得单例的Person,直接序列化是不行的。
 * 通过readResolve方法，就可以返回单例的Person.
 * 无论是是实现Seriable接口，还是Externalizable接口，都是调用readResolve方法
 * 返回对象。如果没重写，就再调用writeObject()
 * @author maskwang
 *
 */
public class ReadResovleTest {
	@Test
	public void readResolve() throws Throwable, IOException{
		File file=new File("p.dat");
		//ObjectOutputStream是包装流
		ObjectOutputStream outStream=new ObjectOutputStream(new FileOutputStream(file));
		outStream.writeObject(Person.getInstance());
		ObjectInputStream inStream=new ObjectInputStream(new FileInputStream(file));
		Object p1= inStream.readObject();
		System.out.println(p1==Person.getInstance());
	}
}
