Лабораторная 3. Основы ООП в языке Kotlin
[x] 1. Реализовать класс Person с полями: фио (класс Fio), возраст, пол, паспортные данные (серия и номер), рабочие обязанности (список Duty)
[x] 2. Для класса Person даже фигурировать: первичный конструктор (заполняющий поле Fio, возраст и пол), вторичные конструкторы:
   - вызывающий первичный и добавляющий паспортные данные
   - вызывающий предыдущий конструктор и добавляющий список обязанностей
[x] 3. Fio - должно быть inline классом
[] 4. Определить сеттеры для паспортных данных с их валидацией (чтобы количество цифр не превышало стандартные значения и нельзя было добавлять в эти поля не цифровые символы)
[x] 5. Добавить методы по добавлению обязанностей
[x] 6. Добавить метод по удалению обязанностей из списка по значению должности
[x] 7. Класс Duty должен содержать поля: должность, стаж, заработная плата
   - сделать для данного класса только первичный конструктор, но все сеттеры определить как приватные
[x] 8. Если поле возраст < 18 лет, рабочие обязанности всегда должны быть равны null

     