package br.digital.com.desafio

import java.lang.StringBuilder
import java.util.*

class Curso (override var nome: String,
             override var codigo: Int,
             var maxAlunos: Int): EntidadeAcademica {

    lateinit var alunosMatriculados: SortedSet<Aluno>
    lateinit var professorTitular: ProfessorTitular
    lateinit var professorAdjunto: ProfessorAdjunto

    fun adicionarUmAluno(aluno: Aluno): Boolean{
        if (alunosMatriculados.size == maxAlunos) return false else alunosMatriculados.add(aluno)
        return true
    }

    fun excluirAluno(aluno: Aluno) = alunosMatriculados.removeIf { it.equals(aluno) }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("CURSO: $nome; \nCódigo: $codigo; \nNúmero máximo de alunos: $maxAlunos")
        if (professorTitular != null) sb.append("; \n${professorTitular.toString()}")
        if (professorAdjunto != null) sb.append("; \n${professorAdjunto.toString()}")
        alunosMatriculados.forEach{ sb.append(it.toString()) }
        return sb.toString()
    }
}