/*
 * This software is the confidential and proprietary information ("Confidential Information"). 
 * You shall not disclose such Confidential Information and shall use it only in accordance with the terms of the license agreement.
 */
package com.autoserve.abc.dao;

import java.util.List;

import javax.annotation.Resource;

import org.testng.annotations.Test;

import com.autoserve.abc.dao.common.PageCondition;
import com.autoserve.abc.dao.dataobject.IncomePlanDO;
import com.autoserve.abc.dao.intf.IncomePlanDao;

/**
 * 类PlanIncomeTest.java的实现描述：TODO 类实现描述
 * 
 * @author J.YL 2014年12月28日 下午11:11:00
 */
public class PlanIncomeTest extends BaseDaoTest {
    @Resource
    private IncomePlanDao dao;

    //@Test
    public void updateIncomePlanByAllocPunishMoneyTest() {
        dao.updateIncomePlanByAllocPunishMoney(1, 1000, 1);
    }

    @Test
    public void Test() {
        IncomePlanDO incomePlanDO = new IncomePlanDO();
        incomePlanDO.setPiBeneficiary(1);
        IncomePlanDO incomePlan = dao.findlastIncomePlanBySearch(incomePlanDO, null);
        System.out.println(incomePlan.getPiId());
    }
    
    @Test
    public void testFindParam(){
    	IncomePlanDO plan = new IncomePlanDO();
    	plan.setPiId(759);
    	
    	List<IncomePlanDO>  list = dao.findListByParam(plan, new PageCondition(1, 10));
    	
    	IncomePlanDO in = list.get(0);
    	System.out.println(in.getPiIncomePlanState());
//    	dao.batchInsert(list);
    }
    
   

}
