package code.by.tc.server.service;

import code.by.tc.client.entity.student.Student;
import code.by.tc.client.entity.user.User;

import java.util.List;

public interface StudentServerService {

    boolean editInfo(Student newValue);

    List<Student> getAll();

    Student get(int id);

    boolean create(Student student);

    User login(User user);

    User register(User user);
}
