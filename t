echo "----- Test $1"
java -classpath . TestHL Test/test$1.hl >Test/$1.out
diff Test/$1.out Test/$1.results
