package com.java.enumdemo;
/**
 * ö�����Զ�������
 * @author maskwang
 *
 */
public enum EnumDemo1 {
	MONDAY(1, "����һ", "����һ���ֲ���״̬"), TUESDAY(2, "���ڶ�", "���ڶ����ɷ���"), WEDNESDAY(3, "������", "�������о��������ڹ�ȥ��"), THURSDAY(4, "������",
			"�������ڴ���������"), FRIDAY(5, "������",
					"������о�������"), SATURDAY(6, "������", "�������о��ǳ���"), SUNDAY(7, "������", "�����ոо���ĩ��û����������");
	EnumDemo1(int index, String name, String value) {
		this.index = index;
		this.name = name;
		this.value = value;
	}

	private int index;
	private String name;
	private String value;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	public static void main(String []args){
		EnumDemo1 friday=EnumDemo1.FRIDAY;
		System.out.println(friday.getIndex()+":"+friday.getName()+":"+friday.getValue());
		
	}

}