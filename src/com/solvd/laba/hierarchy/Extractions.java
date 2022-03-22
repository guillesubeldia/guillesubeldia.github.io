package com.solvd.laba.hierarchy;

import com.solvd.laba.hierarchy.Interface.IServices;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Extractions implements IServices {

    private ArrayList<ArrayList<Double>> extractionHistory = new ArrayList<>();

    public Extractions(){

    }

    @Override
    public void setHistory(Double balance, Double amount) {
        ArrayList<Double> history = new ArrayList<>();
        history.add(balance);
        history.add(amount);
        this.extractionHistory.add(history);
    }

    @Override
    public void getHistory() {
        System.out.println(Arrays.toString(extractionHistory.toArray()));
    }
}
