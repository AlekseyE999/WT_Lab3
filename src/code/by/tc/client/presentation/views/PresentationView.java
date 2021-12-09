package code.by.tc.client.presentation.views;

import code.by.tc.client.entity.user.User;
import code.by.tc.client.presentation.viewModel.PresentationModel;
import code.by.tc.client.service.StudentClientService;

public abstract class PresentationView {
    protected PresentationModel model;
    protected StudentClientService studentService;
    protected User currentUser;

    protected PresentationView(StudentClientService studentService, User user) {
        this.studentService = studentService;
        this.currentUser = user;
    }

    public abstract void show();
    public abstract PresentationView getInput(String input);
}
