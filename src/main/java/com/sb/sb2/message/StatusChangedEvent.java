package com.sb.sb2.message;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by ipipman on 2020/9/1.
 *
 * @version V1.0
 * @Package com.sb.sb2.message
 * @Description: (信息事件)
 * @date 2020/9/1 10:28 上午
 */
@Getter
@Setter
@ToString
public class StatusChangedEvent {

    private String topic;

    private String tag;

    private String content;
}
