package lesson.l18;

import java.io.FileWriter;
import java.io.IOException;

public class Test11 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("d:/c.txt");
            fw.write(97);
            fw.write("b");
            fw.write('c');

            fw.write("dfg".toCharArray());

            char[] chars = {'h','i','j','k'};
            fw.write(chars,0,2);

            fw.flush();

            fw =  new FileWriter("d:/c.txt",true);
            fw.write('j');
            fw.write('k');
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
