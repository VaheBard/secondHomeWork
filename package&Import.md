# Пакет и импорт

Вполном наименовании java.util.Scanner, java.util - имя пакета, а Scanner - имя типа.  

Пакет(package) в джаве позволяет разделить типы/классы между библиотеками.  

Чтобы обратиться к классу в другом классе, нужно ввести его полное имя, а именно указать пакет в котором он  
находится в конце только указав ег оимя : ru.netology.lesson2.Test.

Для того чтобы каждый раз не написать такое длинное объявление например java.util.Scanner, был разработан  
оператор import.  

Для всех типов, не входящих в библиотеку java.lang, нужно писать полное имя использовать import: 

> import ru.netology.lesson2;  
> import java.util.Scanner;
> class Test {  
> public static void main(String [] args) {  
> Scanner scanner = new Scanner(System.in);  
> ...  
> }  

