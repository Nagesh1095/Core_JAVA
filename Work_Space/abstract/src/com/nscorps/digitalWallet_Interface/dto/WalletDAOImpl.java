package com.nscorps.digitalWallet_Interface.dto;

import com.nscorps.digitalWallet_Interface.dao.WalletDAO;

public class WalletDAOImpl implements WalletDAO {

	WalletDTO[] dtos = new WalletDTO[1];
	int index = 0;
	int count;
	int transactions = 0;

	@Override
	public String createWallet(WalletDTO dto) {
		dtos[index] = dto;
		index++;
		return "Wallet Created";
	}

	@Override
	public float getCurrentBalance(String name) {
		for (int index = 0; index < dtos.length; index++) {
			if (dtos[index] != null && name.equals(dtos[index].getName())) {
				return dtos[index].getAvailableBalance();
			}
		}
		return 0;
	}

	@Override
	public float addMoney(double credit, String name) {
		float totalBalance;
		for (int index = 0; index < dtos.length; index++) {
			if (dtos[index] != null && name.equals(dtos[index].getName())) {
				totalBalance = (float) (dtos[index].getAvailableBalance() + credit);
				dtos[index].setAvailableBalance(totalBalance);
				count++;
				transactions += credit;
				return totalBalance;
			}
		}
		return 0;
	}

	@Override
	public float pay(double debit, String name) {
		float totalBalance;
		for (int index = 0; index < dtos.length; index++) {
			if (dtos[index] != null && name.equals(dtos[index].getName())) {
				totalBalance = (float) (dtos[index].getAvailableBalance() - debit);
				dtos[index].setAvailableBalance(totalBalance);
				count++;
				transactions += debit;
				return totalBalance;
			}
		}
		return 0;
	}

	@Override
	public byte getRemainingTransaction() {
		byte remainingTrans;
		for (int index = 0; index < dtos.length;) {
			remainingTrans = (byte) (dtos[index].getNoOfTransaction() - count);
			dtos[index].setNoOfTransaction(remainingTrans);
			return (byte) remainingTrans;
		}

		return 0;
	}

	@Override
	public byte getTotalTodaysTransaction() {
//		byte allTrans;
//		for (int index = 0; index < dtos.length; index++) {
//			if (dtos[index] != null && name.equals(dtos[index].getName())) {
//				allTrans = (byte) (dtos[index].getNoOfTransaction() - );
//				dtos[index].setNoOfTransaction(allTrans);
//				return (byte) allTrans=count;
//			}
//		}
		return (byte) count;
	}

	@Override
	public double totalTransactionInAmount() {
		return transactions;
	}

	@Override
	public void printAll() {
		for (int index = 0; index < dtos.length; index++) {
			System.out.println(dtos[index]);
		}
	}

}
