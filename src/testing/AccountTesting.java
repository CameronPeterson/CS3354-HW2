package testing;

import org.junit.jupiter.api.*;

import static org.junit.Assert.*;
import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

import model.Account;

class AccountTesting {
	
	private  Account accountTest;

	@BeforeEach
	void setUp() throws Exception {
		accountTest = new Account();
		}
	
	@Test
	void depositTestBigDecimal() {
		accountTest.deposit(BigDecimal.valueOf(3000));
		BigDecimal returnBalance = accountTest.getBalance();
		//System.out.println("Value of test bal: " + testBal);
		//System.out.println("Value of accountTest.getBalance(): " + accountTest.getBalance());
		assertEquals(returnBalance, accountTest.getBalance());
		assertEquals(BigDecimal.valueOf(3000).setScale(2, RoundingMode.HALF_EVEN), accountTest.getBalance());
	}
	
	@Test
	void depositTestDouble() {
		accountTest.deposit(3000);
		BigDecimal returnBalance = accountTest.getBalance();
		//System.out.println("Value of test bal: " + testBal);
		//System.out.println("Value of accountTest.getBalance(): " + accountTest.getBalance());
		assertEquals(returnBalance, accountTest.getBalance());
		assertEquals(BigDecimal.valueOf(3000).setScale(2, RoundingMode.HALF_EVEN), accountTest.getBalance());
	}
	
	@Test
	void withdrawalTest() {
		accountTest.deposit(500);
		accountTest.withdraw(200);
		BigDecimal returnBalance = accountTest.getBalance();
		assertEquals(returnBalance, accountTest.getBalance());
		assertEquals(BigDecimal.valueOf(300).setScale(2, RoundingMode.HALF_EVEN), accountTest.getBalance());
	}
	
	@Test
	void nameTest() {
		assertEquals("Unnamed",accountTest.getName());
		accountTest.setName("New name");
		assertEquals("New name", accountTest.getName());
	}
	
	@Test
	void idTest() {
		assertEquals("No ID",accountTest.getID());
		accountTest.setID("A04");
		assertEquals("A04", accountTest.getID());
	}

}
