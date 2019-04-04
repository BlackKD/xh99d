package com.autoserve.abc.dao;

public class TempTest {

	public static int calcInvestMoney() {
		int balance = 1;
		int can = 50000;// 标可投
		int retainSet = 600;// 设置保留金额
		int maxSet = 600;// 设置最大投资金额

		// 账户可投
		int balanceCan = balance - retainSet;
		int invest = balanceCan;// 投资金额
		if (balanceCan > can) {
			invest = can;
		}
		if (invest > maxSet) {
			invest = maxSet;// 不能大于用户设置的最大投资金额
		}
		// 标最大金额，最小金额限制
		int minInvest = 100;
		int maxInvest = 500;
		if (invest < minInvest) {
			return -1;
		}
		if (invest > maxInvest) {
			invest = maxInvest;
		}
		return invest;
	}

//	public static void main(String[] args) {
//		BigDecimal a = new BigDecimal("2");
//		a.subtract(null);
//	}
}
