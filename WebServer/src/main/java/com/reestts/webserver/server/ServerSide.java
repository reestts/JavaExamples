package com.reestts.webserver.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class ServerSide {
    public static final int PORT = 8080;
    public static LinkedList<ServerProcess> serverList = new LinkedList<>();
    public static MessageHistory messageHistory;

    public static void main(String[] args) throws IOException {
        messageHistory = new MessageHistory();
        System.out.println("Server Started");
        try (ServerSocket server = new ServerSocket(PORT)) {
            while (true) {
                Socket socket = server.accept();
                RequestHandler.handleRequest(socket);
                try {
                    serverList.add(new ServerProcess(socket));
                } catch (IOException e) {
                    socket.close();
                }
            }
        }
    }
}