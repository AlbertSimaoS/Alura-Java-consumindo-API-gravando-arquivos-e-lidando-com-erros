//poderia utilizar a "ArithmeticException", mas optei por criar minha propria exception

class DivisaoPorZeroException extends Exception {
    public DivisaoPorZeroException() {
        super("O divisor não pode ser zero!"); // mensagem já definida
    }
}
