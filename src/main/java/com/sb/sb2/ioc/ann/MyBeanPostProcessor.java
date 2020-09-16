package com.sb.sb2.ioc.ann;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by ipipman on 2020/9/16.
 *
 * @version V1.0
 * @Package com.sb.sb2.ioc.ann
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/9/16 4:45 下午
 */
@Component
public class MyBeanPostProcessor implements
        InstantiationAwareBeanPostProcessor {


    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (beanName.equals("worker")){
            return new Worker();
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (beanName.equals("worker")){
            Worker worker = (Worker) bean;
            worker.setName("master");
        }
        return false;
    }


}
