class TamanhoDaSenhaException extends Exception {
    public TamanhoDaSenhaException() {
        super("A senha deve ter pelo menos 8 caracteres!"); // mensagem já definida
    }
}
