package code.by.tc.server.service;

import code.by.tc.server.dao.StudentServerDAO;
import code.by.tc.server.service.impl.StudentServerServiceImpl;

public class ServiceServerFactory {
    private static final ServiceServerFactory instance = new ServiceServerFactory();

    private ServiceServerFactory() {

    }

    public StudentServerService getStudentService(StudentServerDAO studentDAO) {

        return new StudentServerServiceImpl(studentDAO);
    }

    public static ServiceServerFactory getInstance() {
        return instance;
    }
}
