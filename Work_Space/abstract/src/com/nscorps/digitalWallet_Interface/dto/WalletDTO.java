package com.nscorps.digitalWallet_Interface.dto;

import java.util.Objects;

public class WalletDTO {
	private String name;
	private byte noOfTransaction;
	private int maxTransaction;
	private float availableBalance;
	private String reward;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getNoOfTransaction() {
		return noOfTransaction;
	}

	public void setNoOfTransaction(byte noOfTransaction) {
		this.noOfTransaction = noOfTransaction;
	}

	public int getMaxTransaction() {
		return maxTransaction;
	}

	public void setMaxTransaction(int maxTransaction) {
		this.maxTransaction = maxTransaction;
	}

	public float getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(float availableBalance) {
		this.availableBalance = availableBalance;
	}

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	@Override
	public String toString() {
		return "\n" + this.getClass().getSimpleName() + " name=" + name + ", noOfTransaction=" + noOfTransaction
				+ ", maxLimit=" + maxTransaction + ", availableBalance=" + availableBalance + ", reward=" + reward;
	}

	@Override
	public int hashCode() {
		return Objects.hash(availableBalance, maxTransaction, name, noOfTransaction, reward);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WalletDTO dto = (WalletDTO) obj;
		return Float.floatToIntBits(availableBalance) == Float.floatToIntBits(dto.availableBalance)
				&& maxTransaction == dto.maxTransaction && Objects.equals(name, dto.name)
				&& noOfTransaction == dto.noOfTransaction && Objects.equals(reward, dto.reward);
	}

}
