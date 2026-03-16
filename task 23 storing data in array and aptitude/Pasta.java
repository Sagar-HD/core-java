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
}