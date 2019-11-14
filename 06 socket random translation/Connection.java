import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Connection implements Runnable{

    private Socket socket;
    private N n;
    public Connection(Socket socket, N n) {
        this.socket = socket;
        this.n = n;
    }

    @Override
    public void run() {
        OutputStream os = null;
        try {
            os = socket.getOutputStream();
            while (true) {
                os.write(n.getData());
                Thread.sleep(1000);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
