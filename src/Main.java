public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("#1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //2
        System.out.println("#2");
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //3
        System.out.println("#3");
        int year = 2021;
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //4
        System.out.println("#4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.printf("Доставки нет");
        }

        //5
        System.out.println("#5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Месяц " + monthNumber + " это зима");
                break;
            case 2:
                System.out.println("Месяц " + monthNumber + " это зима");
                break;
            case 3:
                System.out.println("Месяц " + monthNumber + " это весна");
                break;
            case 4:
                System.out.println("Месяц " + monthNumber + " это весна");
                break;
            case 5:
                System.out.println("Месяц " + monthNumber + " это весна");
                break;
            case 6:
                System.out.println("Месяц " + monthNumber + " это лето");
                break;
            case 7:
                System.out.println("Месяц " + monthNumber + " это лето");
                break;
            case 8:
                System.out.println("Месяц " + monthNumber + " это лето");
                break;
            case 9:
                System.out.println("Месяц " + monthNumber + " это осень");
                break;
            case 10:
                System.out.println("Месяц " + monthNumber + " это осень");
                break;
            case 11:
                System.out.println("Месяц " + monthNumber + " это осень");
                break;
            case 12:
                System.out.println("Месяц " + monthNumber + " это зима");
                break;
            default:
                System.out.println("Нет такого месяца.");
                break;
        }
    }
}