package org.example;

public class Menu {

    private int price;
    private String name;

    public Menu(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "가격=" + price +
                ", 이름='" + name + '\'' +
                '}';
    }
}
