package com.autoserve.abc.service.biz.impl.loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.autoserve.abc.service.biz.impl.BaseServiceTest;
import com.autoserve.abc.service.biz.intf.loan.NumberRuleService;
import com.autoserve.abc.service.biz.result.PlainResult;

public class NumberRuleServiceTest extends BaseServiceTest{
	@Autowired
	NumberRuleService ruleService;
	
	@Test
	public void testCreateRule(){
		PlainResult<String> result = ruleService.createNumberByYear();
		System.out.println(result.getData());
	}
}
