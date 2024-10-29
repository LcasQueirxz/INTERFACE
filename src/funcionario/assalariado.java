package funcionario;

// criando as classes da minha superclasse
public class assalariado implements employee {
    @Override
    // exibindo o total anual e inserindo um valor a ser retornado
    public double totalanual() {
        return 4000.00;
    }
}
