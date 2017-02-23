package Java1Module.module10.practice;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static final String FIRST_NAME = "firstName";
    public static final String LAST_NAME = "lastName";
    public static final String EMAIL = "email";

    public static void main(String[] args) {
        //create data
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put(FIRST_NAME, "Paulo");
        requestParams.put(LAST_NAME, "Petrenko");
        requestParams.put(EMAIL, "Petrenko@gmail.com");

        Map<String, String> requestParams2 = new HashMap<>();
        requestParams2.put(FIRST_NAME, "Andrey");
        requestParams2.put(LAST_NAME, "Demchuk");
        requestParams2.put(EMAIL, "demchuk@gmail.com");

        //execute code
        PersonController controller = new PersonController();
        controller.save(requestParams);
        controller.save(requestParams2);

        String name = controller.findByEmail(requestParams);
        //check the result
        System.out.println("Request is " + name.equals("Paulo"));

    }
}
