package lesson.l21.test4;

public @interface Book {
    String value();

    double price() default 100;

    String[] authors();
}
