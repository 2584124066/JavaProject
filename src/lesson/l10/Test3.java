package lesson.l10;

public class Test3 {
    private String name = "凤姐";

    public void eat() {
        class Chopsticks {
            private int length;

            public int getLength() {
                return length;
            }

            public void setLength(int length) {
                this.length = length;
            }

            public void use() {
                //使用外部类变量
                System.out.println(name + "在使用长为" + length + "的筷子吃饭");
            }
        }

        Chopsticks c = new Chopsticks();
        c.setLength(50);
        c.use();
    }
}
