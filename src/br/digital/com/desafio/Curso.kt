package br.digital.com.desafio

import java.util.*

class Curso (var nome: String,
             var codigo: Int,
             var professorTitular: ProfessorTitular,
             val professorAdjunto: ProfessorAdjunto,
             var maxAlunos: Int, val alunosMatriculados: SortedSet<Aluno>) {

    constructor (nome: String, codigo: Int, maxAlunos: Int){
        this.nome = nome
        this.codigo = codigo
        this.maxAlunos = maxAlunos
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Curso) return false
        if (other.codigo == codigo) return true
        return false
    }

    fun adicionarUmAluno(aluno: Aluno): Boolean{
        if (alunosMatriculados.size == maxAlunos) return false else alunosMatriculados.add(aluno)
        return true
    }

    fun excluirAluno(aluno: Aluno){
        alunosMatriculados.removeIf { it.equals(aluno) }
    }
}