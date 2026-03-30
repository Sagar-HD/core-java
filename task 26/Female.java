class Female implements Gender{
	String name;
	int age;
	public Female(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void display(){
		System.out.println("name :"+this.name+" age :"+this.age);
	}
	public String getName(){
		return this.name;
	}
}