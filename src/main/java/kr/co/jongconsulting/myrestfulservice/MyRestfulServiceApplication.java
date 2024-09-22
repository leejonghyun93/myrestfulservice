package kr.co.jongconsulting.myrestfulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyRestfulServiceApplication {

	public static void main(String[] args) {
	 SpringApplication.run(MyRestfulServiceApplication.class, args);

//		String[] allBeanNams = ac.getBeanDefinitionNames();
//		for (String beanName : allBeanNams){
//			System.out.println(beanName);
//		}
	}

}
