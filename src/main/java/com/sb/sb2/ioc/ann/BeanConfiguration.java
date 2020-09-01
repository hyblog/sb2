package com.sb.sb2.ioc.ann;

import com.sb.sb2.ioc.xml.Animal;
import com.sb.sb2.ioc.xml.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ipipman on 2020/9/1.
 *
 * @version V1.0
 * @Package com.sb.sb2.ioc.ann
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/9/1 3:57 下午
 */
@Configuration
public class BeanConfiguration {

    @Bean(name = "dog")
    public Animal getDog(){
        return new Dog();
    }
}
