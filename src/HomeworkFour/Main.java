package HomeworkFour;

public class Main {
    public static void main(String[] args) {
        GroupOfTeacher<Teacher> teachers = new GroupOfTeacher<>("teachers");
        teachers.add(new HagwartsAllTeacher("Albus", "Dumbledore"));
        teachers.add(new HagwartsAllTeacher("Fillius", "Flitwick"));
        teachers.add(new DarkArtsTeacher("Dolores", "Umbrige"));

        for (int index = 0; index < teachers.count(); index++) {
            System.out.println(teachers.get(index));
        }


    }
}