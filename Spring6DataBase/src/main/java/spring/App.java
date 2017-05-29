package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans/beans.xml");
		Robot robot = (Robot) context.getBean("robot");
		robot.speech();
		((ClassPathXmlApplicationContext) context).close();
	}

}
