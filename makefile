HL.class: HL.jj TestHL.java Token.java BooleanToken.java IntegerToken.java DecimalToken.java StringToken.java IdentifierToken.java
	javacc HL.jj
	javac  *.java
Token.java: HL.jj
	javacc HL.jj
