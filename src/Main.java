//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // Задача номер 1
        System.out.println("задача номер 1");
        byte apple = 126;
        short deposit = 32766;
        int salary = 2_147_483_646;
        long number = 9_223_32_036_854_775_806L;
        float pi = 3.14f;
        double strike = 0.1234654321;
        System.out.println("Значение переменной apple с типом byte равно " + apple);
        System.out.println("Значение переменной deposit с типом short равно " + deposit);
        System.out.println("Значение переменной salary с типом int равно " + salary);
        System.out.println("Значение переменной namber с типом long равно " + number);
        System.out.println("Значение переменной pi с типом float равно " + pi);
        System.out.println("Значение переменной strike с типом double равно " + strike);


        // Задача номер 2
        System.out.println("задача номер 2");
        float numberOne =27.12f;
        long numberTwo = 987_678_965_549L;
        float numberThree = 2.786f;
        short numberFour = 569;
        short numberFive = -159;
        short numberSix = 27897;
        byte numberSeven = 67;
        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(numberThree);
        System.out.println(numberFour);
        System.out.println(numberFive);
        System.out.println(numberSix);
        System.out.println(numberSeven);


        //задача номер 3
        System.out.println("задача номер 3");
        byte lyda = 23;
        byte anna = 27;
        byte katy = 30;
        short paper = 480;
        byte schoolStudents = (byte) (lyda + anna + katy);
        short paperOneStudent = (short) (paper / schoolStudents);
        System.out.println("На каждого ученика рассчитано "+ paperOneStudent + " листов бумаги");


        // Задача номер 4
        System.out.println("Задача номер 4");
        int machineTwoMinutes = 16;
        int machineOneMinutes = (machineTwoMinutes / 2);


        int twentyMinutes = 20;
        int machineTwentyMinutes = machineOneMinutes * twentyMinutes;
        System.out.println("За 20 минут машина произвела " + machineTwentyMinutes + " штук бутылок");


        int minutesInDay = 24*60;
        int machineOneDay = (machineOneMinutes * minutesInDay);
        System.out.println("За один день машина произвела " + machineOneDay + " штук бутылок");


        int threeDay = 3;
        int machineThreeDay = (machineOneDay * threeDay);
        System.out.println("За три дня машина произвела " + machineThreeDay + " штук бутылок");


        int oneMonth = 30;
        int machineOneMonth = (machineOneDay * oneMonth);
        System.out.println("За месяц машина произвела " + machineOneMonth + " штук бутылок");


        //Задача номер 5
        System.out.println("Задача номер 5");
        int totalPaints = 120;
        int whitePaintOneClass = 2;
        int brownPaintOneClass = 4;
        int setPaintsOneClass = whitePaintOneClass + brownPaintOneClass;
        int amtClass = totalPaints / setPaintsOneClass;
        int whitePaintAllClass = amtClass * whitePaintOneClass;
        int brownPaintAllClass = amtClass * brownPaintOneClass;
        System.out.println("В школе, где " + amtClass + " классов, нужно " + whitePaintAllClass + " банок белой краски и " + brownPaintAllClass + " банок коричневой краски" );


        //Задача номер 6
        System.out.println("Задача номер 6");
        int bananas = 5;
        int weightOneBanana = 80;

        int milk = 200;
        int weightMilk100Ml = 105;

        int iceCream = 2;
        int weightOneIceCream = 100;

        int eggs = 4;
        int weightOneEgg = 70;

        int weightAllBananas = bananas*weightOneBanana;
        int weightAllMilk = milk/100*weightMilk100Ml;
        int weightAllIceCream = iceCream*weightOneIceCream;
        int weightAllEggs = eggs*weightOneEgg;
        int weightCocktailGram = weightAllBananas+weightAllMilk+weightAllIceCream+weightAllEggs;
        float weightCocktailKg = weightCocktailGram/1000f;
        System.out.println("Вес протеинового коктейля получился " + weightCocktailGram + " грамм, или "+ weightCocktailKg +" килограмм");

        //Задача номер 7
        System.out.println("Задача номер 7");
        int targetWeightKg = 7;
        int minWeightLossGram = 250;
        int maxWeightLossGram = 500;

        int targetWeightGram = targetWeightKg*1000;
        float amtDayMinLoss = targetWeightGram/250f;
        float amtDayMaxLoss = targetWeightGram/500f;

        float averageAmtDayLossWeight= (amtDayMinLoss+amtDayMaxLoss)/2f;

        System.out.println("При минимальной потере веса спортсмену понадобится "+ amtDayMinLoss + " дней. При максимальной потере веса ему понадобится "+ amtDayMaxLoss+ " дней. В средне на похудение уйдет "+averageAmtDayLossWeight+ " дней." );


        // Задача номер 8
        System.out.println("Задача номер 8");
        int masha = 63760;
        int denis = 83690;
        int kristy = 76230;

        float mashaSalaryAfterIncrease= (masha*0.1f)+masha;
        float denisSalaryAfterIncrease= (denis*0.1f)+denis;
        float kristySalaryAfterIncrease= (kristy*0.1f) +kristy;



        float mashaSalaryIncreaseYear = (mashaSalaryAfterIncrease*12f) -(masha*12f);
        float denisSalaryIncreaseYear = (denisSalaryAfterIncrease*12f) - (denis*12f);
        float kristySalaryIncreaseYear = (kristySalaryAfterIncrease*12f) - (kristy*12f);

        System.out.println("После повышения зарплаты Маша стала получать " + mashaSalaryAfterIncrease + " рублей. Годовая зарплата выросла на " + mashaSalaryIncreaseYear + " рублей");
        System.out.println("После повышения зарплаты Денис стал получать " + denisSalaryAfterIncrease + " рублей. Годовая зарплата выросла на " + denisSalaryIncreaseYear + " рублей");
        System.out.println("После повышения зарплаты Кристина стала получать " + kristySalaryAfterIncrease + " рублей. Годовая зарплата выросла на " + kristySalaryIncreaseYear + " рублей");






























        














    }
}