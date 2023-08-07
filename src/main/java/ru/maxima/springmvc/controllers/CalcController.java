package ru.maxima.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calc")
public class CalcController {
//Сделать калькулятор, который будет принимать в качестве аргументов запроса
// две переменные и вид операции. И будет возвращать пользователю результат
// математической операции в виде html - страницы


    @GetMapping("/calculator")
    public String calc(@RequestParam("a") int a,
                       @RequestParam("b") int b,
                       @RequestParam("op") String op,
                       Model model) {
        double result = switch (op) {
            case "mul" -> a * b;
            case "div" -> (double) a / b;
            case "sub" -> a - b;
            case "sum" -> a + b;
            default -> 0;
        };
        model.addAttribute("result", result);
        return "calc/calculator";
    }
}
