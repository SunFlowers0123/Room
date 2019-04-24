package Room;
public class Doll extends Toys {
	
	private String nameOfDoll;
	
public String getNameOfDoll() {
		return nameOfDoll;
	}

	public void setNameOfDoll(String nameOfDoll) {
		this.nameOfDoll = nameOfDoll;
	}

public Doll(double price , String nameOfDoll,String typeOfModel) {
		setPrice(price);
		setNameOfDoll(nameOfDoll);
		setTypeOfModel(typeOfModel);
	}
	
}
