package Room;

public abstract class Toys {
	private double price;
	private String color;
	private String typeOfModel;
	
	
	public String getTypeOfModel() {
		return typeOfModel;
	}

	public void setTypeOfModel(String typeOfModel) {
		this.typeOfModel = typeOfModel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void drive() {
		System.out.println("Move....");
	}

	@Override
	public String toString() {
		return "Іграшка "+ getTypeOfModel() + " за ціною : " + getPrice() ;
	}
	
	
	
}
