package com.fibonaccimaster.fibonacci.recursive.service;

import com.fibonaccimaster.fibonacci.recursive.model.OperationModel;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class GeneratorService {


    public String fibonacciSerie(OperationModel model)
    {
        return fibonacciSerie(model.getFibNumber());
    }


    private String fibonacciSerie(int n)
    {
        int[] fibArr = new int[n];
        for (int i = 0; i < n; i++) {

            fibArr[i] = fibRecursive(i);
        }
        return Arrays.toString(fibArr);
    }


    private int fibRecursive(int n)
    {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else if (n == 2) return 1;
        else return fibRecursive(n - 1) + fibRecursive(n - 2);
    }


    public OperationModel clear(OperationModel model)
    {
        model.setFibNumber(0);
        return model;
    }
}
