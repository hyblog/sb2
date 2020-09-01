package com.sb.sb2.message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by ipipman on 2020/9/1.
 *
 * @version V1.0
 * @Package com.sb.sb2.message
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/9/1 10:42 上午
 */
@Component
public class EventHandle implements ApplicationListener<ContextRefreshedEvent> {

    // 消息事件
    private final Map<String, Set<EventExecutor>> executorMap = new HashMap<>();

    /**
     * 绑定监听器事件
     *
     * @param event
     */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // synchronized 防止并发
        synchronized (executorMap) {
            // 获取Spring容器上下文
            ApplicationContext applicationContext = event.getApplicationContext();
            // 从Spring容器上下文中，获取消息事件接口类
            Map<String, EventExecutor> eventExecutorMap = applicationContext.getBeansOfType(EventExecutor.class);
            if (!eventExecutorMap.isEmpty()) {
                // 遍历所有上下文中的消息事件类
                for (EventExecutor eventExecutor : eventExecutorMap.values()) {
                    // 获取事件中的Tag（UPDATE，INSERT，DELETE，QUERY）
                    Set<String> tags = eventExecutor.supportTag();
                    for (String tag : tags) {
                        // 如果当前事件没有添加，则添加
                        if (executorMap.containsKey(tag)) {
                            executorMap.get(tag).add(eventExecutor);
                        } else {
                            Set<EventExecutor> executorSet = new HashSet<>();
                            executorSet.add(eventExecutor);
                            executorMap.put(tag, executorSet);
                        }
                    }
                }
            }
        }
    }

    /**
     * 执行具体的事件
     *
     * @param event
     */
    public void handleEvent(StatusChangedEvent event) {
        executorMap.get(event.getTag()).forEach(it -> it.handleEvent(event));
    }

}
