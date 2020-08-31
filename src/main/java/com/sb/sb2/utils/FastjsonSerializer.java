package com.sb.sb2.utils;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;

/**
 * Created by ipipman on 2020/8/31.
 *
 * @version V1.0
 * @Package com.sb.sb2.utils
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/8/31 2:22 下午
 */
@Component
public class FastjsonSerializer implements SerializerInterface {

    @Override
    public String serializer(Object object) {
        return JSON.toJSONString(object);
    }
}
