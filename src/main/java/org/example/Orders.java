package org.example;

public class Orders {

    private String size;

    private int count;
    private int totalPrice;

    public Orders(String size, int count) {
        this.size = size;
        this.count = count;
    }

    public String getSize() {
        return size;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public int calTotalPrice(String size,int count) { //이건 메인으로 빼야하는지 - 엔티티느낌인가요 너무..
        if ("Tall".toUpperCase().equals(size.toUpperCase())) {
            return 4500 * count;
        }
        else if ("Grande".toUpperCase().equals(size.toUpperCase())) {
            return 5000 * count;
        } else if ("Venti".toUpperCase().equals(size.toUpperCase())) {
            return 5500 * count;
        }
        return 0;
    }
}
