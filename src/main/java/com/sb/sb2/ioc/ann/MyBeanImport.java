package com.sb.sb2.ioc.ann;

import com.sb.sb2.ioc.xml.Bird;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * Created by ipipman on 2020/9/1.
 *
 * @version V1.0
 * @Package com.sb.sb2.ioc.ann
 * @Description: (通过继承ImportBeanDEfinitionRegistrar类 ， 重新registerBeanDefinitions方法 ， 注入自定义Bean)
 * @date 2020/9/1 4:43 下午
 */
@Component
public class MyBeanImport implements ImportBeanDefinitionRegistrar {

    /**
     * 通过继承ImportBeanDEfinitionRegistrar类，重新registerBeanDefinitions方法，注入自定义Bean
     *
     * @param annotationMetadata
     * @param registry
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        rootBeanDefinition.setBeanClass(Bird.class);
        registry.registerBeanDefinition("myBird", rootBeanDefinition);
    }
}
