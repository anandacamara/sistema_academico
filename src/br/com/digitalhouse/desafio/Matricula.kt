package br.com.digitalhouse.desafio

import java.util.*

data class Matricula (val aluno: Aluno, val curso: Curso) {
    val data: Date = Date()
}