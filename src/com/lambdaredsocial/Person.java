
package com.lambdaredsocial;

import java.util.Date;

public class Person {

    public Person(String name, int age, Date birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }
    
    
    
    public enum Sex {
        MALE,FEMALE
    }
    String name;
    int age;
    Date birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", birthday=" + birthday + ", gender=" + gender + ", emailAddress=" + emailAddress + '}';
    }
    
    
    
}
