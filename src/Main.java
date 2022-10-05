public class Main {
    public static void main(String[] args) {
        int salary = 15000;
        int total = 0;
        int i = 1;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i++ + " сумма накоплений равна " + total + " рублей");
        }

        int w = 1;
        while (w <= 10) {
            System.out.print(w++ + " ");
        }
        System.out.println();
        for (int a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
        int populationY = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int difference = birthRate - mortalityRate;
        for (int s = 1; s <= 10; s++) {
            populationY = populationY + difference;
            populationY = populationY + difference / 1000;
            System.out.println("Год " + s + " численность населения составляет " + populationY);
        }
        int Vasyasalary = 15000;
        int total1 = 0;
        for (int k = 0; total1 <= 12_000_000; k++) {
            total1 = total1 + total1 * 7 / 100;
            total1 = total1 + Vasyasalary;
            System.out.println("Месяц " + k + " сумма накоплений равна " + total1 + " рублей");
        }
        int Vasyasalary1 = 15000;
        int total2 = 0;
        for (int k = 0; total2 <= 12_000_000; k++) {
            total2 = total2 + total2 * 7 / 100;
            total2 = total2 + Vasyasalary1;
            if (k % 6 == 0) {
                System.out.println("Месяц " + k + " сумма накоплений равна " + total2 + " рублей");
            }
            int Vasyasalary2 = 15000;
            int total3 = 6;
            for (int e = 6; e <= 108; e++) {
                total3 = total3 + total3 * 7 / 100;
                total3 = total3 + Vasyasalary2;
                if (e % 6 == 0) {
                    System.out.println("Месяц " + e + " сумма накоплений равна " + total3 + " рублей");
                }


                for (int firstFriday = 5; firstFriday < 31; firstFriday++) {
                    if (firstFriday % 7 == 0)
                        System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
                }


                for (int year = 1822; year < 2122; year++) {
                    if (year % 79 == 0)
                        System.out.println(year);
                }

                for (int h = 1; h <= 10; h++) {
                    System.out.println(h * 2 + " ");
                }
            }
        }
    }
            }