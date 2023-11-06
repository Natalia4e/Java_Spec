package HomeworkSix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//Применение Single Responsibility Principle:
//Выделила отдельный класс для хранения и управления списком учителей,
// и выделила отдельный класс для представления группы учителей. Э
// то разделит ответственности между двумя классамию
public class GroupOfTeacher<T extends Teacher> {
    private String nameGroup;
    private TeacherStorage<T> teacherStorage;

    public GroupOfTeacher(String nameGroup, TeacherStorage<T> teacherStorage) {
        this.nameGroup = nameGroup;
        this.teacherStorage = teacherStorage;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void addTeacher(T teacher) {
        teacherStorage.add(teacher);
    }

    public int getTeachersCount() {
        return teacherStorage.count();
    }

    public T getTeacher(int index) {
        return teacherStorage.get(index);
    }
}