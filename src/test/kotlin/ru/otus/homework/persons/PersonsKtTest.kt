package ru.otus.homework.persons

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PersonsKtTest {
    private companion object {
        val P1 = Person("Ivan", "Petrov", 10)
        val P2 = Person("Sergey", "Petrov", 35)
        val P3 = Person("Tatyana", "Petrova", 36)
        val P4 = Person("Natalya", "Sidorova", 50)
        val P5 = Person("Nilolay", "Zatochkin", 65)
    }

    private val persons = listOf(P1, P2, P3, P4, P5).shuffled()

    @Test
    fun sortsByAge() {
        println("=== СОРТИРОВКА ПО УБЫВАНИЮ ВОЗРАСТА ===")

        println("\n📋 Перемешанный список persons:")
        persons.forEachIndexed { index, person ->
            println("   ${index + 1}. ${person.name} ${person.surname} - ${person.age} лет")
        }

        val result = persons.sortByAge()

        println("\n🔽 Сортировка по убыванию возраста:")
        result.forEachIndexed { index, person ->
            println("   ${index + 1}. ${person.name} ${person.surname} - ${person.age} лет")
        }

        assertEquals(
            listOf(P5, P4, P3, P2, P1),
            persons.sortByAge()
        )
    }

    @Test
    fun sortsByNames() {
        println("=== СОРТИРОВКА ПО АЛФАВИТУ (ФАМИЛИЯ + ИМЯ) ===")

        println("\n📋 Перемешанный список persons:")
        persons.forEachIndexed { index, person ->
            println("   ${index + 1}. ${person.name} ${person.surname} - ${person.age} лет")
        }

        val result = persons.sortByName()

        println("\n🔤 Сортировка по алфавиту (фамилия + имя):")
        result.forEachIndexed { index, person ->
            println("   ${index + 1}. ${person.name} ${person.surname} - ${person.age} лет")
        }


        assertEquals(
            listOf(P1, P2, P3, P4, P5),
            persons.sortByName()
        )
    }
}