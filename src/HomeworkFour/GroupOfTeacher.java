package HomeworkFour;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class GroupOfTeacher<Teach extends Teacher> implements Iterable<Teacher> {
    private String nameGroup;
    private List<Teach> numberOfTeachers;
    private int index;

    public GroupOfTeacher(String nameGroup) {
        this.numberOfTeachers = new ArrayList<>();
        this.nameGroup = nameGroup;
    }

    public String getName() {
        return nameGroup;
    }

    public void add(Teach teacher){
        numberOfTeachers.add(teacher);
    }

    public int count() {
        return numberOfTeachers.size();
    }

    public Teach get(Integer index) {
        return numberOfTeachers.get(index);
    }

    public TeachersIterator TeachersIterator() {
        return new TeachersIterator(numberOfTeachers);
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeachersIterator(numberOfTeachers);
    }

    private class TeachersIterator implements Iterator<Teacher> {
        private List<Teach> numberOfTeachers;
        private int counter;

        public TeachersIterator(List<Teach> numberOfTeachers) {
            this.numberOfTeachers = numberOfTeachers;
            this.counter = 0;
        }

        @Override
        public boolean hasNext() {
            return index < numberOfTeachers.size() - 1;
        }

        @Override
        public Teach next() {
            if (hasNext()) {
                return numberOfTeachers.get(index++);
            }
            return null;
        }

        @Override
        public void remove() {
            numberOfTeachers.remove(numberOfTeachers.get(index));
        }
    }

}