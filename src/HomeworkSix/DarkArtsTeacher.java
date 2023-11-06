package HomeworkSix;

import HomeworkSix.Teacher;
import HomeworkSix.Person;

public class DarkArtsTeacher extends Teacher {
    public DarkArtsTeacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return "DarkArtsTeacher{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }
}

