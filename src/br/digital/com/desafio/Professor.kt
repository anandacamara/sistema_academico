package br.digital.com.desafio

abstract class Professor (var nome: String, var sobrenome: String, val codigo: Int){

    var tempoDeCasa: Int = 0

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Professor) return false
        if (other.codigo == codigo) return true
        return false
    }
}