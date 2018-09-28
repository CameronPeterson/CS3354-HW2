package model;

import java.util.HashSet;
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
			writer.write("helloworld");
			writer.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
				}
		}
	
	public void accountListAsString()
	{
		
	}
}