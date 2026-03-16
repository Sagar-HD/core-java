class Scooter{

    String[] scooters=new String[10];
    int curIndex=0;

    void save(String name){
        if(this.scooters!=null){
            int index=this.scooters.length-1;

            if(this.curIndex<=index){
                scooters[this.curIndex]=name;
                this.curIndex++;
            }
        }
    }

    boolean search(String name){
        if(name!=null){
            if(this.scooters!=null){
                for(String scooter:scooters){
                    if(name==scooter){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}