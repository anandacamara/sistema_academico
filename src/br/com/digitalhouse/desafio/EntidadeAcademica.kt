package br.com.digitalhouse.desafio

interface EntidadeAcademica {

    var nome: String
    var codigo: Int

    fun equals(other: EntidadeAcademica): Boolean {
        if (this === other) return true
        if (other.codigo == codigo) return true
        return false
    }
}