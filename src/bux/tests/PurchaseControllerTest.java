package bux.tests;

import bux.List;
import bux.Purchase;
import bux.PurchaseController;
import bux.PurchaseType;
import bux.tasks.AllSumProviderTask;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PurchaseControllerTest {

	private PurchaseController controller = new PurchaseController();

	@Before
	public void doBefore() {
		controller.add(new Purchase(50.5, "Молоко", PurchaseType.FOOD));
		controller.add(new Purchase(49.5, "носок", PurchaseType.CLOTHES));
	}

	@Test
	public void successAdd() {
		List<Purchase> purchases = controller.getAllTasks();

		Purchase purchase = purchases.get(0);
		assertEquals(50.5, purchase.getPrice(), 0.01);
		assertEquals("Молоко", purchase.getName());
		assertEquals(PurchaseType.FOOD, purchase.getType());
	}

	@Test
	public void successSum() {
		Object res = controller.doTask(0);
		assertEquals(100.0, res);
	}

	@Test
	public void sucessSave() {
		controller.doTask(1);
		Object res = controller.doTask(2);
		assertEquals("Purchase{price=50.5, name='Молоко', type=FOOD}Purchase{price=50.5, name='Молоко', type=FOOD}", res);
	}
}
