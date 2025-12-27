public class Authenticate {
    public static void validateCEP(String cep) {
        if (!cep.matches("\\d{8}")) {
            throw new CEPException("CEP deve conter exatamente 8 números.");
        }
    }
}
