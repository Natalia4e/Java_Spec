package Data5.Model;

public class Teacher extends User {
String TeacherId;

    public Teacher(String name, int age, String teacherId) {
        super(name, age);
        this.TeacherId = teacherId;
    }
    public Teacher(String teacherId){
        this.TeacherId = teacherId;
    }

    public String getTeacherId() {
        return TeacherId;
    }

    public void setTeacherId(String teacherId) {
        TeacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "TeacherId='" + TeacherId + '\'' +
                '}';
    }
}
