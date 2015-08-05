package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {

  public Client() {
    System.out.println("Client....");
  }
  /**
   * @param args
   */
  public static void main(String[] args) {
    // Find XML
    ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
    
    // create test class object
    Object o1 = ap.getBean("t");
    Object o2 = ap.getBean("t");
    //Object o3 = ap.getBean("t");
    if(o1 == o2) System.out.println("true");
    else System.out.println("false");
    Test t = (Test)o1;
    t.hello();
    ((ConfigurableApplicationContext)ap).close();
  }

}
