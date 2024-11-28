public class menu
{
        String tarefas;
        String tarefaP;
        String lista;
        String alterar;
        String removeT;
        String sair;

    public void menus( String tarefas,String tarefaP,String lista,String alterar,String removeT,String sair){

        this.tarefas= tarefas;
        this.tarefaP = tarefaP;
        this.lista = lista;
        this.alterar = alterar;
        this.removeT = removeT;
        this.sair = sair;

    }

    public void outro(){
       menus("1: Tarefas simples","2: Tarefas com prazo","3: Listar tarefas","4: Alterar status de uma tarefa","5: Remover tarefa","6: Sair");
    }

    public void tenta(menu menus){

    }

    public static void main(String[] args) {

    }
}


