package br.com.digitalhouse.desafio

abstract class Professor(override var nome: String,
                         var sobrenome: String,
                         override var codigo: Int): EntidadeAcademica {
    var tempoDeCasa: Int = 0
}