class Kettle{

    String[] kettles=new String[10];
    int curIndex=0;

    void save(String name){
        if(this.kettles!=null){
            int index=this.kettles.length-1;

            if(this.curIndex<=index){
                kettles[this.curIndex]=name;
                this.curIndex++;
            }
        }
    }

    boolean search(String name){
        if(name!=null){
            if(this.kettles!=null){
                for(String kettle:kettles){
                    if(name==kettle){
                        return true;
                    }
                }
            }
        }
        return false;
    }
	void delete(int index){
    if(this.kettles==null){
        System.out.println("Kettle list is null");
        return;
    }
    if(index<0 || index>=this.kettles.length){
        System.out.println("Invalid index: "+index);
        return;
    }
    if(kettles[index]==null){
        System.out.println("Already empty at index "+index);
        return;
    }
    System.out.println("Deleting at index "+index+" value: "+kettles[index]);
    kettles[index]=null;
    System.out.println("Deleted successfully");
}

void delete(String name){
    if(name==null){
        System.out.println("Name is null");
        return;
    }
    if(this.kettles==null){
        System.out.println("Kettle list is null");
        return;
    }
    for(int i=0;i<this.kettles.length;i++){
        if(name.equals(kettles[i])){
            System.out.println("Found "+name+" at index "+i+" deleting");
            kettles[i]=null;
            System.out.println("Deleted successfully");
            return;
        }
    }
    System.out.println(name+" not found");
}
}