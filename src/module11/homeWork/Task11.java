package module11.homeWork;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("===================Original=======================");
        System.out.println(fileToString(addStringInFile()));
        System.out.println("==============String version replace==============");
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("one", "1");
        stringMap.put("two", "2");
        stringMap.put("three", "3");
        String replacer = replacer(stringMap);
        System.out.println(replacer);
        System.out.println("================File after replace================");
        String fileToString = fileToString(fileWriter(replacer, false));
        System.out.println(fileToString);
        System.out.println("============File after append something============");
        File file = fileAppendString(fileWriter(replacer, false), "Add new string");
        System.out.println(fileToString(file));
        System.out.println("==============Searching words in file==============");
        checkWord(file, "Andrey");
        checkWord(file, "not found");
        System.out.println("=================fileContentMerger==================");
        Map<String, String> contentToReplace = new HashMap<>();
        contentToReplace.put("new","<old>");
        contentToReplace.put("try","<can>");
        fileContentMerger(contentToReplace);
    }

    private static File fileContentMerger(Map<String, String> map){
        File file = new File("TestInput.txt");
        String replacedString = fileToString(file);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            replacedString = replacedString.replaceAll(entry.getKey(), entry.getValue());
        }
        return fileWriter(replacedString, true);
    }

    private static File fileAppendString(File file, String s) {
        try (FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("\n" +s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public static String replacer(Map<String, String> map) {
        String newString = fileToString(addStringInFile());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            newString = newString.replaceAll(entry.getKey(), entry.getValue());
        }
        return newString;
    }

    public static File fileWriter(String str, boolean task) {
        File file = createNewFile();
        try (   FileWriter fileWriter = new FileWriter(file, task);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            if (task)
                bufferedWriter.write("\n");
            bufferedWriter.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public static String fileToString(File file) {
        String fileToString = "";
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                new FileInputStream(file)))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                fileToString = fileToString + str + System.lineSeparator();
            }
            fileToString = fileToString.trim();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileToString;
    }

    public static File createNewFile() {
        File file = new File("TestInput.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public static File addStringInFile() {
        File file = createNewFile();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write("Andrey try something write ... one" + "\n");
            bufferedWriter.write("Andrey try something write ... two" + "\n");
            bufferedWriter.write("Andrey try something write ... three" + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public static int checkWord(File file, String word) {
        int counter = 0;
        String[] strFile = fileToString(file).replaceAll("\n", " ").split(" ");
        for (String s : strFile) {
            if (s.equals(word))
                counter++;
        }
        System.out.println(file.getName() + " contains: " + counter + " \"" + word + "\" words");
        return 0;
    }
}
