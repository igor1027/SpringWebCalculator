package by.tms.controller;

import by.tms.entity.User;
import by.tms.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/calc")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/calculator")
    public String calc(){
        return "calc";
    }

    @PostMapping("/calculator")
    public String calc(String num1, String num2, String operation, HttpSession httpSession, Model model){
        if(num1 != null && num2 != null && operation != null){
            User user = (User) httpSession.getAttribute("user");
            double result = calculatorService.Calculator(num1,num2,operation,user.getId());
            model.addAttribute("message1",num1+ " " + operation + " " + num2
            + " = " + result);
        }else {
            model.addAttribute("message2", "No values entered");
        }
        return "calc";
    }

    @GetMapping("/history")
    public String history(){
        return "history";
    }

    @PostMapping("/history")
    public  String history(HttpSession httpSession, Model model){
        User user = (User) httpSession.getAttribute("user");
        List<String> operationHistory = calculatorService.showOperation(user.getId());
        if(operationHistory != null && !operationHistory.isEmpty()){
            model.addAttribute("operationHistory", operationHistory);
        }else {
            model.addAttribute("message", "List operation is empty");
        }
        return "history";
    }
}
