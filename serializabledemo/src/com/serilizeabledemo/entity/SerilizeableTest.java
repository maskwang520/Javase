package com.serilizeabledemo.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.junit.Assert;
import org.junit.Test;
/**
 * Ĭ�ϵ����л��ͷ����л�����ΪString,Array,Enum��Serilizeableʱ���������л���������
 * ���л��������������͵�ȻҲ�ǿ������л���
 * @author maskwang
 *
 */
public class SerilizeableTest {
	@Test
	public void testSerializable() throws FileNotFoundException, IOException, ClassNotFoundException{
		File file=new File("p.dat");
		Person p=new Person("maskwang",10,Gender.Male);
		//ObjectOutputStream�ǰ�װ��
		ObjectOutputStream outStream=new ObjectOutputStream(new FileOutputStream(file));
		outStream.writeObject(p);
		ObjectInputStream inStream=new ObjectInputStream(new FileInputStream(file));
		Object p1= inStream.readObject();
		System.out.println(p1);
		//Assert.assertEquals(p1.getName(),"maskwang");
	}
}