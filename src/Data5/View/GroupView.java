package Data5.View;
import Data5.Controller.GroupController;
import Data5.Model.Student;
import Data5.Model.User;
import Data5.Model.Teacher;
import Data5.Model.StudyGroup;
import java.util.List;

public class GroupView {
    GroupController groupController = new GroupController();

    public GroupView() {
        this.groupController = groupController;

    }
    public void saveGroup(Teacher teacherId, List<Student> studentId, String name){
        groupController.createSG(teacherId,studentId,name);
    }

    public void getGroup(String name){
        System.out.println(groupController.getByName(name));
    }


}
