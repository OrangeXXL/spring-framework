package com.wen.demo;

import com.wen.demo.service.IService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author WenXun
 * @version 1.0
 * @date 2021/3/2 下午4:59
 */
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IService service = (IService) context.getBean("beanTest");
        service.sayHello();

    }
}
