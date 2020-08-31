package com.sb.sb2.event;

/**
 * Created by ipipman on 2020/8/22.
 *
 * @version V1.0
 * @Package com.sb.sb2.event
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/8/22 11:26 上午
 */
//事件广播器
public interface EventMulticaster {

    //广播事件
    void multicastEvent(WeatherEvent event);

    //添加监听器
    void addListener(WeatherListener listener);

    //删除监听器
    void removeListener(WeatherListener listener);
}
