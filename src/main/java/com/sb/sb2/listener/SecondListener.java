package com.sb.sb2.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;

/**
 * Created by ipipman on 2020/8/22.
 *
 * @version V1.0
 * @Package com.sb.sb2.listener
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/8/22 5:42 下午
 */
@Order(1)
@Slf4j
public class SecondListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event){
        log.info("自定义【监听器】【监听SpringBoot启动事件】【SecondListener】启动 ...");
    }
}
