package zy.day18.Checkpoint2;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("zy/zy18/Checkpoint2/score.txt");
        Properties p = new Properties();
        p.load(fr);
        FileWriter fw = new FileWriter("zy/zy18/Checkpoint2/score.txt");
        Set<String> keys = p.stringPropertyNames();
        keys.stream().forEach(key -> {
            if ("lisi".equals(key)) {
                p.setProperty(key, "" + 100);
            }
        });
        p.store(fw, null);
        fw.flush();
        fw.close();
        fr.close();
    }
}
