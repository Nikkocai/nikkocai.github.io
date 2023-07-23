package com.curso.android.app.practica.proyectofinal.view

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.curso.android.app.practica.proyectofinal.R
import org.junit.Assert.*

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get: Rule
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun mainActivity_EqualStrings() {
        val holaMundo = "Hola mundo"
        Espresso.onView(
            ViewMatchers.withId(R.id.textField1)
        ).perform(
            ViewActions.typeText(holaMundo)
        )

        Espresso.onView(
            ViewMatchers.withId(R.id.textField2)
        ).perform(
            ViewActions.typeText(holaMundo)
        )

        Espresso.pressBack()

        Espresso.onView(
            ViewMatchers.withId(R.id.cmpBtn)
        ).perform(
            ViewActions.click()
        )

        Espresso.onView(
            ViewMatchers.withId(R.id.resultOutput)
        ).check(
            ViewAssertions.matches(
                ViewMatchers.withText(R.string.equal)
            )
        )
    }

    @Test
    fun mainActivity_NonEqualStrings() {
        val str1 = "Hola"
        val str2 = "Chau"
        Espresso.onView(
            ViewMatchers.withId(R.id.textField1)
        ).perform(
            ViewActions.typeText(str1)
        )

        Espresso.onView(
            ViewMatchers.withId(R.id.textField2)
        ).perform(
            ViewActions.typeText(str2)
        )

        Espresso.pressBack()

        Espresso.onView(
            ViewMatchers.withId(R.id.cmpBtn)
        ).perform(
            ViewActions.click()
        )

        Espresso.onView(
            ViewMatchers.withId(R.id.resultOutput)
        ).check(
            ViewAssertions.matches(
                ViewMatchers.withText(R.string.nonequal)
            )
        )
    }


}