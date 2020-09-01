package com.sb.sb2.message;

import java.util.Set;

/**
 * Created by ipipman on 2020/9/1.
 *
 * @version V1.0
 * @Package com.sb.sb2.message
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/9/1 10:32 上午
 */
public interface EventExecutor {

    /**
     * 关联感兴趣的消息事件
     *
     * @return
     */
    Set<String> supportTag();

    /**
     * 执行具体的消息事件
     *
     * @param event
     */
    void handleEvent(StatusChangedEvent event);
}
