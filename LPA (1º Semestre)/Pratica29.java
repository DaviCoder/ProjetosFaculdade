import java.text.DecimalFormat;
import java.util.Scanner;

public class Pratica29 {
    public static void main(String[] args) {
        Calcular();
    }
    public static void Calcular(){
        double valor = obterDados();
        int escolha = Escolha();
        double resultado = 0;
        switch (escolha){
            case 1:
                resultado = RparaD(valor);
                break;
            case 2:
                resultado = RparaE(valor);
                break;
            case 3:
                resultado = RparaL(valor);
                break;
            case 4:
                resultado = DparaR(valor);
                break;
            case 5:
                resultado = EparaR(valor);
                break;
            case 6:
                resultado = LparaR(valor);
                break;
            case 7:
                resultado = DparaE(valor);
                break;
            case 8:
                resultado = EparaD(valor);
                break;
            case 9:
                resultado = LparaD(valor);
                break;
            case 10:
                resultado = DparaL(valor);
                break;
            case 11:
                resultado = EparaL(valor);
                break;
            case 12:
                resultado = LparaE(valor);
                break;
            default:
                System.out.println("Valor invalido");
        }
        Imprimir(String.format("%.2f", resultado)+"$$");
    }
    public static double obterDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um valor");
        return sc.nextDouble();
    }
    public static void Imprimir(String resultado){
        System.out.println(resultado);
    }
    public static int Escolha(){
        Scanner sc = new Scanner(System.in);
        String texto ="Conversões disponiveis: escolha o numero de uma delas\n" +
                "1) real para dólar americano;\n"+
                "2) real para euro;\n"+
                "3) real para libra esterlina;\n" +
                "4) dólar americano para real;\n" +
                "5) euro para real;\n" +
                "6) libra esterlina para real;\n" +
                "7) dólar americano para euro;\n" +
                "8) euro para dólar americano;\n" +
                "9) libra esterlina para dólar americano;\n" +
                "10) dólar americano para libra esterlina;\n" +
                "11) euro para libra esterlina;\n" +
                "12) libra esterlina para euro.";
        Imprimir(texto);
        return sc.nextInt();
    }

    public static double RparaD(double real){ return real*0.18; }
    public static double RparaE(double real){ return real*0.16; }
    public static double RparaL(double real){ return real*0.13; }

    public static double DparaR(double dolar){ return dolar/0.18; }
    public static double EparaR(double euro){ return euro/0.16; }
    public static double LparaR(double libra){ return libra/0.13; }

    public static double DparaE(double dolar){ return DparaR(dolar)*0.16; }
    public static double EparaD(double euro){ return EparaD(euro)*0.18; }
    public static double LparaD(double libra){ return LparaR(libra)*0.18; }

    public static double DparaL(double dolar){ return DparaR(dolar)*0.13; }
    public static double EparaL(double euro){ return EparaR(euro)*0.13; }
    public static double LparaE(double libra){ return LparaR(libra)*0.16; }
}

