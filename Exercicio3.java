import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
    
        System.out.print("Digite o primeiro número: ");
         int valor1 = entrada.nextInt();
                
        System.out.print("digite o segundo número: ");
         int valor2 = entrada.nextInt();

         System.out.println("Digite o terceiro número:");
         int valor3 = entrada.nextInt();

       
    
        if (valor1> valor2){
            System.out.println("O valor  " + valor1 + " é maior que o valor " + valor2 + " e menor ou maior que do valor " + valor3);
        }else if(valor2> valor1){
            System.out.println("O valor " + valor2 + " é maior que o valor " + valor1 + " e maior ou menor que do valor " + valor3);

        } else if (valor2>valor3){
        System.out.println("O valor " +valor2 + " e maior que o valor " + valor3 + " e maior ou menor que o do  valor " + valor1);

        }else{
            System.out.println("Números iguais");

        }
        
    
        }
    }

