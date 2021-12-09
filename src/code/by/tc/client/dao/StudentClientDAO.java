package code.by.tc.client.dao;

import code.by.tc.client.entity.student.Student;
import code.by.tc.client.entity.user.User;

import java.util.List;

public interface StudentClientDAO {

    User login(User user);

    User register(User user);

    Student get(int id);

    List<Student> getAll();

    boolean create(Student item);

    boolean editInfo(Student newValue);
}
