package com.nscorps.digitalWallet_Interface;

import com.nscorps.digitalWallet_Interface.dao.WalletDAO;
import com.nscorps.digitalWallet_Interface.dto.WalletDAOImpl;
import com.nscorps.digitalWallet_Interface.dto.WalletDTO;

public class Tester {
	public static void main(String[] args) {
		WalletDAO dao = new WalletDAOImpl();
		WalletDTO dto = new WalletDTO();
		WalletDAO dao1 = new WalletDAOImpl();
		WalletDAO dao2 = new WalletDAOImpl();
		dto.setName("NS Pay");
		dto.setNoOfTransaction((byte) 15);
		dto.setAvailableBalance(35.6f);
		dto.setMaxTransaction(100000);
		dto.setReward("X-workz 50% Off");

		WalletDTO dto1 = new WalletDTO();
		dto1.setName("Phone-pe");
		dto1.setNoOfTransaction((byte) 15);
		dto1.setAvailableBalance(30265.6f);
		dto1.setMaxTransaction(50000);
		dto1.setReward("Zomato");

		WalletDTO dto2 = new WalletDTO();
		dto2.setName("GPay");
		dto2.setNoOfTransaction((byte) 15);
		dto2.setAvailableBalance(325815.6f);
		dto2.setMaxTransaction(100000);
		dto2.setReward("Better luck Next Time");

		dao.createWallet(dto);
		dao1.createWallet(dto1);
		dao2.createWallet(dto2);
		dao.printAll();
		dao1.printAll();
		dao2.printAll();
		System.out.println("\n" + "The Current Balance is : " + dao.getCurrentBalance("NS Pay"));
		System.out.println("\n" + "The Updated Balance is : " + dao.addMoney(254.6, "NS Pay"));
		System.out.println("\n" + "The Updated Balance is : " + dao.addMoney(569, "NS Pay"));
		System.out.println("\n" + "The Updated Balance is : " + dao.addMoney(569, "NS Pay"));
		System.out.println("\n" + "The Updated Balance is : " + dao.pay(203, "NS Pay"));
		System.out.println("\n" + "Total Remaining Transactions are : " + (byte) dao.getRemainingTransaction());
		System.out.println("\n" + "Total Transactions are : " + (byte) dao.getTotalTodaysTransaction());
		System.out.println("\n" + "Total Transactions in Amount : " + (double) dao.totalTransactionInAmount());

		System.out.println("\n" + "The Current Balance is : " + dao1.getCurrentBalance("Phone-pe"));
		System.out.println("\n" + "The Updated Balance is : " + dao1.addMoney(2554.6, "Phone-pe"));
		System.out.println("\n" + "The Updated Balance is : " + dao1.addMoney(3468, "Phone-pe"));
		System.out.println("\n" + "The Updated Balance is : " + dao1.addMoney(8585, "Phone-pe"));
		System.out.println("\n" + "Total Remaining Transactions are : " + (byte) dao1.getRemainingTransaction());
		System.out.println("\n" + "Total Transactions are : " + (byte) dao1.getTotalTodaysTransaction());
		System.out.println("\n" + "Total Transactions in Amount : " + (double) dao1.totalTransactionInAmount());

		System.out.println("\n" + "The Current Balance is : " + dao2.getCurrentBalance("GPay"));
		System.out.println("\n" + "The Updated Balance is : " + dao2.addMoney(468, "GPay"));
		System.out.println("\n" + "The Updated Balance is : " + dao2.addMoney(899, "GPay"));
		System.out.println("\n" + "Total Remaining Transactions are : " + (byte) dao2.getRemainingTransaction());
		System.out.println("\n" + "Total Transactions are : " + (byte) dao2.getTotalTodaysTransaction());
		System.out.println("\n" + "Total Transactions in Amount : " + (double) dao2.totalTransactionInAmount());

		System.out.println("\n" + "Total Transactions in Amount : " + (double) dao1.totalTransactionInAmount());

	}

}
