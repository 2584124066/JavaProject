package lesson.l14;

import static java.util.Objects.requireNonNull;

public class Test7 {
    public static void main(String[] args) {
        requireNonNull(null);

    }
    public static <E> void requireNonNull(E obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
    }
}
