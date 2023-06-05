# Практическая работа №4
В рамках данной лабораторной работы был на практике реализован паттерн **"Итератор"**.

Данный паттерн предоставляет способ последовательного доступа ко всем элементам составного объекта, не раскрывая его внутреннего представления.**Итератор** - это интерфейс, включающий необходимые методы для просмотра всех элементов структуры данных. 
Наиболее распространенные методы:
* hasNext() - возвращает  true, если все еще в структуре есть элементы для просмотра, и false, если не осталось ни одного.
* next() - возвращает следующий элемент в структуре данных.

На снове программы, написанной в Task2, **были реализованы**: 
* Aggregate — интерфейс.
* Iterator — интерфейс.
* Класс ImageCollection, реализующий интерфейс Aggregate.
*Внутренний класс ImageIterator, реализующий интерфейс Iterator.

Данная программа позволяет запустить и остановить слайд-шоу, предварительно задав скорость переключения слайдов (start, play), а также прокрутить изображения вперёд и назад соответсвующими кнопками.

### Зависимости
Для корректной работы данного приложения требуется наличие у пользователя ОС Windows не ниже 7 версии, а также установленная на ПК Java.

### Рабочие окна программы
