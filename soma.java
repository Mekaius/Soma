import static java.lang.System.*;

public class soma {
    private int valor1;
    private int valor2;
    public int soma;

    public void setValor1(int v1){
        this.valor1 = v1;
    }
    public int getValor1(){
        return valor1;
    }
    public void setValor2(int v2){
        this.valor2 = v2;
    }
    public int getValor2(){
        return valor2;
    }
    public int soma(){
        return valor1+valor2;
    }
    public void imprime(){
        System.out.println ("Valor da soma de " + getValor1() + " e " + getValor2() + " = " + this.soma());
    }

}
