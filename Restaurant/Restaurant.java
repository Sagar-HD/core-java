class Restaurant{
	
	private List<MenuItem> menu=new ArrayList<>;
	private String restaurantName;
	
	
	Restaurant(String name){
		this.name=name;
	}
	void addItemToMenu(MenuItem menuItem){
		
		this.menu.add(menuItem);
		System.out.print("item added to menu successfully");
		
		
	}
	void removeItemFromMenu(String name){
		
		this.menu.removeIf(item -> item.getName().equals(name));
		System.out.print("item removed from menu successfully");
		
		
	}
	
	
	
}