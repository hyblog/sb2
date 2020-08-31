package com.sb.sb2.utils;

import com.sb.sb2.bean.NewResult;
import com.sb.sb2.bean.NewResultModel;
import com.sb.sb2.bean.OldResultModel;
import org.springframework.stereotype.Component;

/**
 * Created by ipipman on 2020/8/31.
 *
 * @version V1.0
 * @Package com.sb.sb2.utils
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/8/31 2:19 下午
 */
@Component
public class ConvertResultModelUtils {

    public static final String FAST_JSON = "fastjson";
    public static final String JACKSON = "jackson";

    /**
     * 静态方法通过上下文监听器实现类注入
     *
     * @param oldResultModel
     * @return
     */
    public static NewResultModel convert(OldResultModel oldResultModel) {
        NewResultModel newResultModel = new NewResultModel();
        NewResult newResult = new NewResult();
        newResult.setNewAge(oldResultModel.getOldResult().getOldAge());
        newResult.setNewName(oldResultModel.getOldResult().getOldName());
        newResult.setNewSex(oldResultModel.getOldResult().getOldSex());
        // 获取上下文监听器后初始化的静态json类
        if (FAST_JSON.equals(oldResultModel.getType())) {
            FastjsonSerializer fastjsonSerializer = ResultModelSpringContainer.getInstance().getBean(FastjsonSerializer.class);
            newResultModel.setOldResultDesc(fastjsonSerializer.serializer(newResult));
        } else if (JACKSON.equals(oldResultModel.getType())) {
            JacksonSerializer jacksonSerializer = ResultModelSpringContainer.getInstance().getBean(JacksonSerializer.class);
            newResultModel.setOldResultDesc(jacksonSerializer.serializer(newResult));
        }
        newResultModel.setNewResult(newResult);
        return newResultModel;
    }
}
