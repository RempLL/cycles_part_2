public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        int count = 1;
        int contribution = 15000;
        int sumContribution = contribution;
        while(sumContribution<=2459000){
            System.out.println("Месяц "+count+ ", сумма накоплений равна "+sumContribution+" рублей.");
            sumContribution+=contribution;
            count++;
        }
        System.out.println();

        System.out.println("Задача 2:");
        int a = 1;
        while (a<=10){
            System.out.print(a+" ");
            a++;
        }
        System.out.println();
        for (int i = 10;i>=1;i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Задача 3:");
        int born = 17;
        int death = 8;
        int population = 12000000;
        int dif = born - death;
        for(int i = 1; i<=10;i++){
            population+=population*dif/1000;
        }
        System.out.println(population);
        System.out.println();

        System.out.println("Задача 4:");
        int sumContribution4 = 15000;
        for(int i = 1;sumContribution4<=12000000;i++,sumContribution4+=sumContribution4/100*7 ){
            System.out.println("Месяц " + i + ", в банке "+sumContribution4+ " рублей.");
        }
        System.out.println();

        System.out.println("Задача 5:");
        int sumContribution5 = 15000;
        for(int i = 1;sumContribution5<=12000000;i++,sumContribution5+=sumContribution5/100*7 ){
            if(i%6==0){
                System.out.println("Месяц " + i + ", в банке "+sumContribution5+ " рублей.");
            }
        }
        System.out.println();

        System.out.println("Задача 6:");
        int sumContribution6 = 15000;
        for(int i = 1;i<=108;i++,sumContribution6+=sumContribution6/100*7 ) {
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", в банке " + sumContribution6 + " рублей.");
            }
        }
        System.out.println();

        System.out.println("Задача 7:");
        int firstFriday = 6;
        for(int i = firstFriday;i<=31;i+=7){
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println();

        System.out.println("Задача 8:");
        int endYear = 2023+100;
        int startYear = 2023-200;
        for(int i = 0; i<=endYear;i+=79){
            if(i>=startYear){
                System.out.println(i);
            }
        }
    }
}