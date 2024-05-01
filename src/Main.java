import java.time.LocalDate;

public class Main {
    public static void printIssues(int issuesYear)
    {
        System.out.println(issuesYear + " год является высокосным");
    }

    public static void printIssues2(int issuesYear2)
    {
        System.out.println(issuesYear2 + " год не является высокосным");
    }

public static void printOS(int clientOS,int clientDeviceYear)
{
    if (clientOS == 1 && clientDeviceYear == 1)
    {
        System.out.println("Установите облегченную версию приложения для Android по ссылке».");
    }
     else if (clientOS == 1)
    {
        System.out.println("Установите обычную версию приложения для Android по ссылке");
    }

        if(clientOS == 0 && clientDeviceYear == 0)
        {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if(clientOS == 0)
        {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }
    }
public static void getDay(int deliveryDistance){
    if (deliveryDistance <= 20) {
        System.out.println("потребуетс 1 день");
    }
    if (deliveryDistance > 20 && deliveryDistance <= 60) {
        System.out.println("потребуется 2 дня");
    }
    if (deliveryDistance > 60 && deliveryDistance <= 100) {
        System.out.println("потребуется 3 дня");
    }
    if (deliveryDistance > 100) {
        System.out.println("доставки нет");
    }
}
    public static void main(String[] args) {
        int year = 100;
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0))

                printIssues(year);
            else {
                printIssues2(year);
            }
        }
        int clientDeviceYear = 1;
        int clientOS = 1;
        printOS(clientOS, clientDeviceYear);

        int deliveryDistance= 101;
        getDay(deliveryDistance);


    }
}

