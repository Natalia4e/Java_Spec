package HomeworkFour;

public class DarkArtsTeacher extends  Teacher{
    protected DarkArtsTeacher(String firstName, String lastName){
        super(firstName, lastName);
    }
    @Override
    public String toString() {
        return "DarkArtsTeacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

