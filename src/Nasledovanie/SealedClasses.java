package Nasledovanie;
/*
sealed запечатанные классы - разрешаем наследование перечислинным классам permits
наследники могут быть final,
sealed - что повторяет первое Dog лежит в томже пакете или в другом пакете
или non-sealed - что значит наследовать может кто угодно
у интерфейса можно сделать то же самое
 */
public abstract sealed class SealedClasses permits Cat,Dog, Parrot{
}

final class Cat extends SealedClasses {}
non-sealed class Parrot extends SealedClasses {}

