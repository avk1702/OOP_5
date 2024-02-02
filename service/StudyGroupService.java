package OOP_5.service;

import OOP_5.model.StudyGroup;
import OOP_5.model.Student;
import OOP_5.model.Teacher;

import java.util.List;

public class StudyGroupService {
    public StudyGroup formStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}
