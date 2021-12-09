package code.by.tc.client.service.impl;

import code.by.tc.client.dao.StudentClientDAO;
import code.by.tc.client.entity.student.Student;
import code.by.tc.client.entity.user.User;
import code.by.tc.client.service.StudentClientService;

import java.util.List;

public class StudentClientServiceImpl implements StudentClientService {
    private final StudentClientDAO studentDAO;

    public StudentClientServiceImpl(StudentClientDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public Student get(int id) {
        return this.studentDAO.get(id);
    }

    @Override
    public List<Student> getAll() {
        return this.studentDAO.getAll();
    }

    @Override
    public boolean editInfo(Student newValue) {
        return this.studentDAO.editInfo(newValue);
    }

    @Override
    public boolean create(Student student) {
        return this.studentDAO.create(student);
    }

    @Override
    public User register(User user) {
        return this.studentDAO.register(user);
    }

    @Override
    public User login(User user) {
        return this.studentDAO.login(user);
    }
}
