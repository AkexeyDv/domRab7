public class Main {
    public static void main(String[] args)
    {
        //Задание 1
        int sum=0;
        short deltaSum=15000;
        int finalSum=2459000;
        int month=0;
        byte percent=10;
        while (sum<finalSum)
        {
            month++;
            sum=sum+sum/100*percent+deltaSum;
            System.out.println("Месяц "+month+", сумма накоплений равна "+sum);
        }
        //Задание 2
        int i=1;
        while(i<=10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        for(i=10;i>=1;i--){
            System.out.print(i+" ");
        }
        System.out.println();
        //Задание 3
        int population=12000000;
        byte rogd=17;
        byte smert=8;
        for(i=1;i<=10;i++){
            population=population+population/1000*(rogd-smert);
            System.out.println("Год "+i+", численность населения составляет "+population);
        }
        //Задание 4
        int startSum=15000;
        byte percVklad=7;
        int sumFinal=startSum;
        month=0;
        while(sumFinal<12000000) {
            month = month + 1;
            sumFinal = sumFinal + sumFinal / 100 * percVklad;
            System.out.println("Месяц " + month + ": сумма накопления " + sumFinal);
        }
            //Задание 5
            startSum=15000;
            percVklad=7;
            sumFinal=startSum;
            month=0;
            while(sumFinal<12000000){
                month=month+1;
                sumFinal=sumFinal+sumFinal/100*percVklad;
                if (month%6==0) {
                    System.out.println("Месяц " + month + ": сумма накопления " + sumFinal);
                }

            }
        //Задание 6
        startSum=15000;
        percVklad=7;
        sumFinal=startSum;
        month=0;
        while(month<=12*9){
            month=month+1;
            sumFinal=sumFinal+sumFinal/100*percVklad;
            if (month%6==0) {
                System.out.println("Месяц " + month + ": сумма накопления " + sumFinal);
            }

        }
        //Задание 7
        byte chisloPrimPyat=3;
        int day=chisloPrimPyat;
        while (day<=31){
            System.out.println("Сегодня пятница, "+day+"-е число. Необходимо подготовить отчет.");
            day=day+7;
        }




    }
}