package com.sb.sb2.event;

/**
 * Created by ipipman on 2020/8/22.
 *
 * @version V1.0
 * @Package com.sb.sb2.event
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/8/22 11:19 上午
 */
public interface WeatherListener {

    //定义天气事件监听器
    void onWeatherEvent(WeatherEvent event);
}
