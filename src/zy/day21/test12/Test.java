package zy.day21.test12;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        Class bdClass = BookDemo.class;
        Method method = bdClass.getMethod("method");
        if (method.isAnnotationPresent(Book.class)) {
            Book book = method.getAnnotation(Book.class);
            System.out.println(book.value());
            System.out.println(book.price());
            for (String author : book.authors()) {
                System.out.println(author);
            }
        }
    }
}
