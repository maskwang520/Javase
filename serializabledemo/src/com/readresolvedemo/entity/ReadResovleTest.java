package com.readresolvedemo.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;
/**
 * ���õ�����Person,ֱ�����л��ǲ��еġ�
 * ͨ��readResolve�������Ϳ��Է��ص�����Person.
 * ��������ʵ��Seriable�ӿڣ�����Externalizable�ӿڣ����ǵ���readResolve����
 * ���ض������û��д�����ٵ���writeObject()
 * @author maskwang
 *
 */
public class ReadResovleTest {
	@Test
	public void readResolve() throws Throwable, IOException{
		File file=new File("p.dat");
		//ObjectOutputStream�ǰ�װ��
		ObjectOutputStream outStream=new ObjectOutputStream(new FileOutputStream(file));
		outStream.writeObject(Person.getInstance());
		ObjectInputStream inStream=new ObjectInputStream(new FileInputStream(file));
		Object p1= inStream.readObject();
		System.out.println(p1==Person.getInstance());
	}
}
