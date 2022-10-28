import java.util.ArrayList;

public class BazaLotow {

	public static void main(String[] args) {
		int a = 5;
		boolean b = false;
		String dupa = "dupa123";
		
	// Flight Rajaner= new Flight ("Kraków", "Radom");
	//	Rajaner.printValues();
		
		FlightDatabase BazaLotow = new FlightDatabase();
		BazaLotow.displayFlights();
		BazaLotow.checkIfFlightExists("Sosnowiec");
//		Rajaner.printValues();
		
		Mobile ajfon = new Mobile("200pk",69);
		//System.out.println(ajfon.weight + " " + ajfon.price);
		Mobile szajsung = new Mobile("300pk",550);
		//szajsung.printValues();
		//szajsung.reducePrice10percent();
		//szajsung.printValues();
		//szajsung.add2price(11);
		//szajsung.printValues();
		//szajsung.checkPrice();
		//szajsung.wyswietlParzysteDo20(-123, 9);
		System.out.println("-----------------------");
		//szajsung.isDividedBy3or5(4, 18);
		//szajsung.getEvenSum(5, 9);
		//szajsung.getNumber(5, -2);
		
		//ComputerItems computerItems = new ComputerItems();
		//computerItems.displayItems();
		
		}
}

class ComputerItems{
	
	ArrayList<String> list = new ArrayList<String>();
	
	public ComputerItems() {

	list.add("test");
	list.add("jeden");
	list.add("dwa");
	list.add("trzy");
	list.add("cztery");
	}
	
	public void displayItems() {
		for (int i = 0; i < list.size();i++ ) {
			String element = list.get(i);
			if (element.length()>5)
				System.out.println("Ciąg znaków dłuższy od 5: " + element);
		}	
	}
}


class Mobile {
	String weight;
	int price;
	//int addPrice;
	
	public Mobile (String weight, int price) {
		this.weight = weight;
		this.price	= price;

	}
	
	public void printValues() {
		System.out.println(this.weight+ " " + this.price);
	}
	
	public returnValues() {
		return this.weight + " " + this.price;
	}
	
	public void reducePrice10percent() {
		this.price = (int) (0.9 * (this.price));
	}
	
	public void add2price(int addPrice) {
		this.price = addPrice + this.price;
	}
	
	public void checkPrice() {
		if (this.price < 200) {
			System.out.println ("Price is very good");
		}
		else if (this.price > 200 && this.price < 299) {
			System.out.println ("Price is very good");
		}
		else if (this.price > 200 && this.price < 299) {
			System.out.println ("Price is good");
		}
		else if (this.price > 500 && this.price < 549) {
			System.out.println ("Price could be lower");
		}
		else System.out.println ("Price is too fucking expensive");
			
	}
	
	public void wyswietlParzysteDo20(int min, int max) {
		int i;
		for (i=min;i<=max;i=i+1) {
			if (i%2==0)
				System.out.println(i);
		}
	}
	
	public void isDividedBy3or5 (int rangeMin, int rangeMax) { //wyswietla liczy parzyste z zakresu
		int i;
		for (i=rangeMin; i<= rangeMax;i++) {
			if (i%3==0 || i%5==0)
				System.out.println(i);
		}
	}
	public void getEvenSum (int rangeMin, int rangeMax) { //sumuje liczy parzyste z zakresu
		int i;
		int sum=0;
		for (i=rangeMin; i<= rangeMax;i++) {
			if (i%2==0)
				sum = sum + i;
		}
		System.out.println("suma: " + sum);
	}
	public void getNumber (int rangeMax, int rangeMin) { //wyswietla liczby malejaco
		int i;
		for (i=rangeMax; i>= rangeMin;i--) {
			System.out.println(i);
		}
	}
	
}

class FlightDatabase{
	
	ArrayList<Flight> flights = new ArrayList<Flight>();
	
	public FlightDatabase() {
		this.flights.add(new Flight("Kraków", "Sosnowiec"));
		this.flights.add(new Flight("Rudawa", "Warszawa"));
		this.flights.add(new Flight("Londyn", "Cancun"));
	}
	
	public void displayFlights() {
		for (int i = 0; i<flights.size();i++)
			System.out.println(this.flights.get(i).departure + " " + this.flights.get(i).arrival);
	}
	
	public void checkIfFlightExists(String flightName) {
		boolean exist = false;
		for (int i = 0; i<flights.size();i++) {			
			if (flightName.equals(this.flights.get(i).departure)  ||  flightName.equals(this.flights.get(i).arrival)) {
				exist = true;
				break;
			}
			else
				exist = false;
		}
		if (exist) {
			System.out.println("Miasto " + flightName + " znajduje się na liście");
		}
		else {
			System.out.println("Miasta " + flightName + " nie na liście");
		}
		
	}
	
}

class Flight {
	String departure;
	String arrival;
	
	public Flight (String departure, String arrival) {
		this.departure = departure;
		this.arrival	= arrival;
	}
	
	public void printValues() {
		System.out.println("Flight from: " + this.departure+ " to: " + this.arrival);
	}
	
	public String returnValues() {
		return this.departure + " " + this.arrival;
	}
	

}