package by.tms.repository;

import by.tms.entity.Operation;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.LinkedList;
import java.util.List;

@Component
public class CalculatorRepository {

    private final LinkedList<Operation> operationList = new LinkedList<>();

    public void saveOperation(Operation operation){
        operationList.addFirst(operation);
    }

    public List<String> showOperation(long id){
        LinkedList<String> list = new LinkedList<>();
        for (Operation operation : operationList){
            if(operation.getUserId() == id){
                String getOperation = operation.getNum1() + " " + operation.getOperation() + " " + operation.getNum2()+
                        " = " + operation.getResult();
                list.add(getOperation);
            }
        }
        return null;
    }
}
