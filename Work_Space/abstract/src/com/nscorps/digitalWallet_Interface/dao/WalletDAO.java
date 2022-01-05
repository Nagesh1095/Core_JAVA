package com.nscorps.digitalWallet_Interface.dao;

import com.nscorps.digitalWallet_Interface.dto.WalletDTO;

public interface WalletDAO {

	float getCurrentBalance(String name);

	String createWallet(WalletDTO dto);

	float addMoney(double credit, String name);

	float pay(double debit, String name);

	byte getRemainingTransaction();

	byte getTotalTodaysTransaction();

	double totalTransactionInAmount();

	void printAll();
}
