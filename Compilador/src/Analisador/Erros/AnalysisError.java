package Analisador.Erros;

import Analisador.Token;

public class AnalysisError extends Exception
{
    private int position;
    private Token token;

    public AnalysisError(String msg, int position)
    {
        super(msg);
        this.position = position;
    }

    public AnalysisError(String msg, int position, Token token)
    {
        super(msg);
        this.position = position;
        this.token = token;
    }

    public AnalysisError(String msg)
    {
        super(msg);
        this.position = -1;
    }

    public int getPosition()
    {
        return position;
    }

    public Token getToken() {
        return token;
    }
    
    

    public String toString()
    {
        return super.toString() + ", @ "+position;
    }
}
