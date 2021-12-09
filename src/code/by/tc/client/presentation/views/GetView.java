package code.by.tc.client.presentation.views;

import code.by.tc.client.entity.student.Student;
import code.by.tc.client.entity.user.User;
import code.by.tc.client.presentation.viewModel.impl.GetModelView;
import code.by.tc.client.service.StudentClientService;

import java.util.List;

public class GetView extends PresentationView {
    public GetView(StudentClientService studentService, User user, int id) {
        super(studentService, user);
        this.model = new GetModelView(studentService, id);
    }

    @Override
    public void show() {
        List<Student> items = this.model.getItems();
        if (items.isEmpty()) {
            System.out.println("Element not found");
        } else {
            System.out.println(items.get(0));
        }
    }

    @Override
    public PresentationView getInput(String input) {
        return new GetSelectView(this.studentService, this.currentUser);
    }
}
