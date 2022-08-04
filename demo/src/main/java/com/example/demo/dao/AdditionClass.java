package com.example.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class AdditionClass implements Operation {
    @Override
    public long applyOperation(long x, long y) {
        return x + y;
    }

    @Override
    public boolean isValidOperator(String operator) {
        return "+".equals(operator);
    }
}
