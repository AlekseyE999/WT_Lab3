package code.by.tc.server.dao;

import code.by.tc.server.dao.impl.StudentServerDAOImpl;

public class ServerDAOFactory {
    private static final ServerDAOFactory instance = new ServerDAOFactory();

    private ServerDAOFactory() {}

    public StudentServerDAO getStudentDAO() {
        return new StudentServerDAOImpl();
    }

    public static ServerDAOFactory getInstance() {
        return instance;
    }
}
