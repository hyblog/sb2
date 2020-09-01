package com.sb.sb2;

import com.sb.sb2.ioc.ann.Hello1Service;
import com.sb.sb2.ioc.xml.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by ipipman on 2020/9/1.
 *
 * @version V1.0
 * @Package com.sb.sb2
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/9/1 12:18 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//@ContextConfiguration(locations = "classpath:ioc/demo.xml") //指定SpringBoot上下文加载自定义XML Bean
public class Sb2XmlApplicationTests {

    @Autowired
    private HelloService helloService;

    @Autowired
    private Hello1Service hello1Service;

    /**
     * 测试自定义无参XML的Bean
     */
    @Test
    public void testXmlBean() {
        // System.out.println(helloService.hello());
    }


    /**
     * 测试@Bean注解
     */
    @Test
    public void testBeanAnnotation() {
        System.out.println(hello1Service.hello());
    }
}
