package com.sb.sb2.initializer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ipipman on 2020/8/21.
 *
 * @version V1.0
 * @Package com.sb.sb2.initializer
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/8/21 12:10 下午
 */
@Order(3)
@Slf4j
public class ThirdInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    /**
     * 自定义系统初始化器
     *
     * @param applicationContext
     */
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        //获取系统环境配置
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        //自定义配置
        Map<String, Object> configMap = new HashMap<>();
        configMap.put("key3", "value3");
        MapPropertySource mapPropertySource = new MapPropertySource("thirdInitialize", configMap);
        //添加自定义配置
        environment.getPropertySources().addLast(mapPropertySource);
        log.info("自定以【系统初始化器】【ThirdInitializer】启动 ...");
    }
}
