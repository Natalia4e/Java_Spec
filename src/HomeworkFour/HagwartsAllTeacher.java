package HomeworkFour;

public class HagwartsAllTeacher extends Teacher{

    protected HagwartsAllTeacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return "HagwartsStaff{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}