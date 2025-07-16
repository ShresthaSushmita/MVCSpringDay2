package com.controller;

import com.dto.EmployeeDTO;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping({"/login","/"})
    public String callLoginPage(){
        return "login";
    }

    @PostMapping("/loginValidate")
    public String authenticate(@RequestParam String emailId, @RequestParam String password, Model model){
        EmployeeDTO employeeDTO = employeeService.authenticate(emailId, password);

        if(employeeDTO != null){
            //valid
            model.addAttribute("employeeDTO", employeeDTO);
            return "congratulation";
        }else{
            //invalid
            model.addAttribute("message", "Wrong credential!! Re-try please");
            return "login";
        }
    }
}
