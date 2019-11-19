package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class DummyServer {
    public static void main(String[] args) throws IOException {
        int port = 1234;
        ServerSocket ss = new ServerSocket(port);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        s.getInputStream()
                )
        );
        System.out.println(br.readLine());


    }
}
