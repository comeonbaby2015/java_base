package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MyServer {

	// 定义保存所有的Socket的ArrayList
	public static ArrayList<Socket> socketList = new ArrayList<Socket>();

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(30001);

		while (true) {

			// 堵塞，将一直等待别人的连接
			Socket s = ss.accept();
			socketList.add(s);

			new Thread(new ServerThread(s)).start();
		}
	}
}

class ServerThread implements Runnable {
	// 定义当前线程所处理的Socket
	Socket s = null;

	//
	BufferedReader br = null;

	public ServerThread(Socket s) throws IOException {
		this.s = s;
		// 初始化该Socket对应的输入流
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	}

	@Override
	public void run() {
		String content = null;

		// 采用循环不断地从Socket中读取客户端发送过来的数据
		while (content == readFromClient()) {

			// 遍历socketList中的每一个Socket，将读到的内容向每个Socket发送一次
			for (Socket s : MyServer.socketList) {
				PrintStream ps;
				try {
					ps = new PrintStream(s.getOutputStream());
					ps.println(content);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	// 定义读取客户端数据的方法
	private String readFromClient() {
		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			// 如果捕获到异常，则表明该Socket对应的客户端已经关闭了
			MyServer.socketList.remove(s);
		}
		return null;

	}
}
