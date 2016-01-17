package object;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TxtCount {

    /**
     * <pre>
     * 用Java写一个程序，从文件（c:\test.txt）中查出字符串”mobnet”出现的次数？
     * </pre>
     */
    public static void main(String[] args) throws Exception {
        // 从文件按行读取字符串，并依次加入到StringBuilder。
        // 从StringBuilder按正则表达式匹配。
        BufferedReader br = new BufferedReader(new FileReader("C:\\test.txt"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine();
            if (str == null)
                break;
            sb.append(str);
        }

        Pattern p = Pattern.compile("mobnet");
        Matcher m = p.matcher(sb);
        int count = 0;
        while (m.find()) {
            count++;
        }
        System.out.println("mobnet一共出现了" + count + "次");
    }

}
