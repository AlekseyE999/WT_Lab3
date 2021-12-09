package code.by.tc.server.main.server.clientHandler.studentController;

import code.by.tc.client.entity.student.Student;
import code.by.tc.client.entity.student.StudentRequest;
import code.by.tc.client.entity.student.StudentResponse;
import code.by.tc.client.entity.request.ResponseType;
import code.by.tc.client.entity.user.User;
import code.by.tc.server.service.StudentServerService;

import java.util.List;

public class StudentController {
    private final StudentServerService service;

    public StudentController(StudentServerService service) {
        this.service = service;
    }

    public StudentResponse create(StudentRequest request) {
        Student student;
        StudentResponse response = new StudentResponse();
        if (request.getBody() instanceof Student body) {
            student = body;
        } else {
            response.setResponseType(ResponseType.ERROR);
            return response;
        }

        if (this.service.create(student)) {
            response.setResponseType(ResponseType.OK);
        } else {
            response.setResponseType(ResponseType.ERROR);
        }

        return response;
    }

    public StudentResponse editInfo(StudentRequest request) {
        Student student;
        StudentResponse response = new StudentResponse();
        if (request.getBody() instanceof Student body) {
            student = body;
        } else {
            response.setResponseType(ResponseType.ERROR);
            return response;
        }

        if (this.service.editInfo(student)) {
            response.setResponseType(ResponseType.OK);
        } else {
            response.setResponseType(ResponseType.ERROR);
        }

        return response;
    }

    public StudentResponse getAll() {
        List<Student> students = this.service.getAll();
        StudentResponse response = new StudentResponse();
        if (students == null) {
            response.setResponseType(ResponseType.ERROR);
            response.setBody(null);
        }
        else {
            response.setResponseType(ResponseType.OK);
            response.setBody(students);
        }

        return response;
    }

    public StudentResponse get(StudentRequest request) {
        int id;
        StudentResponse response = new StudentResponse();
        if (request.getBody() instanceof Integer) {
            id = (int) request.getBody();
        } else {
            response.setResponseType(ResponseType.ERROR);
            return response;
        }

        Student studentToSend = this.service.get(id);
        if (studentToSend != null) {
            response.setResponseType(ResponseType.OK);
            response.setBody(studentToSend);
        } else {
            response.setResponseType(ResponseType.ERROR);
        }

        return response;
    }

    public StudentResponse register(StudentRequest request) {
        User user;
        StudentResponse response = new StudentResponse();
        if (request.getBody() instanceof User body) {
            user = body;
        } else {
            response.setResponseType(ResponseType.ERROR);
            return response;
        }

        User userResult = this.service.register(user);
        if (userResult != null) {
            response.setResponseType(ResponseType.OK);
            response.setBody(userResult);
        } else {
            response.setResponseType(ResponseType.ERROR);
        }

        return response;
    }

    public StudentResponse login(StudentRequest request) {
        User user;
        StudentResponse response = new StudentResponse();
        if (request.getBody() instanceof User body) {
            user = body;
        } else {
            response.setResponseType(ResponseType.ERROR);
            return response;
        }

        User userResult = this.service.login(user);
        if (userResult != null) {
            response.setResponseType(ResponseType.OK);
            response.setBody(userResult);
        } else {
            response.setResponseType(ResponseType.ERROR);
        }

        return response;
    }

    public StudentResponse notFound() {
        StudentResponse response = new StudentResponse();
        response.setResponseType(ResponseType.NOTFOUND);
        return response;
    }
}
