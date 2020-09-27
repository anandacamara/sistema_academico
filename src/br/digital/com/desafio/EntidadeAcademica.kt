package br.digital.com.desafio

abstract class EntidadeAcademica(var nome: String, var codigo: Int){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EntidadeAcademica) return false
        if (other.codigo == codigo) return true
        return false
    }
}