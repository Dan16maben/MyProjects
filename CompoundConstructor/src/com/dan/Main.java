package com.dan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		 Resource r=new ClassPathResource("Bean.xml");  
	        @SuppressWarnings("deprecation")
			BeanFactory factory=new XmlBeanFactory(r);     
	        Compound c=(Compound)factory.getBean("c");  
	        c.Display();  
	}

}
