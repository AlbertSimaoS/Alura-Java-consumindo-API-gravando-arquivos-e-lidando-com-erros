public class CEPException extends RuntimeException {
    private String message;

    public CEPException(String message) {
      this.message = message;
    }

    @Override
    public String getMessage(){
        return this.message;
    }
}
