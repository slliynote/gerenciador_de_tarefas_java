import java.util.ArrayList;
import java.util.Scanner;

public class tarefaRafael {



    public static void dalva() {

        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> listaN = new ArrayList<>();
        ArrayList<String> Menu = new ArrayList<>();
        ArrayList<String> status = new ArrayList<>();

        Menu.add("1:tarefa simples \n" + "2:tarefa com prazo \n" + "3:listar tarefas \n" +
                "4:mudar status da tarefa \n" + "5:remover tarefa\n" + "6:sair"
        );

        Scanner nome = new Scanner(System.in);
        int num;


        do {
            System.out.println(Menu);
            System.out.print("escolha uma ação: ");
            num = nome.nextInt();


            if (num == 1) {
                System.out.print("escreva uma tarefa: ");
                Scanner nome1 = new Scanner(System.in);
                String num2 = nome1.next();
                lista.add(num2);

                System.out.print("adicione um status: ");
                Scanner nome7 = new Scanner(System.in);
                String num6 = nome7.next();
                status.add(num6);
                listaN.add("");

            } else if (num == 2) {
                System.out.print("escreva uma tarefa: ");
                Scanner nome2 = new Scanner(System.in);
                String num3 = nome2.next();
                lista.add(num3);
                System.out.print("escreva escreva a data: ");
                Scanner nome3 = new Scanner(System.in);
                String num4 = nome3.next();
                listaN.add(num4);
                System.out.print("adicione um status: ");
                Scanner nome7 = new Scanner(System.in);
                String num6 = nome7.next();
                status.add(num6);


            } else if (num == 3) {

                for(int i = 0; i < status.size(); i++) {
                    System.out.println(i + 1 +": " + lista.get(i) + " " + listaN.get(i) + " --" + status.get(i));
                }
            } else if (num == 4) {
                System.out.print("indice do status: ");
                Scanner nome7 = new Scanner(System.in);
                double num6 = nome7.nextDouble();
                System.out.print("digite o novo status: ");
                Scanner nome0 = new Scanner(System.in);
                String num8 = nome0.next();
                for (double i = 0; i < status.size(); i++) {
                   if(i == num6 - 1 ){
                       status.set((int)i,num8);
                   };
                }
            }
            else if(num == 5){
                System.out.print("indice da tarefa a ser excluida: ");
                Scanner nome7 = new Scanner(System.in);
                double num6 = nome7.nextDouble();

                for (double i = 0; i < status.size(); i++) {
                    if(i == num6 - 1 ){
                        lista.remove((int)num6 -1);
                        status.remove((int)num6 -1);
                        listaN.remove((int)num6 -1);
                    };
                }

            }
            else{
                    System.out.println("nenhuma das opções foi selecionada!");
                }
        }while (num != 6) ;



    }
}


    public static void main(String[] args) {
        tarefaRafael.dalva();
    }

