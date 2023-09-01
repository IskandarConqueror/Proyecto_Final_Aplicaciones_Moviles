package com.curso.android.app.practica.proyecto_final

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MainActivityUITest {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testButtonClick() {
        // Busca el botón por su ID y realiza clic en él
        onView(withId(R.id.compareButton)).perform(click())

        // Verifica si un elemento con el texto esperado está presente
        onView(withText("Los textos son iguales")).check(matches(isDisplayed()))
    }
}