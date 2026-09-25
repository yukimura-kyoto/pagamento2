import java.time.LocalDate;

public class Boleto extends FormaDePagamento {

    private LocalDate dataDeVencimento;

    public LocalDate getDataDeVencimento(){
        return dataDeVencimento = getDataCriacao().plusDays(10);
    }

    @Override
    public void processarPagamento() {
        IO.println("seu boleto foi gerado com sucesso! \n" +
                "o codigo da operacao é "+getCodigo()+"\n" +
                "data da Criação é "+getDataCriacao()+"\n" +
                "A data de vencimento é: "+ dataDeVencimento

        );
    }
}
