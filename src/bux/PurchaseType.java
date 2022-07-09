package bux;

public enum PurchaseType {
	FOOD("еда"),
	CLOTHES("одежда"),
	OTHER("иное");

	private String name;

	PurchaseType(String name) {
		this.name = name;
	}

	public static PurchaseType getByName(String name) {
		for (PurchaseType type : values()) {
			if (type.name.equals(name)) {
				return type;
			}
		}
		return OTHER;
	}
}
