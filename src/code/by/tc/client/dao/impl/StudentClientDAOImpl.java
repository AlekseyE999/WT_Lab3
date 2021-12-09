package code.by.tc.client.dao.impl;

import code.by.tc.client.dao.StudentClientDAO;
import code.by.tc.client.dao.impl.socketManager.SocketManager;
import code.by.tc.client.entity.student.Student;
import code.by.tc.client.entity.student.StudentResponse;
import code.by.tc.client.entity.request.RequestType;
import code.by.tc.client.entity.request.ResponseType;
import code.by.tc.client.entity.user.User;

import java.util.ArrayList;
import java.util.List;

public class StudentClientDAOImpl implements StudentClientDAO {
    private final SocketManager socketManager = new SocketManager("localhost", 6666);

    @Override
    public boolean editInfo(Student newValue) {
        StudentResponse response = socketManager
                .sendRequest(newValue, RequestType.EDIT);
        return (response != null) && (response.getResponseType() == ResponseType.OK);
    }

    @Override
    public List<Student> getAll() {
        StudentResponse response = socketManager
                .sendRequest(null, RequestType.GET_ALL);

        if ((response != null)
            && (response.getResponseType() == ResponseType.OK)
            && (response.getBody() instanceof ArrayList<?>)) {
            try {
                return (ArrayList<Student>) response.getBody();
            } catch (ClassCastException e) {
                return new ArrayList<>();
            }
        }
        return new ArrayList<>();
    }

    @Override
    public Student get(int id) {
        StudentResponse response = socketManager
                .sendRequest(id, RequestType.GET);

        if ((response != null) && (response.getResponseType() == ResponseType.OK)
                && (response.getBody() instanceof Student student)) {
            return student;
        }
        return null;
    }

    @Override
    public boolean create(Student item) {
        StudentResponse response = socketManager
                .sendRequest(item, RequestType.CREATE);
        return (response != null) && (response.getResponseType() == ResponseType.OK);
    }

    @Override
    public User register(User user) {
        StudentResponse response = socketManager
                .sendRequest(user, RequestType.REGISTER);
        if (response.getBody() instanceof User body) {
            return body;
        }
        return null;
    }

    @Override
    public User login(User user) {
        StudentResponse response = socketManager
                .sendRequest(user, RequestType.LOGIN);
        if (response.getBody() instanceof User body) {
            return body;
        }
        return null;
    }
}
