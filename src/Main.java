public class Main {
    public static void main(String[] args) {

for (int i=0; i<=10; i++){
    System.out.println("Итерация цикла "+i);
}
for (int i=10; i>=0; i--){
    System.out.println("Итерация цикла "+i);}
for (int i=0; i<=17; i++){if (i%2==0){
    System.out.println("Четные числа "+i);}}

for (int i=10; i>=-10;i--){
    System.out.println("Итерация цикла "+i);}

for(int i=1904; i<2096;i=i+4){
    System.out.println(i+" год является високосным");}

for (int i=7;i<=98;i=i+7){
    System.out.println(i);}

for (int i=1;i<=512;i=i*2){
    System.out.println(i);}


int deposit=29000;
int total=0;
for (int i=0;i<=12;i++){total=total+deposit;
    System.out.println("Месяц "+i+", сумма накоплений равна "+total+" рублей");}

int deposit1=29000;
int total1=0;
for (int i=0;i<=12;i++){
    total1=total1+total1/100;
    total1=total1+deposit1;
    System.out.println("Месяц "+i+", сумма накоплений равна "+total1+" рублей");
}



            }
}