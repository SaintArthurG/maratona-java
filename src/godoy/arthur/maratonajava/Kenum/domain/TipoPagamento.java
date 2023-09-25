package godoy.arthur.maratonajava.Kenum.domain;

public enum TipoPagamento{
        DEBITO(8){
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        },
        CREDITO(9){
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.05;
            }
        };
        public final int DESC;
        TipoPagamento(int desc){
            this.DESC = desc;
        }
        public abstract double calcularDesconto(double valor);
    }