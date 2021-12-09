package code.by.tc.client.main;

import code.by.tc.client.dao.ClientDAOFactory;
import code.by.tc.client.service.ServiceClientFactory;
import code.by.tc.client.presentation.Presentation;

public class Main {
    public static void main(String[] args) {
        ServiceClientFactory factory = ServiceClientFactory.getInstance();
        ClientDAOFactory daoFactory = ClientDAOFactory.getInstance();
        Presentation presentation = new Presentation(factory.getStudentService(daoFactory.getStudentDAO()));
        presentation.show();
    }
}
