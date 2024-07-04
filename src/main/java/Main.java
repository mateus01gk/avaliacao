import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("seja bem vindo!");
    System.out.println("");
    System.out.println("digite seu nome ");
    String nome = sc.nextLine();
    System.out.println("digite seu sobrenome");
    String sobrenome = sc.nextLine();
    System.out.println("digite sua idade");
    double idade = sc.nextDouble();
    System.out.println("digite sua altura");
    double altura = sc.nextDouble();
     System.out.println("digite 1 se você for do        sexo feminino e digite 2 se você for do sexo       masculino");
      int sexo = sc.nextInt();
    if(sexo==1){
      System.out.println("feminino");
    }
      if(sexo==2){
        System.out.println("masculino");
      }





    sc.close();
  }

}