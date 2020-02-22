package com.p2.p2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("context.xml");
		RefrenceBean refrenceBean = (RefrenceBean)beanFactory.getBean("ref_id");
		System.out.println(refrenceBean.getMessage());
	}
}
