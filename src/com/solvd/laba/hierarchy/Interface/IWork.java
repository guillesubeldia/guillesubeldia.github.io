package com.solvd.laba.hierarchy.Interface;

public interface IWork {
    default void work() {
        System.out.format("%nPerforming a job");
    }
}
