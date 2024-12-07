package tarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class tarefa_simples {

    //instancia do scanner
    private static Scanner scanner = new Scanner(System.in);

     //metodo principal
     public static void executa_o_tarefa_simples(){
         ArrayList<String> Tarefa = new ArrayList<>();
         ArrayList<String> listaN = new ArrayList<>();
         ArrayList<String> Status = new ArrayList<>();

         String tarefa = obter_tarefa();
         Tarefa.add(tarefa);

         String status = obter_status();
         Status.add(status);
         listaN.add("");

     }
      //metodo obter_tarefa
     public static String obter_tarefa(){
         System.out.print("escreva uma tarefa: ");
       return scanner.nextLine();
     }
     // metodo obter_status
     public static String obter_status(){
         System.out.print("adicione um status: ");
         return scanner.nextLine();
     }


}
