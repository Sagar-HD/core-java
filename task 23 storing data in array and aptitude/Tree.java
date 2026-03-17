class Tree{

    String[] trees=new String[10];
    int curIndex=0;

    void save(String name){
        if(this.trees!=null){
            int index=this.trees.length-1;

            if(this.curIndex<=index){
                trees[this.curIndex]=name;
                this.curIndex++;
            }
        }
    }

    boolean search(String name){
        if(name!=null){
            if(this.trees!=null){
                for(String tree:trees){
                    if(name==tree){
                        return true;
                    }
                }
            }
        }
        return false;
    }
	void delete(int index){
    if(this.trees==null){
        System.out.println("Tree list is null");
        return;
    }
    if(index<0 || index>=this.trees.length){
        System.out.println("Invalid index: "+index);
        return;
    }
    if(trees[index]==null){
        System.out.println("Already empty at index "+index);
        return;
    }
    System.out.println("Deleting at index "+index+" value: "+trees[index]);
    trees[index]=null;
    System.out.println("Deleted successfully");
}

void delete(String name){
    if(name==null){
        System.out.println("Name is null");
        return;
    }
    if(this.trees==null){
        System.out.println("Tree list is null");
        return;
    }
    for(int i=0;i<this.trees.length;i++){
        if(name.equals(trees[i])){
            System.out.println("Found "+name+" at index "+i+" deleting");
            trees[i]=null;
            System.out.println("Deleted successfully");
            return;
        }
    }
    System.out.println(name+" not found");
}
}