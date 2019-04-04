package com.autoserve.abc.service.biz.impl.loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.autoserve.abc.dao.dataobject.AheadRepay;
import com.autoserve.abc.service.biz.impl.BaseServiceTest;
import com.autoserve.abc.service.biz.intf.loan.repay.AheadRepayService;

public class AheadRepayServiceTest extends BaseServiceTest{
	
	@Autowired
	AheadRepayService service;
	
	@Test
	public void testApply(){
		AheadRepay aheadRepay = new AheadRepay();
		aheadRepay.setLoanId(631);
		aheadRepay.setUserId(296);
		service.apply(aheadRepay);
	}
	
	@Test
	public void testAheadRepay(){
//		service.aheadRepay(630);
	}
}
