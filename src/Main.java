public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
for (int i=1; i<=10; i++){
    System.out.println("Итерация цикла "+i);
}
        System.out.println("Задание 2");
for (int i=10; i>=1; i--){
    System.out.println("Итерация цикла "+i);}

        System.out.println("Задание 3");
for (int i=0; i<=17; i++){if (i%2==0){
    System.out.println("Четные числа "+i);}}

        System.out.println("Задание 4");
for (int i=10; i>=-10;i--){
    System.out.println("Итерация цикла "+i);}

        System.out.println("ДЗ-2. Задание 1");
for(int i=1904; i<2096;i=i+4){if(i%100!=0||i%400==0)
    System.out.println(i+" год является високосным");}

        System.out.println("ДЗ-2. Задание 2");
for (int i=7;i<=98;i=i+7){
    System.out.print(i+" ");
}
        System.out.println();

        System.out.println("ДЗ-2. Задание 3");
for (int i=1;i<=512;i=i*2){
    System.out.print(i+" ");}
        System.out.println();

        System.out.println("ДЗ-3. Задание 1");
int deposit=29000;
int total=0;
for (int i=1;i<=12;i++){total=total+deposit;
    System.out.println("Месяц "+i+", сумма накоплений равна "+total+" рублей");}

        System.out.println("ДЗ-3.Задание 2");
        double percent=0.01;
        double total1=0;
        for (int i=1;i<=12;i++){
           total1=(total1+deposit)*(1+percent);
            System.out.println("Месяц "+i+", сумма накоплений равна "+total1+" рублей");
        }






            }
}