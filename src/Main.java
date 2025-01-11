import java.time.LocalDate;

public class Main {
    public static void printTask(String number) {
        System.out.println("=========================");
        System.out.println("Task" + number);
    }

    public static String checkYear(int i) {
        if (i >= 1584 && (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))) {
            return i + " Год высокосный";
        } else {
            return i + " Год невысокосный";
        }
    }

    public static void checkDevice(int clientDeviceYear, int operatingSystem) {
        if (clientDeviceYear >= 2015 && operatingSystem == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && operatingSystem == 1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
        if (clientDeviceYear < 2015 && operatingSystem == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && operatingSystem == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static float calculateCardDeliverDays(float distance) {
        if (distance < 20 && distance > 0) {
            return 1;
        } else if (distance < 60) {
            return 2;
        } else if (distance < 100) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        printTask(" 1");
        int year = 2021;
        String yearForCheck = checkYear(year);
        System.out.println(yearForCheck);
        printTask(" 2");
        int year1 = 2025;
        int osName = 2;
        if (osName == 0 || osName == 1) {
            checkDevice(year1, osName);
        } else {
            System.out.println("Операционная система не поддерживается");
        }
        printTask(" 3");
        float deliveryDistance = 0.1f;
        if (deliveryDistance < 0) {
            throw new RuntimeException("Неправильно введены данные");
        }
        float days = calculateCardDeliverDays(deliveryDistance);
        if (days > 0) {
            System.out.println("Доставка займет " + days + "  дня");
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
}