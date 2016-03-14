package com.firstapp.zappts.firstapp.activity;

/**
 * Created by zappts on 3/14/16.
 */
public class Person {
    String name;
    String age;
    int photoId;

    Person(String name, String age, int photoId) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String ag) {
        this.age = ag;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photo) {
        this.photoId = photo;
    }
}