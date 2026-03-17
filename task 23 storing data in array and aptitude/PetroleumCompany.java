class PetroleumCompany{

    String[] petroleum=new String[10];
    int curIndex=0;

    void save(String name){
        if(this.petroleum!=null){
            int index=this.petroleum.length-1;

            if(this.curIndex<=index){
                petroleum[this.curIndex]=name;
                this.curIndex++;
            }
        }
    }

    boolean search(String name){
        if(name!=null){
            if(this.petroleum!=null){
                for(String p:petroleum){
                    if(name==p){
                        return true;
                    }
                }
            }
        }
        return false;
    }
	void delete(int index){
    if(this.petroleum==null){
        System.out.println("Petroleum list is null");
        return;
    }
    if(index<0 || index>=this.petroleum.length){
        System.out.println("Invalid index: "+index);
        return;
    }
    if(petroleum[index]==null){
        System.out.println("Already empty at index "+index);
        return;
    }
    System.out.println("Deleting at index "+index+" value: "+petroleum[index]);
    petroleum[index]=null;
    System.out.println("Deleted successfully");
}

void delete(String name){
    if(name==null){
        System.out.println("Name is null");
        return;
    }
    if(this.petroleum==null){
        System.out.println("Petroleum list is null");
        return;
    }
    for(int i=0;i<this.petroleum.length;i++){
        if(name.equals(petroleum[i])){
            System.out.println("Found "+name+" at index "+i+" deleting");
            petroleum[i]=null;
            System.out.println("Deleted successfully");
            return;
        }
    }
    System.out.println(name+" not found");
}
}