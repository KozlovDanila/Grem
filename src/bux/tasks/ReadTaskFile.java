package bux.tasks;

import bux.List;
import bux.Purchase;

import java.io.*;

public class ReadTaskFile implements Task {
	@Override
	public Object doTask(List<Purchase> value) {
		try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
			return reader.readLine();
		} catch (IOException e) {
		}
		return null;
	}

	@Override
	public String getDescription() {
		return "Сохранить";
	}
}
