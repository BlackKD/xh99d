/*
 * This software is the confidential and proprietary information ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only in accordance with the terms of the license agreement.
 */
package com.autoserve.abc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.autoserve.abc.dao.dataobject.TransferLoanJDO;
import com.autoserve.abc.dao.dataobject.search.TransferLoanSearchDO;
import com.autoserve.abc.dao.intf.TransferLoanDao;

/**
 * 类TransferLoanDaoTest.java的实现描述：TODO 类实现描述
 * 
 * @author segen189 2014年12月24日 上午12:11:17
 */
public class TransferLoanDaoTest extends BaseDaoTest {

    @Autowired
    private TransferLoanDao transferLoanDao;

    @Test
    public void testSearch() {
        TransferLoanSearchDO pojo = new TransferLoanSearchDO();
        pojo.setLoanId(363);
        
        List<TransferLoanJDO> data = transferLoanDao.findListBySearchParam(
				pojo, null);
        System.out.println(data.size());
    }
}
