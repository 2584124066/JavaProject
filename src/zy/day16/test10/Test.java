package zy.day16.test10;

public class Test {
    public static Integer flag = 1;

    public static void main(String[] args) {
        Person person = new Person();
        new Thread(() -> {
            synchronized (person) {
                int i = 1;
                while (true) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (flag != 1) {
                        try {
                            person.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (i % 2 == 1) {
                        person.setName(i + "");
                        person.setSex('男');
                    } else {
                        person.setName(i + "");
                        person.setSex('女');
                    }
                    ++i;
                    flag = 2;
                    person.notify();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                synchronized (person) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (flag != 2) {
                        try {
                            person.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if ('男' != person.getSex() && '女' != person.getSex()) {
                        System.out.println("不允许出现人妖");
                        System.exit(1);
                    }
                    System.out.println(person.getName() + "\t" + person.getSex());
                    flag = 1;
                    person.notify();
                }
            }
        }).start();
    }
}
