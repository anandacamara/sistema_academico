package br.com.digitalhouse.desafio

class Aluno (override var nome: String, var sobrenome: String, override var codigo: Int): EntidadeAcademica, Comparable<Aluno>{

    override fun toString(): String { return "\nALUNO: $nome $sobrenome; código: $codigo" }

    override fun compareTo(other: Aluno): Int { return nome.compareTo(other.nome) }
}