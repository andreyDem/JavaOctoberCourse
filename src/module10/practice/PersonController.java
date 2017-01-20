package module10.practice;

import java.util.Map;

import static module10.practice.Main.EMAIL;
import static module10.practice.Main.FIRST_NAME;
import static module10.practice.Main.LAST_NAME;

public class PersonController {
    PersonDao personDao = new PersonDaoImp();

    public String save(Map<String, String> requestParams) {
        String firstName = requestParams.get(FIRST_NAME);
        String lastName = requestParams.get(LAST_NAME);
        String email = requestParams.get(EMAIL);
        if ((firstName==null))  ;

//        Person person = new Person(firstName, lastName, email);
//        personDao.save(person);
        return null;

    }

    public String findByEmail(Map<String, String> requestParams) {
       return "";
    }
}
