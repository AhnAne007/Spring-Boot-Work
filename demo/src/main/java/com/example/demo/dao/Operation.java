package com.example.demo.dao;

public interface Operation {
    long applyOperation(long x,long y);
    boolean isValidOperator(String operator);
}
