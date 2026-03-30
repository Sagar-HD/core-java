class GenderRunner{
	public static void main(String... args){
		Male male=new Male("sagar",21);
		Female female=new Female("Radhe",19);
		Others others=new Others("Rama",26);
		GenderStore store=new GenderStore();
		Male male5=new Male("abcd",21);
		Male male6=new Male("abcd",22);
		Male male7=new Male("abcde",22);
		Male male8=new Male(null,22);
		store.save(male);
		store.save(female);
		store.save(others);
		store.save(male5);
		store.save(male6);
		store.save(male7);
		store.save(male8);
		store.display();
		//testing swap check function in all conditions for asceding
		System.out.println("ascending check...");
		System.out.println(store.swapCheckForAsce(male,female));
		System.out.println(store.swapCheckForAsce(female,male));
		System.out.println(store.swapCheckForAsce(male5,male6));
		System.out.println(store.swapCheckForAsce(male5,male7));
		System.out.println(store.swapCheckForAsce(male7,male5));
		//testing swap check function in all conditions for descending
		System.out.println("desending check...");
		System.out.println(store.swapCheckForDesc(male,female));
		System.out.println(store.swapCheckForDesc(female,male));
		System.out.println(store.swapCheckForDesc(male5,male6));
		System.out.println(store.swapCheckForDesc(male5,male7));
		System.out.println(store.swapCheckForDesc(male7,male5));
		//store.sortAsec();
		store.sort(1);
		store.display();
		//store.sortDesc();
		store.sort(-1);
		store.display();
	}
	
}