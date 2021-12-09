package code.by.tc.server.main;

import code.by.tc.server.main.server.Server;

public class Main {

    public static void main(String[] args) {
        Server server = new Server(6666);
        server.start();
        try {
            server.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
