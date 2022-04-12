import java.util.Scanner;
public class Exercicio1 {

    public static void main(String[] args) {
          
        Scanner entrada = new Scanner(System.in);
        float num1, num2, resultado; 
    
        
        System.out.println("Escolha uma das operações: " + "\n"  +"\n" + "|1| para Subtração" + "\n" + "\n" + "|2| para Somar"+ "\n" + "\n" +  "|3| para Divisão"+ "\n" + "\n" +  "|4| para Multiplicação");
        
        int opcao = entrada.nextInt();
        
        switch (opcao){
          case 1:
                    
           System.out.println("Digite o primeiro Número:");
           num1 = entrada.nextFloat();
    
           System.out.println("Digite o Segundo Número:");
           num2 = entrada.nextFloat();
    
           resultado = (num1 - num2);
    
           System.out.println("Resulado da soma desejada é: " + resultado);
        break; 
        
        case 2:

          System.out.println("Digite o primeiro Número:");
          num1 = entrada.nextFloat();

          System.out.println("Digite o segundo Número:");
          num2 = entrada.nextFloat();

          resultado = (num1 + num2);

          System.out.println("Resulado da soma desejada é: " + resultado);
          break; 
    
          case 3:
          System.out.println("Digite o primeiro Número:");
          num1 = entrada.nextFloat();

          System.out.println("Digite o segundo Número:");
          num2 = entrada.nextFloat();

          resultado = (num1 / num2);

          System.out.println("Resulado da soma desejada é: " + resultado);
          break; 
    
          case 4:
          System.out.println("Digite o primeiro Número:");
          num1 = entrada.nextFloat();

          System.out.println("Digite o segundo Número:");
          num2 = entrada.nextFloat();

          resultado = (num1 * num2);

          System.out.println("Resulado da soma desejada é: " + resultado);
          break; 
    
        }
        
      }



}




