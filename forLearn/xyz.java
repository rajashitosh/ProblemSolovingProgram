package forLearn;

import java.util.*;
public class xyz {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	Hotel[] hotel=new Hotel[4];
	
	for(int i=0;i<hotel.length;i++) {
		
		int a=sc.nextInt();
		sc.nextLine();
		String b=sc.nextLine();
		String c=sc.nextLine();
		int d=sc.nextInt();
		sc.nextLine();
		String e=sc.nextLine();
		double f=sc.nextDouble();
		sc.nextLine();
		
		hotel[i]=new Hotel(a,b,c,d,e,f);
		
		
	}
	

	}

}

class Hotel{
	
	private int hotelId;
	private String hotelName;
	private String dateOfBooking;
	private int noOfRoomsBook;
	private String wifiFacility;
	private double totalBill;
	
	public int getHotelId() {
		return hotelId;
	}
	
	public void setHotelId(int hotelId) {
		this.hotelId=hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	public String getDateOfBooking() {
		return dateOfBooking;
	}
	
	public void setDateOfBooking(String dateOfBooking) {
		this.dateOfBooking=dateOfBooking;
	}
	
	public int getNoOfRoomsBook() {
		return noOfRoomsBook;
	}
	
	public void setNoOfRoomsBook(int noOfRoomsBook) {
		this.noOfRoomsBook=noOfRoomsBook;
	}
	
	public String getWifiFacility() {
		return wifiFacility;
	}
	
	public void setWifiFacility(String wifiFacility) {
		this.wifiFacility=wifiFacility;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}

	public Hotel(int hotelId,String hotelName, String dateOfBooking, int noOfRoomBook, String wifiFacility, double totalBill) {
		
		super();
		
		this.hotelId=hotelId;
		this.hotelName=hotelName;
		this.dateOfBooking=dateOfBooking;
		this.noOfRoomsBook=noOfRoomBook;
		this.wifiFacility=wifiFacility;
		this.totalBill=totalBill;
		
	}
	
}
