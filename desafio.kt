// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {
    val inscritos = mutableListOf<Usuario>()

    fun matricula(vararg usuarios: Usuario) {
        inscritos.addAll(usuarios)
    }
}

fun main() {

    val user0 = Usuario("Paulo Augusto")
    val user1 = Usuario("Fabio Barbosa")
    val user2 = Usuario("Angela Maria")

    val python = listOf(
        ConteudoEducacional("Basico Python", 30),
        ConteudoEducacional("Intermediario Python", 45),
        ConteudoEducacional("Avancado Python", 40)
    )

    val ruby = listOf(
        ConteudoEducacional("Basico Ruby", 20),
        ConteudoEducacional("Intermediario RubyOnRails", 65),
        ConteudoEducacional("Avancado RubyOnRails", 60)
    )

    val java = listOf(
        ConteudoEducacional("Basico Java", 28),
        ConteudoEducacional("Intermediario Java", 50),
        ConteudoEducacional("Avancado Java", 40) // Corrigido o nome do conteúdo
    )

    val formacaoPython0 = Formacao("Python", python, Nivel.BASICO)
    val formacaoPython1 = Formacao("Python", python, Nivel.INTERMEDIARIO)
    val formacaoPython2 = Formacao("Python", python, Nivel.AVANCADO)

    val formacaoRuby0 = Formacao("Ruby", ruby, Nivel.BASICO)
    val formacaoRuby1 = Formacao("RubyOnRails", ruby, Nivel.INTERMEDIARIO)
    val formacaoRuby2 = Formacao("RubyOnRails", ruby, Nivel.AVANCADO)

    val formacaoJava0 = Formacao("Java", java, Nivel.BASICO)
    val formacaoJava1 = Formacao("Java", java, Nivel.INTERMEDIARIO)
    val formacaoJava2 = Formacao("Java", java, Nivel.AVANCADO)

    formacaoPython0.matricula(user0) // Matricular múltiplos usuários
	formacaoJava0.matricula(user1)
    println("${user0.nome} está matriculado na formação ${formacaoPython0.nome} - ${formacaoPython0.nivel}")
    println("${user1.nome} está matriculado na formação ${formacaoJava2.nome} - ${formacaoJava2.nivel}")
    println("${user2.nome} está matriculado na formação ${formacaoRuby1.nome} - ${formacaoRuby1.nivel}")
}
