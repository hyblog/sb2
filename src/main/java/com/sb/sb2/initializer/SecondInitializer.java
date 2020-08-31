package com.sb.sb2.initializer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
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
 * @Description: (自定义系统初始化器)
 * @date 2020/8/21 11:55 上午
 */
@Order(2) //容器加载顺序
@Slf4j
public class SecondInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        //获取环境配置
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        //自定义配置
        Map<String, Object> configMap = new HashMap<>();
        configMap.put("key2", "value2");
        //创建配置
        MapPropertySource mapPropertySource = new MapPropertySource("secndInitializer", configMap);
        //添加自定义配置
        environment.getPropertySources().addLast(mapPropertySource);
        log.info("自定以【系统初始化器】【secondInitializer】启动 ...");
    }
}
