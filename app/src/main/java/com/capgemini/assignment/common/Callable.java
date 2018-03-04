package com.capgemini.assignment.common;

public interface Callable<T> {

    static <T> Callable<T> empty() {
        return t -> {
        };
    }

    void call(T t);
}
