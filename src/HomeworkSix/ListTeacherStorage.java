package HomeworkSix;

import java.util.ArrayList;
import java.util.List;

public class ListTeacherStorage<T extends Teacher> implements TeacherStorage<T> {
    private List<T> teachers = new ArrayList<>();

    @Override
    public void add(T teacher) {
        teachers.add(teacher);
    }

    @Override
    public int count() {
        return teachers.size();
    }

    @Override
    public T get(int index) {
        return teachers.get(index);
    }
}