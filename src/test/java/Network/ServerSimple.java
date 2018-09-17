package Network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerSimple {
public static void main(String args[]) throws IOException {

ServerSocket s = new ServerSocket(1254);
s.setSoTimeout(1000000);

Socket s1=s.accept(); // Wait and accept a connection

System.out.println("ss");


// Get a communication stream associated with the socket
OutputStream s1out = s1.getOutputStream();
DataOutputStream dos = new DataOutputStream (s1out);



// Send a string!
//dos.writeUTF("Hi there");
// Close the connection, but not the server socket
dos.close();
s1out.close();
s1.close();
}
}