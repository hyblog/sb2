package com.sb.sb2.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * Created by ipipman on 2020/8/21.
 *
 * @version V1.0
 * @Package com.sb.sb2.service
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/8/21 11:38 上午
 */
@Component
public class TestInitializerService implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    /**
     * 获取系统初始化环境配置，赋予本地成员
     *
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * 获取自定义环境配置
     *
     * @return
     */
    public String test() {
        // return this.applicationContext.getEnvironment().getProperty("key1");
        // return this.applicationContext.getEnvironment().getProperty("key2");
        return this.applicationContext.getEnvironment().getProperty("key3");
    }
}
