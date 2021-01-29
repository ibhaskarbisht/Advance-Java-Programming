import java.net.*;
import java.io.*;

class Server {

	public static void main(String[] args) throws Exception {

			ServerSocket server = new ServerSocket(4000);
			Socket temp = server.accept();
			System.out.println("Client Connected Successfully");

			DataInputStream s = new DataInputStream(temp.getInputStream());
			String ans = (String)s.readUTF();
			System.out.println(ans);
	
	}

}
