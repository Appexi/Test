import java.math.BigDecimal; //подключаем библиотеки
import java.util.Scanner;

public class Calculator // создаём общедоступный класс
{

    public static void main(String[] args) 
    {
        BigDecimal x; // объявляем переменные
        BigDecimal y;
        String whatOp; //создаём строку для хранения символа математической операции


        Scanner input = new Scanner(System.in); // запускаем сканнер для ввода чисел в BigDecimal

        System.out.println("Введите первое число А (дробь через запятую! пример 1,2)");
        x = input.nextBigDecimal(); 

        System.out.println("Введите второе число Б");
        y = input.nextBigDecimal(); 

        Scanner op = new Scanner(System.in); // запускаем сканнер для ввода символа математической операции

        System.out.println("Введите математическую операцию");
        whatOp = op.next();

        if (whatOp.equals("+")) //ищем нужный символ математической операции
        {
            System.out.println(  " А + Б =" + ( x.add(y) )  ); //производим вычисление и выводим ответ
        }
        else if  (whatOp.equals("-"))
        {
            System.out.println(  "А - Б = " + ( x.subtract(y) )  );
        }
        else if (whatOp.equals("*"))
        {
            System.out.println(  "А * Б = " + ( x.multiply(y) )  );
        }
        else if (whatOp.equals("/"))
        {
            System.out.println( "А / Б = "  + ( x.divide(y) )  );
        }
        else
        {
           System.out.println("Ошибка ввода"); //если введено чтото другое
        }
    }
}