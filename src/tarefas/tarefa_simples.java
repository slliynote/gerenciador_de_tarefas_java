package tarefas;

import java.util.ArrayList;
import java.util.Scanner;

//importação dos arrays dos arrays tarefa, tarefaComposta e status.
import static tarefas.tarefa_composta.Status;
import static tarefas.tarefa_composta.Tarefa;
import static tarefas.tarefa_composta.tarefaC;

public class tarefa_simples {

    //instancia do scanner
    private static Scanner scanner = new Scanner(System.in);

     //metodo principal
     public static void executa_o_tarefa_simples(){


         String tarefa = obter_tarefa();
         Tarefa.add(tarefa);

         String status = obter_status();
         Status.add(status);
         tarefaC.add("");

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
