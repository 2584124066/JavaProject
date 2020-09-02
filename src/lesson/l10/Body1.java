package lesson.l10;

public class Body1 {
    public Boolean live = true;

    public void walk() {
        System.out.println("散步");
    }

    class Heart {
        public void jump() {
            if (live) {
                System.out.println("心脏在跳动");
            } else {
                System.out.println("心脏不跳了");
            }
        }
    }
}
