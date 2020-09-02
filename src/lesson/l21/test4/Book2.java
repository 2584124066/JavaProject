package lesson.l21.test4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
public @interface Book2 {
    String value();

    double price() default 100;

    String[] authors();
}
