class GenderStore{
	Gender[] genders=new Gender[10];
	int curIndex=0;
	void save(Gender gender){
		
		System.out.println("executing save operation ");
		if(this.genders!=null && gender!=null){
			if(gender.getName()==null){
			System.out.println("cannot store gender name as null...");
			return;
		   }
			if(curIndex<this.genders.length){
				this.genders[curIndex]=gender;
				curIndex++;
				System.out.println("gender stored..");
				
			}
			else{
				System.out.println("Array is full");
			}
			
		}
		else{
			System.out.println("input cannot be null");
		}
		
		
	}
	void display(){
		if(this.genders!=null){
			for(Gender gender : this.genders){
				if(gender!=null){
				gender.display();
				}
			}
			
		}else{
			System.out.println("Array is empty");
		}
	}
	boolean swapCheckForAsce(Gender g1,Gender g2){
		if(g1==null){
			return true;
		}
		if(g2==null){
			return false;
		}
		int m=g1.getName().length();
		int n=g2.getName().length();
		
		
		String name1=g1.getName().toLowerCase();
		String name2=g2.getName().toLowerCase();
		int i=0,j=0;
		while(i<m && j<n){
			if((int)name1.charAt(i)>(int)name2.charAt(j)){
				return true;
			}
			else if((int)name1.charAt(i)==(int)name2.charAt(j)){
				i++;
				j++;
			}
			else{
				return false;
			}	
		}
		
		if(i>=m && j>=n){
			System.out.println("return false due to both are same");
			return false;
			
		}
		
		if(i>=m){
			System.out.println("return false due to 1st object has same and less alphabets than object 2");
			return false;
		}
		else{
			System.out.println("return true due to 2nd object has same and less alphabets than object 1");
			return true;
		}
		
		
		
	}
	boolean swapCheckForDesc(Gender g1,Gender g2){
		if(g1==null){
			return true;
		}
		if(g2==null){
			return false;
		}
		int m=g1.getName().length();
		int n=g2.getName().length();
		
		
		
		String name1=g1.getName().toLowerCase();
		String name2=g2.getName().toLowerCase();
		int i=0,j=0;
		while(i<m && j<n){
			if((int)name1.charAt(i)<(int)name2.charAt(j)){
				return true;
			}
			else if((int)name1.charAt(i)==(int)name2.charAt(j)){
				i++;
				j++;
			}
			else{
				return false;
			}	
		}
		
		if(i>=m && j>=n){
			System.out.println("return false due to both are same");
			return false;
			
		}
		
		if(i>=m){
			System.out.println("return true due to 1st object has same and less alphabets than object 2");
			return true;
		}
		else{
			System.out.println("return false due to 2nd object has same and less alphabets than object 1");
			return false;
		}
		
		
		
	}
	void sortAsec(){
	System.out.println("sorting in asceding");	
	for(int i=0;i<this.genders.length;i++){
		for(int j=0;j<this.genders.length-i-1;j++){
			if(swapCheckForAsce(this.genders[j],this.genders[j+1])){
				Gender temp=this.genders[j];
				this.genders[j]=this.genders[j+1];
				this.genders[j+1]=temp;
			}
			
		}
	}
	System.out.println("array is sorted in ascending..");
	}
	void sortDesc(){
		System.out.println("sorting in descending");
		for(int i=0;i<this.genders.length;i++){
		for(int j=0;j<this.genders.length-i-1;j++){
			if(swapCheckForDesc(this.genders[j],this.genders[j+1])){
				Gender temp=this.genders[j];
				this.genders[j]=this.genders[j+1];
				this.genders[j+1]=temp;
			}
			
		}
	}
	System.out.println("array is sorted in descending..");
		
	}
	
	void sort(int type){
		System.out.println("exectuing sort method using bubble sort");
		if(type>=0){
			sortAsec();
			
		}
		else{
			
			sortDesc();
		}
		
	}
	
	
}