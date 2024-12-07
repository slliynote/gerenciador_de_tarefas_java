package main;

import main.menu;
import tarefas.tarefa_simples;

import java.util.Scanner;

public class main {

   public static void executar_programa() {


       int indiceEscolhido;

       do{
          menu.mostraMenu();
          indiceEscolhido = menu.obter_valor();

           switch(indiceEscolhido){

               case 1 :
                  String tarefa = tarefa_simples.obter_tarefa();

                  String status = tarefa_simples.obter_status();

           }
          


       }while(indiceEscolhido != 6);


   }

    public static void main(String[] args) {

        executar_programa();

    }
}
