public class Main {

    public static void main(String[] args) {

        // Задача №1:
        int num = 2371;
        System.out.println("Задача №1\nЗначение переменной num с типом int равно " + num + ";");
        byte x = 7;
        System.out.println("Значение переменной x с типом byte равно " + x + ";");
        short y = 354;
        System.out.println("Значение переменной y с типом short равно " + y + ";");
        long z = -374533509793535356L;
        System.out.println("Значение переменной z с типом long равно " + z + ";");
        float f = 34.1234f;
        System.out.println("Значение переменной f с типом float равно " + f + ";");
        double d = -154.2675447686745564;
        System.out.println("Значение переменной d с типом byte равно " + d + ";");

        // Задача №2:
        float f1 = 27.12f;
        long z1 = 987678965549L;
        float f2 = 2.786f;
        boolean m;
        short y1 = 569;
        short y2 = -159;
        int num1 = 27898;
        short y3 = 67;

        // Задача №3:
        short as = 27;
        short lp = 23;
        short ea = 30;
        int ttlPaper = 480;
        int perStudent = ttlPaper / (as + lp + ea);
        System.out.println("\nЗадача №3\nНа каждого ученика рассчитано " + perStudent + " листов бумаги.");

        // Задача №4
        int bottlesMin = 16 / 2;

        int bottles20Min = bottlesMin * 20;
        System.out.println("\nЗадача №4\nЗа 20 минут машина произвела бутылок " + bottles20Min + " штук.");
        int bottlesDay = bottlesMin * 60 * 24;
        System.out.println("За сутки машина произвела бутылок " + bottlesDay + " штук.");
        int bottles3Days = bottlesDay * 3;
        System.out.println("За 3 дня машина произвела бутылок " + bottles3Days + " штук.");
        int bottlesMonth = bottlesDay * 30;
        System.out.println("За 1 месяц машина произвела бутылок " + bottlesMonth + " штук.");

        // Задача №5
        int ttlCans = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;
        int classes = ttlCans / (whitePerClass + brownPerClass);
        int white = classes * whitePerClass;
        int brown = classes * brownPerClass;
        System.out.println("\nЗадача №5\nВ школе, где " + classes + " классов, нужно " + white +
                " банок белой краски и " + brown + " банок коричневой краски.");

        // Задача №6
        float bananas = 5 * 80;
        float milk = 200 / 100 * 105;
        float icecream = 2 * 100;
        float eggs = 4 * 70;
        float summ = bananas + milk + icecream + eggs;
        float summKg = summ / 1000;
        System.out.println("\nЗадача №6\nОбщий вес в граммах = " + summ + ". Общий вес в кг = " +
                summKg + ".");

        // Задача №7
        int ttlWeight = 7 * 1000;
        int days250gr = ttlWeight / 250;
        int days500gr = ttlWeight / 500;
        int daysAverage = ttlWeight / ((250 + 500)/2);
        System.out.println("\nЗадача №7\nВсего дней при потере 250 грамм в день = " + days250gr +
                ". Всего дней при потере 500 грамм в день = " +
                days500gr + ". Всего дней при средней потере веса = " + daysAverage + ".");

        // Задача №8
        int masha = 67760;
        int mashaNew = (int) (masha + (masha * 0.10));
        int mashaYearUp = (mashaNew * 12) - (masha * 12);
        System.out.println("\nЗадача №8\nМаша теперь получает " + mashaNew +
                " рублей. Годовой доход вырос на " + mashaYearUp + " рублей");
        int denis = 83690;
        int denisNew = (int) (denis + (denis * 0.10));
        int denisYearUp = (denisNew * 12) - (denis * 12);
        System.out.println("Денис теперь получает " + denisNew +
                " рублей. Годовой доход вырос на " + denisYearUp + " рублей");
        int kristina = 76230;
        int kristinaNew = (int) (kristina + (kristina * 0.10));
        int kristinaYearUp = (kristinaNew * 12) - (kristina * 12);
        System.out.println("Кристина теперь получает " + kristinaNew +
                " рублей. Годовой доход вырос на " + kristinaYearUp + " рублей");


    }
}