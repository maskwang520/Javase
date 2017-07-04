package com.java.enumdemo;
/**
 * ÿ��ö��ʵ���������Զ����Լ������ԣ����һ�������д�����ķ�����
 * @author maskwang
 *
 */
public enum EnumDemo2 {
	MONDAY(1, "����һ", "���ֲ���״̬"){
        @Override
        public EnumDemo2 getNext() {
            return TUESDAY;
        }
    },
    TUESDAY(2, "���ڶ�", "���ɷ���"){
        @Override
        public EnumDemo2 getNext() {
            return WEDNESDAY;
        }
    },
    WEDNESDAY(3, "������", "�о��������ڹ�ȥ��"){
        @Override
        public EnumDemo2 getNext() {
            return THURSDAY;
        }
    },
    THURSDAY(4, "������", "�ڴ���������"){
        @Override
        public EnumDemo2 getNext() {
            return FRIDAY;
        }
    },
    FRIDAY(5, "������", "�о�������"){
        @Override
        public EnumDemo2 getNext() {
            return SATURDAY;
        }
    },
    SATURDAY(6, "������", "�о��ǳ���"){
        @Override
        public EnumDemo2 getNext() {
            return SUNDAY;
        }
    },
    SUNDAY(7, "������", "�о���ĩ��û����������"){
        @Override
        public EnumDemo2 getNext() {
            return MONDAY;
        }
    };
	private int index;
    private String name;
    private String value;
    public abstract EnumDemo2 getNext();
    EnumDemo2(int index, String name, String value) {
        this.index = index;
        this.name = name;
        this.value = value;
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
}
