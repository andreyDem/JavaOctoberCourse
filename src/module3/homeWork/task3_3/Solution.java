package module3.homeWork.task3_3;

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Course course1 = new Course(new Date(), "Andrey");
        Course course2 = new Course(new Date(), "Dmitriy");
        Course course3 = new Course(60, "Vasiliy", "Petrovich");
        Course course4 = new Course(120, "Stepan", "Kostya");
        Course course5 = new Course(180, "Denis", "Glebka");

        Course[] courses = {course1, course2, course3, course4, course5};

        Student student1 = new Student("Vasiliy", "Pupkin", 10);
        Student student2 = new Student("Pupkin", courses);

        CollegeStudent collegeStudent1 = new CollegeStudent("Petr", "Petrenko", 15);
        CollegeStudent collegeStudent2 = new CollegeStudent("Kyzmi4", courses);
        CollegeStudent collegeStudent3 = new CollegeStudent("Dima", "Kydr9vui", 3, "KPI", 18, 432164132);

        SpecialStudent specialStudent1 = new SpecialStudent("Olga", "Litvinenko", 15);
        SpecialStudent specialStudent2 = new SpecialStudent("Litvinenko", courses);
        SpecialStudent specialStudent3 = new SpecialStudent("Veronika", "Malinina", 4, "KNYBA", 33, 321343, 566324);

    }


}
