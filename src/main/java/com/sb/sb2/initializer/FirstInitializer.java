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
 * @Description: (SpringBoot 系统初始化器)
 * @date 2020/8/21 10:22 上午
 */

@Order(1) //定义容器加载顺序
@Slf4j
public class FirstInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    /**
     * 实现自定义系统初始化器
     *
     * @param applicationContext
     */
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        //获取环境配置
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        //自定义配置
        Map<String, Object> configMap = new HashMap<>();
        configMap.put("key1", "value1");
        //创建配置
        MapPropertySource mapPropertySource =
                new MapPropertySource("firstInitializer", configMap);
        //在当前环境配置最后添加自定义配置
        environment.getPropertySources().addLast(mapPropertySource);
        log.info("自定以【系统初始化器】【FirstInitializer】启动 ...");
    }
}
