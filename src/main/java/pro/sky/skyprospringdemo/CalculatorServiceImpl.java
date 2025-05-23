package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl {

    public String calculatorHello() {
        return "Добро пожаловать в калькулятор";
    }

    public String calculatorPlus(int num1, int num2) {
        int res = num1 + num2;
        return num1 + " + " + num2 + " = " + res;
    }


    public String calculatorMinus(int num1, int num2) {
        int res = num1 - num2;
        return num1 + " - " + num2 + "  = " + res;
    }

    public String calculatorMultiply(int num1, int num2) {
        int res = num1 * num2;
        return num1 + " * " + num2 + "=" + res;
    }

    public String calculatorDevide(int num1, int num2) {
        if (num2 != 0) {
            int res = num1 / num2;
            return num1 + " / " + num2 + " = " + res;
        }else {
            return "На ноль делить нельзя";
        }

    }
 }
