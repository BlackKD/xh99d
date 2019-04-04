package com.autoserve.abc.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.autoserve.abc.dao.common.PageCondition;
import com.autoserve.abc.dao.dataobject.AheadRepay;
import com.autoserve.abc.dao.dataobject.enums.AheadRepayState;
import com.autoserve.abc.dao.intf.AheadRepayDao;

public class AheadRepayDaoTest extends BaseDaoTest{
	
	@Autowired
	AheadRepayDao dao;
	
	@Test
	public void testInsert(){
		AheadRepay t = new AheadRepay();
		
		t.setLoanId(1);
		t.setUserId(296);
		t.setState(AheadRepayState.WAIT_AUDIT);
		t.setCreateDate(new Date());
		dao.insert(t);
	}
	
	@Test
	public void testFindOne(){
		AheadRepay t = new AheadRepay();
//		t.setLoanId(629);
//		List<AheadRepayState> states = Lists.newArrayList(AheadRepayState.WAIT_AUDIT,AheadRepayState.AUDIT_PASS);
//		t.setSearchState(states);
		t.setId(25);
		t = dao.findOne(t);
	}
	
	@Test
	public void testFindList(){
		AheadRepay t = new AheadRepay();
//		LoanDO loanDO = new LoanDO();
//		loanDO.setLoanNo("提");
//		t.setLoanDO(loanDO);
//		int count = dao.countList(t);
//		System.out.println(count);
		t.setUserId(1);
		List<AheadRepay> list = dao.findList(t, new PageCondition(1, 5));
		for(AheadRepay a:list){
			System.out.println(a);
		}
	}
	
	@Test
	public void testUpdate(){
		AheadRepay t = new AheadRepay();
		t.setId(25);
		t.setAuditDate(new Date());
		t.setAuditUserId(1);
		t.setState(AheadRepayState.AUDIT_PASS);
		t.setAuditOpinion("ss");
		dao.update(t);
	}
}
