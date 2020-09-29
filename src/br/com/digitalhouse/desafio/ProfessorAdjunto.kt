package br.com.digitalhouse.desafio

class ProfessorAdjunto (nome: String,
                        sobrenome: String,
                        codigo: Int,
                        var horasMonitoria: Int): Professor(nome, sobrenome, codigo){

    override fun toString(): String {
        return "PROFESSOR ADJUNTO: $nome $sobrenome; código $codigo; Horas de monitoria: $horasMonitoria"
    }
}