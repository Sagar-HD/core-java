class Steel{

    String[] steels=new String[10];
    int curIndex=0;

    void save(String name){
        if(this.steels!=null){
            int index=this.steels.length-1;

            if(this.curIndex<=index){
                steels[this.curIndex]=name;
                this.curIndex++;
            }
        }
    }

    boolean search(String name){
        if(name!=null){
            if(this.steels!=null){
                for(String steel:steels){
                    if(name==steel){
                        return true;
                    }
                }
            }
        }
        return false;
    }
	void delete(int index){
    if(this.steels==null){
        System.out.println("Steel list is null");
        return;
    }
    if(index<0 || index>=this.steels.length){
        System.out.println("Invalid index: "+index);
        return;
    }
    if(steels[index]==null){
        System.out.println("Already empty at index "+index);
        return;
    }
    System.out.println("Deleting at index "+index+" value: "+steels[index]);
    steels[index]=null;
    System.out.println("Deleted successfully");
}

void delete(String name){
    if(name==null){
        System.out.println("Name is null");
        return;
    }
    if(this.steels==null){
        System.out.println("Steel list is null");
        return;
    }
    for(int i=0;i<this.steels.length;i++){
        if(name.equals(steels[i])){
            System.out.println("Found "+name+" at index "+i+" deleting");
            steels[i]=null;
            System.out.println("Deleted successfully");
            return;
        }
    }
    System.out.println(name+" not found");
}
}