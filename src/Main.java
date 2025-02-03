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
        short pShort = (short) -32768;
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
        var b1 = "987 678 965 549";
        var c1 = "2,786";
        short d1 = 569;
        short e1 = -159;
        short f1 = 27897;
        byte g1 = 67;
        System.out.println("Значение переменной a1 с типом float равно " + a1);
        System.out.println("Значение переменной b1 с типом var равно " + b1);
        System.out.println("Значение переменной c1 с типом var равно " + c1);
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
        int st1 = 23;
        int st2 = 27;
        int st3 = 30;
        int ttlPpr = 480;
        int ttlSt = st1 + st2 + st3;
        int stPpr = ttlPpr / ttlSt;
        System.out.println("Всего в трех классах " + ttlSt + " учеников.");
        System.out.println("На каждого ученика рассчитано " + stPpr + " листов бумаги." + "\n");

        //Задача № 4
        //- Арифметические операции выполнены верно ❌
        //- В арифметических операциях использованы переменные ❌
        //- Корректно использовали типы переменных ❌
        //- В решении не использовали тип переменной var ❌
        //- Решение задания вывели в консоль ❌
        //- Переменные именованы в стиле camelCase ❌

        System.out.println("Задача № 4:");
        int bottles = 16;
        int eff20 = 20 / 2 * bottles;
        int eff24 = 60 / 2 * bottles * 24;
        int eff3 = 3 * eff24;
        int effM = 10 * eff3;
        System.out.println("За 20 минут машина произвела " + eff20 + " штук бутылок.");
        System.out.println("За сутки машина произвела " + eff24 + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + eff3 + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + effM + " штук бутылок." + "\n");

        //Задача № 5
        //- Арифметические операции выполнены верно ❌
        //- В арифметических операциях использованы переменные ❌
        //- Корректно использовали типы переменных ❌
        //- В решении не использовали тип переменной var ✅
        //- Решение задания вывели в консоль ❌
        //- Переменные именованы в стиле camelCase ❌

        System.out.println("Задача № 5:");
        int ttlCans = 120;
        int pntKl = 2 + 4;
        int ttlKl = ttlCans / pntKl;
        int pntWt = ttlKl * 2;
        int pntBr = ttlKl * 4;
        System.out.println("В школе, где " + ttlKl + " классов, нужно " + pntWt + " банок белой краски и " + pntBr + " банок коричневой краски." + "\n");

        //Задача № 6
        //- Подсчитан общий вес спортзавтрака ❌
        //- В арифметических операциях использованы переменные ❌
        //- Корректно использовали типы переменных ❌
        //- Переменные типа var не используются для решения задания ✅
        //- Решение задания вывели в консоль ❌

        System.out.println("Задача № 6:");
        int wBanana = 80;
        int wMilk = 105;
        int wIcr = 100;
        int wEgg = 70;
        int spBrg = 5 * wBanana + 2 * wMilk + 2 * wIcr + 4 * wEgg;
        float spBrkg = (float) spBrg / 1000;
        System.out.println("Вес спортзавтрака составит " + spBrg + " граммов или " + spBrkg + " кг. соответственно." + "\n");

        //Задача № 7
        //- Арифметические операции выполнены верно ❌
        //- В арифметических операциях использованы переменные ❌
        //- Корректно использовали типы переменных ❌
        //- В решении не использовали тип переменной var ❌
        //- Решение задания вывели в консоль ❌
        //- Переменные именованы в стиле camelCase ❌

        System.out.println("Задача № 7:");
        int weight = 7;
        int decline1 = 250;
        int decline2 = 500;
        int days1 = weight * 1000 / decline1;
        int days2 = weight * 1000 / decline2;
        int daysSr = (days1 + days2) / 2;
        System.out.println(days1 + " дней уйдет на сброс веса по " + decline1 + " грамм в день.");
        System.out.println(days2 + " дней уйдет на сброс веса по " + decline2 + " грамм в день.");
        System.out.println("В среднем потребуется " + daysSr + " день, чтобы сбросить " + weight + " кг." + "\n");

        //Задача № 8
        //- Посчитана разница между годовым доходом с нынешней зарплатой и после повышения ❌
        //- В арифметических операциях использованы переменные ❌
        //- Корректно использовали типы переменных ❌
        //- Переменные типа var не используются для решения задания ❌
        //- Решение задания вывели в консоль ❌

        System.out.println("Задача № 8:");
        float height = 1.10f;
        int zMaria = 67660;
        float zMaria10 = zMaria * height;
        int zDenis = 83690;
        float zDenis10 = zDenis * height;
        int zKristina = 76230;
        float zKristina10 = zKristina * height;
        float dMaria = (zMaria10 - zMaria) * 12f;
        float dDenis = (zDenis10 - zDenis) * 12f;
        float dKristina = (zKristina10 - zKristina) * 12f;
        System.out.println("Мария теперь получает " + zMaria10 + " рублей в месяц. Годовой доход вырос на " + dMaria + " рублей.");
        System.out.println("Денис теперь получает " + zDenis10 + " рублей в месяц. Годовой доход вырос на " + dDenis + " рублей.");
        System.out.println("Кристина теперь получает " + zKristina10 + " рублей в месяц. Годовой доход вырос на " + dKristina + " рублей." + "\n");

    }
}