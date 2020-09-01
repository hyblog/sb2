package com.sb.sb2.ioc.ann;

import com.sb.sb2.ioc.xml.Animal;
import com.sb.sb2.ioc.xml.Cat;
import com.sb.sb2.ioc.xml.Dog;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * Created by ipipman on 2020/9/1.
 *
 * @version V1.0
 * @Package com.sb.sb2.ioc.ann
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/9/1 4:18 下午
 */
@Component
public class MyCat implements FactoryBean<Animal> {

    /**
     * 返回具体的工厂Bean对象
     *
     * @return
     * @throws Exception
     */
    @Override
    public Animal getObject() throws Exception {
        return new Dog();
    }

    /**
     * 获取Bean类型
     *
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Animal.class;
    }

}
