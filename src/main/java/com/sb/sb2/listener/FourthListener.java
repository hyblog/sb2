package com.sb.sb2.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.annotation.Order;

/**
 * Created by ipipman on 2020/8/22.
 *
 * @version V1.0
 * @Package com.sb.sb2.listener
 * @Description: (SmartApplicaitonListener系统监听器，根据自己指定事件进行监听)
 * @date 2020/8/22 5:54 下午
 */
@Order(4)
@Slf4j
public class FourthListener implements SmartApplicationListener {

    /**
     * 授权对哪些时间感兴趣
     *
     * @param eventType
     * @return
     */
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return ApplicationStartedEvent.class.isAssignableFrom(eventType)
                || ApplicationPreparedEvent.class.isAssignableFrom(eventType);
    }

    /**
     * 触发事件
     *
     * @param event
     */
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        log.info("自定义【监听器】【监听SpringBoot启动事件】【FourthListener】启动 ...");
    }
}

