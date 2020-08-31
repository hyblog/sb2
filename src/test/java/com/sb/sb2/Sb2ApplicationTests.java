package com.sb.sb2;

import com.sb.sb2.bean.NewResultModel;
import com.sb.sb2.bean.OldResult;
import com.sb.sb2.bean.OldResultModel;
import com.sb.sb2.event.WeatherRunListener;
import com.sb.sb2.utils.ConvertResultModelUtils;
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
    public void contextLoads() {

    }

    /**
     * 测试事件监听器
     */
    @Test
    public void testEvent() {
        weatherRunListener.rain();
        weatherRunListener.snow();
    }

    /**
     * 测试上下文监听器应用
     */
    @Test
    public void testContextRefreshedListener() {
        OldResultModel oldResultModel = new OldResultModel();
        OldResult oldResult = new OldResult();
        oldResult.setOldAge(1);
        oldResult.setOldName("1");
        oldResult.setOldSex("1");
        oldResultModel.setOldResult(oldResult);
        oldResultModel.setType(ConvertResultModelUtils.FAST_JSON);
        NewResultModel newResultModel = ConvertResultModelUtils.convert(oldResultModel);
        System.out.println(newResultModel);
    }
}