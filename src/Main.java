import java.time.LocalDate;

public class Main
{
    public static void printLeapYearCheck(int year)
    {
        if (year % 4 == 0)
        {
            if ((year % 100 != 0) || (year % 400 == 0))
                System.out.println(year + " год является высокосным");
        }
        else
        {
            System.out.println(year + " год не является высокосным");
        }
    }

    public static class YourClass
    {
        public static void printOS(int clientOS, int clientDeviceYear)
        {
            int currentYear = LocalDate.now().getYear();

            if (clientDeviceYear > currentYear)
            {
                System.out.println("Указанный год еще не наступил. Пожалуйста, укажите корректный год.");
                return;
            }

            if (clientOS == 1 && clientDeviceYear == currentYear)
            {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else if (clientOS == 1)
            {
                System.out.println("Установите обычную версию приложения для Android по ссылке.");
            }

            if (clientOS == 0 && clientDeviceYear == currentYear)
            {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else if (clientOS == 0)
            {
                System.out.println("Установите обычную версию приложения для iOS по ссылке.");
            }
        }
    }




    public static void getDay(int deliveryDistance)
    {
    if (deliveryDistance <= 20)
    {
        System.out.println("Потребуется 1 день для доставки");
    }
    else if (deliveryDistance > 20 && deliveryDistance <= 60)
    {
        System.out.println("Потребуется 2 дня для доставки");
    }
    else if (deliveryDistance > 60 && deliveryDistance <= 100)
    {
        System.out.println("Потребуется 3 дня для доставки");
    }
    else if (deliveryDistance > 100)
    {
        System.out.println("доставки нет");
    }
}
    public static void main(String[] args)
    {
        int year = 1201;
        printLeapYearCheck(year);

        int clientDeviceYear = 155;
        int clientOS = 1;
        YourClass.printOS( clientOS,  clientDeviceYear);

        int deliveryDistance= 20;
        getDay(deliveryDistance);


    }
}

