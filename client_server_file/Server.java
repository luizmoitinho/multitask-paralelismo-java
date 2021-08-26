import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Server {
	public static void main(String argv[]) throws Exception {
		
		ServerSocket serverSocket = new ServerSocket(9876);
		System.out.println("Server on");
		while (true) {
			Socket connectionSocket = serverSocket.accept();
			Clients c = new Clients(connectionSocket);
			c.start();
			
		}
	}
}
