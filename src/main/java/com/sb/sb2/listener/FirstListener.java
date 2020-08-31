package com.sb.sb2.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;

import javax.validation.constraints.Size;

/**
 * Created by ipipman on 2020/8/22.
 *
 * @version V1.0
 * @Package com.sb.sb2.listener
 * @Description: (自定义监听器)
 * @date 2020/8/22 5:32 下午
 */
@Slf4j
@Order(1)
public class FirstListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event){
        log.info("自定义【监听器】【监听SpringBoot启动事件】【FirstListener】启动 ...");
    }
}
