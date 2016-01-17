package network;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

// 服务器
public class Service {

	public static void main(String[] args) {
		try {
			ServerSocket socket = new ServerSocket(30000);
			while (true) {
				Socket s = socket.accept();
				PrintStream printStream = new PrintStream(s.getOutputStream());
				printStream.println("来自服务器的祝福");
				printStream.close();
				s.close();
			}

			// socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
