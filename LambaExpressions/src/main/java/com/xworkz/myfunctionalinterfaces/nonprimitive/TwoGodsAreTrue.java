package com.xworkz.myfunctionalinterfaces.nonprimitive;
@FunctionalInterface
public interface TwoGodsAreTrue {
    boolean check(God god1,God god2,IsTrueGod godPredicate);
}
