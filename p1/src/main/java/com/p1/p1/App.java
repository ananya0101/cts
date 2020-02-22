package com.p1.p1;

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
        //BasicBean bean = (BasicBean) beanfactory.getBean("basic");
        //System.out.println(bean.getMesg());
        SetterInjection bean = (SetterInjection) beanfactory.getBean("been_message");
		String msg = bean.getMessage();
		System.out.println(msg);
		 ConstructorInjection bean1 = (ConstructorInjection) beanfactory.getBean("springMessage");
			System.out.println(bean1.getMessage());
			System.out.println(bean1.getValue());
    }
}
