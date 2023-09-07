import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] komand = new int[16]; // оздаем список команд
        Scanner in = new Scanner(System.in);
        int sms = new Random().nextInt(0,10);  // рандомно решаем сколько смс пришло
        System.out.println("Пришло "+sms+" сообщений");
        int golos;
        for (int i=0; i<sms; i++){ // присылаем сообщения и заполняем список голосами за команды
            golos = in.nextInt();
            komand[golos-1]=komand[golos-1]+1;
        }
        int max=0;
        int index = 0;
        for(int y =0; y<3;y++) {  // проходим по списку 3 раза т. к. нам нужны призрёры
            for (int i = 0; i < komand.length; i++) {     // проходим по списку
                if (max < komand[i]) {                 // и выбираем наибольше колличество голов
                    max = komand[i];                  // индекс и будет являться номером команды
                    index = i;                         // так же меняям колличесьво на ноль чтобы не мешать
                }                                     // следующим проходкам
            }
            if(max !=0) {
                System.out.println(index + 1 + "   " + max);
            }
            komand[index]=0;
            max=0;
        }
    }
}