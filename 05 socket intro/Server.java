import java.io.*;
import java.net.*;

public class Server {
	
	public static void main(String [] args) throws IOException {
		
		final int PORT = 1234;
		System.out.println("Server started.");
		ServerSocket ss = new ServerSocket(PORT);
		System.out.println("Opening connection on PORT " + PORT);
		Socket s = ss.accept();
		System.out.println("Connected.");
		int x = 100;
		OutputStream os = s.getOutputStream();
		os.write(x);
		
	}
	
	
}