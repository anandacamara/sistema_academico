package br.digital.com.desafio

import java.lang.IllegalArgumentException

class DigitalHouseManager {
    lateinit var alunos: MutableMap<Int, Aluno>
    lateinit var professores: MutableMap<Int, Professor>
    lateinit var cursos: MutableMap<Int, Curso>
    lateinit var matriculas: MutableList<Matricula>

    fun registrarCurso(nome: String, codigo: Int, maxAlunos: Int) = cursos.put(codigo, Curso(nome, codigo, maxAlunos))

    fun excluirCurso(codigo: Int) =  cursos.remove(codigo)

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigo: Int, horasMonitoria: Int)
            = professores.put(codigo, ProfessorAdjunto(nome, sobrenome, codigo, horasMonitoria))

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigo: Int, especialidade: String)
            = professores.put(codigo, ProfessorTitular(nome, sobrenome, codigo, especialidade))

    fun excluirProfessor(codigo: Int) = professores.remove(codigo)

    fun matricularAluno(nome: String, sobrenome: String, codigo: Int)
            = alunos.put(codigo, Aluno(nome, sobrenome, codigo))

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
        val aluno = alunos.find<Aluno>(codigoAluno)
        val curso = cursos.find<Curso>(codigoCurso)
        if (curso.adicionarUmAluno(aluno)) {
            matriculas.add(Matricula(aluno, curso))
            println("Matricula realizada com sucesso!")
        }
        else println("Impossível realizar matrícula! Não há vagas.")
        }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
        val curso = cursos.find<Curso>(codigoCurso)
        curso.professorTitular = professores.find(codigoProfessorTitular)
        curso.professorAdjunto = professores.find(codigoProfessorAdjunto)
    }

    private fun <T: EntidadeAcademica> MutableMap<Int, out EntidadeAcademica>.find(codigo: Int): T {
        return this[codigo] as T? ?: throw IllegalArgumentException("CODIGO INVALIDO: $codigo")
    }
}