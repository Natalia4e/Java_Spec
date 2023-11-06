package HomeworkSix;
// создаю класс Teacher, который будет использовать класс Person для хранения информации о преподавателе:
public class Teacher {
    private Person person;

    public Teacher(String firstName, String lastName) {
        this.person = new Person(firstName, lastName);
    }

    public String getFirstName() {
        return person.getFirstName();
    }

    public String getLastName() {
        return person.getLastName();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "person=" + person +
                '}';
    }
}