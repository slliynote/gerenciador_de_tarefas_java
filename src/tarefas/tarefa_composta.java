package tarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class tarefa_composta {


        //instancia do scanner
        private static Scanner scanner = new Scanner(System.in);

        //instanciação dos arrays tarefa, tarefaComposta e status
   public static ArrayList<String> Tarefa = new ArrayList<>();
   public static ArrayList<String> tarefaC= new ArrayList<>();
   public static ArrayList<String> Status = new ArrayList<>();

        //metodo principal
        public static void executa_o_tarefa_composta(){

            String tarefa = obter_tarefa();
            Tarefa.add(tarefa);

            String tarefa_composta = obter_tarefa_composta();
            tarefaC.add(tarefa_composta);

            String status = obter_status();
            Status.add(status);

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
        // metodo obter_tarefa_composta
        public static String obter_tarefa_composta(){
            System.out.print("escreva uma data: ");
            return scanner.nextLine();
        }

        // metodo listar
        public static void listar(){
            for(int i = 0; i < Status.size(); i++) {
                System.out.println(i + 1 +": " + Tarefa.get(i) + " " + tarefaC.get(i) + " --" + Status.get(i));
            }

        }


    }

