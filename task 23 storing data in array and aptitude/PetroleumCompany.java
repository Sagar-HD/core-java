class PetroleumCompany{
	String[] companies=new String[5];
	int curIndex=0;
	void save(String name){
		if(this.companies!=null){
			System.out.println("executing save inside PetroleumCompany..");
			int index=this.companies.length-1;
				System.out.println("data will be saved in index :"+this.curIndex);
			if(this.curIndex<=index){
				companies[this.curIndex]=name;
				this.curIndex++;
				System.out.println("data saved .. next index :"+this.curIndex);
				
			}
			else{
				
					System.out.println("array is full cannot save data");
			}
			
		}
		else{
			System.out.println("Companies array cannot be null");
		}
		
		
		
	}
	
	
	
	
	
	
	
}