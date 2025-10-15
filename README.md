# Kotlin-4 - Коллекции
Код к занятию Kotlin-4 - коллекции

- List
- Set
- Map
- Sequence

# Домашнее задание

## 1. Сортировка справочника по возрасту
В папке [persons](src/main/kotlin/ru/otus/homework/persons) вы найдете класс `Person` для хранения имени, фамилии и возраста.
Напишите реализацию функции `sortByAge` в файле [persons.kt](src/main/kotlin/ru/otus/homework/persons/persons.kt), чтобы
персоны сортировались по возрасту в порядке убывания
Тест функции в файле [PersonsKtTest](src/test/kotlin/ru/otus/homework/persons/PersonsKtTest.kt)

## 2. Сортировка справочника по имени
В папке [persons](src/main/kotlin/ru/otus/homework/persons) вы найдете класс `Person` для хранения имени, фамилии и возраста.
Напишите реализацию функции `sortByName` в файле [persons.kt](src/main/kotlin/ru/otus/homework/persons/persons.kt), чтобы:

- персоны сортировались по алфавиту
- при одинаковой фамилии, персоны сортируются по имени

Тест функции в файле [PersonsKtTest](src/test/kotlin/ru/otus/homework/persons/PersonsKtTest.kt)

## 3. Переворот Map
В папке [mapswap](src/main/kotlin/ru/otus/homework/mapswap) вы найдете файл `mapSwap.kt` c заготовкой функции `swap`.
Напишите реализацию функции таким образом, чтобы ключи и значения менялись местами для произвольных типов `K` и `V`.
Тест функции в файле [MapSwapKtTest](src/test/kotlin/ru/otus/homework/mapswap/MapSwapKtTest.kt)

## 4. Собственный List
На семинаре мы начали делать свою собственную реализацию List. Нужно доделать методы `subList` и `containsAll`,
класса [NaturalList](src/main/kotlin/ru/otus/homework/NaturalList.kt), чтобы интерфейс был полностью закончен.
Тест функций найдете в файле [NaturalListTest](src/test/kotlin/ru/otus/homework/NaturalListTest.kt)

## 5. equals() и hashCode() для списка
На семинаре мы начали делать свою собственную реализацию List. Нужно реализовать методы `equals` и `hashCode`,
класса [NaturalList](src/main/kotlin/ru/otus/homework/NaturalList.kt), чтобы контракт этих функций выполнялся.

- Результат работы `equals` должен давать положительный результат при сравнении с другим стандартным списком.
  Например, выполнение функции для `NaturalList(5)` должно совпадать с результатами аналогичной функций для `listOf(1, 2, 3, 4, 5)`.
- Результат работы `hashCode` должен быть корректным и "хорошим" - должен зависеть от параметра списка. Вы можете воспользоваться 
  любой удобной вам хэш-функцией. Например, посмотреть готовую реализацию в библиотечных классах. Эта часть задания, скорее, 
  на исследование библиотечных коллекций и поиск готовых реализаций в стандартной библиотеке.

Тест функций найдете в файле [NaturalListTest](src/test/kotlin/ru/otus/homework/NaturalListTest.kt)

