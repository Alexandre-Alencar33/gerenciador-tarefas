import java.util.ArrayList;

public class GerenciadorTarefas {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();
    private int proximoId = 1;

    public void adicionar(String descricao) {
        Tarefa t = new Tarefa(proximoId, descricao);
        tarefas.add(t);
        proximoId++;
        System.out.println("Tarefa adicionada com id " + t.getId());
    }

    public void listar() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada");
            return;
        }
        for (Tarefa t : tarefas) {
            String status = t.isConcluida() ? "[x]" : "[ ]";
            System.out.println(t.getId() + " " + status + " " + t.getDescricao());

        }
    }

    public void concluir(int id) {
        Tarefa t = buscarPorId(id);
        if (t == null) {
            System.out.println("Tarefa " + id + " não encontrada.");
            return;
        }
        t.setConcluida(true);
        System.out.println("Tarefa " + id + " concluída.");
    }

    public void remover(int id) {
        Tarefa t = buscarPorId(id);
        if (t == null) {
            System.out.println("Tarefa " + id + " não encontrada.");
            return;
        
        }
        tarefas.remove(t);
        System.out.println("Tarefa " + id + " removida.");
        

    }

    

    public Tarefa buscarPorId(int id) {
        for (Tarefa t : tarefas) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;

    }

}
