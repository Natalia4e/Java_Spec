package Data5;
import Data5.Model.Student;
import Data5.Model.User;
import Data5.Model.Teacher;
import Data5.View.GroupView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Anna Ivanova", 60, "001");
        Student student1 = new Student("Ivan Ivanov", 18, "s002");
        Student student2 = new Student("Maria Petrova", 22, "s001");
        GroupView userView = new GroupView();
        userView.saveGroup(new Teacher(teacher.getTeacherId()),
                (List.of(new Student(student1.getStudentId()), new Student(student2.getStudentId()))), "group1");
        userView.getGroup("group2");
    }
}
