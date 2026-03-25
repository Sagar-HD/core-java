class ProductStore{
	Product[] products=new Product[127];
	int curIndex=0;
	
	void save(Product product){
		System.out.println("executing save with one product");
		if(product!=null || this.products!=null){
			if(curIndex<products.length){
				System.out.println("storing product");
				this.products[curIndex]=product;
				System.out.println(" product stored");
				curIndex++;
			}
			else{
				System.out.println("array full cannot store data");
			}
			
		}
		else{
			System.out.println("product cannot be null");
		}
	}
	void save(Product[] products){
		System.out.println("executing save with products array");
		if(products!=null){
			if(products.length<=10){
				
				if(curIndex+products.length-1<this.products.length){
					
					for(Product product:products){
						if(product!=null){
							System.out.println("storing product");
							this.products[curIndex]=product;
							System.out.println("product stored");
							curIndex++;
						}
						else{
							System.out.println("product is null cannot add skipping this");	
						}
					}
				}
				else{
					System.out.println("array full cannot store data");
				}
				
			}
			else{
				System.out.println("only 10 element can be added at a time");
			}
		}
		else{
			System.out.println("products cannot be null");
		}
		
	}
	void display(){
		System.out.println("displaying all products");
		if(this.products!=null){
			for(Product product : products){
				if(product!=null){
					product.display();
				}
			}
		}
		else{
			System.out.println("products array is empty");
		}
	}
	
	boolean searchById(int id){
		System.out.println("executing search by id");

		if(this.products!=null){
			for(Product product:products){
				if(product!=null){
					System.out.println("comparing product "+product.uniqueId);
					if(product.uniqueId==id){
						System.out.println("element matched name "+product.make);
						return true;
					}
				}
			}
		}
		else{
			System.out.println("products array is empty");
		}
		System.out.println("product not found ..");
		return false;
	}
	
	boolean searchByUniqeIdAndName(int id,String name){
		System.out.println("executing search by id and name");
		if(this.products!=null && name!=null){
			for(Product product:products){
				if(product!=null){
					System.out.println("comparing product "+product.uniqueId+"product name "+product.make);
					if(product.uniqueId==id && product.name==name){
						System.out.println("element matched name "+product.make);
						return true;
					}
				}
			}
		}
		else{
			System.out.println("products array is empty or name is null");
		}
		System.out.println("product not found ..");
		return false;
	}
	
	boolean searchByUniqeIdAndNameAndOriginCountry(int id,String name,String country){
		System.out.println("executing search by id,name and origin country");
		if(this.products!=null ){
			if(name!=null && country!=null){
			for(Product product:products){
				if(product!=null){
					System.out.println("comparing product "+product.uniqueId+"product name "+product.make+" product country "+product.originCountry);
					if(product.uniqueId==id && product.name==name && product.originCountry==country) {
						System.out.println("element matched name "+product.make);
						return true;
					}
				}
			}
			}
			else{
				System.out.println("name or country is null ");
			}
		}
		else{
			System.out.println("products array is empty or name is null");
		}
		System.out.println("product not found ..");
		return false;
	}
	void getAllOriginCountry(){
		System.out.println("executing get allOriginCountry");
		if(this.products!=null ){	
			for(Product product:this.products){
				if(product!=null){
					System.out.println(product.originCountry);
				}
			}
		}
		else{
			System.out.println("products array is empty or name is null");
		}
	
}
	boolean checkWarrantyExpiredByUniqueId(int id){
		
		System.out.println("check warranty exprie by id");
		if(this.products!=null ){	
			for(Product product:this.products){
				if(product!=null){
					if(product.uniqueId==id){
						return product.warrantyExpired;
					}
				}
			}
			
			
		}
		else{
			System.out.println("products array is empty or name is null");
			
		}
		System.out.println("product not found");
		return false;
}
	void getAllByType(String name){
		System.out.println("executing getProducts by type");
		if(this.products!=null ){	
			if(name!=null){
				for(Product product:this.products){
					if(product!=null){
						if(product.name==name){
							System.out.println("name :"+product.name+"brand :"+product.make);
						}
					}
				}
				
			}else{
				System.out.println("name is null");
			}
			
		}
		else{
			System.out.println("products array is empty or name is null");
			
		}
		
	}
	void getAllByWarrantyYears(WarrantyYears warrentyYear){
		System.out.println("executing getProducts by warranty year");
		if(this.products!=null ){	
			if(warrentyYear!=null){
				for(Product product:this.products){
					if(product!=null){
						if(product.warantyyear==warrentyYear){
							System.out.println("name :"+product.name+"brand :"+product.make);
						}
					}
				}
				
			}else{
				System.out.println("name is null");
			}
			
		}
		else{
			System.out.println("products array is empty or name is null");
			
		}
	}
	
	
}