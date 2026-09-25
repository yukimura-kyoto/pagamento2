import java.time.LocalDate;

public  abstract class FormaDePagamento {

    private int codigo = 0;
    private LocalDate dataCriacao;
    // Instant


    public FormaDePagamento() {
        this.dataCriacao = LocalDate.now();
    }

    public abstract void processarPagamento();

    public int getCodigo() {
        codigo +=1;
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
