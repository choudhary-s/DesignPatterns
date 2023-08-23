package typesofpatterns;

import typesofpatterns.behavioural.observer.*;
import typesofpatterns.behavioural.strategy.Context;
import typesofpatterns.behavioural.strategy.Strategy;
import typesofpatterns.behavioural.strategy.StrategyA;
import typesofpatterns.behavioural.strategy.StrategyB;
import typesofpatterns.creational.factory.Notification;
import typesofpatterns.creational.factory.NotificationFactory;
import typesofpatterns.creational.singleton.Singleton;
import typesofpatterns.structural.decorator.*;
import typesofpatterns.structural.proxy.Internet;
import typesofpatterns.structural.proxy.ProxyInternet;

/**
 * Author: Saurabh Choudhary
 * Date: 18-Aug-2023
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        //Singleton Pattern - only one instance of the class will be created.
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println("Obj1: "+obj1+" Obj2: "+obj2); //Both the references output should be same.
        System.out.println(obj1.equals(obj2));
        System.out.println("------------------------------------------");

        //Factory Pattern - encapsulates object creation. The factory class decides which instance should be returned based on the parameters passed
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.getNotificationInstance("SMS");
        notification.sendNotification();
        notification = notificationFactory.getNotificationInstance("Email");
        notification.sendNotification();
        System.out.println("------------------------------------------");

        //Decorator Pattern - Allows behaviours to be added to an object dynamically
        Component c = new ComponentA();
        Component dA = new DecoratorA(c);
        Component dB = new DecoratorB(c);
        dA.operation();
        dB.operation();
        System.out.println("------------------------------------------");

        //Proxy Pattern - provides a place holder for another object to control access to it.
        Internet proxyInternet = new ProxyInternet();
        proxyInternet.connectTo("abc.com");
        proxyInternet.connectTo("def.com");
        System.out.println("------------------------------------------");

        //Observer Pattern - establishes one to many dependency between objects so that when one object changes its state all the other dependents are notified automatically
        Subject subject = new SubjectA();
        Observer oA = new ObserverA();
        Observer oB = new ObserverB();
        subject.registerObserver(oA);
        subject.registerObserver(oB);
        subject.setState(10);
        subject.removeObserver(oA);
        subject.setState(5);
        System.out.println("------------------------------------------");

        //Strategy Pattern - enables to define a family of interchangeable algorithms
        Strategy sA = new StrategyA();
        Strategy sB = new StrategyB();
        Context context = new Context();
        context.setStrategy(sA);
        context.execute();
        context.setStrategy(sB);
        context.execute();
        System.out.println("------------------------------------------");
    }
}
