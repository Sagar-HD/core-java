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
	void delete(int index){
    if(this.singers==null){
        System.out.println("Singer array cannot be null");
        return;
    }
    if(index<0 || index>=this.singers.length){
        System.out.println("Invalid index: "+index);
        return;
    }
    if(singers[index]==null){
        System.out.println("Already empty at index "+index);
        return;
    }
    System.out.println("Deleting at index "+index+" value: "+singers[index]);
    singers[index]=null;
    System.out.println("Deleted successfully");
}

void delete(String name){
    if(name==null){
        System.out.println("name is null");
        return;
    }
    if(this.singers==null){
        System.out.println("Singer array cannot be null");
        return;
    }
    for(int i=0;i<this.singers.length;i++){
        System.out.println("matching with "+singers[i]);
        if(name.equals(singers[i])){
            System.out.println("Found "+name+" at index "+i+" deleting");
            singers[i]=null;
            System.out.println("Deleted successfully");
            return;
        }
    }
    System.out.println("user not found");
}
}