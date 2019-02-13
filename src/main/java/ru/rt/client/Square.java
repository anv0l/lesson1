package ru.rt.client;

public class Square {
    private int a = 2;

    public Square() {
    }

    public Square(int a) {
        this.a = a;
    }

    public int area() {
        return this.a * this.a;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
