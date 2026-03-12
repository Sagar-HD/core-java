class Singer{

    String[] singers=new String[20];
    int curIndex=0;

    void save(String name){

        if(this.singers!=null){
            System.out.println("executing save inside Singer..");

            int index=this.singers.length-1;
            System.out.println("data will be saved in index :"+this.curIndex);

            if(this.curIndex<=index){
                singers[this.curIndex]=name;
                this.curIndex++;
                System.out.println("data saved .. next index :"+this.curIndex);
            }
            else{
                System.out.println("array is full cannot save data");
            }
        }
        else{
            System.out.println("Singer array cannot be null");
        }
    }
}