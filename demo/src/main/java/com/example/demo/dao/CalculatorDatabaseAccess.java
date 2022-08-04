package com.example.demo.dao;

import com.example.demo.model.Calculator;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("CalcDao")
public class CalculatorDatabaseAccess implements CalculatorDao{
    private static List<Calculator> DB = new ArrayList<>();

    @Override
    public List<Calculator> selectAllCalculations() {
        return DB;
    }

    @Override
    public int insertCalculation(Calculator calculator) {
        DB.add(new Calculator(calculator.getVariableOne(),calculator.getVariableTwo(),calculator.getOperation()));
        return 1;
    }
}
