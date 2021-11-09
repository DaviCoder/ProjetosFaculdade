import java.util.Scanner;

public class Pratica27 {
    public static void main(String[] args) {
        Calcular();

    }
    public static  void Calcular(){
        double valor1 = obterDados();
        String operacao = Operacao();
        double valor2 = obterDados();
        double resultado = 0;
        switch (operacao){
            case "+":
                resultado = Soma(valor1,valor2);
                break;
            case "-":
                resultado = Subtracao(valor1,valor2);
                break;
            case "*":
                resultado = Multiplicacao(valor1,valor2);
                break;
            case "/":
                resultado = Divisao(valor1,valor2);
                break;
        }
        Imprimir(""+resultado);
    }
    public static void Imprimir(String resultado){
        System.out.println(resultado);
    }
    public static double obterDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um valor");
        return sc.nextDouble();
    }
    public static String Operacao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Operações disponiveis: | + | - | * | / |");
        return sc.next();
    }
    public static double Soma(double valor1, double valor2){
        return valor1+valor2;
    }
    public static double Subtracao(double valor1, double valor2){
        return valor1-valor2;
    }
    public static double Divisao(double valor1, double valor2){
        return valor1/valor2;
    }
    public static double Multiplicacao(double valor1, double valor2){
        return valor1*valor2;
    }
}
