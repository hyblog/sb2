package com.sb.sb2.ioc.xml;

import org.springframework.stereotype.Component;

/**
 * Created by ipipman on 2020/9/1.
 *
 * @version V1.0
 * @Package com.sb.sb2.ioc.xml
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/9/1 11:53 上午
 */
@Component
public class HelloService {

    private Student student;

    private Animal animal;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String hello() {
        return animal.getName();
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

}
