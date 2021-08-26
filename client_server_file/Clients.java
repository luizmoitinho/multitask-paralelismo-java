import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;

public class Clients extends Thread{

	Socket s;
	public Clients(Socket s)
	{
		this.s = s;
	}

	@SuppressWarnings("deprecation")
	public void run(){
		String clientSentence = "";
		String capitalizedSentence = "";
		
		try{
			this.s.setSoTimeout(10000);
			BufferedReader inFromClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
			DataOutputStream outToClient = new DataOutputStream(s.getOutputStream());
			
			clientSentence = inFromClient.readLine();
			
			System.out.println(	"\nIP.............: " + s.getInetAddress() +
								"\nPorta..........: " + s.getPort() +
								"\nBuscar arquivo.: " + clientSentence 
							 );
		
			String response = this.searchFiles(clientSentence) ? "Arquivo encontrado.":"Arquivo no foi encontrado!";
			outToClient.writeBytes(response + '\n');
			this.s.close(); 
			
		}catch(SocketTimeoutException ste) {
			try {
				System.out.println(	"\nIP.............: " + s.getInetAddress() +
						"\nPorta..........: " + s.getPort() +
						"\nBuscar arquivo.: " + clientSentence 
					 );
				System.out.println("Client demorou para responder.");
				this.s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}catch(Exception ex){
			System.out.println(ex);
		}
		
		this.stop();
		
	}
	
	private boolean searchFiles(String nameFile) {
		Path currentRelativePath = Paths.get("");
        String url = currentRelativePath.toAbsolutePath().toString() + "/Client_Server_File/arquivos/"+nameFile; 
        File f = new File(url);
        
		if(f.exists())
		    return true;
		return false;
		
	}
	
	
	
}