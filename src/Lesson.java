public class Lesson {
    public static void main(String[] args) {

        task0(); //lesson 2 Task 0 домашняя работа 2
        task1(); //variable Task 1 описание переменных
        task2(); //initializing variables Task 2 инициализация переменнных
        task3(); //three teachers Task 3 три учителя
        task4(); //bottle cutting machine Task 4 станок для бутылок
        task5(); //paint for school Task 5 краска для школы
        task6(); //Breakfast of the champion Task 6 завтрак чемпиона
        task7(); //Diet Program Task 7 программа диеты
        task8(); //Staff motivation Task 8 мотивация персонама
        task9(); //Combined homework 4 Task 9 домашняя работа 4
        task10(); //Combined homework 5 Task 10 домашняя работа 5
        task11(); //Combined homework 6 Task 11 домашняя работа 6
        System.out.println("___________________________________________________________________");
    }
    public static void task0() {
        System.out.println("__________________________________________________________________");
        System.out.println(" Домашняя работа 2");
        System.out.println("Новая задача 1, 2, 3, новые переменные");
        var weightDog =8.0;
        //Dog wight = 8.0 кг.//
        var weightCat =3.6;
        //Cat wight=3.6 кг.//
        var weightPaper =763789.;
        //Paper wight=763789.0 кг.//
        System.out.println(" Вес собаки - " +weightDog+ " кг.");
        //writes weight values dog //
        System.out.println(" Вес кошки - " +weightCat+ " кг.");
        //writes weight values Cat//
        System.out.println(" Вес бумаги- " +weightPaper+ " кг.");
        //writes weight values Paper//
        System.out.println("_________________________________________________________________________________");
        System.out.println("Следующая итерация массива + добавочное значение 4 кг. всем значениям");
        //the first iteration of the data//
        var additionalValue= 4;
        var weightDog1=weightDog+additionalValue;
        //calculate the weight of the dog +4 кг//
        System.out.println(" Вес собаки 1 - " +weightDog1+ " кг.");
        //New writes weight values dog //
        var weightCat1=weightCat+additionalValue;
        //calculate the weight of the cat +4 кг//
        System.out.println(" Вес кошки 1 - " +weightCat1+ " кг.");
        //New writes weight values cat //
        var weightPaper1=weightPaper+additionalValue;
        //calculate the weight of the cat +4 кг//
        System.out.println(" Вес бумаги 1 - " +weightPaper1+ " кг.");
        //New writes weight values paper + 4 кг//
        System.out.println("_________________________________________________________________________________");
        System.out.println("Следующая итерация массива снижение каждого значения на индивидуальную величину");
        //the next iteration of the data//
        var declineWeightDog =3.5;
        System.out.println(" Вес собаки снизить на " +declineWeightDog+ " кг.");
        var declineWeightCat =1.6;
        System.out.println(" Вес кошки снизить на " +declineWeightCat+ " кг.");
        var declineWeightPaper =7639.;
        System.out.println(" Вес бумаги снизить на " +declineWeightPaper+ " кг.");
        var weightDog2=weightDog1-declineWeightDog;
        //calculate the weight of the dog -3.5 кг//
        System.out.println(" Вес собаки снизился до " +weightDog2+ " кг.");
        //New writes weight values dog //
        var weightCat2=weightCat1-declineWeightCat;
        //calculate the weight of the dog -3.5 кг//
        System.out.println(" Вес кошки снизился до " +weightCat2+ " кг.");
        //New writes weight values dog //
        var weightPaper2=weightPaper1-declineWeightPaper;
        //calculate the weight of the Paper -7639 кг//
        System.out.println(" Вес бумаги снизился до " +weightPaper2+ " кг.");
        //New writes weight values Paper //
        System.out.println("________________________________________________________________________________");
        System.out.println("Новая задача 4 Друзья, новые переменные");
        var oldFriend=19;
        //old friend//
        var newFriend=2;
        //new friend//
        System.out.println(" Количество старых друзей " +oldFriend+ " человек.");
        //print old friends//
        System.out.println(" Количество новых друзей " +newFriend+ " человек.");
        //print new friends//
        var  totalFriends=oldFriend+newFriend;
        //in total friend//
        System.out.println(" Общее количество друзей " +totalFriends+ " человек.");
        //print total friends//
        var quantityCars=3;
        var manInCar=totalFriends/quantityCars;
        System.out.println(" Количество человек в машине " +manInCar+ " человек.");
        System.out.println("________________________________________________________________________________");
        System.out.println("Новая задача 5 лягушка, новые переменные");
        var sizeChildFrog=3.5;
        //Size frog//
        System.out.println(" Размер малька лягушки "+sizeChildFrog+ " мм.");
        //Print size a child frog//
        var newVariableFrog1=sizeChildFrog*10;
        //There's no point 1//
        System.out.println(" Просто переменнна лягушки 1 "+newVariableFrog1+ " ??.");
        //I can't think of a description//
        var newVariableFrog2=newVariableFrog1/3.5;
        //There's no point 2//
        System.out.println(" Просто переменнна лягушки 2 "+newVariableFrog2+ " ??.");
        //I can't think of a description//
        var finishFrog=newVariableFrog2+4;
        //There's no point 3//
        System.out.println(" Просто переменнна лягушки 3 "+finishFrog+ " ??.");
        //I can't think of a description//
        System.out.println("________________________________________________________________________________");
        System.out.println("Новая задача 6 боксеры, новые переменные");
        var weightBoxer1=78.2;
        var weightBoxer2=82.7;
        System.out.println(" Вес первого боксера "+weightBoxer1+ " кг.");
        System.out.println(" Вес второго боксера "+weightBoxer2+ " кг.");
        var SummWeightBoxer=weightBoxer1+weightBoxer2;
        //Total weight of boxers//
        System.out.println(" Общий вес боксеров "+SummWeightBoxer+ " кг.");
        var differenceWeightBoxer1=weightBoxer2-weightBoxer1;
        //Defference weight of boxers//
        System.out.println(" Разница в весе боксеров вариант 1 "+differenceWeightBoxer1+ " кг.");
        var differenceWeightBoxer2=weightBoxer2%weightBoxer1;
        //Defference weight of boxers//
        System.out.println(" Разница в весе боксеров вариант 2 "+differenceWeightBoxer2+ " кг.");
    }
    public static void task1() {
        System.out.println("__________________________________________________________________");
        System.out.println(" Домашняя работа 3 Переменные");
        System.out.println(" Задача 1");
        byte a = 127; // variable limit -128 до 127
        System.out.println(" Переменная byte a = " +a);
        short b = 32767; // variable limit -32768 до 32767
        System.out.println(" Переменная short b = " +b);
        int c = 2147483647; // variable limit -2147483648 до 2147483647
        System.out.println(" Переменная int c = " +c);
        long d = 922337203685477580L; // variable limit - many до many
        System.out.println(" Переменная long d = " +d);
        Float i = 1.152674748373f; //variable fractional
        System.out.println(" Переменная Float i = " +i);
        double f = 1.152674748373;
        System.out.println(" Переменная double f = " +f);
    }
    public static void task2() {
        System.out.println("__________________________________________________________________");
        System.out.println(" Задача 2 инициализация переменных " + " 27.12, " + " 987 678 965 549, " + " 2.786, " + " 569, " + " -159, " + " 27897, " + " 67, ");
        byte a = 67; // variable limit -128 до 127
        System.out.println(" Переменная byte a = " +a);
        short b1 = 569; // variable limit -32768 до 32767
        System.out.println(" Переменная short b1 = " +b1);
        short b2 = -159; // variable limit -32768 до 32767
        System.out.println(" Переменная short b2 = " +b2);
        short b3 = 27897; // variable limit -32768 до 32767
        System.out.println(" Переменная short b3 = " +b3);
        long d = 987678965549L; // variable limit - many до many
        System.out.println(" Переменная long d = " +d);
        Float i1 = 27.12f; //variable fractional
        System.out.println(" Переменная Float i1 = " +i1);
        Float i2 = 2.786f; //variable fractional
        System.out.println(" Переменная Float i2 = " +i2);

    }
    public static void task3() {
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 3 три учителя");
        byte lyudmilaPavlovna = 23;
        System.out.println(" Людмила ПАвловна = " +lyudmilaPavlovna+ " учеников");
        byte annaSergeevna = 27;
        System.out.println(" Анна Сергеевна = " +annaSergeevna+ " учеников");
        byte ekaterinaAndreevna = 30;
        System.out.println(" Екатерина Андреевна = " +ekaterinaAndreevna+ " учеников");
        int totalStudents = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna; // Почему INT значение 80 позволяет BYT??????
        System.out.println(" Всего учеников = " +totalStudents+ " учеников");
        short totalTaper = 480;
        System.out.println(" Купили бумаги = " +totalTaper+ " листов");
        int sheetsStudent = totalTaper / totalStudents ;
        System.out.println(" Количество бумаги на одного ученика = " +sheetsStudent+ " листов");
    }
    public static void task4() {
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 4 станок бутылок");
        byte machinePerformance = 16/2;
        System.out.println(" Производительность станка = " +machinePerformance+ " шт/мин");
        int machinePerformanceTwentyMinutes = machinePerformance*20;
        System.out.println(" За 20 минут станок произвел = " +machinePerformanceTwentyMinutes+ " шт");
        int machineProductivityOneDay = machinePerformance*60*24;
        System.out.println(" За сутки станок произвел = " +machineProductivityOneDay+ " шт");
        int machinePerformanceThreeDays = machineProductivityOneDay*3;
        System.out.println(" За три дня станок произвел = " +machinePerformanceThreeDays+ " шт");
        int machineProductivityPerMonth = machineProductivityOneDay*30;
        System.out.println( " За месяц станок произвел = " +machineProductivityPerMonth+ " шт");

    }
    public static void task5() {
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 5 краска для школы");
        byte totalPaint = 120;
        System.out.println(" Всего краски = " +totalPaint+ " банок");
        byte  paintsOneClass= 2+4;// Proportion 2 of white 4 to brown
        System.out.println(" Количество краски на один класс  = " +paintsOneClass+ " банок");
        int  numberСlasses= totalPaint/paintsOneClass;
        System.out.println(" Количество колическтво классов  = " +numberСlasses+ " аудиторий");
        int  amountWhitePaint= numberСlasses*2;
        System.out.println(" Общее количество белой краски  = " +amountWhitePaint+ " банок");
        int  amountBrownPaint= numberСlasses*4;
        System.out.println(" Общее количество белой краски  = " +amountBrownPaint+ " банок");
        System.out.println(" В школе,где " +numberСlasses+ " , классов нужно " +amountWhitePaint+ " банок белой краски и " +amountBrownPaint+ " банок коричневой краски.");

    }
    public static void task6() {
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 6 завтрак чемпиона");
        byte numberBananas = 5;
        System.out.println(" Количество бананов  " +numberBananas+ " штук");
        byte weightOneBanana = 80;
        System.out.println(" Масса одного банана  " +weightOneBanana+ " гр.");
        double totalWeightBanana = numberBananas*weightOneBanana;
        double totalWeightBananakg = numberBananas*weightOneBanana*0.001;
        System.out.println(" Масса бананов  " +totalWeightBanana+ " гр. " +totalWeightBananakg+ " кг." );
        int amountMilk = 200;
        System.out.println(" Количество молока  " +amountMilk+ " мл.");
        int oneHundredMlMilk = 105;
        System.out.println(" Масса 100 милилитров молока  " +oneHundredMlMilk+ " гр.");
        float totalMilkWeight = amountMilk*oneHundredMlMilk*0.01F;
        float totalMilkWeightkg = amountMilk*oneHundredMlMilk*0.00001F;
        System.out.println(" Масса молока  " +totalMilkWeight+ " гр. " +totalMilkWeightkg+ " кг." );
        int iceСreaSundae = 2;
        System.out.println(" Количество упаковок мороженного  " +iceСreaSundae+ " брикета.");
        int iceСreamWeight = 100;
        System.out.println(" Масса одной упаковки мороженного  " +iceСreamWeight+ " гр.");
        int totaliceСreamWeight = iceСreaSundae*iceСreamWeight;
        float totaliceСreamWeightkg = iceСreaSundae*iceСreamWeight*0.001F;
        System.out.println(" Масса мороженого  " +totaliceСreamWeight+ " гр. " +totaliceСreamWeightkg+ " кг." );
        byte numberEggs = 4;
        System.out.println(" Количество яиц  " +numberEggs+ " штуки");
        byte weightOneEggs = 70;
        System.out.println(" Масса одного яйца  " +weightOneEggs+ " гр.");
        double totalWeightEggs = numberEggs*weightOneEggs;
        double totalWeightEggskg = numberEggs*weightOneEggs*0.001;
        System.out.println(" Масса бананов  " +totalWeightEggs+ " гр. " +totalWeightEggskg+ " кг." );
        double totalBreakfast = totalWeightBanana+totalMilkWeight+totaliceСreamWeight+totalWeightEggs;
        double totalBreakfastkg = (totalWeightBanana+totalMilkWeight+totaliceСreamWeight+totalWeightEggs)*0.001;
        System.out.println(" общая масса завтрака  " +totalBreakfast+ " гр. " +totalBreakfastkg+ " кг." );

    }
    public static void task7() {
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 7 программа диеты");
        int excessMasskg = 7;
        int excessMass = 7*1000;
        System.out.println(" Исбыток массы спортсмена на  " +excessMasskg+ " кг." +excessMass+ " гр.");
        int dietReductionQuarter = 7000/250;
        System.out.println(" Количество дней при потере массы 250 гр/день  " +dietReductionQuarter+ " дней.");
        int dietReductionalf = 7000/500;
        System.out.println(" Количество дней при потере массы 500 гр/день  " +dietReductionalf+ " дней.");
        int dietAverageReduction = 7000/((500+250)/2);
        System.out.println(" Количество дней при средней вычесленной потере массы 750 гр/день  " +dietAverageReduction+ " дней.");

    }
    public static void task8() {
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 8 мотивация сотрудников");
        int paymentMarina = 67760;
        int paymentMarinaYear = 67760*11;
        System.out.println(" Оплата Марина в месяц = " +paymentMarina+ " руб/мес. Доход за год " +paymentMarinaYear+ " руб/год." );
        int paymentDenis = 83690;
        int paymentDenisYear = 83690*11;
        System.out.println(" Оплата Дениса в месяц = " +paymentDenis+ " руб/мес. Доход за год " +paymentDenisYear+ " руб/год.");
        int paymentKristina = 76230;
        int paymentKristinaYear = 76230*11;
        System.out.println(" Оплата Кристина в месяц = " +paymentKristina+ " руб/мес. Доход за год " +paymentKristinaYear+ " руб/год." );
        //Indexing employee pay
        float idexVariable= 1.1F;
        float paymentMarinaInd= paymentMarina*idexVariable;
        float paymentMarinaIndYear= paymentMarina*idexVariable*11;
        System.out.println(" Оплата после индексации Марина в месяц = " +paymentMarinaInd+ " руб/мес. Доход за год с учетом индексации " +paymentMarinaIndYear+" руб/год.");
        float paymentDenisInd= paymentDenis*idexVariable;
        float paymentDenisIndYear= paymentDenis*idexVariable*11;
        System.out.println(" Оплата после индексации Дениса в месяц = " +paymentDenisInd+ " руб/мес. Доход за год с учетом индексации " +paymentDenisIndYear+" руб/год.");
        float paymentKristinaInd= paymentKristina*idexVariable;
        float paymentKristinaIndYear= paymentKristina*idexVariable*11;
        System.out.println(" Оплата после индексации Кристина в месяц = " +paymentKristinaInd+ " руб/мес. Доход за год с учетом индексации " +paymentKristinaIndYear+" руб/год.");
        //The difference in annual income before and after indexing
        float diffMarinaMonth=paymentMarinaInd-paymentMarina;
        float diffMarinaYear=paymentMarinaIndYear-paymentMarinaYear;
        System.out.println(" Разница в оплате Марина в месяц = " +diffMarinaMonth+ " руб/мес. Разница в оплате за год " +diffMarinaYear+" руб/год.");
        float diffDenisMonth=paymentDenisInd-paymentDenis;
        float diffDenisYear=paymentDenisIndYear-paymentDenisYear;
        System.out.println(" Разница в оплате Дениса в месяц = " +diffDenisMonth+ " руб/мес. Разница в оплате за год " +diffDenisYear+" руб/год.");
        float diffKristinaMonth=paymentKristinaInd-paymentKristina;
        float diffKristinaYear=paymentKristinaIndYear-paymentKristinaYear;
        System.out.println(" Разница в оплате Кристина в месяц = " +diffKristinaMonth+ " руб/мес. Разница в оплате за год " +diffKristinaYear+" руб/год.");
    }
    public static void task9() {
        System.out.println("___________________________________________________________________");
        System.out.println(" Домашняя работа 4 Условный оператор.");
        System.out.println(" Задача 1.");//Разрешение на управление машиной вриант решения 1
        System.out.println("_____________________________");
        System.out.println(" Задача 1 вариант 1.");
        byte age = 17;//the age variable is used for both solutions
        System.out.println(" Тебе уже целых " + age + "лет.");
        if (age >= 18) {
            System.out.println(" Ты уже совсем взрослый тебе можно управлять автомобилем.");
        }
        if (age < 18) {
            System.out.println(" Ты еще молод и тебе пока рано управлять автомобилем.");
        }
        System.out.println("_____________________________");
        System.out.println(" Задача 1 вариант 2.");//Разрешение на управление машиной вриант решения 1
        System.out.println(" Тебе уже целых " + age + "лет.");
        if (age >= 18) {
            System.out.println(" Ты уже совсем взрослый тебе можно управлять автомобилем.");
        } else {
            System.out.println(" Ты еще молод и тебе пока рано управлять автомобилем.");
        }
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 2");//температура за окном пора одеть шапкку
        float outdoorTempreatura = 4.5f;
        System.out.println(" Сейчас температура на улице " + outdoorTempreatura + " градусов цельсия.");
        if (outdoorTempreatura >= 5.0f) {
            System.out.println(" Так как на улице " + outdoorTempreatura + " С. можно идти гулять без шапки.");
            ;
        } else {
            System.out.println(" Так как на улице " + outdoorTempreatura + " С. необходимо одеть шапку.");
        }
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 3");//Скоросной режим первышение выше 60 км.
        byte speed = 61;
        byte limitSpeeding = 60;//Speed limit
        System.out.println(" Ваша текущая скорость " + speed + " км/час.");
        if (speed <= limitSpeeding) {
            System.out.println(" Текущая скорость автомобиля составляет " + speed + " км/час. и не преышает допустимую " + limitSpeeding + " км/час. Продолжайте движение.");
            ;
        } else {
            System.out.println(" Текущая скорость автомобиля составляет " + speed + " км/час. и преышает допустимую " + limitSpeeding + " км/час. Вам необходимо снизить скорость или придется заплотить штраф.");
        }
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 4 ( Обязательно в программе укажите сколько полных лет в ручную от 0 до 100)");//Где ты должен быть и что ты должен делать
        byte howOldAreYou = 37;// Введи сколько лет
        //от2 до 6 Детский сад;
        // от 7 до 18 включительно ходит в школу;
        // от 18 до 24 учится в университете;
        // от 24 до 60 включительно ходит на работ;
        // от 60 отдыхает;
        System.out.println(" Ваш возраст " + howOldAreYou + " лет.");
        boolean baby = howOldAreYou < 2;
        boolean youGoToKindergarten = howOldAreYou >= 2 && howOldAreYou <= 6;
        boolean youGoToSchool = howOldAreYou >= 7 && howOldAreYou <= 18;
        boolean youGoToUniversity = howOldAreYou > 18 && howOldAreYou <= 24;
        boolean youGoToWork = howOldAreYou > 24 && howOldAreYou <= 60;
        boolean youPensioner = howOldAreYou > 60 && howOldAreYou <= 100;
        if (baby) {
            System.out.println(" Вы младенец, расслабьтесь и получайте удовольствие. ");
        }
        if (youGoToKindergarten) {
            System.out.println(" Вы ребенок и должны ходить в садик. ");
        }
        if (youGoToSchool) {
            System.out.println(" Вы подросток и должны ходить в школу. ");
        }
        if (youGoToUniversity) {
            System.out.println(" Вы юноша и должны ходить в университет. ");
        }
        if (youGoToWork) {
            System.out.println(" Вы взрослый и должны ходить на работу. ");
        }
        if (youPensioner) {
            System.out.println(" Вы являетесь пенсионером и должны отдыхать и наслаждаться жизнью, но это не точно. ");
        }
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 5 Ограничение на атракционы (Обязательно введите с клавиатуры возраст ребенка и наличие взрослого человека).");
        byte howOldAreСhild = 15; // Введи сколько лет ребенку?;
        System.out.println(" Ребенку " + howOldAreСhild + " лет. ");
        var thereIsAdult0 = 0;// Есть ли взрослый человек "0"-нет,"1"-есть?;
        boolean thereIsAdult = thereIsAdult0 >= 1;
        if (thereIsAdult) {
            System.out.println(" Взрослый есть ");
        } else {
            System.out.println(" Взрослых нет ");
        }
        boolean theLittleOneCantRide = howOldAreСhild < 5;
        boolean CanRideWithAdults = howOldAreСhild >= 5 && howOldAreСhild <= 14;
        boolean canRideOnHisOwn = howOldAreСhild > 14;
        if (theLittleOneCantRide) {
            System.out.println(" Ребенок не может кататься на атракционах . ");
        }
        if (CanRideWithAdults && thereIsAdult) {
            System.out.println(" Ребенок не может кататься на атракционах  в сопровождении взрослого. ");
        } else if (CanRideWithAdults) {
            System.out.println(" Детям в этом возрасте без взрослого кататься на атракционе нельзя. ");
        }
        if (canRideOnHisOwn) {
            System.out.println(" Ребенок может кататься на атракционах самостоятельно. ");
        }
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 6 Наличие свободных мест в жд вагоне.");
        byte totalSeats = 102;// Всего мест ввагоне.
        byte seatsForSitting = 60;// Сколько всего сидящих мест в вагоне.
        int placesForStanding = totalSeats - seatsForSitting; // Сколько всего стоящих мест в вагоне.
        System.out.println(" В вагоне всего " + totalSeats + " места.   ");
        byte occupiedPlacesForSitting=60; // Сколько сидящих мест в вагоне занято.
        byte occupiedPlacesForStanding=40; // Сколько стоящих мест в вагоне занято.
        System.out.println(" В вагоне сидящих " + seatsForSitting + " мест. Сейчас занято " +occupiedPlacesForSitting+ " сидящих мест. ");
        System.out.println(" В вагоне стоящих " + placesForStanding + " мест. Сейчас занято " +occupiedPlacesForStanding+ " сидящих мест. ");
        int freePlacesForSitting=seatsForSitting-occupiedPlacesForSitting;// Свободные места для сидящих.
        int freePlacesForStanding=placesForStanding-occupiedPlacesForStanding;// Свободные места для стоящих.
        int freetotalSeats=freePlacesForSitting+freePlacesForStanding;// Сколько всего свободных мест осталось.
        if (freetotalSeats>=1){
            System.out.println(" В вагоне есть " +freetotalSeats+ " свободных места. Свободно " +freePlacesForSitting+ " места для сидящих пассажиров и вободно " +freePlacesForStanding+ " места для стоящих пассажиров. ");
        }else { System.out.println(" В вагоне свободных мест нет. ");
        }
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 7 Какое из чисел больше.");
        byte a=2;
        byte b=1;
        byte c=3;
        boolean writeA=a>b&&a>c;
        boolean writeB=b>a&&b>c;
        boolean writeC=c>a&&c>b;
        if (writeA){System.out.println("a");
        } else {
            if (writeB) {
                System.out.println("b");
            } else {
                if (writeC) {
                    System.out.println("c");
                }
            }
        }

    }
    public static void task10() {
        System.out.println("___________________________________________________________________");
        System.out.println(" Домашняя работа 5 комбинации условных операторов.");
        System.out.println(" Задача 1. Мобильный банк.");//Мобильный банк;
        //Есть ли у вас телефон? если нет то напишите "2....."
        //Если есть то отметьте какой вид ОС у вашего телефона если "Android" то напишите "1", если "iOS" то напишите "0"
        byte clintOs = 0;
        if (clintOs <= 1) {
            System.out.println(" Поздравляю вы обладатель отличного функционального гаджета который может селать вашу жизнь проще.");
        } else
            System.out.println(" Я рекомендую вам приобрести телефон и в полной мере пользоваться услугами наших сервисов.");
        if (clintOs == 1) {
            System.out.println(" Ваше устройство на базе операционной системы Android приложения для которого вы можете скачать пройдя по ссылке.");
        }
        if (clintOs == 0) {
            System.out.println(" Ваше устройство на базе операционной системы IOS приложения для которого вы можете скачать пройдя по ссылке.");
        }
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 2. Мобильный банк для новых и старых устройств.");//Мобильный банк, в зависимости от года выпуска устройства.;
        //Есть ли у вас телефон? если нет то напишите "2.....".;
        //Если есть то отметьте какой вид ОС у вашего телефона если "Android" то напишите "1", если "iOS" то напишите "0".;
        //Укажите год выпуска вашего мобильного устройства.;
        byte clintOs1 = 0;
        short clintDeviceYear = 2000;
        if (clintOs1<=1) {System.out.println(" Поздравляю вы обладатель отличного функционального гаджета который может селать вашу жизнь проще.");
        } else System.out.println(" Я рекомендую вам приобрести телефон и в полной мере пользоваться услугами наших сервисов.");
        if (clintOs1==1){if (clintDeviceYear>=2015) System.out.println(" Ваше устройство на базе операционной системы Android поддерживает последнюю версию мобильного приложения которое вы можете установить пройдя по ссылке.");
            else System.out.println(" Ваше устройство на базе операционной системы Android является устаревшим и не может поддерживать последнюю версию ПО, вам необходимо установить облегченную версию ПО, которую вы можете скачать пройдя по ссылке.");
        }
        if (clintOs1==0){if (clintDeviceYear>=2015) System.out.println(" Ваше устройство на базе операционной системы IOS поддерживает последнюю версию мобильного приложения которое вы можете установить пройдя по ссылке.");
        else System.out.println(" Ваше устройство на базе операционной системы IOS является устаревшим и не может поддерживать последнюю версию ПО, вам необходимо установить облегченную версию ПО, которую вы можете скачать пройдя по ссылке.");
        }
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 3. Определение високосного года (Люди машины за 60 секунд угоняют в кино, я два дня думал и только такое придумал.");//Определение високосного года.;
        int year=2000;
        float checkingYear=year/4f;
        float checkingYear1=year/100f;// каждый сотый год который делится без остатка в 468 строке;
        float checkingYear2=year/400f;// каждый четырехсотый год который делится без остатка в 468 строке;
        boolean exception=checkingYear1%1!=0||checkingYear2%1==0;
        System.out.println(" Промежуточная переменная " + checkingYear + " при высокосном годе она кратна 4.");// Дата високосного года делится без остатка на "4";
        System.out.println(" Промежуточная переменная " + checkingYear1 + " год кратный 100 .");// Дата не високосного года делится без остатка на "100";
        System.out.println(" Промежуточная переменная " + checkingYear2 + " год кратный 400 .");// Дата високосного года делится без остатка на "400";
        if (checkingYear%1==0&&exception) {
            System.out.println( " "+ year + " год был високосным.");
        }else System.out.println( " "+ year + " год был не високосным.");
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 4. Доставка банковской карты.");//Определение времени доставки банковской карты.;
        int distanceBankHouse=200;//Укажите какое расстояние от вашего дома до банка.;
        System.out.println( " От банка  до вашего дома " +distanceBankHouse+ " км. " );
        boolean near=distanceBankHouse<=20;
        boolean close=distanceBankHouse>20&&distanceBankHouse<=60;
        boolean medium=distanceBankHouse>60&&distanceBankHouse<=100;
        boolean far=distanceBankHouse>100;
        if (near) {
            System.out.println(" Ваш дом находится рядом с офисом банка, мы доставим вашу пластиковую карту в течениии суток.");
        }else if (close) {
            System.out.println(" Ваш дом находится дальше 20 километров от офиса банка, мы сможем доставить вам пластиковую карту в течениии двух суток.");
        }else if (medium) {
            System.out.println(" Ваш дом находится дальше 60 километров от офиса банка, мы сможем доставить вам пластиковую карту в течениии трех суток.");
        } else if (far) { System.out.println(" К сожалению ваш дом находится слишком далеко от офиса банка и мы не сможем доставить вам пластиковую карту, вам необходимо самостоятельно забрать ее.");
        }
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 5. Определение времени года.");//Определение времени года.;
        //Напишите номер месяца где: January-1, February-2, March-3, April-4, May-5, June-6, July-7, August-8, September-9, October-10, November-11, December-12;
        int numberMonth=6;
        System.out.println(" Вы ввели значение "+numberMonth+ " соответствующее месяцу");
        switch (numberMonth) {
            case 12:
            case 1:
            case 2:
                System.out.println(" Вы указали месяц ссответствующтй сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Вы указали месяц ссответствующтй сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Вы указали месяц ссответствующтй сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Вы указали месяц ссответствующтй сезону осень");
                break;
            default:
                System.out.println(" Месяц которы был указан не существует и не может быть присвоен ни к одному из времен года.");
        }

    }
    public static void task11() {
        System.out.println("___________________________________________________________________");
        System.out.println(" Домашняя работа 6.");
    }

}
