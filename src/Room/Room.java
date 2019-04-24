package Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class Room {
	
	public List toys(double price) {// the method that buys toys for a dedicated amount
		double sum = 0;
		if (price < 3.50) { System.out.println("Ціна повинна буне не менше ніж 3.50"); System.exit(0);}
		List<Toys>toys = new ArrayList<>();
		Random rand = new Random();
		toys.add(new SmallSizeCar(0, "red","Sedan")) ;
		while(sum < price) {		// loop where add objects to list
			int k = rand.nextInt(30)+1;
		if(k==1)	toys.add(new SmallSizeCar(14.35, "red" , "Universal")) ;
		if(k==2)	toys.add(new SmallSizeCar(10.50, "black", "Sedan"));
		if(k==3)	toys.add(new SmallSizeCar(3.50, "yello", "truck")); 
		if(k==4)	toys.add(new SmallSizeCar(25.00, "silver", "HatchBack"));
		if(k==5)	toys.add(new SmallSizeCar(19.99, "white", "Miniven")); 
		if(k==6)	toys.add(new MiddleSizeCar(43.90 , "green" , "OutRider"));
		if(k==7)	toys.add(new MiddleSizeCar(26.00 , "black" , "Compartment"));
		if(k==8)	toys.add(new MiddleSizeCar(60.00 , "red", "Cabriolet" ));
		if(k==9)	toys.add(new MiddleSizeCar(33.80 , "white", "PickUp" ));
		if(k==10)	toys.add(new MiddleSizeCar(80.00 , "silver", "Limousine" ));
		if(k==11)	toys.add(new BigSizeCar(110, "blue", "Torn"));
		if(k==12)	toys.add(new BigSizeCar(76.40, "blue", "Universal"));
		if(k==13)	toys.add(new BigSizeCar(234, "silver", "Compartment"));
		if(k==14)	toys.add(new BigSizeCar(180, "black", "Sedan"));
		if(k==15)	toys.add(new BigSizeCar(400, "orange", "OutRider"));
		if(k==16)	toys.add(new Doll(29.99, "Barbie", "White"));
		if(k==17)	toys.add(new Doll(191, "Gwan", "Black") ); 
		if(k==18)	toys.add(new Doll(117, "Mishon" , "Asiatn")); 
		if(k==19)	toys.add(new Doll(47, "Rishele" , "AfroAmerician")); 
		if(k==20)	toys.add(new Doll(377, "Meggi" , "Wooman"));
		if(k==21)	toys.add(new Cube(10 , "red", "9*9"));
		if(k==22)	toys.add(new Cube(11 , "green" ,"12*12"));
		if(k==23)	toys.add(new Cube(7 , "orange","3*3"));
		if(k==24)	toys.add(new Cube(9 , "silver", "6*6"));
		if(k==25)	toys.add(new Cube(15 , "magenta","9*9" ));
		if(k==26)	toys.add(new Ball(110 , "volleyball" , "red"));
		if(k==27)	toys.add(new Ball(90 , "football" , "green"));
		if(k==28)	toys.add(new Ball(200 , "Basketball" , "white"));
		if(k==29)	toys.add(new Ball(100 , "GangBall" , "silver"));
		if(k==30)	toys.add(new Ball(150 , "AmaricanBall" , "magenta"));
		if( sum + toys.get(toys.size()-1).getPrice() > price ) {
			toys.remove(toys.size()-1);
		}sum = sum + toys.get(toys.size()-1).getPrice();
		
		for (int i = 0; i < toys.size(); i++) {
			toys.get(i).getPrice();
		}
		}
		toys.remove(0);
		return toys;
	}

	
	 void sortToysByPrice(List<Toys> toys){  //// the method that sorted toys in room by price
        Collections.sort(toys, new Comparator<Toys>() {
            @Override
        	public int compare(Toys o1, Toys o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
	}
	
	 void searchToysByPrice(List<Toys> list , int beginRangeOfPrice , int endRangeOfPrice) { // here we do a search objects by price
		System.out.println("Знайдені іграшки  : ");
		for(int i = 0 ; i<list.size();i++) {
			if((list.get(i).getPrice() > beginRangeOfPrice)&&(list.get(i).getPrice()<endRangeOfPrice)) {
				System.out.println(list.get(i).getTypeOfModel());
			}
		}System.out.println("Знайдено...");
	}
	
	List<Cars>searchCarsByModel(List<Cars>list , String typeOfCars){// here we do a search objects car by model
		for(int i = 0; i<list.size();i++) {
			if(list.get(i).getTypeOfCar()==typeOfCars) {
				System.out.println(list.get(i).getTypeOfCar()+ "   " + list.get(i).getClass().getName());
			}
		}
		return list;
	}
	
	public void printList(List list) {		//// here we do a print list of objects
		for(int i=0;i<list.size();i++) System.out.println(i + " ) " + list.get(i));
	}
	
	public void printListByName(List list) {// here we do a print  list by name
		for(int i=0;i<list.size();i++) System.out.println( i + " )  "+ list.get(i).getClass().getName());
	}
	
}
