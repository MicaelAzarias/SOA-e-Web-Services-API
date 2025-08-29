package br.com.fiap3espa.service;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap3espa.service.Operations")
public class Multiplication implements Operations{

    @Override
    public String showName() {
        return "MULTIPLICAÇÃO";
    }

    @Override
    public String showSymbol() {
        return "*";
    }

    @Override
    public double calculate(double a, double b) {
        return a * b;
    }

    @Override
    public String showMessage(double a, double b) {
        return "A MULTIPLICAÇÃO É " + calculate(a, b);
    }
}
