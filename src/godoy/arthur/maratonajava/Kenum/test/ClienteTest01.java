package godoy.arthur.maratonajava.Kenum.test;

import godoy.arthur.maratonajava.Kenum.domain.Cliente;
import godoy.arthur.maratonajava.Kenum.domain.TipoCliente;
import godoy.arthur.maratonajava.Kenum.domain.TipoPagamento;

import java.sql.SQLOutput;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Arthur", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("Lia", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);


    }
}
