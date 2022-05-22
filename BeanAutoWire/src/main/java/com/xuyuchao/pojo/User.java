package com.xuyuchao.pojo;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-25-15:34
 * @Description:
 */
public class User {
    private Cat cat;
    private Dog dog;

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }
}
