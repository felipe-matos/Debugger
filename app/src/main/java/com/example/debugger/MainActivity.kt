package com.example.debugger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaUsuarios = listOf("felipe", "android", "kotlin", "mobile")

        exibirListaItens(listaUsuarios)

    }

    private fun exibirListaItens(listaUsuarios: List<String>) {

        var exibirPrimeiroUsuario = true
        var contadorItens = 0 //Breack Point (ponto de parada)

        for (usuario in listaUsuarios) {


            if (exibirPrimeiroUsuario) {
                println("primeiro usuário")
                exibirPrimeiroUsuario = false
            }
            print(usuario)
            contadorItens++
        }
    }
}