package testing;

import org.junit.jupiter.api.*;
import static org.junit.Assert.*;

import java.io.*;

import model.Account;
import model.AccountList;

class AccountListsTesting {
	
	Account testAcct0;
	Account testAcct1;
	AccountList testAcctList;
	
	@BeforeEach
	void setUp() throws Exception {
		testAcct0 = new Account();
		testAcct1 = new Account("Cameron Peterson", "A04", 50000000);
		testAcctList = new AccountList();
		}

	@Test
	void addAccount() {
		testAcctList.add(testAcct0);
		testAcctList.add(testAcct1);
		assertTrue(testAcctList.contains(testAcct0) && testAcctList.contains(testAcct1));
	}
	
	@Test
	void removeAccount() {
		testAcctList.add(testAcct0);
		testAcctList.add(testAcct1);
		
		testAcctList.remove(testAcct0);
		assertFalse(testAcctList.contains(testAcct0));
		assertTrue(testAcctList.contains(testAcct1));
	}
	
	@Test
	void writeToFile() throws Exception {
		testAcctList.saveToFile();
		File file = new File("accountLists.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		assertEquals("helloworld", reader.readLine());
		reader.close();
	}

}
