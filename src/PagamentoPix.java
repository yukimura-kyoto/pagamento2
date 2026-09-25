public class PagamentoPix extends FormaDePagamento{
    @Override
    public void processarPagamento() {
        IO.println("seu pix foi realizado com sucesso! \n" +
                "o codigo da operacao é "+getCodigo()+"\n" +
                "data do pagamento é "+getDataCriacao());
    }
}
