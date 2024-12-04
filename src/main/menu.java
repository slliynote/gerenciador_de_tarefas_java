package main;

import java.util.ArrayList;

public class menu {


    public static void Menu(String[] args) {
        ArrayList<String> Menu = new ArrayList<>();

        Menu.add("1:tarefa simples \n" + "2:tarefa com prazo \n" + "3:listar tarefas \n" +
                "4:mudar status da tarefa \n" + "5:remover tarefa\n" + "6:sair"
        );
    }
}


