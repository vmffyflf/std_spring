package com.example.stdspring.dto;

public class MemberDto {

    private String name;
    private String sex;
    private String age;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MemberDto{" + "name='" + name + '\'' + ", sex'"+ sex + '\''+ ", age'" + age + '\'' + '}';
    }


}
