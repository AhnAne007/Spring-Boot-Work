package com.example.demo.model;

import com.example.demo.dao.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Calculator {
    private UUID id;
    private long variableOne;
    private long variableTwo;

    private String operation;

    private List<Operation> operationsCalc = new ArrayList<>();
    private long result;

    public long getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Calculator(@JsonProperty("varone") long variableOne,@JsonProperty("vartwo") long variableTwo,@JsonProperty("op") String operation) {
        this.variableOne = variableOne;
        this.variableTwo = variableTwo;
        this.operation = operation;
        this.result = 0;
        operationsCalc.add(new AdditionClass());
        operationsCalc.add(new DivisionClass());
        operationsCalc.add(new MultiplyClass());
        operationsCalc.add(new SubtractionClass());
        calculate(variableOne,variableTwo,operation);
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

//    public Calculator(long variableOne, long variableTwo) {
//        this.variableOne = variableOne;
//        this.variableTwo = variableTwo;
//    }

    public long getVariableOne() {
        return variableOne;
    }

    public void setVariableOne(long variableOne) {
        this.variableOne = variableOne;
    }

    public long getVariableTwo() {
        return variableTwo;
    }

    public void setVariableTwo(long variableTwo) {
        this.variableTwo = variableTwo;
    }

    public void calculate(long a, long b, String operator) {
        for (Operation o : operationsCalc) {
            if (o.isValidOperator(operator)) {
                result = o.applyOperation(a, b);
            }
            //throw new IllegalArgumentException("Illegal operation for operator : "+operator);
        }
    }
}