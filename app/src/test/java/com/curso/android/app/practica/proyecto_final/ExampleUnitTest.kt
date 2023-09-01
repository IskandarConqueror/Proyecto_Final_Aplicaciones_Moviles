package com.curso.android.app.practica.proyecto_final

import Comparartext.TextComparisonViewModel
import junit.framework.TestCase.assertTrue
import org.junit.Test

class TextComparisonTes {
    @Test
    fun comparartexto() {
        //Definimos las variables
        val texto1 = "hola"
        val texto2 = "hola"

        //hacemos la funcion
        val resultado = TextComparisonViewModel().compareTexts(texto1, texto2)

        //verifica si el resultado es correcto
        assertTrue(resultado)
    }
}
