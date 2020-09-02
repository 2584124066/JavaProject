package lesson.l14;

public class TestException {
    private static String[] names = {"bill","hill","jill"};

    public static void main(String[] args) {
        try {
            checkUsername("bill");
            System.out.println("注册成功");
        }catch (RegisterException e){
            System.out.println(e.getMessage());
        }
    }

    private static boolean checkUsername(String username) throws RegisterException {
        for (String name:names){
            if (name.equals(username)){
                throw new RegisterException("亲"+name+"已经被注册了！");
            }
        }
        return true;
    }
}
