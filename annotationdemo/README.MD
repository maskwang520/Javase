### annotationdemo 
### 注解讲注解的定义和解析，以及jdk1.8注解新的特性
### 1. 使用元注解定义注解，例如@Target(ElementType.FIELD)
### 2. 定义注解属性String role();
### 3. 解析注解
``` java
Field[] fields = Apple.class.getDeclaredFields();
 if (field.isAnnotationPresent(FruitName.class)){
	                FruitName fruitName = field.getAnnotation(FruitName.class);
	                System.out.println("水果的名称：" + fruitName.value());
	            }
```
