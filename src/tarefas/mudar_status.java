package tarefas;

import java.util.Scanner;

import static tarefas.tarefa_composta.Status;


public class mudar_status {

    private static Scanner scanner = new Scanner(System.in);

    private static double indice;
    private static String novoStatus;

    //metodo principal
    public static void executar_o_mudar_classe(){

        Double ind = obter_indice();
        indice = ind;

        String novo = obter_novoStatus();
        novoStatus = novo;

        muda_status();


    }
    // metodo obter_indice
    public static Double obter_indice(){
        System.out.print("adicione o indice do status: ");
        return scanner.nextDouble();
    }
    // metodo obter_novoStatus
    public static String obter_novoStatus(){
        System.out.print("adicione o novo status: ");
        return scanner.next();
    }
    // metodo que o muda o status
    public static void muda_status(){

        for (double i = 0; i < Status.size(); i++) {
            if(i == indice - 1 ){
                Status.set((int)i, novoStatus);
            };
        }
    }

}
