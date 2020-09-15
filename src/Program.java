import Aula03.Conta;
import Entities.Funcionario;

public class Program {
    public static void main(String[] args) { //executavel
        Funcionario funcionario1 = new Funcionario(); //objeto
        funcionario1.nome = "Pedro";
        funcionario1.sobrenome = "Rodrigues";
        funcionario1.email = "pedro@gmail.com";
        funcionario1.idade = 34;

        Funcionario funcionario2 = new Funcionario("Maria", "Silva", "maria@gmail.com", 32);

        //Dados do Pedro
        funcionario1.mostraEmail(); //pedro@gmail.com
        funcionario1.mostraNomeESobrenomeJuntos();
        funcionario1.mostraODobroDaIdade();

        funcionario2.mostraEmail();
    }
}
