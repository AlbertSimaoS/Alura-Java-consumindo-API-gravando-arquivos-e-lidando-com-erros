public class UserDoesntExistException extends RuntimeException {
  private String message;

  public UserDoesntExistException(String message) {
      this.message = message;
  }

  @Override
  public String getMessage(){
      return this.message;
  }
}
