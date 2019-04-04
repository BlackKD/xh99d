package com.autoserve.abc.service.biz.impl.loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.autoserve.abc.service.biz.impl.BaseServiceTest;
import com.autoserve.abc.service.biz.intf.loan.AutoInvestLoanService;

public class AutoInvestLoanServiceTest extends BaseServiceTest{
	
	@Autowired
	AutoInvestLoanService autoInvestService;
	
	@Test
	public void testInvest(){
		autoInvestService.run(519);
	}
}
