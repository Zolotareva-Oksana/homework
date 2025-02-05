public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!" + "\n");

        //Задача № 1
        // - Корректно использовали типы переменных ❌
        //- Объявили типы переменных ❌
        //- Вывели значения всех переменных в консоль ❌

        System.out.println("Задача № 1:");
        int pInt = 50000;
        byte pByte = 127;
        short pShort = -32768;
        long pLong = 3000000000L;
        float pFloat = 1.2f;
        double pDouble = 3.5;
        System.out.println("Значение переменной pInt с типом int равно " + pInt);
        System.out.println("Значение переменной pByte с типом byte равно " + pByte);
        System.out.println("Значение переменной pShort с типом short равно " + pShort);
        System.out.println("Значение переменной pLong с типом long равно " + pLong);
        System.out.println("Значение переменной pFloat с типом float равно " + pFloat);
        System.out.println("Значение переменной pDouble с типом double равно " + pDouble + "\n");

        //Задача № 2
        // - Корректно использовали типы переменных ❌
        //- В решении не использовали тип переменной var ✅
        //- Корректно инициализировали требуемые переменные ❌

        System.out.println("Задача № 2:");
        float a1 = 27.12f;
        long b1 = 987678965549L;
        float c1 = 2.786f;
        short d1 = 569;
        short e1 = -159;
        short f1 = 27897;
        byte g1 = 67;
        System.out.println("Значение переменной a1 с типом float равно " + a1);
        System.out.println("Значение переменной b1 с типом long равно " + b1);
        System.out.println("Значение переменной c1 с типом float равно " + c1);
        System.out.println("Значение переменной d1 с типом short равно " + d1);
        System.out.println("Значение переменной e1 с типом short равно " + e1);
        System.out.println("Значение переменной f1 с типом short равно " + f1);
        System.out.println("Значение переменной g1 с типом byte равно " + g1 + "\n");

        //Задача № 3
        //- Арифметические операции выполнены верно ❌
        //- В арифметических операциях использованы переменные ❌
        //- Корректно использовали типы переменных ❌
        //- В решении не использовали тип переменной var ✅
        //- Решение задания вывели в консоль ❌

        System.out.println("Задача № 3:");
        int students1Сlass = 23;
        int students2Сlass = 27;
        int students3Сlass = 30;
        int totalPapers = 480;
        int totalStudents = students1Сlass + students2Сlass + students3Сlass;
        int studentSheets = totalPapers / totalStudents;
        System.out.println("Всего в трех классах " + totalStudents + " учеников.");
        System.out.println("На каждого ученика рассчитано " + studentSheets + " листов бумаги." + "\n");

        //Задача № 4
        //- Арифметические операции выполнены верно ❌
        //- В арифметических операциях использованы переменные ❌
        //- Корректно использовали типы переменных ❌
        //- В решении не использовали тип переменной var ❌
        //- Решение задания вывели в консоль ❌
        //- Переменные именованы в стиле camelCase ❌

        //Нарушение camelCase в именах переменных
        //В задачах № 4, 5, 6, 7 лучше использовать подобные нейминги:
        //eff20, eff24, eff3, effM → bottlesPer20Min, bottlesPerDay, bottlesPer3Days, bottlesPerMonth

        System.out.println("Задача № 4:");
        int bottles = 16;
        int bottlesPer20Min = 20 / 2 * bottles;
        int bottlesPerDay = 60 / 2 * bottles * 24;
        int bottlesPer3Days = 3 * bottlesPerDay;
        int bottlesPerMonth = 10 * bottlesPer3Days;
        System.out.println("За 20 минут машина произвела " + bottlesPer20Min + " штук бутылок.");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + bottlesPerMonth + " штук бутылок." + "\n");

        //Задача № 5
        //- Арифметические операции выполнены верно ❌
        //- В арифметических операциях использованы переменные ❌
        //- Корректно использовали типы переменных ❌
        //- В решении не использовали тип переменной var ✅
        //- Решение задания вывели в консоль ❌
        //- Переменные именованы в стиле camelCase ❌

        //Нарушение camelCase в именах переменных
        //В задачах № 4, 5, 6, 7 лучше использовать подобные нейминги:
        //ttlCans, pntKl, ttlKl, pntWt, pntBr → totalCans, paintPerClass, totalClasses, whitePaint, brownPaint

        System.out.println("Задача № 5:");
        int totalCans = 120;
        int paintPerClass = 2 + 4;
        int totalClasses = totalCans / paintPerClass;
        int whitePaint = totalClasses * 2;
        int brownPaint = totalClasses * 4;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски." + "\n");

        //Задача № 6
        //- Подсчитан общий вес спортзавтрака ❌
        //- В арифметических операциях использованы переменные ❌
        //- Корректно использовали типы переменных ❌
        //- Переменные типа var не используются для решения задания ✅
        //- Решение задания вывели в консоль ❌

        //В задачах № 4, 5, 6, 7 лучше использовать подобные нейминги:
        //spBrg, spBrkg → totalBreakfastWeightGrams, totalBreakfastWeightKg

        System.out.println("Задача № 6:");
        int weightBanana = 80;
        int weightMilk = 105;
        int weightIcr = 100;
        int weightEgg = 70;
        int totalBreakfastWeightGrams = 5 * weightBanana + 2 * weightMilk + 2 * weightIcr + 4 * weightEgg;
        float totalBreakfastWeightKg = (float) totalBreakfastWeightGrams / 1000;
        System.out.println("Вес спортзавтрака составит " + totalBreakfastWeightGrams + " граммов или " + totalBreakfastWeightKg + " кг. соответственно." + "\n");

        //Задача № 7
        //- Арифметические операции выполнены верно ❌
        //- В арифметических операциях использованы переменные ❌
        //- Корректно использовали типы переменных ❌
        //- В решении не использовали тип переменной var ❌
        //- Решение задания вывели в консоль ❌
        //- Переменные именованы в стиле camelCase ❌

        //В задачах № 4, 5, 6, 7 лучше использовать подобные нейминги:
        //days1, days2, daysSr → daysFor250g, daysFor500g, averageDays

        System.out.println("Задача № 7:");
        int weight = 7;
        int decline1 = 250;
        int decline2 = 500;
        int daysFor250g = weight * 1000 / decline1;
        int daysFor500g = weight * 1000 / decline2;
        int averageDays = (daysFor250g + daysFor500g) / 2;
        System.out.println(daysFor250g + " дней уйдет на сброс веса по " + decline1 + " грамм в день.");
        System.out.println(daysFor500g + " дней уйдет на сброс веса по " + decline2 + " грамм в день.");
        System.out.println("В среднем потребуется " + averageDays + " день, чтобы сбросить " + weight + " кг." + "\n");

        //Задача № 8
        //- Посчитана разница между годовым доходом с нынешней зарплатой и после повышения ❌
        //- В арифметических операциях использованы переменные ❌
        //- Корректно использовали типы переменных ❌
        //- Переменные типа var не используются для решения задания ❌
        //- Решение задания вывели в консоль ❌

        System.out.println("Задача № 8:");
        float height = 1.10f;
        int wagesMaria = 67660;
        float wagesMaria10 = wagesMaria * height;
        int wagesDenis = 83690;
        float wagesDenis10 = wagesDenis * height;
        int wagesKristina = 76230;
        float wagesKristina10 = wagesKristina * height;
        float incomeMaria = (wagesMaria10 - wagesMaria) * 12f;
        float incomeDenis = (wagesDenis10 - wagesDenis) * 12f;
        float incomeKristina = (wagesKristina10 - wagesKristina) * 12f;
        System.out.println("Мария теперь получает " + wagesMaria10 + " рублей в месяц. Годовой доход вырос на " + incomeMaria + " рублей.");
        System.out.println("Денис теперь получает " + wagesDenis10 + " рублей в месяц. Годовой доход вырос на " + incomeDenis + " рублей.");
        System.out.println("Кристина теперь получает " + wagesKristina10 + " рублей в месяц. Годовой доход вырос на " + incomeKristina + " рублей." + "\n");

    }
}