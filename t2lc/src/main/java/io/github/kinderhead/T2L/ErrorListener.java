package io.github.kinderhead.T2L;

import io.github.kinderhead.T2L.ANTLR.t2lLexer;
import io.github.kinderhead.T2L.execution.T2LError;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class ErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        Token offSymbol = (Token) offendingSymbol;

        String offSymName;
        if (offSymbol != null) {
            offSymName = t2lLexer.VOCABULARY.getSymbolicName(offSymbol.getType());
        } else {
            offSymName = "<lexer error>";
        }

        new T2LError(msg + " at " + offSymName, line, charPositionInLine).runWithoutFail();
    }
}
