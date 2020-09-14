package com.gumeik.springbootdemo.step2.bean;

public class Info {
    private String lover;//爱好
    private String sex;//性别

    public String getLover() {
        return lover;
    }

    public void setLover(String lover) {
        this.lover = lover;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Info{" +
                "lover='" + lover + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
