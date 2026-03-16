class Singer{

    String[] singers=new String[20];
    int curIndex=0;

    void save(String name){

        if(this.singers!=null){
            System.out.println("executing save inside Singer..");

            int index=this.singers.length-1;
            System.out.println("data will be saved in index :"+this.curIndex);

            if(this.curIndex<=index){
                singers[this.curIndex]=name;
                this.curIndex++;
                System.out.println("data saved .. next index :"+this.curIndex);
            }
            else{
                System.out.println("array is full cannot save data");
            }
        }
        else{
            System.out.println("Singer array cannot be null");
        }
    }
	boolean search(String name){
		if(name!=null){
			if(this.singers!=null){
				for(String singer : singers){
					 System.out.println("matching with "+singer);
					if(name==singer){
						 System.out.println("user matched");
						 return true;
				
					}
					
					
				}
				
			}
			else{
				 System.out.println("array is null");	
				
				
			}
			
		}
		else{
			
		 System.out.println("name is null");	
		}
		System.out.println("user not found");
		return false;
		
		
	}
}