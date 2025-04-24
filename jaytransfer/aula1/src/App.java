import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // declaração de variáveis
        String nome; //referência
        int opcaoTransporte; //camelCasing
        String meioTransporte = "";

        // classe para teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println("==Pesquisa De Transporte Diário");
        System.out.println("Digite seu nome:");
        nome = scanner.nextLine();
        System.out.println(nome);
        System.out.println("Como você vai ao trabalho?");
        // utf-8 - Samuel
        System.out.println("1-Metrô");
        System.out.println("2-Ônibus");
        System.out.println("3-Caminhada");
        System.out.println("4-Uber");
        System.out.println("5-Táxi");
        System.out.println("6-Carro");
        System.out.println("Escolha uma opção (1-6)");

        // exercicio
        //faça como eu fiz
        // leia a opcaoTransporte e mostre a opção lida
        //casting (conversão) - texto/número (String/int)
        opcaoTransporte = scanner.nextInt();
        
        switch(opcaoTransporte){
           case 1:
                  meioTransporte = "Metrô";break;
           case 2:
                  meioTransporte = "Ônibus";break;
           case 3:
                  meioTransporte = "Caminhada";break;
           case 4:
                  meioTransporte = "Uber";break;
           case 5:
                  meioTransporte = "Taxi";break;
           case 6:
                  meioTransporte = "Carro";break;                           
        }
        
        //Task de amanhã: salvar os dados no arquivo.
        //Task no Github (git e github)
        System.out.println("Nome:"+nome+","+"Meio do Transporte:"+meioTransporte);
    
      
    }
}
