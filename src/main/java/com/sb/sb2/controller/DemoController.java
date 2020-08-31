package com.sb.sb2.controller;

import com.sb.sb2.bean.Demo;
import com.sb.sb2.service.DemoService;
import com.sb.sb2.service.TestInitializerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

/**
 * Created by ipipman on 2020/8/20.
 *
 * @version V1.0
 * @Package com.sb.sb2.controller
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/8/20 12:11 下午
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @Autowired
    private TestInitializerService initializerService;

    @RequestMapping("/get/{id}")
    @ResponseBody
    public String getDemo(@PathVariable(value = "id") Integer id) {
        System.out.println(id);
        return Optional.ofNullable(demoService.getDemoById(id)).map(Demo::toString).orElse(null);
    }

    /**
     * 测试自定系统初始化器配置
     */
    @RequestMapping("/test/initializer")
    @ResponseBody
    public String testInitializer() {
        return initializerService.test();
    }
}
