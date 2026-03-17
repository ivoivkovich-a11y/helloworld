//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Задание №1
        int syringes = 1303445433;
        byte treatmentDepartment = 85;
        short nurses = 30234;
        long injections = 7344344678845435432L;
        float workLoadNurses = 32.3f;
        double sizeBacteria = 23.2333233456;
            System.out.println("Значение переменной syringes с типом int равно " + syringes); //Строка №1
            System.out.println("Значение переменной " + "treatmentDepartment" + " с типом" + " byte" + " равно " + treatmentDepartment); //Строка №2
            System.out.println("Значение переменной syringes с типом short равно " + nurses);
            System.out.println("Значение переменной syringes с типом long равно " + injections);
            System.out.println("Значение переменной syringes с типом float равно " + workLoadNurses);
            System.out.println("Значение переменной syringes с типом double равно " + sizeBacteria);
//Комментарий к заданию №1. Тест можно написать минимум двумя вариантами как в строках №1 и №2. Я считаю , что более читабильно было как в строке №1 (весь текст удобнее читается)
// Задание №2
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        int d = 569;
        int i = -159;
        int f = 27897;
        byte g = 67;
// Задание №3
        byte studentLudmilaPavlovna = 23;
        byte studentAnnaSergeevna = 27;
        byte studentEkaterinaAndreevna = 30;
        int totalPaper = 480;
        int paperStudent = totalPaper / (studentLudmilaPavlovna + studentAnnaSergeevna + studentEkaterinaAndreevna);
            System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги");
// Задание №4
        byte bottleTwoMinutes = 16;
        byte twoMinutes = 2;
        int bottleOneMinute = (bottleTwoMinutes / twoMinutes);
        int bottleTwentyMinute = bottleOneMinute * 20;
        int minetesOneDay = 1 * 24 * 60;
        int bottleDay = bottleOneMinute * minetesOneDay;
        int bittleThreeDay = bottleOneMinute * minetesOneDay * 3;
        int bittleOneMonth = bottleOneMinute * minetesOneDay * 30;
            System.out.println("За 20 минут машина произела " + bottleTwentyMinute + " штук бутылок");
            System.out.println("За один день машина произела " + bottleDay + " штук бутылок");
            System.out.println("За три дня машина произела " + bittleThreeDay + " штук бутылок");
            System.out.println("За месяц машина произела " + bittleOneMonth + " штук бутылок");
// Задание №5
        byte jarBye =120;
        byte oneClassWhiteJar = 2;
        byte oneClassBrownJar = 4;
        int totalClass = jarBye / (oneClassWhiteJar + oneClassBrownJar);
        int owerWhiteJar = totalClass * oneClassWhiteJar;
        int owerBrownJar = totalClass * oneClassBrownJar;
            System.out.println("В школе, где " + totalClass + " классов, нужно " + owerWhiteJar + " банок белой краски и " + owerBrownJar + " банок коричневой краски");
// Задание №6
        byte bananas = 5;
        byte weightBanana = 105;
        int milk = 200;
        byte weightMilkInOneHundred = 105;
        byte iceCream = 2;
        byte weightIceCream = 100;
        byte egg = 4;
        byte weightEgg = 70;
        int weightBananas = bananas * weightBanana;
        int weightMilks = milk / 100 * weightMilkInOneHundred;
        int weightIceCreams = iceCream * weightIceCream;
        int weightEggs = egg * weightEgg;
        int weightGr = weightBananas + weightMilks + weightIceCreams + weightEggs;
        double weightKg = weightGr / 1000.0;
            System.out.println(weightGr);
            System.out.println(weightKg);
// Задание №7
        byte totalWeightKg = 7;
        int minLossWeightGr = 250;
        int maxLossWeightGr = 500;
        int totalWeightGr = totalWeightKg * 1000;
        int maxLossDay = totalWeightGr / minLossWeightGr;
        int minLossDay = totalWeightGr / maxLossWeightGr;
            System.out.println(totalWeightGr);
            System.out.println(maxLossDay);
            System.out.println(minLossDay);
// Задание №8
        int salaryMonthMasha = 67760;
        int salaryMonthDenis = 83690;
        int salaryMonthKristina = 76230;
        byte monthYear = 12;
        double coefficient = 0.1;

        int monthYearSalaryMonthMasha = monthYear * salaryMonthMasha; // Зп Маши за 12 сесяцев
        int monthYearSalaryMonthDenis = monthYear * salaryMonthDenis; // Зп Дениса за 12 месяцев
        int monthYearSalaryMonthKristina = monthYear * salaryMonthKristina; //За Кристины за 12 месяцев
        double salaryMonthMashaNew = salaryMonthMasha + (salaryMonthMasha * coefficient); // Зп Маши с 10%
        double salaryMonthDenisNew = salaryMonthDenis + (salaryMonthDenis * coefficient); // Зп Дениса с 10%
        double salaryMonthKristinaNew = salaryMonthKristina + (salaryMonthKristina * coefficient); // Зп Кристины с 10%
        double salaryMonthMashaNewYear = (salaryMonthMashaNew * monthYear) - (salaryMonthMasha * monthYear); //"Разница годовая Маши "
        double salaryMonthDenisNewYear = (salaryMonthDenisNew * monthYear) - (salaryMonthDenis * monthYear); //"Разница годовая Дениса "
        double salaryMonthKristinaNewYear = (salaryMonthKristinaNew * monthYear) - (salaryMonthKristina * monthYear); //"Разница годовая Кристины "
            System.out.println("Маша будет получать " + salaryMonthMashaNew + " рублей. Годовая разница в ЗП составляет " + salaryMonthMashaNewYear);
            System.out.println("Денис будет получать " + salaryMonthDenisNew + " рублей. Годовая разница в ЗП составляет " + salaryMonthDenisNewYear);
            System.out.println("Кристина будет получать " +  salaryMonthKristinaNew + " рублей. Годовая разница в ЗП составляет " + salaryMonthKristinaNewYear);
    }
}