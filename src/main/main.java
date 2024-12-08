package main;

import main.menu;
import tarefas.tarefa_simples;
import tarefas.tarefa_composta;
import tarefas.mudar_status;

import java.util.Scanner;

public class main {

   public static void executar_programa() {

       int indiceEscolhido;

       do{

          menu.mostraMenu();
          indiceEscolhido = menu.obter_valor();

           switch(indiceEscolhido){

               case 1 :
                 tarefa_simples.executa_o_tarefa_simples();
               break;

                case 2 :
                  tarefa_composta.executa_o_tarefa_composta();
                  break;

               case 3 :
                   tarefa_composta.listar();
                   break;

               case 4 :
                   mudar_status.executar_o_mudar_classe();
                   break;
           }
          


       }while(indiceEscolhido != 6);


   }

    public static void main(String[] args) {

        executar_programa();

    }
}
