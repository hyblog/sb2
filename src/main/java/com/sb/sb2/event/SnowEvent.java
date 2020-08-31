package com.sb.sb2.event;

/**
 * Created by ipipman on 2020/8/22.
 *
 * @version V1.0
 * @Package com.sb.sb2.event
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/8/22 11:15 上午
 */
//下雪事件，继承天气事件
public class SnowEvent extends WeatherEvent {

    @Override
    public String getWeather() {
        return "Snow Event";
    }
}
