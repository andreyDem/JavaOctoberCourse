package module11.practice;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class PracticeTask2 {
    public static void main(String[] args) throws IOException {

//        try (BufferedReader reader = new BufferedReader(
//                new InputStreamReader(
//                        new FileInputStream("C:\\Users\\slayer\\Desktop\\Google.htm"), StandardCharsets.UTF_8))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            // log error
//        }
        URL url = null;
        try {
            url = new URL("http://google.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(url.openStream()));
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("C://Users//slayer//Desktop//Google.txt"));
        String line;
        while ((line = bufferedReader.readLine())!=null){
            bufferedWriter.write(line.replaceAll("Google", "Yandex").replaceAll("google", "yandex"));
            bufferedWriter.newLine();
            System.out.println(line);
        }

    }
}

