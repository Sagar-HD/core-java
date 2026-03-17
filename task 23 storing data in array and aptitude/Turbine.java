class Turbine{

    String[] turbines=new String[10];
    int curIndex=0;

    void save(String name){
        if(this.turbines!=null){
            int index=this.turbines.length-1;

            if(this.curIndex<=index){
                turbines[this.curIndex]=name;
                this.curIndex++;
            }
        }
    }

    boolean search(String name){
        if(name!=null){
            if(this.turbines!=null){
                for(String turbine:turbines){
                    if(name==turbine){
                        return true;
                    }
                }
            }
        }
        return false;
    }
	void delete(int index){
    if(this.turbines==null){
        System.out.println("Turbine list is null");
        return;
    }
    if(index<0 || index>=this.turbines.length){
        System.out.println("Invalid index: "+index);
        return;
    }
    if(turbines[index]==null){
        System.out.println("Already empty at index "+index);
        return;
    }
    System.out.println("Deleting at index "+index+" value: "+turbines[index]);
    turbines[index]=null;
    System.out.println("Deleted successfully");
}

void delete(String name){
    if(name==null){
        System.out.println("Name is null");
        return;
    }
    if(this.turbines==null){
        System.out.println("Turbine list is null");
        return;
    }
    for(int i=0;i<this.turbines.length;i++){
        if(name.equals(turbines[i])){
            System.out.println("Found "+name+" at index "+i+" deleting");
            turbines[i]=null;
            System.out.println("Deleted successfully");
            return;
        }
    }
    System.out.println(name+" not found");
}
}