package com.autoserve.abc.service.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.autoserve.abc.dao.dataobject.SmsNotifyCfg;
import com.autoserve.abc.service.biz.enums.SysConfigEntry;
import com.autoserve.abc.service.biz.impl.BaseServiceTest;
import com.autoserve.abc.service.biz.intf.sys.SysConfigService;
import com.autoserve.abc.service.biz.result.PlainResult;

public class SysConfigServiceTest extends BaseServiceTest {
	@Autowired
	SysConfigService sysConfigService;

	@Test
	public void test1() {
		PlainResult<SmsNotifyCfg> result = sysConfigService
				.querySmsNotifyConfig(SysConfigEntry.SMS_NOTIFY_ABORT_BID_TRANSFER_USER);
		System.out.println(result.isSuccess());
		System.out.println(result.getMessage());
		System.out.println(result.getData().getContentTemplate());
		System.out.println(result.getData().getSwitchState());
	}
}
