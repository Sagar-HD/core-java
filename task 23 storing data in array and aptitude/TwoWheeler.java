class TwoWheeler{

    String[] models=new String[50];
    int curIndex=0;

    void save(String name){

        if(this.models!=null){
            System.out.println("executing save inside TwoWheeler..");

            int index=this.models.length-1;
            System.out.println("data will be saved in index :"+this.curIndex);

            if(this.curIndex<=index){
                models[this.curIndex]=name;
                this.curIndex++;
                System.out.println("data saved .. next index :"+this.curIndex);
            }
            else{
                System.out.println("array is full cannot save data");
            }
        }
        else{
            System.out.println("Models array cannot be null");
        }
    }
	void delete(int index){
    if(this.models==null){
        System.out.println("Models array cannot be null");
        return;
    }
    if(index<0 || index>=this.models.length){
        System.out.println("Invalid index: "+index);
        return;
    }
    if(models[index]==null){
        System.out.println("Already empty at index "+index);
        return;
    }
    System.out.println("Deleting at index "+index+" value: "+models[index]);
    models[index]=null;
    System.out.println("Deleted successfully");
}

void delete(String name){
    if(name==null){
        System.out.println("Name is null");
        return;
    }
    if(this.models==null){
        System.out.println("Models array cannot be null");
        return;
    }
    for(int i=0;i<this.models.length;i++){
        if(name.equals(models[i])){
            System.out.println("Found "+name+" at index "+i+" deleting");
            models[i]=null;
            System.out.println("Deleted successfully");
            return;
        }
    }
    System.out.println(name+" not found");
}
boolean search(String name){
    if(name!=null){
        if(this.models!=null){
            for(String model:models){
                if(name==model){
                    return true;
                }
            }
        }
    }
    return false;
}
}