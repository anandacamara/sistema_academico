package br.digital.com.desafio

import java.util.*

class Curso (nome: String,
             codigo: Int,
             var professorTitular: ProfessorTitular,
             val professorAdjunto: ProfessorAdjunto,
             var maxAlunos: Int,
             val alunosMatriculados: SortedSet<Aluno>): EntidadeAcademica(nome, codigo) {

    constructor (nome: String, codigo: Int, maxAlunos: Int){
        this.nome = nome
        this.codigo = codigo
        this.maxAlunos = maxAlunos
    }

    fun adicionarUmAluno(aluno: Aluno): Boolean{
        if (alunosMatriculados.size == maxAlunos) return false else alunosMatriculados.add(aluno)
        return true
    }

    fun excluirAluno(aluno: Aluno){
        alunosMatriculados.removeIf { it.equals(aluno) }
    }
}