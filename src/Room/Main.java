package Room;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String [] argv) {
		Scanner scan = new Scanner(System.in);
		Room room = new Room();
		System.out.print("Виділена сума на іграшки : ");
		double price = scan.nextDouble(); String ch; int minValue , maxValue; 
		List<Toys> toysList = new ArrayList<>();
			toysList = room.toys(price);
		System.out.println("На суму " + price + " ви купили такі іграшки : ");
			room.printListByName(toysList);
			
			for(;;) {
				System.out.print("Знайти іграшки у кімнаті за вартістю (Y - yes / N - no)?  : " );
				ch = scan.next();
				if(ch.equalsIgnoreCase("Y")) {
					System.out.print("Введіть мінімальну ціну : "); minValue = scan.nextInt();
					System.out.print("Введіть максимальну ціну : "); maxValue = scan.nextInt();
					room.searchToysByPrice(toysList, minValue, maxValue);
					
					System.out.print("Посортовано іграшки в кімнаті за вартістю : ");
					room.sortToysByPrice(toysList);room.printList(toysList);
					
				}break;
			}
			
	}
	
}
