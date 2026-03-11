class Tower {

    int[] heights;
    Tower[] towers;

    Tower(int[] heights, Tower[] towers){
        this.heights = heights;
        this.towers = towers;
    }

    void info(){

        System.out.println("Tower Info");

        for(int h : heights){
            System.out.println(h);
        }

        if(towers != null){
            System.out.println("Tower Objects: " + towers.length);
        }
    }
}