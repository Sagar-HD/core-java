class TwoWheeler{

    String[] models=new String[50];
    int curIndex=0;

    void save(String name){

        if(this.models!=null){
            System.out.println("executing save inside TwoWheeler..");

            int index=this.models.length-1;
            System.out.println("data will be saved in index :"+this.curIndex);

            if(this.curIndex<=index){
                models[this.curIndex]=name;
                this.curIndex++;
                System.out.println("data saved .. next index :"+this.curIndex);
            }
            else{
                System.out.println("array is full cannot save data");
            }
        }
        else{
            System.out.println("Models array cannot be null");
        }
    }
}