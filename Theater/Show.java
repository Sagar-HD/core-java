import java.util.HashMap;

class Show{
	
	private final int fixedPrice=250;
	private final int seatsPerRow=10;
	private String showName;
	private HashMap<Integer,Seat> seats=new HashMap<>();
	Show(String showName,int totalSeats){
		
		
		this.showName=showName;
		  for(int i = 1; i <= totalSeats; i++) {
			int row = (i - 1) / seatsPerRow + 1;
        seats.put(i, new Seat(i,fixedPrice+((row-1)*20) ));
    }
		
	}
	
	
}