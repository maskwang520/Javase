package com.java.enumdemo;
/**
 * 每个枚举实例不仅可以定义自己的属性，而且还可以重写公共的方法。
 * @author maskwang
 *
 */
public enum EnumDemo2 {
	MONDAY(1, "星期一", "各种不在状态"){
        @Override
        public EnumDemo2 getNext() {
            return TUESDAY;
        }
    },
    TUESDAY(2, "星期二", "依旧犯困"){
        @Override
        public EnumDemo2 getNext() {
            return WEDNESDAY;
        }
    },
    WEDNESDAY(3, "星期三", "感觉半周终于过去了"){
        @Override
        public EnumDemo2 getNext() {
            return THURSDAY;
        }
    },
    THURSDAY(4, "星期四", "期待这星期五"){
        @Override
        public EnumDemo2 getNext() {
            return FRIDAY;
        }
    },
    FRIDAY(5, "星期五", "感觉还不错"){
        @Override
        public EnumDemo2 getNext() {
            return SATURDAY;
        }
    },
    SATURDAY(6, "星期六", "感觉非常好"){
        @Override
        public EnumDemo2 getNext() {
            return SUNDAY;
        }
    },
    SUNDAY(7, "星期日", "感觉周末还没过够。。。"){
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
