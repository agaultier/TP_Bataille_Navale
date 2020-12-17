package server;


import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
	public static void main(String[] args) {
		try {
			ServerSocket ecoute = new ServerSocket(1234);
			System.out.println("Serveur lanc�!");
		
			while(true) {
				Socket client1 = ecoute.accept();
				Socket client2 = ecoute.accept();	
				new ThreadGame (client1 , client2).start();
			}
		}catch(Exception e) {
			
		}
	}
}
