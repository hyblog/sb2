package com.sb.sb2.event;

import org.springframework.stereotype.Component;

/**
 * Created by ipipman on 2020/8/22.
 *
 * @version V1.0
 * @Package com.sb.sb2.event
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/8/22 11:40 上午
 */
@Component
public class WeatherEventMulticaster extends AbstractEventMulticaster {

    @Override
    public void doStart() {
        System.out.println("begin weather event ...");
    }

    @Override
    public void doEnd() {
        System.out.println("end weather event ...");
    }
}
