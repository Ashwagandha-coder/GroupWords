fun main() {

    var abc: Array<String> = arrayOf("eat","tea","tan","ate","nat","bat")
    println(GroupWords(abc))


}

fun GroupWords(words: Array<String>): List<List<String>> {

    var result: MutableList<List<String>> = mutableListOf()

    val map = mutableMapOf<String, MutableList<String>>()

    for (word in words) {
        // сеператор это символ между буквами
        // Преобразуем строку в символьный массив , сортируем по алфавиту , преобразуем символ в строку
        val sortedWord = word.toCharArray().sorted().joinToString("")

        if (map.containsKey(sortedWord))
            // Проверяем есть ли этот ключ в хеш-таблице
            map[sortedWord]?.add(word)
        else
            // Добавляем по ключу значение обернутово в лист(массив)
            map[sortedWord] = mutableListOf(word)

// Проходимся по элементам хеш-таблицы и все значения value кладем в результирующий массив
        for((key, value) in map) {
            result.add(value)
        }
    }

    return result



}