package com.externalizabledemo.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

import com.serilizeabledemo.entity.Gender;
/**
 * 使用无参构造器，再填充属性
 * @author maskwang
 *
 */

public class ExternalizableTest {
	@Test
	public void testSerializable() throws FileNotFoundException, IOException, ClassNotFoundException{
		File file=new File("p.dat");
		Person p=new Person("maskwang",10,Gender.Male);
		//ObjectOutputStream是包装流
		ObjectOutputStream outStream=new ObjectOutputStream(new FileOutputStream(file));
		outStream.writeObject(p);
		ObjectInputStream inStream=new ObjectInputStream(new FileInputStream(file));
		Object p1= inStream.readObject();
		System.out.println(p1);
		//Assert.assertEquals(p1.getName(),"maskwang");
	}
}
