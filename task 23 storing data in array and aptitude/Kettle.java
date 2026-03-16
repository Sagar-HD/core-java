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
}