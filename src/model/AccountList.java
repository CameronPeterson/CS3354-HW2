package model;

import java.util.HashSet;
import java.util.Iterator;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class AccountList extends HashSet<Account> {
	
	public void saveToFile() {
		File file = new File("accountLists.txt");

		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fWriter = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(fWriter);
			Iterator<Account> iterator = this.iterator();
			while (iterator.hasNext())
			{
				Account element = (Account) iterator.next();
				writer.write(element.getID() +  ',' + element.getName() + ',' + element.getBalance());
				writer.newLine();
			}
			writer.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
				}
		}
}