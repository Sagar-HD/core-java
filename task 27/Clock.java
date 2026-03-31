class Clock{
	int hr;
	int minutes;
	int seconds;
	Clock(int hr,int minutes,int seconds){
		this.hr=hr;
		this.minutes=minutes;
		this.seconds=seconds;
	}
	
	int getHour(){
		return this.hr;
	}
	
	int getMinutes(){
		return this.minutes;
	}
	
}