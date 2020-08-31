package com.sb.sb2;

import com.sb.sb2.event.WeatherRunListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by ipipman on 2020/8/22.
 *
 * @version V1.0
 * @Package com.sb.sb2
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/8/22 3:15 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Sb2ApplicationTests {

    @Autowired
    private WeatherRunListener weatherRunListener;

    @Test
    public void contextLoads(){

    }

    /**
     * 测试事件监听器
     */
    @Test
    public void testEvent(){
        weatherRunListener.rain();
        weatherRunListener.snow();
    }
}
