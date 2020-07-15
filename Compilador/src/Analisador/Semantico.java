package Analisador;

import Analisador.Modelos.Token;
import Analisador.Constants.Constants;
import Analisador.Erros.SemanticError;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class Semantico implements Constants {

    private final static String INT64 = "int64";
    private final static String FLOAT64 = "float64";
    private final static String BOOLEAN = "bool";
    private final static String HEXA = "hex";
    private final static String BINARY = "bin";
    private final static String STRING = "str";

    private String operador_relacional = "";
    private String tipo_var = "";
    private String valor_var = "";
    private ArrayList<String> codigo_gerado = new ArrayList<>();
    private Deque<String> pilha_tipos = new LinkedList<>();
    private Deque<String> pilha_rotulos = new LinkedList<>();
    private ArrayList<String> lista_identificadores = new ArrayList<>();
    private HashMap<String, String> tabela_simbolos = new HashMap<>();

    private String tabulacao = "";

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
            case 7:
                acao7();
                break;
            case 8:
                acao8();
                break;
            case 9:
                acao9(token);
                break;
            case 10:
                acao10();
                break;

            case 11:
                acao11();
                break;
            case 12:
                acao12();
                break;
            case 13:
                acao13();
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

            case 17:
                acao17();
                break;
            case 18:
                acao18();
                break;
            case 19:
                acao19(token);
                break;
            case 20:
                acao20(token);
                break;
            case 21:
                acao21(token);
                break;
            case 22:
                acao22();
                break;
            case 23:
                acao23();
                break;
            case 24:
                acao24();
                break;
        }
    }

    private void acao1() throws SemanticError {
        String tipo1 = pilha_tipos.pop();
        String tipo2 = pilha_tipos.pop();

        if (tipo1.equals(INT64) && tipo2.equals(INT64)) {
            pilha_tipos.push(INT64);

        } else if (tipo1.equals(FLOAT64) && tipo2.equals(FLOAT64)) {
            pilha_tipos.push(FLOAT64);

        } else if ((tipo1.equals(INT64) && tipo2.equals(FLOAT64)) || (tipo1.equals(FLOAT64) && tipo2.equals(INT64))) {
            pilha_tipos.push(FLOAT64);

        } else if (tipo1.equals(BINARY) && tipo2.equals(BINARY)) {
            pilha_tipos.push(BINARY);

        } else if (tipo1.equals(HEXA) && tipo2.equals(HEXA)) {
            pilha_tipos.push(HEXA);

        } else {
            throw new SemanticError("tipos incompatíveis em expressão aritmética");
        }

        construtorCodigo("add");

    }

    private void acao2() throws SemanticError {
        String tipo1 = pilha_tipos.pop();
        String tipo2 = pilha_tipos.pop();

        if (tipo1.equals(INT64) && tipo2.equals(INT64)) {
            pilha_tipos.push(INT64);

        } else if (tipo1.equals(FLOAT64) && tipo2.equals(FLOAT64)) {
            pilha_tipos.push(FLOAT64);

        } else if ((tipo1.equals(INT64) && tipo2.equals(FLOAT64)) || (tipo1.equals(FLOAT64) && tipo2.equals(INT64))) {
            pilha_tipos.push(FLOAT64);

        } else if (tipo1.equals(BINARY) && tipo2.equals(BINARY)) {
            pilha_tipos.push(BINARY);

        } else if (tipo1.equals(HEXA) && tipo2.equals(HEXA)) {
            pilha_tipos.push(HEXA);

        } else {
            throw new SemanticError("tipos incompatíveis em expressão aritmética");
        }

        construtorCodigo("sub");

    }

    private void acao3() throws SemanticError {
        String tipo1 = pilha_tipos.pop();
        String tipo2 = pilha_tipos.pop();

        if (tipo1.equals(INT64) && tipo2.equals(INT64)) {
            pilha_tipos.push(INT64);

        } else if (tipo1.equals(FLOAT64) && tipo2.equals(FLOAT64)) {
            pilha_tipos.push(FLOAT64);

        } else if ((tipo1.equals(INT64) && tipo2.equals(FLOAT64)) || (tipo1.equals(FLOAT64) && tipo2.equals(INT64))) {
            pilha_tipos.push(FLOAT64);

        } else if (tipo1.equals(BINARY) && tipo2.equals(BINARY)) {
            pilha_tipos.push(BINARY);

        } else if (tipo1.equals(HEXA) && tipo2.equals(HEXA)) {
            pilha_tipos.push(HEXA);

        } else {
            throw new SemanticError("tipos incompatíveis em expressão aritmética");
        }

        construtorCodigo("mul");
    }

    private void acao4() throws SemanticError {
        String tipo1 = pilha_tipos.pop();
        String tipo2 = pilha_tipos.pop();

        if (tipo1.equals(INT64) && tipo2.equals(INT64)) {
            pilha_tipos.push(FLOAT64);

        } else if (tipo1.equals(FLOAT64) && tipo2.equals(FLOAT64)) {
            pilha_tipos.push(FLOAT64);

        } else if ((tipo1.equals(INT64) && tipo2.equals(FLOAT64)) || (tipo1.equals(FLOAT64) && tipo2.equals(INT64))) {
            pilha_tipos.push(FLOAT64);

        } else if (tipo1.equals(BINARY) && tipo2.equals(BINARY)) {
            pilha_tipos.push(BINARY);

        } else if (tipo1.equals(HEXA) && tipo2.equals(HEXA)) {
            pilha_tipos.push(HEXA);

        } else {
            throw new SemanticError("tipos incompatíveis em expressão aritmética");
        }

        construtorCodigo("div");
    }

    private void acao5(Token token) {
        pilha_tipos.push(INT64);
        construtorCodigo(token, "ldc.r8");
    }

    private void acao6(Token token) {
        pilha_tipos.push(FLOAT64);
        construtorCodigo(token, "ldc.r8");
    }

    private void acao7() throws SemanticError {
        String tipo = pilha_tipos.pop();
        if (tipo.equals(FLOAT64) || tipo.equals(INT64)) {
            pilha_tipos.push(tipo);
        } else {
            throw new SemanticError("tipos incompatíveis em expressão aritmética");
        }
    }

    private void acao8() throws SemanticError {
        String tipo = pilha_tipos.pop();
        if (tipo.equals(FLOAT64) || tipo.equals(INT64)) {
            pilha_tipos.push(tipo);
        } else {
            throw new SemanticError("tipos incompatíveis em expressão aritmética");
        }

        construtorCodigo("ldc.r8 -1");
        construtorCodigo("mul");
    }

    private void acao9(Token token) {
        operador_relacional = token.getLexeme();
    }

    private void acao10() throws SemanticError {
        String tipo1 = pilha_tipos.pop();
        String tipo2 = pilha_tipos.pop();
        if ((tipo1.equals(INT64) || tipo1.equals(FLOAT64)) && (tipo2.equals(INT64) || tipo2.equals(FLOAT64))) {
            pilha_tipos.push(BOOLEAN);
        } else if (tipo1.equals(STRING) && tipo2.equals(STRING)) {
            pilha_tipos.push(BOOLEAN);
        } else {
            throw new SemanticError("tipos incompatíveis em expressão relacional");
        }

        switch (operador_relacional) {
            case "==":
                construtorCodigo("ceq");
                break;
            case "<":
                construtorCodigo("clt");
                break;
            case ">":
                construtorCodigo("cgt");
                break;
            case "!=":
                construtorCodigo("ceq");
                construtorCodigo("ldc.i4.1");
                construtorCodigo("xor");
                break;
            default:
                break;
        }

    }

    private void acao11() {
        pilha_tipos.push(BOOLEAN);
        construtorCodigo("ldc.i4.1");
    }

    private void acao12() {
        pilha_tipos.push(BOOLEAN);
        construtorCodigo("ldc.i4.0");
    }

    private void acao13() throws SemanticError {
        String tipo = pilha_tipos.pop();
        if (tipo.equals(BOOLEAN)) {
            pilha_tipos.push(tipo);
        } else {
            throw new SemanticError("tipo(s) incompatível(is) em expressão lógica");
        }

        construtorCodigo("ldc.i4.1");
        construtorCodigo("xor");
    }

    private void acao14() {
        String tipo = pilha_tipos.poll();
        if (tipo.equals(INT64)) {
            construtorCodigo("conv.i8");
            construtorCodigo("call void [mscorlib]System.Console::Write(" + tipo + ")");
        } else if (tipo.equals(BINARY)) {
            construtorCodigo("ldstr \"#b\"");
            construtorCodigo("call void [mscorlib]System.Console::Write(string)");
            construtorCodigo("ldc.i4 2");
            construtorCodigo("call string [mscorlib]System.Convert::ToString(int64, int32)");
            construtorCodigo("call void [mscorlib]System.Console::Write(string)");
        } else if (tipo.equals(HEXA)) {
            construtorCodigo("ldstr \"#x\"");
            construtorCodigo("call void [mscorlib]System.Console::Write(string)");
            construtorCodigo("ldc.i4 16");
            construtorCodigo("call string [mscorlib]System.Convert::ToString(int64, int32)");
            construtorCodigo("call void [mscorlib]System.Console::Write(string)");
        } else if (tipo.equals(STRING)) {
            construtorCodigo("call void [mscorlib]System.Console::Write(string)");
        } else if (tipo.equals(FLOAT64)) {
            construtorCodigo("call void [mscorlib]System.Console::Write(float64)");
        } else if (tipo.equals(BOOLEAN)) {
            construtorCodigo("call void [mscorlib]System.Console::Write(bool)");
        }
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

    private void acao17() throws SemanticError {
        String tipo1 = pilha_tipos.pop();
        String tipo2 = pilha_tipos.pop();

        if (tipo1.equals(BOOLEAN) && tipo2.equals(BOOLEAN)) {
            pilha_tipos.push(BOOLEAN);

        } else {
            throw new SemanticError("tipo(s) incompatível(is) em expressão lógica");
        }

        construtorCodigo("and");

    }

    private void acao18() throws SemanticError {
        String tipo1 = pilha_tipos.pop();
        String tipo2 = pilha_tipos.pop();

        if (tipo1.equals(BOOLEAN) && tipo2.equals(BOOLEAN)) {
            pilha_tipos.push(BOOLEAN);

        } else {
            throw new SemanticError("tipo(s) incompatível(is) em expressão lógica");
        }

        construtorCodigo("or");

    }

    private void acao19(Token token) {
        pilha_tipos.push(STRING);
        construtorCodigo(token, "ldstr ");
    }

    private void acao20(Token token) {
        pilha_tipos.push(BINARY);
        construtorCodigo("ldstr \"100\"");
        construtorCodigo("ldc.i4 2");
        construtorCodigo("call int64 [mscorlib]System.Convert::ToInt64(string, int32)");
    }

    private void acao21(Token token) {
        pilha_tipos.push(HEXA);
        construtorCodigo("ldstr \"lf\"");
        construtorCodigo("ldc.i4 16");
        construtorCodigo("call int64 [mscorlib]System.Convert::ToInt64(string, int32)");
    }

    private void acao22() throws SemanticError {
        String tipo = pilha_tipos.pop();
        if (tipo.equals(BINARY) || tipo.equals(HEXA)) {
            pilha_tipos.push(INT64);
        } else {
            throw new SemanticError("tipo incompatível em operação de conversão de valor");
        }
        construtorCodigo("conv.r8");
    }

    private void acao23() throws SemanticError {
        String tipo = pilha_tipos.pop();
        if (tipo.equals(INT64) || tipo.equals(HEXA)) {
            pilha_tipos.push(BINARY);
        } else {
            throw new SemanticError("tipo incompatível em operação de conversão de valor");
        }
        construtorCodigo("conv.r8");
    }

    private void acao24() throws SemanticError {
        String tipo = pilha_tipos.pop();
        if (tipo.equals(INT64) || tipo.equals(BINARY)) {
            pilha_tipos.push(HEXA);
        } else {
            throw new SemanticError("tipo incompatível em operação de conversão de valor");
        }
        construtorCodigo("conv.r8");
    }
    
    private void acao30(Token token) {
        tipo_var = token.getLexeme();
    }
    
    private void acao31() {
        switch (tipo_var){
            case "int":
             tabela_simbolos.put("int", INT64);
                break;
        }
    }
    
    

    public ArrayList<String> getCodigo() {
        return this.codigo_gerado;
    }

    private void construtorCodigo(Token token, String codigo) {
        this.codigo_gerado.add("    " + tabulacao + codigo + " " + token.getLexeme() + System.getProperty("line.separator"));
    }

    private void construtorCodigo(Token token, String codigo, String encapsulamento) {
        this.codigo_gerado.add("    " + tabulacao + codigo + encapsulamento + token.getLexeme() + encapsulamento + System.getProperty("line.separator"));
    }

    private void construtorCodigo(String codigo) {
        this.codigo_gerado.add("    " + tabulacao + codigo + System.getProperty("line.separator"));
    }

    private void construtorCodigo(String codigo, int espacos) {
        for (int i = espacos; i > 0; i--) {
            this.codigo_gerado.add(" ");
        }

        this.codigo_gerado.add(codigo + System.getProperty("line.separator"));
    }
}
