package br.com.fiap3espa;
// cp vai ser criar alguma api e criar um codigo pra consulmir esta api que criamos
import br.com.fiap3espa.service.Division;
import br.com.fiap3espa.service.Multiplication;
import br.com.fiap3espa.service.Subtraction;
import br.com.fiap3espa.service.Sum;
import jakarta.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args){
        System.out.println("Publicando API ...");
        Endpoint.publish("http://localhost:8080/calculator/sum", new Sum());
        Endpoint.publish("http://localhost:8080/calculator/subtraction", new Subtraction());
        Endpoint.publish("http://localhost:8080/calculator/multplication", new Multiplication());
        Endpoint.publish("http://localhost:8080/calculator/division", new Division());
        System.out.println("API publicada com sucesso!");
    }
}
