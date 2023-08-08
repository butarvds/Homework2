public class Lesson {
    public static void main(String[] args) {
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

}
