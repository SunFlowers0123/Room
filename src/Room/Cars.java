package Room;
import Room.*;

public class Cars extends Toys{
	
	private String typeOfCar;

	public String getTypeOfCar() {
		return typeOfCar;
	}

	public void setTypeOfCar(String typeOfModel) {
		setTypeOfModel(typeOfModel);
		}
	}

 class SmallSizeCar extends Cars {
	
	public SmallSizeCar(double price , String color , String typeOfModel) {
		setPrice(price);
		setColor(color);
		setTypeOfModel(typeOfModel);
	}
	
}

 class MiddleSizeCar extends Cars{
	
	public MiddleSizeCar(double price , String color,String typeOfModel) {
		setPrice(price);
		setColor(color);
		setTypeOfCar(typeOfModel);
	}
}

 class BigSizeCar extends Cars{
	
	public BigSizeCar(double price , String color , String typeOfModel) {
		setPrice(price);
		setColor(color);
		setTypeOfCar(typeOfModel);
		}
}
