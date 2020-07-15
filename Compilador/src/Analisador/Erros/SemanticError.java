package Analisador.Erros;

import Analisador.Modelos.Token;

public class SemanticError extends AnalysisError
{
    public SemanticError(String msg, int position)
	 {
        super(msg, position);
    }
    
    public SemanticError(String msg, int position, Token token)
	 {
        super(msg, position, token);
    }

    public SemanticError(String msg)
    {
        super(msg);
    }
}
