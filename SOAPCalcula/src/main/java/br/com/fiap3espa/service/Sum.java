package br.com.fiap3espa.service;


import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap3espa.service.Operations")
// implementar os metodos
public class Sum implements Operations {

    @Override
    public String showName() {
        return "SOMA";
    }

    @Override
    public String showSymbol() {
        return "+";
    }

    // substituição o override, serve para substituir o metodo da classe principal, quando se tem o override
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }

    @Override
    public String showMessage(double a, double b) {
        return "O RESULTADO DA " + showName() + " DE (" + a + " " +showSymbol() + " " + b + ") É: " +
                calculate(a, b) + "!";
    }
}
