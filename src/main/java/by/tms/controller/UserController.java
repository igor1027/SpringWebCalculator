package by.tms.controller;


import by.tms.entity.User;
import by.tms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/reg")
    public String reg(){
        return "reg";
    }

    @PostMapping("/reg")
    public String reg(User user, Model model){
        if (!userService.checkUsername(user.getUsername())){
            userService.saveUser(user);
            return "redirect: /user/auth";
        }else {
            model.addAttribute("message", "A user with this username exist");
        }
        return "reg";
    }

    @GetMapping("/auth")
    public String auth(){
        return "auth";
    }

    @PostMapping("/auth")
    public String auth(String username, String password, HttpSession httpSession, Model model){
        User byUsername = userService.findByUser(username);
        if(byUsername != null){
            if (byUsername.getPassword().equals(password)){
                httpSession.setAttribute("user", byUsername);
                return "redirect:/";
            }else {
                model.addAttribute("message", "Wrong password!");
            }
        }else {
            model.addAttribute("message", "User not found!");
        }
        return "auth";
    }

    @GetMapping("/logout")
    public String logout(HttpSession httpSession){
        httpSession.invalidate();
        return "redirect:/";
    }
}
