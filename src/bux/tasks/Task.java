package bux.tasks;

import bux.List;
import bux.Purchase;

public interface Task {

	Object doTask(List<Purchase> value);

	String getDescription();
}
