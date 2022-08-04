package com.example.demo.api;

import com.example.demo.model.Calculator;
import com.example.demo.model.Person;
import com.example.demo.service.CalculatorService;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/calculator")
@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    // Now I need to make some endpoints and requests
    @PostMapping // To use POST request
    public void addCalculation(@RequestBody Calculator calculator){
        calculatorService.addCalculator(calculator);
    }

    @GetMapping
    public List<Calculator> getAllCalculations(@RequestParam(value="varone") int valueOne,@RequestParam(value="vartwo") int valueTwo,@RequestParam(value="op") String opr){
       // Calculator calculator=new Calculator(valueOne,valueTwo,opr);
        addCalculation(new Calculator(valueOne,valueTwo,opr));
        return calculatorService.getAllCalculations();
    }
    // hi something done.
}
