package com.autoserve.abc.web.module.screen.banel;

import javax.annotation.Resource;

import com.alibaba.citrus.service.requestcontext.parser.ParameterParser;
import com.alibaba.citrus.turbine.Context;
import com.autoserve.abc.service.biz.intf.authority.AuthorityService;
import com.autoserve.abc.web.util.GetButtonUtils;

/**
 * 类ArticleView.java的实现描述：TODO 类实现描述
 * 
 * @author liuwei 2014年12月18日 下午3:13:33
 */
public class BanelView {
    
	@Resource
    private AuthorityService authorityService;
	
    public void execute(Context context, ParameterParser params) {
    	GetButtonUtils.getButtons(authorityService, context, params);
    }

}
