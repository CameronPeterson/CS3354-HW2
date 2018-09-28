package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Account extends AbstractModel {
	
	private String name;
	private String id;
	private BigDecimal balance;
	
	public Account() {
		name = new String("Unnamed");
		id = new String("No ID");
		balance = new BigDecimal(0).setScale(2, RoundingMode.HALF_EVEN);
		
	}
	
	public Account(String name, String id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = BigDecimal.valueOf(balance).setScale(2, RoundingMode.HALF_EVEN);
		}
	
	public void withdraw(double withdrawal) {
		BigDecimal bdWithdrawal = BigDecimal.valueOf(withdrawal);
		this.balance = this.balance.subtract(bdWithdrawal);
	}
	public void withdraw(BigDecimal withdrawal) {
		this.balance = this.balance.subtract(withdrawal);
	}
	
	public void deposit(double deposit) {
		BigDecimal bdDeposit = BigDecimal.valueOf(deposit);
		this.balance = this.balance.add(bdDeposit);
	}
	
	public void deposit(BigDecimal deposit) {
		this.balance = this.balance.add(deposit);
	}
	
	public String getName() {
		return name;
	}
	
	public String getID() {
		return id;
	}
	
	public BigDecimal getBalance() {
		return balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(String id) {
		this.id = id;
	}
	
}
