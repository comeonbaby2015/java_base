package observer_pattern;

import observer_pattern.observer.ConcreteObserver;
import observer_pattern.observer.Observer;
import observer_pattern.subject.ConcreteSubject;

/**
 * 客户端类
 */
public class Client {

    public static void main(String[] args) {
        // 创建主题对象
        ConcreteSubject subject = new ConcreteSubject();
        // 创建观察者对象
        Observer observer = new ConcreteObserver();
        // 将观察者对象登记到主题对象上
        subject.attach(observer);
        // 改变主题对象的状态
        subject.change("new state");
    }

}