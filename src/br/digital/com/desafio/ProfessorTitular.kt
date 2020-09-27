package br.digital.com.desafio

class ProfessorTitular (nome: String,
                        sobrenome: String,
                        codigo: Int,
                        var especialidade: String): Professor(nome, sobrenome, codigo) {
}