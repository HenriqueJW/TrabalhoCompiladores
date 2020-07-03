package Analisador;

import Analisador.Constants.Constants;
import Analisador.Erros.SemanticError;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Semantico implements Constants {

    private static String INT64 = "int64";
    private static String FLOAT64 = "float64";
    private static String BOOLEAN = "bool";
    
    private String tabulacao = "";
    private String operador = "";

    private Deque<String> pilha = new LinkedList<>();
    private ArrayList<String> codigo = new ArrayList<>();

    public void executeAction(int action, Token token) throws SemanticError {
        System.out.println("Ação #" + action + ", Token: " + token);
        switch (action) {
            case 1:
                acao1();
                break;
            case 2:
                acao2();
                break;
            case 3:
                acao3();
                break;
            case 4:
                acao4();
                break;
            case 5:
                acao5(token);
                break;
            case 6:
                acao6(token);
                break;

            case 14:
                acao14();
                break;

            case 15:
                acao15();
                break;

            case 16:
                acao16();
                break;
        }
    }

    private void acao1() {
        String tipo1 = pilha.pop();
        String tipo2 = pilha.pop();
        if (tipo1.equals(FLOAT64) || tipo2.equals(FLOAT64)) {
            pilha.push(FLOAT64);
        } else {
            pilha.push(INT64);
        }

        construtorCodigo("add");

    }

    private void acao2() {
        String tipo1 = pilha.pop();
        String tipo2 = pilha.pop();
        if (tipo1.equals(FLOAT64) || tipo2.equals(FLOAT64)) {
            pilha.push(FLOAT64);
        } else {
            pilha.push(INT64);
        }

        construtorCodigo("sub");
    }

    private void acao3() {
        String tipo1 = pilha.pop();
        String tipo2 = pilha.pop();
        if (tipo1.equals(FLOAT64) || tipo2.equals(FLOAT64)) {
            pilha.push(FLOAT64);
        } else {
            pilha.push(INT64);
        }

        construtorCodigo("mul");
    }

    private void acao4() throws SemanticError {
        String tipo1 = pilha.pop();
        String tipo2 = pilha.pop();
        if (tipo1.equals(tipo2)) {
            pilha.push(tipo1);
        } else {
            throw new SemanticError("Erro Semântico, divisão de tipos diferentes");
        }

        construtorCodigo("div");
    }

    private void acao5(Token token) {
        pilha.push(INT64);
        construtorCodigo(token, "ldc.r8");
    }

    private void acao6(Token token) {
        pilha.push(FLOAT64);
        construtorCodigo(token, "ldc.r8");
    }
    
    private void acao7() throws SemanticError {
        String tipo = pilha.pop();
        if(tipo.equals(FLOAT64)||tipo.equals(INT64)){
            pilha.push(tipo);
        }else{
            throw new SemanticError("Erro Semântico, operador junto à tipo inválido");
        }
    }
    
    private void acao8() throws SemanticError {
        String tipo = pilha.pop();
        if(tipo.equals(FLOAT64)||tipo.equals(INT64)){
            pilha.push(tipo);
        }else{
            throw new SemanticError("Erro Semântico, operador junto à tipo inválido");
        }
        
        construtorCodigo("ldc.r8 -1");
        construtorCodigo("mul");
    }
    
    private void acao9(Token token) throws SemanticError {
        operador = token.getLexeme();
    }
    
    private void acao10() throws SemanticError {
        String tipo1 = pilha.pop();
        String tipo2 = pilha.pop();
        if(tipo1.equals(tipo2)){
            pilha.push(BOOLEAN);
        }else{
            throw new SemanticError("Erro Semântico, operador relacional entre tipos inválidos");
        }
        
        construtorCodigo("ldc.r8 -1");
        construtorCodigo("mul");
    }

    private void acao14() {
        String tipo = pilha.poll();
        if (tipo.equals(INT64)) {
            construtorCodigo("conv.i8");
        }
        construtorCodigo("call void [mscorlib]System.Console::Write(" + tipo + ")");

    }

    private void acao15() {
        construtorCodigo(".assembly extern mscorlib {}", 0);
        construtorCodigo(".assembly _codigo_objeto{}", 1);
        construtorCodigo(".module   _codigo_objeto.exe", 2);
        construtorCodigo("", 0);
        construtorCodigo(".class public _UNICA{ ", 2);
        construtorCodigo(".method static public void _principal() {", 2);
        construtorCodigo(".entrypoint ", 3);
        construtorCodigo("", 0);

    }

    private void acao16() {
        construtorCodigo("", 0);
        construtorCodigo("ret", 3);
        construtorCodigo("}", 2);
        construtorCodigo("}", 0);

    }

    public ArrayList<String> getCodigo() {
        return this.codigo;
    }

    private void construtorCodigo(Token token, String codigo) {
        this.codigo.add("    " + tabulacao + codigo + token.getLexeme() + System.getProperty("line.separator"));
    }

    private void construtorCodigo(String codigo) {
        this.codigo.add("    " + tabulacao + codigo + System.getProperty("line.separator"));
    }

    private void construtorCodigo(String codigo, int espacos) {
        for (int i = espacos; i > 0; i--) {
            this.codigo.add(" ");
        }

        this.codigo.add(codigo + System.getProperty("line.separator"));
    }
}
