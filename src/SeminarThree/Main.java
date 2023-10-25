package SeminarThree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student Alex = new Student("Alex", "Popov", 20, "22a");
        Student Masha = new Student("Masha", "Ivanova", 22, "22a");
        Student Aleksandr = new Student("Aleksandr", "Petrov", 25, "23a");

        List<Student> numberoFGroup = new ArrayList<>();
        numberoFGroup.add(Alex);
        numberoFGroup.add(Masha);
        numberoFGroup.add(Aleksandr);

        System.out.println("iterating:");
        Iterator<Student> iterator = numberoFGroup.iterator();
        while (iterator.hasNext()) {
            Student person = iterator.next();
            System.out.println("Name: " + person.getName());
            System.out.println("Surname: " + person.getSurname());
            System.out.println("Age: " + person.getAge());
            System.out.println("Name of group: " + person.getNameofGroup());
        }

        Comparator<Student> studentComp = new StudentComporator()
                .thenComparing(new StudentComporator.StudentAgeComparator());
        TreeSet<Student> checkStudents = new TreeSet<>(studentComp);
        checkStudents.add(new Student("Dan", "Brown", 18, "22a"));
        checkStudents.add(new Student("Margo", "Robbi", 22, "23a"));
        checkStudents.add(new Student("Chris", "Rock", 25, "22a"));
        checkStudents.add(new Student("Chao", "Lee", 22, "22a"));
        checkStudents.add(new Student("Anna", "Sidorova", 25, "23a"));
        for(Student std : checkStudents){

            System.out.println(std.getName() + " -> " + std.getAge() + " years old");
        }
    }
}