package lesson.l21.test5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Computer {
    //计算机名
    String name();
    //计算机价格
     double price() default 2000;
     //厂商
     String[] factories();
}
