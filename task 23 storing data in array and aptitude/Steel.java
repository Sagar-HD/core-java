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
}