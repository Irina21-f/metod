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

    public static void checkPhone(int year) {
        if (year == LocalDate.now().getYear()) {
            System.out.print("Установите обычную версию приложения для  ");
        } else {
            System.out.print("Установите облегченную версию приложения для ");
        }
    }

    public static void checkPhoneOS(int nameOS) {
        if (nameOS == 0) {
            System.out.println("iOs");
        } else {
            System.out.println("Android");

        }
    }

    public static void checkDistance(float km) {
        if (km > 100 || km < 0) {
            System.out.println("Доставка не осуществляется");
        } else {
            if (km >= 60) {
                System.out.println("Доставка займет 3 суток");
            } else if (km >= 20) {
                System.out.println("Доставка займет 2 суток");
            } else {
                System.out.println("Доставка займет сутки");
            }
        }
    }
    public static void main(String[]args) {
        printTask(" 1");
        int year = 2021;
        String yearForCheck = checkYear(year);
        System.out.println(yearForCheck);
        printTask(" 2");
        int year1 = 2025;
        int osName = 2;
        if (osName == 0 || osName == 1) {
            checkPhone(year1);
            checkPhoneOS(osName);
        } else {
            System.out.println("Операционная система не поддерживается");
        }
        printTask(" 3");
        float wayForDelivery = 20.1f;
        checkDistance(wayForDelivery);
    }
}
