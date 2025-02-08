public class Main {
    public static void main(String[] args) {

        //Задача 1
        int age = 25;
        if (age >= 18) {
            System.out.println("Ты совершеннолетний." + "\n");
        }
        if (age < 18) {
            System.out.println("Ты не достиг совершеннолетия, нужно немного подождать." + "\n");
        }

        //Задача 2
        int temperature = 9;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку." + "\n");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки." + "\n");
        }

        //Задача 3
        int speed = 110;
        if (speed <= 60) {
            System.out.println("Ваша скорость " + speed + " км/час, можно ездить спокойно." + "\n");
        }
        if (speed > 60) {
            System.out.println("Ваша скорость " + speed + " км/час, придется заплатить штраф." + "\n");
        }

        //Задача 4
        int years = 26;
        if (years >= 2 && years < 6) {
            System.out.println("Ваш возраст " + years + " года/лет, вам нужно ходить в детский сад." + "\n");
        }
        if (years >= 7 && years < 17) {
            System.out.println("Ваш возраст " + years + " лет, вам нужно ходить в школу." + "\n");
        }
        if (years >= 18 && years <= 24) {
            System.out.println("Ваш возраст " + years + " лет/год(а), вам нужно ходить в университет." + "\n");
        }
        if (years > 24) {
            System.out.println("Ваш возраст " + years + " лет/год(а), вам пора ходить на работу." + "\n");
        }

        //Задача 5
        int yourAge = 14;
        if (yourAge < 5) {
            System.out.println("Ваш возраст " + yourAge + " года/лет, вам нельзя кататься на аттракционе." + "\n");
        }
        if (yourAge >= 5 && yourAge < 14) {
            System.out.println("Ваш возраст " + yourAge + " лет/год(а), вам можно кататься на аттракционе в сопровождении взрослого." + "\n");
        }
        if (yourAge >= 14) {
            System.out.println("Ваш возраст " + yourAge + " лет/год(а), вам можно кататься на аттракционе без сопровождения взрослого." + "\n");
        }

        //Задача 6
        int carriageCapacity = 101, seatingCapacity = 65;
        if (seatingCapacity > 0 && seatingCapacity < 60) {
            System.out.println("В вагоне есть свободные сидячие места." + "\n");
        } else if (seatingCapacity >= 60 && carriageCapacity < 102) {
            System.out.println("В вагоне нет сидячих мест, но есть свободные стоячие места." + "\n");
        } else if (carriageCapacity >= 102) {
            System.out.println("В вагоне нет свободных мест." + "\n");
        }

        //Задача 7
        int One = 10, Two = 65, Fhree = 25;
        if (One > Two && One > Fhree) {
            System.out.println(One + " является наибольшим числом." + "\n");
        } else if (Two > One && Two > Fhree) {
            System.out.println(Two + " является наибольшим числом." + "\n");
        } else if (Fhree > One && Fhree > Two) {
            System.out.println(Fhree + " является наибольшим числом." + "\n");
        }
    }
}