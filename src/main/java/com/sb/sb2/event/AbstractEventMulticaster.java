package com.sb.sb2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ipipman on 2020/8/22.
 *
 * @version V1.0
 * @Package com.sb.sb2.event
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/8/22 11:30 上午
 */
//定义抽象广播器实现
@Component
public abstract class AbstractEventMulticaster implements EventMulticaster {

    //事件监听器列表
    @Autowired
    private List<WeatherListener> listenerList;

    //广播事件
    @Override
    public void multicastEvent(WeatherEvent event) {
        doStart();
        listenerList.forEach(i -> i.onWeatherEvent(event));
        doEnd();
    }

    //添加监听器
    @Override
    public void addListener(WeatherListener listener) {
        listenerList.add(listener);
    }

    //删除监听器
    @Override
    public void removeListener(WeatherListener listener) {
        listenerList.remove(listener);
    }

    //模版方法
    abstract void doStart();

    //模版方法
    abstract void doEnd();


}
