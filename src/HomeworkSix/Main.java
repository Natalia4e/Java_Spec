package HomeworkSix;

import HomeworkSix.DarkArtsTeacher;

public class Main {
    public static void main(String[] args) {
        TeacherStorage<Teacher> teacherStorage = new ListTeacherStorage<>();
        GroupOfTeacher<Teacher> teachers = new GroupOfTeacher<>("teachers", teacherStorage);

        teachers.addTeacher(new HagwartsAllTeacher("Albus", "Dumbledore"));
        teachers.addTeacher(new HagwartsAllTeacher("Fillius", "Flitwick"));
        teachers.addTeacher(new DarkArtsTeacher("Dolores", "Umbridge"));

        for (int index = 0; index < teachers.getTeachersCount(); index++) {
            System.out.println(teachers.getTeacher(index));
        }
    }
}