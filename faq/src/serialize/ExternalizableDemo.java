package serialize;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <pre>
 * 序列化的方式2：Externalizable
 * </pre>
 */
class Person implements Externalizable {
    private static final long serialVersionUID = 3723956860165271668L;
    String userName;
    String password;
    String age;

    public Person(String userName, String password, String age) {
        super();
        this.userName = userName;
        this.password = password;
        this.age = age;
    }

    public Person() {
        super();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 序列化操作的扩展类
     */
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        // 增加一个新的对象
        Date date = new Date();
        out.writeObject(userName);
        out.writeObject(password);
        out.writeObject(date);
    }

    /**
     * 反序列化的扩展类
     */
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // 注意这里的接受顺序是有限制的哦，否则的话会出错的
        // 例如上面先write的是A对象的话，那么下面先接受的也一定是A对象...
        userName = (String) in.readObject();
        password = (String) in.readObject();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = (Date) in.readObject();
        System.out.println("反序列化后的日期为:" + sdf.format(date));

    }

    @Override
    public String toString() {
        // 注意这里的年龄是不会被序列化的，所以在反序列化的时候是读取不到数据的
        return "用户名:" + userName + "密 码:" + password + "年龄:" + age;
    }
}

/**
 * 序列化和反序列化的相关操作类
 *
 * @author 小浩
 * @创建日期 2015-3-12
 */
class Operate {
    /**
     * 序列化方法
     *
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void serializable(Person person) throws FileNotFoundException, IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("a.txt"));
        outputStream.writeObject(person);
    }

    /**
     * 反序列化的方法
     *
     * @throws IOException
     * @throws FileNotFoundException
     * @throws ClassNotFoundException
     */
    public Person deSerializable() throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        return (Person) ois.readObject();
    }

}

/**
 * 测试实体主类
 *
 * @author 小浩
 * @创建日期 2015-3-12
 */
public class ExternalizableDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Operate operate = new Operate();
        Person person = new Person("小浩", "123456", "20");
        System.out.println("为序列化之前的相关数据如下:\n" + person.toString());
        operate.serializable(person);
        Person newPerson = operate.deSerializable();
        System.out.println("-------------------------------------------------------");
        System.out.println("序列化之后的相关数据如下:\n" + newPerson.toString());
    }

}
