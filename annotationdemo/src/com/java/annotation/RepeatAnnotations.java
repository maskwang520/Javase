package com.java.annotation;

public @interface RepeatAnnotations {
	 RepeatAnnotation[] value();//�ظ�ע��
}
 class RepeatAnnotationUseNewVersion {
    @RepeatAnnotation(role="Admin")
    @RepeatAnnotation(role="Manager")//����ʹ���ظ�ע��
    public void doSomeThing(){ }
}