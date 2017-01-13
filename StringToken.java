
public class StringToken extends Token {

  String value ;

  public StringToken(int kind, String image) {
    this.kind = kind ;
    this.image = image ;

    value = "" ;

    boolean escape = false ;

    //escape characters iterativly
    for(char c : image.substring(1, image.length() - 1).toCharArray()) {

      //if backslash detected check next char
      if (c == '\\' && escape == false) {
        escape = true ;
        continue ;
      }

      //if next char matches \ t n or ", escape that character
      if (escape == true) {
        switch(c) {
          case 'n' : value += "\n" ; escape = false ; continue ;
          case 't' : value += "\t" ; escape = false ; continue ;
          case '\\' : value += "\\" ; escape = false ; continue ;
          case '\"' : value += "\"" ; escape = false ; continue ;
          default : value += "" ; continue ;
        }
      }
      //otherwise add character to string value
      else {
        value += c ;
      }
    }


  }

  public Object getValue() {
    return value ;
  }

  @Override
  public String toString() {
    return value ;
  }
}
