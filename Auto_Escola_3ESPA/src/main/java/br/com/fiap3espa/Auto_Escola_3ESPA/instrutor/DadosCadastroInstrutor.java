package br.com.fiap3espa.Auto_Escola_3ESPA.instrutor;

import br.com.fiap3espa.Auto_Escola_3ESPA.endereco.DadosEndereco;

public record DadosCadastroInstrutor(String nome,
                                     String email,
                                     String cnh,
                                     String especialidade,
                                     DadosEndereco endereco) {
}
