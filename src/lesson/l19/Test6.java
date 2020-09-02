package lesson.l19;

import java.io.*;

public class Test6 {
    public static void main(String[] args) {
            Worker worker = new Worker("诸葛亮", "茅庐", 20);
        try {
            //序列化  对象-》》流
            FileOutputStream fos = new FileOutputStream("d:/worker.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(worker);
            oos.flush();
            oos.close();

            //反序列化  流-》》对象
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/worker.txt"));
            Object object = ois.readObject();
            Worker worker1 = (Worker)object;
            System.out.println(worker1.getName()+"\t"+worker1.getAddress()+"\t"+worker1.getAge());
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
