package br.digital.com.desafio

fun main(){

    val digitalHouseManager = DigitalHouseManager()

    digitalHouseManager.registrarCurso("FullStack", 20001, 3)
    digitalHouseManager.registrarCurso("Android", 20002, 2)

    digitalHouseManager.registrarProfessorTitular("Joao", "Silva", 1001, "Kotlin")
    digitalHouseManager.registrarProfessorTitular("Vitoria", "Gomes", 1002, "Android")

    digitalHouseManager.registrarProfessorAdjunto("Fulano", "Silva", 1003, 10)
    digitalHouseManager.registrarProfessorAdjunto("Beltrano", "Camargo", 1004, 10)

    digitalHouseManager.matricularAluno("Ananda", "Larissa", 3001)
    digitalHouseManager.matricularAluno("Anna", "Livia", 3002)
    digitalHouseManager.matricularAluno("Alana", "Luane", 3003)

    digitalHouseManager.alocarProfessores(20001, 1002, 1003)
    digitalHouseManager.alocarProfessores(20002, 1001, 1004)

    digitalHouseManager.matricularAluno(3001, 20001)
    digitalHouseManager.matricularAluno(3002, 20001)

    digitalHouseManager.matricularAluno(3001, 20002)
    digitalHouseManager.matricularAluno(3002, 20002)
    digitalHouseManager.matricularAluno(3003, 20002)

    println()
    println(digitalHouseManager.cursos[20001].toString())

    digitalHouseManager.excluirProfessor(1002)

    println()
    println(digitalHouseManager.cursos[20001].toString())

    digitalHouseManager.excluirCurso(20001)

    println()
    println(digitalHouseManager.cursos[20001].toString())
}