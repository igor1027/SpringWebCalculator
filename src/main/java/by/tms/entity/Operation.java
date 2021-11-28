package by.tms.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operation {

    private long userId;
    private String num1;
    private String num2;
    private String operation;
    private String result;

//    public Operation() {
//    }
//
//    public Operation(long userId, String num1, String num2, String operation, String result) {
//        this.userId = userId;
//        this.num1 = num1;
//        this.num2 = num2;
//        this.operation = operation;
//        this.result = result;
//    }
//
//    public long getUserId() {
//        return userId;
//    }
//
//    public void setUserId(long userId) {
//        this.userId = userId;
//    }
//
//    public String getNum1() {
//        return num1;
//    }
//
//    public void setNum1(String num1) {
//        this.num1 = num1;
//    }
//
//    public String getNum2() {
//        return num2;
//    }
//
//    public void setNum2(String num2) {
//        this.num2 = num2;
//    }
//
//    public String getOperation() {
//        return operation;
//    }
//
//    public void setOperation(String operation) {
//        this.operation = operation;
//    }
//
//    public String getResult() {
//        return result;
//    }
//
//    public void setResult(String result) {
//        this.result = result;
//    }
}
