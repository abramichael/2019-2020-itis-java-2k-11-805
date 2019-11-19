package sample;

import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class IMThread extends Thread {

    private Socket socket;
    private TextArea textArea;

    public IMThread(Socket socket, TextArea textArea) {
        this.socket = socket;
        this.textArea = textArea;
    }

    public void run() {
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream()
                    )
            );
            String line = br.readLine();
            while (line != null) {
                textArea.appendText("CLIENT: " + line + "\n");
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
