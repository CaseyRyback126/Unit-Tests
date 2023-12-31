﻿1.**Вопрос**: Почему использование тестовых заглушек может быть полезным при написании модульных тестов?

**Ответ**: Использование тестовых заглушек полезно при написании модульных тестов, так как они позволяют изолировать код, который вы хотите протестировать, от внешних зависимостей. Это делает тестирование более предсказуемым и позволяет проверить, что конкретная часть кода работает правильно, даже если внешние компоненты еще не реализованы.

2.**Вопрос**: Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?

**Ответ**: для проверки вызова метода с определенными аргументами следует использовать **заглушку-шпиона (Spy)**. Заглушка-шпион записывает информацию о вызовах метода, а затем можно проверить эту информацию, чтобы убедиться, что метод был вызван с ожидаемыми аргументами.

3.**Вопрос**: Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?

**Ответ**: для возвращения определенного значения или исключения в ответ на вызов метода следует использовать **заглушку-подделку (Stub)**. Эта заглушка предоставляет фиксированный результат при вызове метода, что позволяет создавать сценарии для разных вариантов выполнения кода.

4.**Вопрос**: Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?

**Ответ**: Для имитации взаимодействия с внешним API или базой данных следует использовать **заглушку-заменитель (Mock)**. Заглушка-заменитель позволяет эмулировать поведение внешних систем, чтобы код мог быть протестирован в изоляции от реальных сервисов.

