package ru.skypro;

public class Main {

    public static void main(String[] args) {


        //Задача 1
        byte a = 127;
        short b = 1024;
        int c = 10_256;
        long d = 10_256_645L;
        float e = 10.249857f;
        double f = 151.51656566;
        boolean g = true;
        char h = 33;


        //Задача 2
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float totalWeight = firstBoxerWeight + secondBoxerWeight;
        float weightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Общий вес двух бойцов составляет " + totalWeight + " кг.");
        System.out.println("Разница между вторым и первым бойцом в весе составляет " + weightDifference + " кг.");


        //Задача 3
        int bananasWeight = 5 * 80;
        int milkWeight = 2 * 105;
        int eggsWeight = 4 * 70;
        float foodWeight = bananasWeight + milkWeight + eggsWeight;
        float totalFoodWeight = foodWeight / 1000;
        System.out.println("Общий вес завтрака составляет " + totalFoodWeight + " кг");


        //Задача 4
        int lightWeight = 250;
        int heavyWeight = 500;
        int daysOfLightDiet = 7000 / lightWeight;
        int daysOfHeavyDiet = 7000 / heavyWeight;
        int averageDaysOfDiet = (daysOfHeavyDiet + daysOfLightDiet) / 2;
        System.out.println("Если сбрасывать по 250 грамм в день, то на это уйдет " + daysOfLightDiet + " дней.\n" +
                "Eсли сбрасывать по 500 грамм в день, то уйдет " + daysOfHeavyDiet + " дней. \n" +
                "В среднем потребуется " + averageDaysOfDiet + " календарных дней.");


        //Задача 5
        int salaryMasha = (int) (67_760 * 1.1);
        int salaryDenis = (int) (83_690 * 1.1);
        int salaryKristina = (int) (76_230 * 1.1);

        int salaryMashaOfYear = 67_760 * 12;
        int salaryDenisOfYear = 83_690 * 12;
        int salaryKristinaOfYear = 76_230 * 12;

        int newSalaryMashaOfYear = salaryMasha * 12;
        int newSalaryDenisOfYear = salaryDenis * 12;
        int newSalaryKristinaOfYear = salaryKristina * 12;

        int averageSalaryMasha = newSalaryMashaOfYear % salaryMashaOfYear;
        int averageSalaryDenis = newSalaryDenisOfYear % salaryDenisOfYear;
        int averageSalaryKristina = newSalaryKristinaOfYear % salaryKristinaOfYear;

        System.out.println("Маша теперь получает " + salaryMasha + " рублей. Годовой доход вырос на " + averageSalaryMasha + " рублей \n" +
                "Денис теперь получает " + salaryDenis + " рублей. Годовой доход вырос на " + averageSalaryDenis + " рублей \n" +
                "Кристина теперь получает " + salaryKristina + " рублей. Годовой доход вырос на " + averageSalaryKristina + " рублей.");





    }
}
