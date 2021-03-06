package ece351.w.rdescent;

import ece351.util.Lexer;

public final class WRecursiveDescentRecognizer {
    private final Lexer lexer;

    public WRecursiveDescentRecognizer(final Lexer lexer) {
        this.lexer = lexer;
    }

    public static void recognize(final String input) {
    	final WRecursiveDescentRecognizer r = new WRecursiveDescentRecognizer(new Lexer(input));
        r.recognize();
    }

    /**
     * Throws an exception to reject.
     */
    public void recognize() {
        program();
    }

    public void program() {
        waveform();
        while (!lexer.inspectEOF()) {
            waveform();
        }
        lexer.consumeEOF();
    }

    public void waveform() {
// TODO: 10 lines snipped
    	while(lexer.inspectID())
    		lexer.consumeID();
    	if(lexer.inspect(":"))
    		lexer.consume(":");
    	while(lexer.inspect("0", "1"))
    		lexer.consume("0","1");
    	//if(lexer.inspect(";"))
    		lexer.consume(";");
//throw new ece351.util.Todo351Exception();
    }
}
