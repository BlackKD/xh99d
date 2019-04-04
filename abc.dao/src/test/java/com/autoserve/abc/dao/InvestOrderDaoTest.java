package com.autoserve.abc.dao;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.autoserve.abc.dao.intf.InvestOrderDao;

public class InvestOrderDaoTest extends BaseDaoTest {
	
	@Autowired
	InvestOrderDao orderDao;
	
	@Test
	public void test1(){
		BigDecimal amount = orderDao.findRedAmountByOutSeqNo("LN16308581509301354046050283x");
		System.out.println(amount);
	}
}
