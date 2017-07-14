package mario.com.palindromo.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import mario.com.palindromo.R
import mario.com.palindromo.presenter.Palindromo

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btVerificar.setOnClickListener(this)
        tvResultado.text = "Digite uma palavra"
    }

    override fun onClick(v: View?) {
        val palindromo = Palindromo(etName.text.toString())
        tvResultado.text = if(palindromo.ehPalindromo()) "${palindromo.conteudo} é um palíndromo" else "${palindromo.conteudo} não é um palíndromo"
    }
}
