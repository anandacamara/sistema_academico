package br.digital.com.desafio

import java.util.*

class Curso (var nome: String,
             val codigo: Int,
             val professorTitular: ProfessorTitular,
             val professorAdjunto: ProfessorAdjunto,
             val maxAlunos: Int, val alunosMatriculados: SortedSet<Aluno>) {

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