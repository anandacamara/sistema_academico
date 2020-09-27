package br.digital.com.desafio

class ProfessorTitular (nome: String,
                        override var sobrenome: String,
                        codigo: Int,
                        var especialidade: String): Professor, EntidadeAcademica(nome, codigo){
    override var tempoDeCasa: Int = 0
}