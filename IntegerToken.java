import java.math.* ;

public class IntegerToken extends Token {

  public BigInteger value ;


  public IntegerToken(int kind, String image) {
    this.kind = kind ;
    this.image = image ;

    //make new BigInteger object and set value equal to it
    value = new BigInteger(image) ;
  }

  public Object getValue() {
    return value ;
  }

  @Override
  public String toString() {
    return new String(value.toByteArray()) ;
  }
}
