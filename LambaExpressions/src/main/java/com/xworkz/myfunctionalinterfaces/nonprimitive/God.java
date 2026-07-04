package com.xworkz.myfunctionalinterfaces.nonprimitive;

public class God {
    private String name;
    private boolean canDoEverything;

    public God(String name,boolean canDoEverything) {
        this.name = name;
        this.canDoEverything=canDoEverything;
    }

    public boolean isCanDoEverything() {
        return canDoEverything;
    }

    public void setCanDoEverything(boolean canDoEverything) {
        this.canDoEverything = canDoEverything;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
