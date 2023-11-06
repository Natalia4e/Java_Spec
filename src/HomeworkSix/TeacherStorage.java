package HomeworkSix;

import java.util.List;

public interface TeacherStorage<T extends Teacher> {
    void add(T teacher);
    int count();
    T get(int index);
}
