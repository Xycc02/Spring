package com.xuyuchao.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-24-18:52
 * @Description:
 */
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbys;
    private Map<String,String> card;
    private Set<String> games;
    private String wife;
    private Properties info;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public String[] getBooks() {
        return books;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public String getWife() {
        return wife;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public Properties getInfo() {
        return info;
    }

    public void show(){
        System.out.println("name="+ name
                + ",address="+ address.getAddress()
                + ",books="
        );
        for (String book:books){
            System.out.print("<<"+book+">>\t");
        }
        System.out.println("\n爱好:"+hobbys);

        System.out.println("card:"+card);

        System.out.println("games:"+games);

        System.out.println("wife:"+wife);

        System.out.println("info:"+info);

    }
}
