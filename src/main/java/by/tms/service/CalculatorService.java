package by.tms.service;

import by.tms.entity.Operation;
import by.tms.repository.CalculatorRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CalculatorService {

    private final CalculatorRepository calculatorRepository;

    public CalculatorService(CalculatorRepository calculatorRepository) {
        this.calculatorRepository = calculatorRepository;
    }

    public double Calculator(String num1, String num2, String operation, long userId){

        double number1 = Double.parseDouble(num1);
        double number2 = Double.parseDouble(num2);

        switch (operation){
            case "sum" : {
                double result = number1 + number2;
                calculatorRepository.saveOperation(new Operation(userId,num1,num2,operation,String.valueOf(result)));
                return result;
            }
            case "sub" : {
                double result = number1 - number2;
                calculatorRepository.saveOperation(new Operation(userId,num1,num2,operation,String.valueOf(result)));
                return result;
            }
            case "div" : {
                double result = number1 / number2;
                calculatorRepository.saveOperation(new Operation(userId,num1,num2,operation,String.valueOf(result)));
                return result;
            }
            case "mul" : {
                double result = number1 * number2;
                calculatorRepository.saveOperation(new Operation(userId,num1,num2,operation,String.valueOf(result)));
                return result;
            }
        }
        return 0;
    }

    public List<String> showOperation(long userid){
        return calculatorRepository.showOperation(userid);
    }
}
