import java.math.* ;

public class DecimalToken extends Token {

  BigDecimal value ;

  public DecimalToken(int kind, String image) {
    this.kind = kind ;
    this.image = image ;

    value = new BigDecimal(image) ;
  }

  public Object getValue() {
    return value ;
  }

  @Override
  public String toString() {
    return value.toString() ;
  }
}
