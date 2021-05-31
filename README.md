# taskOfFloors

Реконструкция домов

Есть двумерная улица имени Оптимальной Алгоритмической Сложности, которая идет с востока на запад. На этой улице стоят дома разной этажности. Администрация города планирует провести реконструкцию этих домов, в процессе увеличив их этажность.
Вас назначили главным архитектором проекта реконструкции.
Администрация выдвинула следующие требования к проекту:

Высота домов на улице не должна превышать 5 этажей.
В домах можно достраивать новые этажи, но они не должны ухудшать вид из окон уже существующих. Ухудшением считается ситуация, когда до реконструкции из окон существующих этажей был виден восход или закат солнца по прямой линии видимости, не перекрытый этажом другого дома той же высотности, а после реконструкции – нет.
Вид из окон новых этажей может быть любым.
Реконструкция всех домов проводится одновременно.

Напишите код, который позволяет рассчитать план реконструкции, максимизирующий количество этажей в домах. Алгоритмическая сложность расчета должна быть лучше, чем 
O(n∗n)

Формат ввода:  
Данные об этажности домов улицы передаются в виде строки с количеством этажей каждого из домов разделенных пробелами.
Например следующая улица описывается строкой "4 2 5"
      

Формат вывода:  
В качестве ответа нужно вывести рассчитанный план этажности домов улицы после реконструкции. План задается в виде массива чисел, разделенных пробелами. Например, следующая улица описывается строкой "4 4 5"



Пример 1:  
Ввод:  
4 2 5
  
Вывод:  
4 4 5



Пример 2:  
Ввод:  
5 2 3 1
  
Вывод:  
5 3 3 1
