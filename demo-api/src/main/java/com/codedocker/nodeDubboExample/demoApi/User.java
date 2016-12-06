package com.codedocker.nodeDubboExample.demoApi;

import java.io.Serializable;

/**
 * Created by marshal on 16/12/6.
 */
public class User implements Serializable {
    private String name;
    private Integer age;

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
