package cn.longq.test;

import cn.longq.base.MyClassPathXMLApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author DC.LonQ
 */
public class BaseMain {

	public static void main(String[] args) {
		System.out.println("1111");
//		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-${username}.xml");
		MyClassPathXMLApplicationContext ac = new MyClassPathXMLApplicationContext("spring-${username}.xml");
//		System.out.println("222");
//		Object person = ac.getBean("person");
//		System.out.println(person.toString());
	}

}
