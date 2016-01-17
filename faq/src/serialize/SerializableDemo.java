package serialize;

import java.io.*;

/**
 * <pre>
 * 序列化的方式1：Serializable
 * </pre>
 */
public class SerializableDemo {
    public static void main(String[] args) {
        Stu stu = new Stu("CY", 25);

        object2File(stu, "stuInfo.txt");
        Stu stu2 = (Stu) file2Object("stuInfo.txt");

        System.out.println(stu.toString());
        System.out.println(stu2.toString());
    }

    /**
     * <pre>
     * 把Object输出到文件
     * @param obj
     * @param outputFile
     * </pre>
     */
    public static void object2File(Object obj, String outputFile) {
        ObjectOutputStream oos = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File(outputFile));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /**
     * <pre>
     * 从文件读取然后存入Object
     * </pre>
     */
    public static Object file2Object(String fileName) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(fileName);
            ois = new ObjectInputStream(fis);
            Object object = ois.readObject();
            return object;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return null;
    }

}

class Stu implements Serializable {

    private static final long serialVersionUID = 3723956860165271668L;
    private String name;
    private int age;

    public Stu() {
        // TODO Auto-generated constructor stub
    }

    public Stu(String name, int age) {
        // TODO Auto-generated constructor stub
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stu [name=" + name + ", age=" + age + "]";
    }

}
