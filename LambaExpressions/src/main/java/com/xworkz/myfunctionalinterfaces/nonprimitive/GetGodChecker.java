package com.xworkz.myfunctionalinterfaces.nonprimitive;

import java.util.function.Predicate;
@FunctionalInterface
public interface GetGodChecker {
    Predicate<God> get(String filedTocheck);
}
