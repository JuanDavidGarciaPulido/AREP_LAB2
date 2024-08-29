package edu.escuelaing.arep.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.net.ServerSocket;

public class WebServerTest {

    @Test
    public void testGetInstance() {
        SimpleWebServer server1 = SimpleWebServer.getInstance();
        SimpleWebServer server2 = SimpleWebServer.getInstance();
        assertSame(server1, server2);
    }


    @Test
    public void testStartServer() {
        SimpleWebServer server = SimpleWebServer.getInstance();
        try {

            ServerSocket serverSocket = new ServerSocket(8080);
            assertNotNull(serverSocket);
            serverSocket.close();
        } catch (Exception e) {
            fail("Can´t start the server on 8080 port");
        }
    }
}
