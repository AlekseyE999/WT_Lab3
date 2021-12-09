package code.by.tc.client.main;

import code.by.tc.client.dao.ClientDAOFactory;
import code.by.tc.client.service.ServiceClientFactory;

public class Main {
    public static void main(String[] args) {
        ServiceClientFactory factory = ServiceClientFactory.getInstance();
        ClientDAOFactory daoFactory = ClientDAOFactory.getInstance();
    }
}
