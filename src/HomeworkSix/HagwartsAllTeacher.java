package HomeworkSix;

public class HagwartsAllTeacher extends Teacher {
    protected HagwartsAllTeacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return "HagwartsAllTeacher{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }
}






