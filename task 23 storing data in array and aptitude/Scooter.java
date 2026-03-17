class Scooter{

    String[] scooters=new String[10];
    int curIndex=0;

    void save(String name){
        if(this.scooters!=null){
            int index=this.scooters.length-1;

            if(this.curIndex<=index){
                scooters[this.curIndex]=name;
                this.curIndex++;
            }
        }
    }

    boolean search(String name){
        if(name!=null){
            if(this.scooters!=null){
                for(String scooter:scooters){
                    if(name==scooter){
                        return true;
                    }
                }
            }
        }
        return false;
    }
	void delete(int index){
    if(this.scooters==null){
        System.out.println("Scooter list is null");
        return;
    }
    if(index<0 || index>=this.scooters.length){
        System.out.println("Invalid index: "+index);
        return;
    }
    if(scooters[index]==null){
        System.out.println("Already empty at index "+index);
        return;
    }
    System.out.println("Deleting at index "+index+" value: "+scooters[index]);
    scooters[index]=null;
    System.out.println("Deleted successfully");
}

void delete(String name){
    if(name==null){
        System.out.println("Name is null");
        return;
    }
    if(this.scooters==null){
        System.out.println("Scooter list is null");
        return;
    }
    for(int i=0;i<this.scooters.length;i++){
        if(name.equals(scooters[i])){
            System.out.println("Found "+name+" at index "+i+" deleting");
            scooters[i]=null;
            System.out.println("Deleted successfully");
            return;
        }
    }
    System.out.println(name+" not found");
}
}