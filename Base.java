import java.util.Scanner;


public class Base {


    public static void main(String []args){
        System.out.println("Hello World");
        Scanner l = new Scanner(System.in);
        int x, y;
        x = l.nextInt();
        y = l.nextInt();
        soma Soma = new soma();
        Soma.setValor1(x);
        Soma.setValor2(y);
        Soma.soma();
        Soma.imprime();
    }
}
