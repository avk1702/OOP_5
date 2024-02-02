package OOP_5.controller;

import OOP_5.model.StudyGroup;
import OOP_5.model.Student;
import OOP_5.model.Teacher;
import OOP_5.service.StudyGroupService;

import java.util.List;

public class Controller {
    private StudyGroupService studyGroupService;

    public Controller() {
        this.studyGroupService = new StudyGroupService();
    }

    public StudyGroup createStudyGroup(int teacherId, List<Integer> studentIds) {
        Teacher teacher = getTeacherById(teacherId);
        List<Student> students = getStudentsByIds(studentIds);
        return studyGroupService.formStudyGroup(teacher, students);
    }

    private Teacher getTeacherById(int teacherId) {
        
        return null;
    }

    private List<Student> getStudentsByIds(List<Integer> studentIds) {
        
        return null;
    }

}