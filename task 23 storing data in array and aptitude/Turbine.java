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
}