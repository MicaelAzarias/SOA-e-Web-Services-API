package br.com.fiap3espa.Auto_Escola_3ESPA.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health-check")
public class HealthCheckController {

    @GetMapping
    public String healthCheck() {
        return "Verificação de intregridade Auto Escola 3ESPA!";
    }
}
