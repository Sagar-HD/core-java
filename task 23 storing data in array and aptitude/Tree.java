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
}