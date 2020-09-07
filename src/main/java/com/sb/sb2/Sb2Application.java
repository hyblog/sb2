package com.sb.sb2;

import com.sb.sb2.initializer.SecondInitializer;
import com.sb.sb2.listener.SecondListener;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
@MapperScan(value = "com.sb.sb2.mapper")
@Slf4j
public class Sb2Application {

    public static void main(String[] args) {
         SpringApplication.run(Sb2Application.class, args);
         log.info("Start Run Success...");

        //创建SB应用
//        SpringApplication springApplication = new SpringApplication(Sb2Application.class);

//        //添加系统化初始器
//        springApplication.addInitializers(new SecondInitializer());
//        //添加事件监听器
//        springApplication.addListeners(new SecondListener());
//        //启动SB应用
//        springApplication.run(args);
    }

}
