package infnet.desenvolvimento.calculadoraTP1.controller;

import infnet.desenvolvimento.calculadoraTP1.model.Calculadora;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperacaoController {

    @GetMapping("/add")
    double addGet(@RequestBody Calculadora calculadora){
        return calculadora.add();
    }

    @PostMapping("/add")
    double addPost(@RequestBody Calculadora calculadora){
        return calculadora.add();
    }

    @GetMapping("/subtract")
    double subtractGet(@RequestBody Calculadora calculadora){
        return calculadora.subtract();
    }

    @PostMapping("/subtract")
    double subtractPost(@RequestBody Calculadora calculadora){
        return calculadora.subtract();
    }

    @GetMapping("/multiply")
    double multiplyGet(@RequestBody Calculadora calculadora){
        return calculadora.multiply();
    }

    @PostMapping("/multiply")
    double multiplyPost(@RequestBody Calculadora calculadora){
        return calculadora.multiply();
    }

    @GetMapping("/divide")
    double divideGet(@RequestBody Calculadora calculadora){
        return calculadora.divide();
    }

    @PostMapping("/divide")
    double dividePost(@RequestBody Calculadora calculadora){
        return calculadora.divide();
    }

    @GetMapping("/power")
    double powerGet(@RequestBody Calculadora calculadora){
        return calculadora.power();
    }

    @PostMapping("/power")
    double powerPost(@RequestBody Calculadora calculadora){
        return calculadora.power();
    }

}
