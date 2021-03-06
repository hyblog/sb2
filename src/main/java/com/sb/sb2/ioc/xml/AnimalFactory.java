package com.sb.sb2.ioc.xml;

/**
 * Created by ipipman on 2020/9/1.
 *
 * @version V1.0
 * @Package com.sb.sb2.ioc.xml
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/9/1 2:34 下午
 */
public class AnimalFactory {

    public Animal getAnimal(String type) {
        if ("dog".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
