package com.sb.sb2.event;

import org.springframework.stereotype.Component;

/**
 * Created by ipipman on 2020/8/22.
 *
 * @version V1.0
 * @Package com.sb.sb2.event
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/8/22 11:21 上午
 */
//下雪事件监听器
@Component
public class SnowListener implements WeatherListener {

    //实现监听天气监听
    @Override
    public void onWeatherEvent(WeatherEvent event){
        if (event instanceof SnowEvent){
            System.out.println(event.getWeather());
        }
    }
}
