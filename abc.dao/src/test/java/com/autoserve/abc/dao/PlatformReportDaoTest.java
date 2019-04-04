package com.autoserve.abc.dao;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;
import com.autoserve.abc.dao.dataobject.PlatformReport;
import com.autoserve.abc.dao.intf.PlatformReportDao;

public class PlatformReportDaoTest extends BaseDaoTest{
	
	@Autowired
	PlatformReportDao dao;
	
	@Test
	public void testReport(){
		DateTime beginDate = new DateTime(2015,12,1, 0,0,0);
		DateTime endDate = new DateTime(2015,12,31, 23,59,59);
		PlatformReport report = new PlatformReport();
		report.setBeginDate(beginDate.toDate());
		report.setEndDate(endDate.toDate());
		Integer i = dao.report(report);
		System.out.println(report);
	}
}
