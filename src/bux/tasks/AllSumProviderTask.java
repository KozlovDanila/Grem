package bux.tasks;

import bux.List;
import bux.Purchase;

public class AllSumProviderTask implements Task {

	@Override
	public Object doTask(List<Purchase> value) {
		double result = 0;
		for (int i = 0; i < value.getSize(); i++) {
			result += value.get(i).getPrice();
		}
		return result;
	}

	@Override
	public String getDescription() {
		return "Посчитать сумму покупок";
	}


}
