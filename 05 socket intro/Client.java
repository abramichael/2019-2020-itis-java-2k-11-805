import java.io.*;
import java.net.*;

public class Client {
	
	public static void main(String [] args) throws IOException {
		
		final String HOST = "10.17.2.135";
		final int PORT = 1234;
		System.out.println("Connecting to " + HOST + ":" + PORT + ".");
		Socket s = new Socket(HOST, PORT);
		System.out.println("Connected.");
		InputStream is = s.getInputStream();
		int x = is.read();
		System.out.println("Received from server: " + x);
		
	}
	
}