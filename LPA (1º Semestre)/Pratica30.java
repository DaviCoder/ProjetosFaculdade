import java.util.Scanner;

public class Pratica30 {
    public static void main(String[] args) {
    calcular();
    }
    public static void calcular(){
        double resultado1 = obterNota1();
        double resultado2 = obterNota2();
        resultadoFInal(resultado1,resultado2);
    }
    public static double obterNota1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a primeira nota da primeira unidade");
        double nota1 = sc.nextDouble();
        System.out.println("digite a segunda nota da primeira unidade");
        double nota2 = sc.nextDouble();
        System.out.println("digite a terceira nota da primeira unidade");
        double nota3 = sc.nextDouble();
        return primeiraUnidade(nota1,nota2,nota3);
    }
    public static double obterNota2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a primeira nota da segunda unidade");
        double nota1_2 = sc.nextDouble();
        System.out.println("digite a segunda nota da segunda unidade");
        double nota2_2 = sc.nextDouble();
        System.out.println("digite a terceira nota da segunda unidade");
        double nota3_2 = sc.nextDouble();
        return segundaUnidade(nota1_2,nota2_2,nota3_2);
    }
    public static double primeiraUnidade(double nota1,double nota2,double nota3){
        return ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/(2 + 3 + 5);
    }
    public static double segundaUnidade(double nota1,double nota2,double nota3){
        return ((nota1 * 2) + (nota2 * 3) + (nota3 * 4))/(3 + 3 + 4);
    }
    public static void resultadoFInal(double resultado1, double resultado2){
        double mediaFinal = (resultado1+resultado2)/2;
        System.out.println(mediaFinal + " | " + resultado1 + " | " + resultado2);
        if(mediaFinal >=6) System.out.println("Aprovado");
        else System.out.println("Reprovado");
    }
}


