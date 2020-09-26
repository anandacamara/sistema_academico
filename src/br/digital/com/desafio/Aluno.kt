package br.digital.com.desafio

class Aluno (var nome: String, var sobrenome: String, val codigo: Int){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aluno) return false
        if (other.codigo == codigo) return true
        return false
    }
}