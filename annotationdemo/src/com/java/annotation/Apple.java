package com.java.annotation;

import java.lang.reflect.Field;

public class Apple {
	@FruitName("Apple")
    private String appleName;
    @FruitColor(fruitColor = FruitColor.Color.RED)
    private String appleColor;
    @FruitProvider(id = 1, name = "陕西红富士集团", address = "陕西红富士大厦")
    private String appleProvider;
    public String getAppleProvider() {
        return appleProvider;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public void displayName(){
        System.out.println(getAppleName());
    }

}
class AnnotationParse {
	public static void main(String []args){
		 //打印apple.getAppleColor()为null,注解对程序本身没影响，只是它解析之后，就可以利用了
		 //这就是非标记注解为啥都要解析的程序。
		 Apple apple=new Apple();
		 System.out.println(apple.getAppleColor());
		 Field[] fields = Apple.class.getDeclaredFields();
	        for (Field field : fields) {
	            //System.out.println(field.getName().toString());
	            if (field.isAnnotationPresent(FruitName.class)){
	                FruitName fruitName = field.getAnnotation(FruitName.class);
	                System.out.println("水果的名称：" + fruitName.value());
	            }else if (field.isAnnotationPresent(FruitColor.class)){
	                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
	                System.out.println("水果的颜色："+fruitColor.fruitColor());
	            }else if (field.isAnnotationPresent(FruitProvider.class)){
	                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
	                System.out.println("水果供应商编号:" + fruitProvider.id() + " 名称:" + fruitProvider.name() + " 地址:" + fruitProvider.address());
	            }
	        }
	}
}
