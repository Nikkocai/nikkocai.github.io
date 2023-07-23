package com.curso.android.app.practica.proyectofinal

import com.curso.android.app.practica.proyectofinal.view.MainViewModel
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.*
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
class MainViewModelUnitTest {

    private lateinit var viewModel : MainViewModel

    @get:Rule
    val instantTaskRule = InstantTaskExecutorRule()
    private val dispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(dispatcher)
        viewModel = MainViewModel()
    }
    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }
    @Test
    fun mainViewModel_CheckInitialValues() = runTest {
        val value1 = viewModel.inputResult.value?.textInput1
        val value2 = viewModel.inputResult.value?.textInput2
        val cmp = viewModel.inputResult.value?.cmp

        assertEquals("", value1)
        assertEquals("", value2)
        assertTrue(cmp?:false)
    }
    @Test
    fun mainViewModel_TestEqualStringsOutput() = runTest {
        launch{
            val str = "iguales"
            viewModel.compareTextFields(str, str)
        }
        advanceUntilIdle()
        val result = viewModel.inputResult.value?.cmp
        assertTrue(result?:false)
    }

    @Test
    fun mainViewModel_TestDifferentStringsOutput() = runTest {
        launch{
            viewModel.compareTextFields("a", "b")
        }
        advanceUntilIdle()
        val result = viewModel.inputResult.value?.cmp
        assertFalse(result?:true)
    }
}