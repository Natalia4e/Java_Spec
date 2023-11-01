package Data5.Model;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> student;
    private String name;
    public StudyGroup(Teacher teacher, List<Student> student, String name) {
        this.teacher = teacher;
        this.student = student;
        this.name = name;
    }
    public Teacher getTeacher() {return teacher;}

    public void setTeacher(Teacher teacher) {this.teacher = teacher;}

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> student, int number) {
        return new StudyGroup(teacher, student, name);
    }

    public String getName() {return name;}

    public void setNumber(String name) {this.name = name;}

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher= " + teacher +
                ", student= " + student +
                ", name= " + name +
                '}';
    }
}
