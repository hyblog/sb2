package com.sb.sb2.ioc.ann;

import com.sb.sb2.ioc.xml.Monkey;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;


/**
 * Created by ipipman on 2020/9/1.
 *
 * @version V1.0
 * @Package com.sb.sb2.ioc.ann
 * @Description: (通过继承BeanDefinitionRegistryPostProcessor类，实现postProcessBeanDefinitionRegistry方法，实现自定义Bean注入)
 * @date 2020/9/1 4:30 下午
 */
@Component
public class MyBeanRegister implements BeanDefinitionRegistryPostProcessor {

    /**
     * 通过继承BeanDefinitionRegistryPostProcessor类，实现postProcessBeanDefinitionRegistry方法，实现自定义Bean注入
     *
     * @param registry
     * @throws BeansException
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        rootBeanDefinition.setBeanClass(Monkey.class);
        registry.registerBeanDefinition("myMonkey", rootBeanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
