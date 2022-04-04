package com.solvd.hierarchy;

import com.solvd.hierarchy.interfaces.IAllowance;
import com.solvd.hierarchy.interfaces.IPay;

public class Allowance extends Service implements IAllowance {
    private Double allowanceAmount;

    public Allowance() {

    }

    //calculate allowance (income / 2)*40
    public double getAllowance() {
        return allowanceAmount;
    }

    public void setAllowance(Double allowanceAmount) {
        this.allowanceAmount = allowanceAmount;
    }


    @Override
    public void calculateAllowance(Double income) {
        allowanceAmount = (income / 2) * 40;
        setAllowance(allowanceAmount);
    }

    public void takePayment(IPay iPay) {
        System.out.println(iPay.pay());
    }
}
