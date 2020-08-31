package com.sb.sb2.event;

import org.springframework.stereotype.Component;

/**
 * Created by ipipman on 2020/8/22.
 *
 * @version V1.0
 * @Package com.sb.sb2.event
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/8/22 11:24 上午
 */
//下雨事件坚挺器
@Component
public class RainListener implements WeatherListener {

    //实现下雨事件监听器
    @Override
    public void onWeatherEvent(WeatherEvent event){
        if (event instanceof RainEvent){
            System.out.println(event.getWeather());
        }
    }
}
