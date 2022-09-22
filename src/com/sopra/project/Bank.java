package com.sopra.project;

public class Bank {
	private int bankId;
	 private String accNum;
	 private String bankName;

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	

	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", accNum=" + accNum + ", bankName=" + bankName + "]";
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(int bankId, String accNum, String bankName) {
		super();
		this.bankId = bankId;
		this.accNum = accNum;
		this.bankName = bankName;
	}

	public static void main(String[] args) {
	 
	 

	}

}
