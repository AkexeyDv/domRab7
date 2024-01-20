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


    }
}