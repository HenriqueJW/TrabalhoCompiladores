package Analisador;

import Analisador.Constants.Constants;
import Analisador.Modelos.Token;

import Analisador.Erros.SemanticError;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class Semantico implements Constants {

    private final static String INT64 = "int64";
    private final static String FLOAT64 = "float64";
    private final static String BOOLEAN = "bool";
    private final static String HEXA = "hexa";
    private final static String BINARY = "bin";
    private final static String STRING = "string";

    private final static String SEPARADOR_LINHAS = System.getProperty("line.separator");

    private String operador_relacional = "";
    private String operador = "";
    private String tipo_var = "";
    private String tipo_valor_var = "";
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
            case 30:
                acao30(token);
                break;
            case 31:
                acao31();
                break;
            case 32:
                acao32(token);
                break;
            case 33:
                acao33(token);
                break;
            case 34:
                acao34();
                break;
            case 35:
                acao35();
                break;
            case 36:
                acao36(token);
                break;
            case 37:
                acao37();
                break;
            case 38:
                acao38(token);
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
        construtorCodigo(token, "ldc.r8");
        pilha_tipos.push(INT64);
    }

    private void acao6(Token token) {
        construtorCodigo(token, "ldc.r8");
        pilha_tipos.push(FLOAT64);
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
        construtorCodigo("ldc.i4.1");
        pilha_tipos.push(BOOLEAN);
    }

    private void acao12() {
        construtorCodigo("ldc.i4.0");
        pilha_tipos.push(BOOLEAN);
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
        switch (tipo) {
            case INT64:
                construtorCodigo("conv.i8");
                construtorCodigo("call void [mscorlib]System.Console::Write(" + tipo + ")");
                break;
            case BINARY:
                construtorCodigo("ldstr \"#b\"");
                construtorCodigo("call void [mscorlib]System.Console::Write(string)");
                construtorCodigo("ldc.i4 2");
                construtorCodigo("call string [mscorlib]System.Convert::ToString(int64, int32)");
                construtorCodigo("call void [mscorlib]System.Console::Write(string)");
                break;
            case HEXA:
                construtorCodigo("ldstr \"#x\"");
                construtorCodigo("call void [mscorlib]System.Console::Write(string)");
                construtorCodigo("ldc.i4 16");
                construtorCodigo("call string [mscorlib]System.Convert::ToString(int64, int32)");
                construtorCodigo("call void [mscorlib]System.Console::Write(string)");
                break;
            case STRING:
                construtorCodigo("call void [mscorlib]System.Console::Write(string)");
                break;
            case FLOAT64:
                construtorCodigo("call void [mscorlib]System.Console::Write(float64)");
                break;
            case BOOLEAN:
                construtorCodigo("call void [mscorlib]System.Console::Write(bool)");
                break;
            default:
                break;
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
        construtorCodigo(token, "ldstr ");
        pilha_tipos.push(STRING);
    }

    private void acao20(Token token) {
        pilha_tipos.push(BINARY);
        construtorCodigo("ldstr \"" + token.getLexeme().replace("#b", "").replace("#B", "") + "\"");
        construtorCodigo("ldc.i4 2");
        construtorCodigo("call int64 [mscorlib]System.Convert::ToInt64(string, int32)");
    }

    private void acao21(Token token) {
        pilha_tipos.push(HEXA);
        construtorCodigo("ldstr \"" + token.getLexeme().replace("#x", "").replace("#X", "") + "\"");
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
        construtorCodigo("conv.i8");
    }

    private void acao24() throws SemanticError {
        String tipo = pilha_tipos.pop();
        if (tipo.equals(INT64) || tipo.equals(BINARY)) {
            pilha_tipos.push(HEXA);
        } else {
            throw new SemanticError("tipo incompatível em operação de conversão de valor");
        }
        construtorCodigo("conv.i8");
    }

    private void acao30(Token token) {
        tipo_var = token.getLexeme();
    }

    private void acao31() throws SemanticError {
        String codigo_declaracao = ".locals(";
        for (String id : lista_identificadores) {
            if (tabela_simbolos.containsKey(id)) {
                throw new SemanticError(id + "já declarado");
            }
            if (tipo_var.equals("float")) {
                tabela_simbolos.put(id, FLOAT64);
                codigo_declaracao += FLOAT64 + " " + id + ", ";
            } else if (tipo_var.equals("int")) {
                tabela_simbolos.put(id, INT64);
                codigo_declaracao += INT64 + " " + id + ", ";
            } else if (tipo_var.equals("str")) {
                tabela_simbolos.put(id, STRING);
                codigo_declaracao += STRING + " " + id + ", ";
            } else if (tipo_var.equals("bin")) {
                tabela_simbolos.put(id, tipo_var);
                codigo_declaracao += INT64 + " " + id + ", ";
            } else if (tipo_var.equals("hexa")) {
                tabela_simbolos.put(id, tipo_var);
                codigo_declaracao += INT64 + " " + id + ", ";
            } else {
                tabela_simbolos.put(id, tipo_var);
                codigo_declaracao += tipo_var + " " + id + ", ";
            }
        }

        codigo_declaracao = codigo_declaracao.substring(0, codigo_declaracao.length() - 2);
        codigo_declaracao += ")";
        construtorCodigo(codigo_declaracao);
        lista_identificadores.clear();

    }

    private void acao32(Token token) {
        lista_identificadores.add(token.getLexeme());
    }

    private void acao33(Token token) throws SemanticError {
        String id = token.getLexeme();
        if (!tabela_simbolos.containsKey(id)) {
            throw new SemanticError(id + "não declarado");
        }
        String tipoid = tabela_simbolos.get(id);
        pilha_tipos.push(tipoid);
        construtorCodigo("ldloc " + id);
        if (tipoid.equals(INT64)) {
            construtorCodigo("conv.r8");
        }

    }

    private void acao34() {
        if (operador.equals("=")) {
            for (int i = 0; i < lista_identificadores.size(); i++) {

                construtorCodigo(!(i == lista_identificadores.size() - 1) ? "dup" : "");
                construtorCodigo((tabela_simbolos.get(lista_identificadores.get(i)).equals(INT64)) ? "conv.i8" : "");
                construtorCodigo("stloc " + lista_identificadores.get(i));

            }

        } else if (operador.equals("+=")) {

            for (int i = 0; i < lista_identificadores.size(); i++) {
                
                construtorCodigo((i == lista_identificadores.size() -1) ? "" : "dup");
                if (tabela_simbolos.get(lista_identificadores.get(i)).equals(INT64)) {
                    construtorCodigo("ldloc " + lista_identificadores.get(i));
                    construtorCodigo("conv.r8");
                } else {
                    construtorCodigo("ldloc " + lista_identificadores.get(i));
                }
                construtorCodigo("add");
                construtorCodigo((tabela_simbolos.get(lista_identificadores.get(i)).equals(INT64)) ? "conv.i8" : "");
                construtorCodigo("stloc " + lista_identificadores.get(i));
            }
        } else if (operador.equals("-=")) {

            for (int i = 0; i < lista_identificadores.size(); i++) {
                construtorCodigo((i == lista_identificadores.size() -1) ? "" : "dup");
                if (tabela_simbolos.get(lista_identificadores.get(i)).equals(INT64)) {
                    construtorCodigo("ldloc " + lista_identificadores.get(i));
                    construtorCodigo("conv.r8");
                } else {
                    construtorCodigo("ldloc " + lista_identificadores.get(i));
                }
                construtorCodigo("sub");
                construtorCodigo((tabela_simbolos.get(lista_identificadores.get(i)).equals(INT64)) ? "conv.i8\n" : "");
                construtorCodigo("stloc " + lista_identificadores.get(i));
            }
        }
        lista_identificadores.clear();
    }

    private void acao35() {
        for (String id : lista_identificadores) {
            String classe = tabela_simbolos.get(id);
            if (classe.equals(BOOLEAN)) {
                classe = "Boolean";
            } else if (classe.equals(INT64)) {
                classe = "Int64";
            } else if (classe.equals(FLOAT64)) {
                classe = "Double";
            }
            construtorCodigo("call string [mscorlib]System.Console::ReadLine()");

            if (tabela_simbolos.get(id).equals(HEXA)) {
                construtorCodigo("ldc.i4 16");
                construtorCodigo("call int64 [mscorlib]System.Convert::ToInt64(string, int32)");
            } else if (tabela_simbolos.get(id).equals(BINARY)) {
                construtorCodigo("ldc.i4 2");
                construtorCodigo("call int64 [mscorlib]System.Convert::ToInt64(string, int32)");
            }

            construtorCodigo("stloc " + id);
        }
        lista_identificadores.clear();
    }

    private void acao36(Token token) {
        switch (token.getId()) {
            case 3:
                tipo_valor_var = INT64;
                break;
            case 4:
                tipo_valor_var = FLOAT64;
                break;
            case 5:
                tipo_valor_var = BINARY;
                break;
            case 6:
                tipo_valor_var = HEXA;
                break;
            case 7:
                tipo_valor_var = STRING;
                break;
            case 22:
                tipo_valor_var = BOOLEAN;
                break;
            case 23:
                tipo_valor_var = BOOLEAN;
                break;
            default:
                break;

        }
        valor_var = token.getLexeme()
                .replace("#x", "")
                .replace("#X", "")
                .replace("#b", "")
                .replace("#B", "");
    }

    private void acao37() throws SemanticError {
        String codigo_declaracao = ".locals(";
        String codigo_valor = "";
        for (String id : lista_identificadores) {
            if (tabela_simbolos.containsKey(id)) {
                throw new SemanticError(id + "já declarado");
            }
            if (tipo_valor_var.equals(INT64) || tipo_valor_var.equals(FLOAT64)) {
                tabela_simbolos.put(id, tipo_valor_var);
                codigo_declaracao += tipo_valor_var + " " + id + ", ";
                codigo_valor += "ldc.r8 " + valor_var + SEPARADOR_LINHAS
                        + "stloc " + id + SEPARADOR_LINHAS;
            } else if (tipo_valor_var.equals(BOOLEAN)) {
                tabela_simbolos.put(id, tipo_valor_var);
                codigo_declaracao += tipo_valor_var + " " + id + ", ";
                codigo_valor += "ldc.i4." + (valor_var.equals("true") ? "1" : "0") + SEPARADOR_LINHAS
                        + "stloc " + id + SEPARADOR_LINHAS;
            } else if (tipo_valor_var.equals(STRING)) {
                tabela_simbolos.put(id, tipo_valor_var);
                codigo_declaracao += tipo_valor_var + " " + id + ", ";
                codigo_valor += "ldstr " + "\"" + valor_var + "\"" + SEPARADOR_LINHAS
                        + "stloc " + id + SEPARADOR_LINHAS;
            } else if (tipo_valor_var.equals(BINARY)) {
                tabela_simbolos.put(id, tipo_valor_var);
                codigo_declaracao += INT64 + " " + id + ", ";
                codigo_valor += "ldstr \"" + valor_var + "\"" + SEPARADOR_LINHAS
                        + "ldc.i4 2" + SEPARADOR_LINHAS
                        + "call int64 [mscorlib]System.Convert::ToInt64(string, int32)" + SEPARADOR_LINHAS
                        + "stloc " + id + SEPARADOR_LINHAS;
            } else if (tipo_valor_var.equals(HEXA)) {
                tabela_simbolos.put(id, tipo_valor_var);
                codigo_declaracao += INT64 + " " + id + ", ";
                codigo_valor += "ldstr \"" + valor_var + "\"" + SEPARADOR_LINHAS
                        + "ldc.i4 16" + SEPARADOR_LINHAS
                        + "call int64 [mscorlib]System.Convert::ToInt64(string, int32)" + SEPARADOR_LINHAS
                        + "stloc " + id + SEPARADOR_LINHAS;
            }

        }

        codigo_declaracao = codigo_declaracao.substring(0, codigo_declaracao.length() - 2);
        codigo_declaracao += ")";
        construtorCodigo(codigo_declaracao);
        construtorCodigo(codigo_valor);
        lista_identificadores.clear();

    }

    private void acao38(Token token) throws SemanticError {
        String codigo = "";
        operador = token.getLexeme();
        if (operador.equals("+=")
                || operador.equals("-=")) {
            for (String id : lista_identificadores) {
                if (!tabela_simbolos.containsKey(id)) {
                    throw new SemanticError(id + "não declarado");
                }

                if (tabela_simbolos.get(id).equals(INT64)) {
//                    construtorCodigo("ldloc " + id);
//                    construtorCodigo("conv.r8");
                } else {
//                    construtorCodigo("ldloc " + id);
                }

            }
        }
//        construtorCodigo(codigo);
    }

    public ArrayList<String> getCodigo() {
        return this.codigo_gerado;
    }

    private void construtorCodigo(Token token, String codigo) {
        this.codigo_gerado.add("    " + tabulacao + codigo + " " + token.getLexeme() + SEPARADOR_LINHAS);
    }

    private void construtorCodigo(Token token, String codigo, String encapsulamento) {
        this.codigo_gerado.add("    " + tabulacao + codigo + encapsulamento + token.getLexeme() + encapsulamento + SEPARADOR_LINHAS);
    }

    private void construtorCodigo(String codigo) {
        this.codigo_gerado.add("    " + tabulacao + codigo + SEPARADOR_LINHAS);
    }

    private void construtorCodigo(String codigo, int espacos) {
        for (int i = espacos; i > 0; i--) {
            this.codigo_gerado.add(" ");
        }

        this.codigo_gerado.add(codigo + SEPARADOR_LINHAS);
    }
}
