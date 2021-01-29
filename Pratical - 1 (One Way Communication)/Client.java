import java.io.*;
import java.net.*;

class Client {


	public static void main(String[] args) throws Exception {

			
			Socket clientSocket = new Socket("localhost",4000);
			DataOutputStream mydata = new DataOutputStream(clientSocket.getOutputStream());

			mydata.writeUTF("My information");
			mydata.flush();
			mydata.close();
			clientSocket.close();
			
	}


}
