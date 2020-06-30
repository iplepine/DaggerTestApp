package com.zs.example.daggertest

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val tcArray = arrayOf(TC("a", 1), TC("a", 3), TC("b", 2), TC("a", 1))

        val group = tcArray.groupingBy { tc -> tc.key }
            .fold(0, operation = { accumulator, element -> accumulator + element.value })



        println(group)
    }

    class TC(val key: String, val value: Int) {
    }
}
