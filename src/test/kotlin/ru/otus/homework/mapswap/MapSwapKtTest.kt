package ru.otus.homework.mapswap

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MapSwapKtTest {
    @Test
    fun swapsIntAndString() {
        val source = mapOf(
            1 to "one",
            2 to "two",
            3 to "three"
        )

        println("=== ТЕСТ ФУНКЦИИ SWAP() ===")
        println("\n📋 Исходная Map:")
        source.forEach { (key, value) ->
            println("   $key → \"$value\"")
        }

        val result = source.swap()

        println("\n🔄 После замены местами ключей и значений:")
        result.forEach { (key, value) ->
            println("   \"$key\" → $value")
        }
        assertEquals(
            mapOf(
                "one" to 1,
                "two" to 2,
                "three" to 3
            ),
            source.swap()
        )
    }
}