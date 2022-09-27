### Найди символы
---
Классический для графического дизайна текст Lorem Ipsum:
`Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum`
---
1. Вам нужно определить, какая буква встречалась в приведенном тексте чаще всего и какая реже всего. 
* Определить, является ли символ буквой, можно с помощью встроенного статического метода `Character.isLetter` 
2. Заведите в Main статическое текстовое поле с содержимым из текста выше, 
3. В main напишите программу, решающую поставленную задачу.
---
### Подсказки
1. Заведите мапу `Map<Character, Integer>`, в которой для каждого символа будете хранить количество раз, которое вы его встретили. 
* Изначально мапа пустая. `Character` это ссылочный тип - обёртка для `char`, как `Integer` для `int`.
2. Пройдитесь циклом по символам строки. Символы можно получать по индексу с помощью метода `.charAt(ИНДЕКС)`. Для каждого символа проверьте, есть ли он в мапе. Может быть два случая:
* Его нет в мапе. Значит, мы встретили его в первый раз и вставляем в мапу пару где ключ это наш символ, а значение это 1 (тк встретили его всего один раз).
* Он есть в мапе. Значит он нам уже встречался. Вынимаем текущее значение для ключа (нашего символа), увеличиваем это число на 1 и вставляем обратно в мапу.
3. В итоге после цикла у нас будет мапа частот с которой встречаются символы.
4. Всё что нам останется - пройтись по этой мапе и найти максимум и минимум. Находить максимум в последовательности вы уже умеете, останется только адаптировать эту логику для поиска не в массиве, а проходясь по мапе. Поиск минимума абсолютно аналогичен (только вместо -1 возьмите `Integer.MAX_VALUE` - максимальное значение которое может быть у `int`).