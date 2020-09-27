package br.digital.com.desafio

import java.util.*

class Curso (override var nome: String,
             override var codigo: Int,
             var professorTitular: ProfessorTitular,
             var professorAdjunto: ProfessorAdjunto,
             var maxAlunos: Int,
             val alunosMatriculados: SortedSet<Aluno>): EntidadeAcademica{

    constructor (nome: String, codigo: Int, maxAlunos: Int){
        this.nome = nome
        this.codigo = codigo
        this.maxAlunos = maxAlunos
    }

    fun adicionarUmAluno(aluno: Aluno): Boolean{
        if (alunosMatriculados.size == maxAlunos) return false else alunosMatriculados.add(aluno)
        return true
    }

    fun excluirAluno(aluno: Aluno) = alunosMatriculados.removeIf { it.equals(aluno) }
}