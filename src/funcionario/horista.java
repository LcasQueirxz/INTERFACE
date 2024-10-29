package funcionario;

// classe que representa um funcionário horista
public class horista implements employee {
    // viriavel para armazenar o total anual
    private double totalAnual;

    // construtor que inicializa o total anual
    public horista(double totalAnual) {
        this.totalAnual = totalAnual;
    }

    @Override
    // metodo que calcula e retorna o total anual com base em uma porcentagem
    public double totalanual() {
        return totalAnual * 0.10;
    }
}
