import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        List<Conta> contas = new ArrayList<Conta>();
        contas.add(cc);
        contas.add(poupanca);
        Banco banco = new Banco();
        banco.setContas(contas);
        System.out.println(banco.getContas());
        System.out.println(banco.getContasByNumero(2));
        System.out.println(banco.getContasBySaldo(0.0));

    }
}
