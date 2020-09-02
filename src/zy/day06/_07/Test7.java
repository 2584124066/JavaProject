package zy.day06._07;

import java.util.ArrayList;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请录入第" + i + "本书的名称");
            String title = scanner.next();
            System.out.println("请录入第" + i + "本书的ISBN编码");
            String isbn = scanner.next();
            System.out.println("请录入第" + i + "本书的价格");
            double price = scanner.nextDouble();
            Book bi = new Book(title, isbn, price);
            list.add(bi);
        }

        for (int i = 0; i < list.size(); i++) {
            Book book = list.get(i);
            System.out.println(book.getTitle() + " , " + book.getIsbn() + " , " + book.getPrice());
        }
    }
}
