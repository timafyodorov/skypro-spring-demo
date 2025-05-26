package pro.sky.skyprospringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorCantroler {
    private final CalculatorServiceImpl CalculatorServiceImpl;

    public CalculatorCantroler(CalculatorServiceImpl calculatorService) {
        this.CalculatorServiceImpl = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String calculatorHello() {
        return CalculatorServiceImpl.calculatorHello();
    }

    @GetMapping(path = "/calculator/plus")
    public String calculatorPlus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return CalculatorServiceImpl.calculatorPlus(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String calculatorMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return CalculatorServiceImpl.calculatorMinus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String calculatorMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return CalculatorServiceImpl.calculatorMultiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String calculatorDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return CalculatorServiceImpl.calculatorDevide(num1, num2);
    }
}
