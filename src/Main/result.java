package Main;
// importando as classes do pacote funcionario
import funcionario.*;

public class result {
    public static void main(String[] args) {
        // criando uma instancia de um funcionario assalariado
        employee assalariado = new assalariado();
        // criando uma instância de um funcionário horista com um exemplo de total anual recebido
        employee horista = new horista(40000.00);

        // exibindo o total anual do bonus do funcionario assalariado
        System.out.println("Total anual do bonus do funcionario assalariado: R$ " + assalariado.totalanual());
        // exibindo o total anual do bonus do funcionario horista
        System.out.println("Total anual do bonus do funcionario horista: R$ " + horista.totalanual());
    }
}
