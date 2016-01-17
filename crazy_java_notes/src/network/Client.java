package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

// 客户端
public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 30000);
		socket.setSoTimeout(10000);

		InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
		BufferedReader br = new BufferedReader(inputStreamReader);
		System.out.println("来自服务器的数据：" + br.readLine());
		br.close();
		socket.close();
	}
}
