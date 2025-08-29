package br.com.fiap3espa.service;

import com.oracle.xmlns.webservices.jaxws_databinding.SoapBindingStyle;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
// @SOAPBinding(style = SOAPBinding.Style.DOCUMENT) caso use em outra linguagem
@SOAPBinding(style = SOAPBinding.Style.RPC) // serve para quando for trabalhar com um codigo java, e outra pessoa for consumir em alguma outra linguagem, aqui que alteramos
public interface Operations {

    @WebMethod // serve para publicar na web, tem que colocar para todos, pois ele serve para um.
    String showName();

    @WebMethod
    String showSymbol();

    @WebMethod
    double calculate(double a, double b);

    @WebMethod
    String showMessage(double a, double b);
}
