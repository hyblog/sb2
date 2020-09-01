package com.sb.sb2.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ipipman on 2020/9/1.
 *
 * @version V1.0
 * @Package com.sb.sb2.message
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/9/1 10:35 上午
 */
@Component
@Slf4j
public class SecondExecutor implements EventExecutor {

    /**
     * 关联感兴趣的消息事件
     *
     * @return
     */
    @Override
    public Set<String> supportTag() {
        return new HashSet<String>() {
            {
                add(EventConstant.DELETE);
                add(EventConstant.QUERY);
            }
        };
    }

    /**
     * 执行消息事件
     *
     * @param event
     */
    @Override
    public void handleEvent(StatusChangedEvent event) {
        log.info("Message SecondExecutor " + event.getContent());
    }
    
}
