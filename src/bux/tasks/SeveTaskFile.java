package bux.tasks;

import bux.List;
import bux.Purchase;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class SeveTaskFile implements Task {
	@Override
	public Object doTask(List<Purchase> value) {
		try (Writer writer = new FileWriter("file.txt")) {
			for (int i = 0; i < value.getSize(); i++) {
				writer.write(value.get(0).toString());
			}
		} catch (IOException e) {
		}
		return null;
	}

	@Override
	public String getDescription() {
		return "Сохранить";
	}
}
