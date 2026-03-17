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
            System.out.println("Значение переменной nurses с типом short равно " + nurses);
            System.out.println("Значение переменной injections с типом long равно " + injections);
            System.out.println("Значение переменной workLoadNurses с типом float равно " + workLoadNurses);
            System.out.println("Значение переменной sizeBacteria с типом double равно " + sizeBacteria);
//Комментарий к заданию №1. Тест можно написать минимум двумя вариантами как в строках №1 и №2. Я считаю , что более читабильно было как в строке №1 (весь текст удобнее читается)
// Задание №2
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short i = -159;
        short f = 27897;
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
        short bottleOneMinute = (short) (bottleTwoMinutes / twoMinutes);
        short bottleTwentyMinute = (short) (bottleOneMinute * 20);
        short minetesOneDay = 24 * 60;
        short bottleDay = (short) (bottleOneMinute * minetesOneDay);
        short bittleThreeDay = (short) (bottleOneMinute * minetesOneDay * 3);
        short bittleOneMonth = (short) (bottleOneMinute * minetesOneDay * 30);
            System.out.println("За 20 минут машина произела " + bottleTwentyMinute + " штук бутылок");
            System.out.println("За один день машина произела " + bottleDay + " штук бутылок");
            System.out.println("За три дня машина произела " + bittleThreeDay + " штук бутылок");
            System.out.println("За месяц машина произела " + bittleOneMonth + " штук бутылок");
// Задание №5
        byte jarBye =120;
        byte oneClassWhiteJar = 2;
        byte oneClassBrownJar = 4;
        short totalClass = (short) (jarBye / (oneClassWhiteJar + oneClassBrownJar));
        short owerWhiteJar = (short) (totalClass * oneClassWhiteJar);
        short owerBrownJar = (short) (totalClass * oneClassBrownJar);
            System.out.println("В школе, где " + totalClass + " классов, нужно " + owerWhiteJar + " банок белой краски и " + owerBrownJar + " банок коричневой краски");
// Задание №6
        int weightGr = getWeightGr();
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
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        byte monthYear = 12;
        double coefficient = 0.1;

        double salaryMashaNew = salaryMasha + (salaryMasha * coefficient);
        double salaryDenisNew = salaryDenis + (salaryDenis * coefficient);
        double salaryKristinaNew = salaryKristina + (salaryKristina * coefficient);
        double salaryMashaDifferenceYear = (salaryMashaNew * monthYear) - (salaryMasha * monthYear);
        double salaryDenisDifferenceYear = (salaryDenisNew * monthYear) - (salaryDenis * monthYear);
        double salaryKristinaDifferenceYear = (salaryKristinaNew * monthYear) - (salaryKristina * monthYear);
            System.out.println("Маша будет получать " + salaryMashaNew + " рублей. Годовая разница в ЗП составляет " + salaryMashaDifferenceYear);
            System.out.println("Денис будет получать " + salaryDenisNew + " рублей. Годовая разница в ЗП составляет " + salaryDenisDifferenceYear);
            System.out.println("Кристина будет получать " +  salaryKristinaNew + " рублей. Годовая разница в ЗП составляет " + salaryKristinaDifferenceYear);
    }

    private static int getWeightGr() {
        byte bananas = 5;
        byte weightBanana = 105;
        short milk = 200;
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
        return weightGr;
    }
}