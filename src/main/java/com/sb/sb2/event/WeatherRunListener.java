package com.sb.sb2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by ipipman on 2020/8/22.
 *
 * @version V1.0
 * @Package com.sb.sb2.event
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/8/22 3:08 下午
 */
@Component
public class WeatherRunListener {

    @Autowired
    private WeatherEventMulticaster eventMulticaster;

    public void snow(){
        eventMulticaster.multicastEvent(new SnowEvent());
    }

    public void rain(){
        eventMulticaster.multicastEvent(new RainEvent());
    }
}
