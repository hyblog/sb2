package com.sb.sb2.service;

import com.sb.sb2.bean.Demo;
import com.sb.sb2.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by ipipman on 2020/8/20.
 *
 * @version V1.0
 * @Package com.sb.sb2.service
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/8/20 12:09 下午
 */
@Component
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public Demo getDemoById(Integer id) {
        return Optional.ofNullable(demoMapper.selectByPrimaryKey(id)).orElse(null);
    }
}
