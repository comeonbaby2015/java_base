import java.util.ArrayList;
import java.util.List;

/**
 * Created by hades on 2016/1/16.
 */
public class TestJvmTool {
    static class OOMObject {
        public byte[] placheholder = new byte[64 * 1024];
    }

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Thread.sleep(100);
            System.out.println("i=============:" + i);
            list.add(new OOMObject());
            OOMObject oomObject = list.get(i);
            oomObject = null;

        }
    }

    public static void main(String[] args) throws Exception {
        fillHeap(1000);
        System.gc();
    }
}
