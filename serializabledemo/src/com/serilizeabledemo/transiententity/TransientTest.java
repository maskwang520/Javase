package com.serilizeabledemo.transiententity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

import com.serilizeabledemo.entity.Gender;
/**
 * ���ֶ�Ϊtransientʱ���ǲ��ᱻ���л��ġ�
 * ��д��writeObject()��readObject��Ϳ���
 * @author maskwang
 *
 */

public class TransientTest {
	@Test
	public void transientest() throws Throwable, IOException {
		File file = new File("p1.dat");
		Person p = new Person(10, "maskwang", Gender.Male);
		// ObjectOutputStream�ǰ�װ��
		ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(file));
		outStream.writeObject(p);
		ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(file));
		Object p1 = inStream.readObject();
		System.out.println(p1);//��ʱageΪ0��Ĭ�ϵġ�˵����û�����л�
	}
}