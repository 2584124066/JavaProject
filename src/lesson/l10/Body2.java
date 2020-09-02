package lesson.l10;

public class Body2 {
    private int num = 10;

    class Heart {
        private int num = 20;

        public void jump() {
            int num = 30;
            System.out.println("心脏在跳动 " + Body2.this.num);//10
            System.out.println("心脏在跳动 " + this.num); //20
            System.out.println("心脏在跳动 " + num); //30
        }
    }
}
