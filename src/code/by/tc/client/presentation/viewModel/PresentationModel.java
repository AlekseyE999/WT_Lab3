package code.by.tc.client.presentation.viewModel;

import code.by.tc.client.entity.student.Student;
import code.by.tc.client.service.StudentClientService;

import java.util.List;

public abstract class PresentationModel {
    protected StudentClientService studentService;
    public PresentationModel(StudentClientService studentService) {
        this.studentService = studentService;
    }

    public abstract List<Student> getItems();
}
