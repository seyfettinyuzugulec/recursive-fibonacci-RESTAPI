package com.fibonaccimaster.fibonacci.recursive.model;

public class OperationModel {


    private String operation;
    private int fibNumber;

    public OperationModel()
    {

    }

    public OperationModel(int fibNumber)
    {
        this.fibNumber = fibNumber;
    }

    public OperationModel(String operation)
    {
        this.operation = operation;
    }

    public int getFibNumber()
    {
        return fibNumber;
    }

    public void setFibNumber(int fibNumber)
    {
        this.fibNumber = fibNumber;
    }
}
