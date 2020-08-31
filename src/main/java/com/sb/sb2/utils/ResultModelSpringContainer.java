package com.sb.sb2.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by ipipman on 2020/8/31.
 *
 * @version V1.0
 * @Package com.sb.sb2.utils
 * @Description: (定义事件触发器 ， 在容器启动完成事件后 ， 获取当前容器上下文)
 * @date 2020/8/31 2:28 下午
 */
@Component
public class ResultModelSpringContainer implements ApplicationListener<ContextRefreshedEvent> {

    private ApplicationContext applicationContext;

    private static ResultModelSpringContainer resultModelSpringContainer;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (applicationContext == null) {
            applicationContext = event.getApplicationContext();
        }
        resultModelSpringContainer = this;
    }

    public static ResultModelSpringContainer getInstance() {
        return resultModelSpringContainer;
    }

    public <T> T getBean(Class<T> clazz) {
        return applicationContext.getBean(clazz);
    }
}
