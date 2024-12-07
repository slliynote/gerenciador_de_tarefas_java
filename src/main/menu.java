package main;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {

    private static Scanner scanner = new Scanner(System.in);




    public static void mostraMenu() {
        ArrayList<String> Menu = new ArrayList<>();
        ArrayList<Integer> valorinicial = new ArrayList<>();


        //adiciona o conteúdo para o array menu
        Menu.add("1:tarefa simples \n" + "2:tarefa com prazo \n" + "3:listar tarefas \n" +
                "4:mudar status da tarefa \n" + "5:remover tarefa\n" + "6:sair"
        );
        System.out.println(Menu);

    }

    public static double obter_ação_inicial(){
        System.out.print("escolha uma ação: ");
        return scanner.nextInt();
    }

    public static int obter_valor(){
        System.out.print("escolha a ação ");
        return scanner.nextInt();
    }

}


