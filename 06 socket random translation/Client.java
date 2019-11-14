import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Date;

public class Client {
    private static final String HOST = "localhost";
    private static final int PORT = 1234;

    public static void main(String[] args) throws IOException {
        Socket s = new Socket(HOST, PORT);
        InputStream is = s.getInputStream();
        while (true) {
            System.out.println("Received: " + is.read() +
                    " on " + (new Date()));
        }
    }

}
