package com.example.demo.service;

import com.example.demo.dao.CalculatorDao;
import com.example.demo.dao.Operation;
import com.example.demo.model.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CalculatorService {

    private CalculatorDao calculatorDao;

    @Autowired
    public CalculatorService(@Qualifier("CalcDao") CalculatorDao calculatorDao) {
        this.calculatorDao = calculatorDao;
    }

    public int addCalculator(Calculator calculator) {
        return calculatorDao.insertCalculation(calculator);
    }

    public List<Calculator> getAllCalculations() {
        return calculatorDao.selectAllCalculations();
    }
}
