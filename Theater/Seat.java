class Seat implements Bookable{
	
	private boolean isAvailable;
	int seatNumber;
	int price;
	
	Seat(int seatNumber,int price){
		this.isAvailable=true;
		this.seatNumber=seatNumber;
		this.price=price;
	}
@Override
public void book(int showId,int seatNumber){
	System.out.println("Booking logic will be implemented here");
}
@Override
public void cancel(int showId,int seatNumber){
		System.out.println("Cancel logic will be implemented here");
	
}
	
	
	
	
}