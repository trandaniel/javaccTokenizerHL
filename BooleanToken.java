public class BooleanToken extends Token {

  public Boolean value ;

  public BooleanToken(int kind, String image) {
    this.kind = kind ;
    this.image = image ;

    if (image.toLowerCase().equals("true")) {
      value = true ;
    }
    else {
      value = false ;
    }

  }

  public Object getValue() {
    return value ;
  }

  @Override
  public String toString() {
    return image.toLowerCase() ;
  }
}
