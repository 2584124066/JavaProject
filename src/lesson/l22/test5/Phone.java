package lesson.l22.test5;

public class Phone extends DianZiApater {
    @Override
    public void music() {
        System.out.println("听音乐");
    }

    @Override
    public void call() {
        System.out.println("打电话");
    }

    @Override
    public void sendMsg() {
        System.out.println("发短信");
    }

    @Override
    public void takePhoto() {
        System.out.println("拍照片");
    }
}
