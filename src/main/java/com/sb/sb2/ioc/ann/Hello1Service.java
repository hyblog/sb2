package com.sb.sb2.ioc.ann;

import com.sb.sb2.ioc.xml.Animal;
import com.sb.sb2.ioc.xml.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by ipipman on 2020/9/1.
 *
 * @version V1.0
 * @Package com.sb.sb2.ioc.ann
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/9/1 4:00 下午
 */
@Component
public class Hello1Service {

    private Student student;

    @Autowired
//    @Qualifier(value = "myCat") //多个相同的Bean名称用Qualifier注定
    @Qualifier(value = "myMonkey") //多个相同的Bean名称用Qualifier注定
//    @Qualifier(value = "myBird") //多个相同的Bean名称用Qualifier注定
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
