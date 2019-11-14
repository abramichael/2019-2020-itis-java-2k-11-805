import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {
    private static final int PORT = 1234;

    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket ss = new ServerSocket(PORT);
        N n = new N();
        (new Thread(new Translation(n))).start();
        while (true) {
            Socket s = ss.accept();
            // создание Треда для данного клиента
            (new Thread(new Connection(s, n))).start();
        }
    }
}
