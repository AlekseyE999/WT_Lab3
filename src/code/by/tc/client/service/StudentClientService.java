package code.by.tc.client.service;

import code.by.tc.client.entity.student.Student;
import code.by.tc.client.entity.user.User;

import java.util.List;

public interface StudentClientService {

    boolean editInfo(Student newValue);

    List<Student> getAll();

    Student get(int id);

    boolean create(Student student);

    User register(User user);

    User login(User user);
}
