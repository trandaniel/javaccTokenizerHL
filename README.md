# javaccTokenizerHL
Tokenizer using JavaCC for a language HL

Tokenizes keywords and ignores single/multi line comments

Comments such as 

<code>//single line comment</code> 

or 

<code> /* a multi /* line comment */ with nested comments */</code>

will be ignored.

All keywords in the language HL are case-insensitive, therefore <code>WhiLE</code> and <code>WHilE</code> will be 
interperted as the same <code>while</code> token.
