class Pasta{

    String[] pastas=new String[10];
    int curIndex=0;

    void save(String name){
        if(this.pastas!=null){
            int index=this.pastas.length-1;

            if(this.curIndex<=index){
                pastas[this.curIndex]=name;
                this.curIndex++;
            }
        }
    }

    boolean search(String name){
        if(name!=null){
            if(this.pastas!=null){
                for(String pasta:pastas){
                    if(name==pasta){
                        return true;
                    }
                }
            }
        }
        return false;
    }
	void delete(int index){
    if(this.pastas==null){
        System.out.println("Pasta list is null");
        return;
    }
    if(index<0 || index>=this.pastas.length){
        System.out.println("Invalid index: "+index);
        return;
    }
    if(pastas[index]==null){
        System.out.println("Already empty at index "+index);
        return;
    }
    System.out.println("Deleting at index "+index+" value: "+pastas[index]);
    pastas[index]=null;
    System.out.println("Deleted successfully");
}

void delete(String name){
    if(name==null){
        System.out.println("Name is null");
        return;
    }
    if(this.pastas==null){
        System.out.println("Pasta list is null");
        return;
    }
    for(int i=0;i<this.pastas.length;i++){
        if(name.equals(pastas[i])){
            System.out.println("Found "+name+" at index "+i+" deleting");
            pastas[i]=null;
            System.out.println("Deleted successfully");
            return;
        }
    }
    System.out.println(name+" not found");
}
}