import java.util.Scanner;

public class Pratica28 {
    public static void main(String[] args) {
        Calcular();
    }
    public static void Calcular(){
        double valor = obterDados();
        int operacao = Operacao();
        double resultado = 0;
        switch (operacao){
            case 1:
                resultado = CparaK(valor);
                break;
            case 2:
                resultado = KparaC(valor);
                break;
            case 3:
                resultado = CparaF(valor);
                break;
            case 4:
                resultado = FparaC(valor);
                break;
            case 5:
                resultado = KparaF(valor);
                break;
            case 6:
                resultado = FparaK(valor);
                break;
            default:
                System.out.println("Valor invalido");
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
    public static int Operacao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Operações disponiveis: escolha o numero de uma delas\n" +
                "(1) De Celsius para Kelvin\n" +
                "(2) De Kelvin para Celsius\n" +
                "(3) De Celsius para Fahrenheit\n" +
                "(4) De Fahrenheit para Celsius\n" +
                "(5) De Kelvin para Fahrenheit\n" +
                "(6) De Fahrenheit para Kelvin\n");
        return sc.nextInt();
    }
    public static double CparaK(double c){
        return c + 273;
    }
    public static double KparaC(double k){
        return -(273-k);
    }

    public static double CparaF(double c){
        return (1.8*c)+32;
    }
    public static double FparaC(double f){
        return (f-32)/1.8;
    }

    public static double KparaF(double k){
        return (k-273)*1.8+32;
    }
    public static double FparaK(double f){
        return (f-32)*(5/9)+273;
    }
}
