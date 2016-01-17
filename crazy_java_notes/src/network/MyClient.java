package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
    static long num = 0;

    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s = new Socket("127.0.0.1", 30001);

        // 客户端启动该线程，不端地读取来自服务器的数据
        new Thread(new ClientThread(s)).start();

        PrintStream ps = new PrintStream(s.getOutputStream());
        String line = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // while ((line = br.readLine()) != null) {
        while (true) {
            // ps.println(line);
            ps.println((num++) + "");
        }
    }
}

// 创建一个线程，不断地获取Socket输入流的内容
class ClientThread implements Runnable {
    // 该线程负责处理的Socket
    Socket s;

    // 该线程所处理的Socket对应的输入流
    BufferedReader br = null;

    public ClientThread(Socket s) throws IOException {
        this.s = s;
        br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    }

    @Override
    public void run() {
        String content = null;

        try {
            while ((content = br.readLine()) != null) {
                System.out.println(content);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
