package com.p4.p4;

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
        BeanFactory beanfactory = new ClassPathXmlApplicationContext("context.xml");
	        CollegeBean coll = (CollegeBean) beanfactory.getBean("collegeBean");
		    System.out.println(coll);
}
    }

