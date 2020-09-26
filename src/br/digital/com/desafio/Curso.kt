package br.digital.com.desafio

class Curso (var nome: String, val codigo: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Curso) return false
        if (other.codigo == codigo) return true
        return false
    }
}