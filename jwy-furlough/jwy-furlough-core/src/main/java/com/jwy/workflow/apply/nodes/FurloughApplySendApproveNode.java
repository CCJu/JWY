/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.apply.nodes;

import com.jwy.entity.FurloughDto;
import com.jwy.mapper.FurloughMapper;
import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.apply.FurloughApplyContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author juchengcheng
 * @version : FurloughApplySendApproveNode.java,v 0.1 2020年05月06日 23:22
 */
@Component
public class FurloughApplySendApproveNode implements Node<FurloughApplyContext> {

    @Resource
    private FurloughMapper furloughMapper;

    @Override
    public String getName() {
        return FurloughApplyNodeNames.SEND_APPROVE;
    }

    @Override
    public NodeResult execute(FurloughApplyContext furloughApplyContext) {
        // 保存请假信息到数据库
        FurloughDto furloughDto = furloughApplyContext.getFurloughDto();
        furloughMapper.add(furloughDto);
        return NodeResult.finish();
    }
}
