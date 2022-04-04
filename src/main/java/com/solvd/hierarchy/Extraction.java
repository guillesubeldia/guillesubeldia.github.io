package com.solvd.hierarchy;

import com.solvd.hierarchy.interfaces.IService;

import java.util.ArrayList;
import java.util.Arrays;

public class Extraction implements IService {

    private ArrayList<ArrayList<Double>> extractionHistory = new ArrayList<>();

    public Extraction() {

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
