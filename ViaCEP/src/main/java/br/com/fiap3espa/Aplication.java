package br.com.fiap3espa;

import br.com.fiap3espa.client.ViapCEPClient;
import br.com.fiap3espa.model.EnderecoDTO;

import java.io.IOException;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o CEP: ");
        String cep = sc.next();

        EnderecoDTO endereco = ViapCEPClient.getEndereco(cep);

        System.out.println(endereco.cep());
        System.out.println(endereco.logradouro());
        System.out.println(endereco.complemento());
        System.out.println(endereco.bairro());
        System.out.println(endereco.localiddade());
        System.out.println(endereco.estado());
    }
}
