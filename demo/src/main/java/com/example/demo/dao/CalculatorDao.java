package com.example.demo.dao;

import com.example.demo.model.Calculator;


import java.util.List;

public interface CalculatorDao {
    List<Calculator> selectAllCalculations();
    int insertCalculation(Calculator calculator);
//    default int insertCalculation(Calculator calculator){
//        return insertCalculation(calculator);
//    }
}
