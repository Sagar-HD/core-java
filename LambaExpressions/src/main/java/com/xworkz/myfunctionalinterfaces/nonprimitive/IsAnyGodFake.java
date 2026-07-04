package com.xworkz.myfunctionalinterfaces.nonprimitive;

import java.util.function.Predicate;

@FunctionalInterface
public interface IsAnyGodFake {
    boolean check(God god1, God god2, IsFakeGod idFakePredicate);
}
