package com.sb.sb2.event;

/**
 * Created by ipipman on 2020/8/22.
 *
 * @version V1.0
 * @Package com.sb.sb2.event
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/8/22 11:42 上午
 */
public class Test {

    public static void main(String[] args){

        //创建广播器
        WeatherEventMulticaster eventMulticaster = new WeatherEventMulticaster();

        //创建下雨事件监听器
        RainListener rainListener = new RainListener();
        //创建下雪事件监听器
        SnowListener snowListener = new SnowListener();

        //添加监听器
        eventMulticaster.addListener(rainListener);
        eventMulticaster.addListener(snowListener);

        //广播天气事件
        eventMulticaster.multicastEvent(new RainEvent());
        eventMulticaster.multicastEvent(new SnowEvent());

        //删除监听器
        eventMulticaster.removeListener(rainListener);

        //广播天气事件
        eventMulticaster.multicastEvent(new RainEvent());
        eventMulticaster.multicastEvent(new SnowEvent());



    }
}
