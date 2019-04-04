package com.autoserve.abc.service.util;

import java.util.HashMap;
import java.util.Map;

import com.autoserve.abc.service.biz.impl.cash.MiscUtil;
import com.autoserve.abc.service.biz.result.PlainResult;
import com.autoserve.abc.service.http.AbcHttpCallService;
import com.autoserve.abc.service.http.AbcHttpCallServiceImpl;

public class TokenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final AbcHttpCallService abcHttpCallService = new AbcHttpCallServiceImpl();
		PlainResult<Map<String, String>> result = new PlainResult<Map<String, String>>();
        Map<String, String> params = new HashMap<String, String>();
        params.put("appid", "wxf09fcbb0bb3edbee");
        params.put("secret", "0e4dcd0eb0d82878d30d164c9f5e9ab5");
        params.put("grant_type", "client_credential");
        String submitUrl = "https://api.weixin.qq.com/cgi-bin/token";
        String resultStr = abcHttpCallService.httpGet(submitUrl, params).getData();
        Map<String, String> paramsResult = new HashMap<String, String>();
        paramsResult = MiscUtil.parseJSON(resultStr.toString());
        String token = paramsResult.get("access_token");
        result.setData(paramsResult);
	}

}
