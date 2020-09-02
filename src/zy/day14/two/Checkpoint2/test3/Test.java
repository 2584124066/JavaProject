package zy.day14.two.Checkpoint2.test3;

public class Test {
    public static void login(String name, String pwd) throws LoginException {
        if (!"admin".equals(name)) {
            throw new LoginException("用户名不存在");
        }
        if (!"admin".equals(pwd)) {
            throw new LoginException("密码错误");
        }
        System.out.println("欢迎" + name);
    }

    public static void main(String[] args) {
        try {
//            login("12345", "12345");
//            login("admin", "12345");
            login("admin", "admin");
        } catch (LoginException e) {
            e.printStackTrace();
        }

    }
}
