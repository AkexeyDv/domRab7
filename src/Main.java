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


    }
}