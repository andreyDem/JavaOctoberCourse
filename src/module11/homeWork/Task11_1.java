package module11.homeWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public class Task11_1 {
    public static void main(String[] args) {
        File file = new File("D:\\JAVA\\TestIO\\TestInput.txt");

        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static String replacer(Map<String, String> map){
        for (Map.Entry<String, String> entry : map.entrySet()) {

        }
        return null;
    }
}
