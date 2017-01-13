public class IdentifierToken extends Token {

  public String value ;

  public IdentifierToken(int kind, String image) {
    this.kind = kind ;
    this.image = image ;

    value = image ;
  }

  //return identifier
  public Object getValue() {
    return value ;
  }

}
