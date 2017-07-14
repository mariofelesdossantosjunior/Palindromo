package mario.com.palindromo.presenter

/**
 * Created by mario on 14/07/17.
 */
class Palindromo constructor(conteudo: String){
    val conteudo: String = conteudo

    get() {
        return field.toLowerCase()
    }

    fun ehPalindromo() : Boolean{
        return conteudo == conteudo.reversed()
    }
}