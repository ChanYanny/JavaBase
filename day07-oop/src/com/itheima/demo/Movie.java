package com.itheima.demo;

/**
 * @author ChanYanny
 * @date 2025/02/21 11:16
 **/
public class Movie {
    private int id;
    private String name;
    private double price;
    private String director;
    private double score;

    public Movie() {
    }

    public Movie(int id, String name, double price, String director, double score) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.director = director;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

