package com.example.debugger

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textClique: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textClique = findViewById(R.id.textClique)

        textClique.setOnClickListener {

            val listaUsuarios = listOf("felipe", "android", "kotlin", "mobile")

            exibirListaItens(listaUsuarios)

        }


    }

    private fun exibirListaItens(listaUsuarios: List<String>) {

        var exibirPrimeiroUsuario = true
        var contadorItens = 0 //Breack Point (ponto de parada)

        for (usuario in listaUsuarios) {


            if (exibirPrimeiroUsuario) {
                println("primeiro usuário")
                exibirPrimeiroUsuario = false
            }
            exibirItem(usuario)
            contadorItens++
        }
    }

    private fun exibirItem(usuario: String) {

        println("usuario")
        println("-------")

    }
}