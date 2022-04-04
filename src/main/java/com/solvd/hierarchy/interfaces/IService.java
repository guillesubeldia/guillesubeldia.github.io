package com.solvd.hierarchy.interfaces;

//all services having an historial
public interface IService {
    void setHistory(Double balance, Double amount);

    void getHistory();

}
