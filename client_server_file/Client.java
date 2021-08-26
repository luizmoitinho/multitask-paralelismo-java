import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;

public class Client {

	public static void main(String argv[]) throws Exception{
		
		try {
			
			String sentence;
			String modifiedSentence;
			Socket clientSocket = new Socket("127.0.0.1", 9876);
			
			
			DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
			BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			clientSocket.setSoTimeout(60000);
			
			System.out.println("#Client on\n");
			System.out.print("Buscar arquivo (teste.txt)...: ");
			
			BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
			sentence = inFromUser.readLine();
			outToServer.writeBytes(sentence + '\n');			
			modifiedSentence = inFromServer.readLine();
			System.out.println("Servidor...: " + modifiedSentence);
			
			clientSocket.close();
			
		}catch(SocketTimeoutException ste) {
			System.out.println("Server demorou para responder.");
			
		}catch(IllegalMonitorStateException e) {
			System.out.println("conexão encerrada.");
			
		}catch(SocketException e) {
			System.out.println("conexão encerrada pelo Server.");
		}
		System.out.println("\n#Client off");
	}
	
}
