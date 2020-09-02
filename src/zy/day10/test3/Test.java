package zy.day10.test3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            list.add(new User(i));
        }

        System.out.print("未分组:\n[");
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (i != list.size() - 1) {
                System.out.print(u.getId() + "-" + u.getType() + ", ");
            } else {
                System.out.print(u.getId() + "-" + u.getType() + "]");
            }
        }

        Receptionist r1 = new Receptionist();
        Receptionist r2 = new Receptionist();
        Receptionist r3 = new Receptionist();

        r1.setFilter((User user) -> {
            if (user.getId() >= 10 && user.getId() <= 19) {
                user.setType("v1");
            }
        });
        r2.setFilter((User user) -> {
            if (user.getId() >= 20 && user.getId() <= 29) {
                user.setType("v2");
            }
        });

        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            r1.setUserType(u);
            r2.setUserType(u);
            r3.setUserType(u);
        }

        System.out.print("已分组：\n");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getId() + "-" + list.get(i).getType() + " ");
            if (i > 0 && (i + 1) % 9 == 0) {
                System.out.println();
            }
        }

    }
}
