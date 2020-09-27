package br.digital.com.desafio

class ProfessorAdjunto (nome: String,
                        override var sobrenome: String,
                        codigo: Int,
                        var horasMonitoria: Int): Professor, EntidadeAcademica(nome, codigo){
    override var tempoDeCasa: Int = 0
}