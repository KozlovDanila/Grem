package bux;

public class Purchase {

	private double price;
	private String name;
	private PurchaseType type;

	public Purchase() {
	}

	public Purchase(double price, String name, PurchaseType type) {
		this.price = price;
		this.name = name;
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PurchaseType getType() {
		return type;
	}

	public void setType(PurchaseType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Purchase{" +
				"price=" + price +
				", name='" + name + '\'' +
				", type=" + type +
				'}';
	}
}
