class TestHL {

    public static void main(String args[]) {
	
		// Determine input source
		java.io.InputStream infile;
		if (args.length < 1) {
		  infile = System.in;
		} 
		else try {  
		   infile = new java.io.FileInputStream(args[0]);
		} catch (java.io.FileNotFoundException e) {
		    System.out.println("File " + args[0] + " not found."); 
		    return;
		} 
	
		// Instantiate scanner for this input
		HLTokenManager scanner;
		scanner = new HLTokenManager(new SimpleCharStream(infile));
	
		// Read tokens until EOF
		Token t;
		Object value;
		for (	t=scanner.getNextToken();
				t.kind != HLConstants.EOF;
		   		t = scanner.getNextToken()	) {
            System.out.println("String scanned: [" + t.image + "]");
			System.out.println("\t->Token kind: " +
				(t.kind==HLConstants.STRING? "STRING": HLConstants.tokenImage[t.kind].toUpperCase()));
        	value = t.getValue();
        	System.out.println("\t->Token value: " +
            	(value instanceof String? "\""+value+"\"" : value));
		}
    }

}
