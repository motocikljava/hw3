public class Main {
    public static void main(String[] args) {
        // задача 1
        int camelInt = 10000000;
        System.out.println("Значение переменной camelInt с типом int равно " + camelInt);
        byte camelByte = 35;
        System.out.println("Значение переменной camelByte с типом byte равно " + camelByte);
        short camelShort = 30000;
        System.out.println("Значение переменной camelShort с типом short равно " + camelShort);
        long camelLong = 100000000000L;
        System.out.println("Значение переменной camelLong с типом long равно " + camelLong);
        float camelFloat = 3.5767f;
        System.out.println("Значение переменной camelFloat с типом float равно " + camelFloat);
        double camelDouble = 3.54565;
        System.out.println("Значение переменной camelDouble с типом double равно " + camelDouble);
        // задача 2
        float drob_1 = 27.12f;
        long chislo = 987_678_965_549L;
        double drob_2 = 2.786;
        boolean neTrue = false;
        short chislo_1 = 569;
        short chislo_2 = -159;
        int chislo_3 = 27897;
        byte chislo_4 = 67;
        // задача 3
        var luPa = 23;
        var anSe = 27;
        var ekAn = 30;
        var summaUchenikov = luPa + anSe + ekAn;
        var listochkov = 480 / summaUchenikov;
        System.out.println("На каждого ученика рассчитано " + listochkov + " листов бумаги");
        // задача 4
        var bottleMin = 16 / 2;
        var bottle20 = bottleMin * 20;
        System.out.println("За 20 минут машина произвела бутылок " + bottle20 + " штук");
        var hour = 24;
        var min = 60;
        var bottleDay = hour * min * bottleMin;
        System.out.println("За 1 день машина произвела бутылок " + bottleDay + " штук");
        var bottle_3_Day = bottleDay * 3;
        System.out.println("За 3 дyz машина произвела бутылок " + bottle_3_Day + " штук");
        var bottle_30_Day = bottleDay * 30;
        System.out.println("За 1 месяц машина произвела бутылок " + bottle_30_Day + " штук");
        var februa = bottleDay * 28;
        System.out.println("За 1 месяц машина произвела бутылок " + februa + " штук");
        var bottle_31_Day = bottleDay * 31;
        System.out.println("За 1 месяц машина произвела бутылок " + bottle_31_Day + " штук");
        var bottleVesokos = bottleDay * 29;
        System.out.println("За 1 месяц машина произвела бутылок " + bottleVesokos + " штук");
        // задача 5
        var banka = 120;
        var white = 2;
        var brown = 4;
        var bankaKlass = white + brown;
        var klass = banka / bankaKlass;
        var allWhite = klass * white;
        var allBrown = klass * brown;
        System.out.println("В школе, где " + klass + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");
        // задача 6
        var bananas = 80.0;
        var allBananas = 5.0 * bananas;
        var milk = 105.0;
        var allMilk = 2 * milk;
        var iceCream = 100.0;
        var allIceCream = iceCream * 2;
        var egg = 70.0;
        var ollEgg = egg * 4;
        var yamyYamy = allBananas + allMilk + allIceCream + ollEgg;
        System.out.println("вес завтрака в граммах = " + yamyYamy);
        var yamyYamyKg = yamyYamy / 1000.0;
        System.out.println("вес завтрака в килограммах = " + yamyYamyKg);
        // задача 7
        var pohudei = 7;
        var horoshoPoshlo = 0.5;
        var pohudel = pohudei / horoshoPoshlo;
        System.out.println("спортсмен похудел за " + pohudel + " дней");
        var plohoPoshlo = 0.25;
        var pohudel2 = pohudei / 0.25;
        System.out.println("спортсмен похудел за " + pohudel2 + " дней");
        var srednyi = (horoshoPoshlo + plohoPoshlo) / 2.0;
        var pohudel3 = pohudei / srednyi;
        String result = String.format("%.1f", pohudel3);
        System.out.println("спортсмен похудел за " + result + " дней");
        // зачада 8
        var coefUvelZp = 1.1;
        var masha = 67760;
        var denis = 83690;
        var kristina = 76230;
        var newZpMa = masha * coefUvelZp;
        var newZpDe = denis * coefUvelZp;
        var newZpKr = kristina * coefUvelZp;
        var raznicaZpMa = newZpMa - masha;
        var raznicaZpDe = newZpDe - denis;
        var raznicaZpKr = newZpKr - kristina;
        System.out.println("Теперь Маша получает " + newZpMa + " рублей. Годовой доход вырос на " + raznicaZpMa + " рублей");
        System.out.println("Теперь Денис получает " + newZpDe + " рублей. Годовой доход вырос на " + raznicaZpDe + " рублей");
        System.out.println("Теперь Кристина получает " + newZpKr + " рублей. Годовой доход вырос на " + raznicaZpKr + " рублей");
        // вариант со сложением
        var masha2 = 67760;
        var denis2 = 83690;
        var kristina2 = 76230;
        var plusMasha = masha2 * 0.1;
        var plusDenis = denis2 * 0.1;
        var plusKristina = kristina2 * 0.1;
        var newZpMa2 = masha2 + plusMasha;
        var newZpDe2 = denis2 + plusDenis;
        var newZpKr2 = kristina2 + plusKristina;
        var raznicaZpMa2 = newZpMa2 - masha;
        var raznicaZpDe2 = newZpDe2 - denis;
        var raznicaZpKr2 = newZpKr2 - kristina;
        System.out.println("Теперь Маша получает " + newZpMa2 + " рублей. Годовой доход вырос на " + raznicaZpMa2 + " рублей");
        System.out.println("Теперь Денис получает " + newZpDe2 + " рублей. Годовой доход вырос на " + raznicaZpDe2 + " рублей");
        System.out.println("Теперь Кристина получает " + newZpKr2 + " рублей. Годовой доход вырос на " + raznicaZpKr2 + " рублей");

        System.out.println("не получается убрать погрешность Дениса, подскажите как это сделать");


    }
}