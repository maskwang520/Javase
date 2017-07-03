package com.java.annotation;

public @interface RepeatAnnotations {
	 RepeatAnnotation[] value();//重复注解
}
 class RepeatAnnotationUseNewVersion {
    @RepeatAnnotation(role="Admin")
    @RepeatAnnotation(role="Manager")//连续使用重复注解
    public void doSomeThing(){ }
}