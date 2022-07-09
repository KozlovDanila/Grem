package bux;

import bux.tasks.AllSumProviderTask;
import bux.tasks.ReadTaskFile;
import bux.tasks.SeveTaskFile;
import bux.tasks.Task;

public class PurchaseController {

	private List<Purchase> purchases = new List<>();
	private List<Task> tasks = new List<>();

	public PurchaseController() {
		tasks.add(new AllSumProviderTask());
		tasks.add(new SeveTaskFile());
		tasks.add(new ReadTaskFile());
	}

	public PurchaseController(List<Task> tasks) {
		this.tasks = tasks;
	}

	public void add(Purchase purchase) {
		purchases.add(purchase);
	}

	public List<Purchase> getAllTasks() {
		return purchases;
	}

	public void addTask(Task task) {
		tasks.add(task);
	}

	public void printTask() {
		for (int i = 0; i < tasks.getSize(); i++) {
			System.out.println(i + 1 + ". " + tasks.get(0).getDescription());
		}
	}

	public Object doTask(int i) {
		Task task = tasks.get(i);
		Object result = task.doTask(purchases);
		return result;
	}
}
