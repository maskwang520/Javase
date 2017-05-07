package com.java.reference;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Date:     2017年5月5日 下午11:16:18
 * @author   maskwang 
 * @since    JDK 1.6
 */
public class Singeleton {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Single sin1=Single.getSingle();
        Single sin2=Single.getSingle();
        System.out.println(sin1==sin2);
        Single2 sin3=Single2.SIN;
        Single2 sin4=Single2.SIN;
        System.out.println(sin3==sin4);
        Single3 sin5=Single3.single;
        Single3 sin6=Single3.single;
        System.out.println(sin5==sin6);
        //通过反射可以控制不是单例
        Class<Single> clazz=Single.class;
        System.out.println(Single.count);
        Constructor<Single> m=clazz.getDeclaredConstructor();
        m.setAccessible(true);
        Single s=m.newInstance();
        System.out.println(Single.count);
	}

}
class Single{
	public static int count=0;
	private static final  Single SIN=new Single();
	private Single()  {
		count++;
		System.out.println("sb");
		if(count>1){
			try {
				throw new MyException("myexption");
			} catch (MyException e) {//在这里控制单例
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
	}
	public static Single getSingle(){
		return SIN;
	}
	
}
class Single2{
	//加载在加载类的时候，可能加载太早啦，通过域属性控制单例
	public static final  Single2  SIN=new Single2();
	private Single2(){}
	
}
enum Single3{ //最好的单例
 single;	
}

class MyException extends Exception{//自定义异常
	 MyException(){}
	 MyException(String msg){
		 super(msg);
	 }
}