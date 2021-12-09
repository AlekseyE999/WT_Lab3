package code.by.tc.client.service;

import code.by.tc.client.dao.StudentClientDAO;
import code.by.tc.client.service.impl.*;

public class ServiceClientFactory {
    private static final ServiceClientFactory instance = new ServiceClientFactory();

    private ServiceClientFactory() {

    }

    public StudentClientService getStudentService(StudentClientDAO studentDAO) {
        return new StudentClientServiceImpl(studentDAO);
    }

    public static ServiceClientFactory getInstance() {
        return instance;
    }
}
