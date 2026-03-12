package MyTests.ToDoList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ToDo {

    private String tarefa;
    private Prioridade prioridade;
    private String dataInicio;
    private String dataFim;
    private boolean concluido = false;

    public String dataAtual(){
        LocalDate data = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formato);
    }

    public ToDo() {
    }

    public ToDo(String tarefa, Prioridade prioridade) {
        this.tarefa = tarefa;
        this.prioridade = prioridade;
        this.dataInicio = dataAtual();
    }


    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public Boolean getConcluido() {
        return concluido;
    }

    public void concluiTarefa(){
        concluido = true;
        dataFim = dataAtual();
    }

    @Override
    public String toString() {
        if (this.concluido) {
            return "CONCLUIDO | %s | %s | data conclusão: %s".formatted(this.prioridade, this.tarefa, this.dataFim);
        }else {
            return "ANDAMENTO | %s | %s | data inicio: %s".formatted(this.prioridade, this.tarefa, this.dataInicio);
        }
    }
}
