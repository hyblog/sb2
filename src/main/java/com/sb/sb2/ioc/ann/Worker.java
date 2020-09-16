package com.sb.sb2.ioc.ann;

import org.springframework.stereotype.Component;

/**
 * Created by ipipman on 2020/9/16.
 *
 * @version V1.0
 * @Package com.sb.sb2.ioc.ann
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/9/16 4:27 下午
 */
@Component
public class Worker {


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
