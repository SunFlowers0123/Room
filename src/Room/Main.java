package Room;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String [] argv) {
		Scanner scan = new Scanner(System.in);
		Room room = new Room();
		System.out.print("������� ���� �� ������� : ");
		double price = scan.nextDouble(); String ch; int minValue , maxValue; 
		List<Toys> toysList = new ArrayList<>();
			toysList = room.toys(price);
		System.out.println("�� ���� " + price + " �� ������ ��� ������� : ");
			room.printListByName(toysList);
			
			for(;;) {
				System.out.print("������ ������� � ����� �� ������� (Y - yes / N - no)?  : " );
				ch = scan.next();
				if(ch.equalsIgnoreCase("Y")) {
					System.out.print("������ �������� ���� : "); minValue = scan.nextInt();
					System.out.print("������ ����������� ���� : "); maxValue = scan.nextInt();
					room.searchToysByPrice(toysList, minValue, maxValue);
					
					System.out.print("����������� ������� � ����� �� ������� : ");
					room.sortToysByPrice(toysList);room.printList(toysList);
					
				}break;
			}
			
	}
	
}
