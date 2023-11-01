package Data5.Controller;
import Data5.Model.Student;
import Data5.Model.User;
import Data5.Model.Teacher;
import Data5.Model.StudyGroup;
import java.util.ArrayList;
import java.util.List;
public class GroupController {
    private List<StudyGroup> studyGroup;

    public GroupController() {
        this.studyGroup = new ArrayList<>();
    }

    public void createSG(Teacher teacherId, List<Student> studentId, String name) {
        studyGroup.add(new StudyGroup(teacherId, studentId, name));
        System.out.println("group has been added");
    }

    public StudyGroup getByName(String name) {
        return studyGroup.stream()
                .filter(group -> group.getName().equals(name))
                .findFirst()
                .orElseGet(() -> {
                    System.out.println("no group found!");
                    return null;
                });
    }

    public List<StudyGroup> getGroup() {
        return studyGroup;
    }

    public void setGroup(List<StudyGroup> studyGroup) {
        this.studyGroup = studyGroup;
    }

    @Override
    public String toString() {
        return "GroupController{" +
                "group=" + studyGroup +
                '}';
    }
}
