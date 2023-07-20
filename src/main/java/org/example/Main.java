package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        // 메뉴생성 - 아메리카노, 카페라떼
        List<Menu> menus = new ArrayList<>();
        menus.add(new Menu(4500, "아메리카노"));
        menus.add(new Menu(4500, "카페라떼"));

        //손님 결제 객체생성
        Payment payment = new Payment(10000); //이것도 입력받아야하는지

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("안녕하세요 셔타박스입니다.\n " +
                "주문은 사이즈 커피명 개수 핫/아이스로 띄어쓰기로 주문해주세요\n" +
                "(예시 : Tall 아메리카노 2 핫)");
        System.out.println("메뉴는 " + menus.toString() + " 입니다.");

        String customerOrder;

        while ((customerOrder = reader.readLine()) != null) {
            String []customerOrders = customerOrder.split(" ");

            Orders orders = new Orders(customerOrders[0], Integer.parseInt(customerOrders[2]));

            int totalPrice = orders.calTotalPrice(orders.getSize(), orders.getCount());

            if (totalPrice <= 0) {
                System.out.println("주문이 잘못되었습니다");
                return;
            }
            if (payment.getAmount() <= 3000) {
                System.out.println("충전금액이 3000원 이하입니다. 충전해주세요");
                return;
            }

            System.out.println("고객님 주문하신 "+ customerOrders[1] + " " + customerOrders[2] + "잔 나왔습니다 \n" +
                    "남은 금액은" +  (payment.getAmount() - totalPrice) + "입니다.");
        }
    }
}