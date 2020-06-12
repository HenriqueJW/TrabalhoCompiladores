package AnalisadorLexico;

public interface ParserConstants {

    int START_SYMBOL = 49;

    int FIRST_NON_TERMINAL = 49;
    int FIRST_SEMANTIC_ACTION = 87;

    int[][] PARSER_TABLE
            = {
                {-1, -1, -1, -1, -1, -1, -1, 0, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, 2, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 11, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 13, -1, -1, -1, -1, -1, 14, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, 17, -1, -1},
                {-1, 3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 3, -1, -1, -1, 3, -1, -1, -1, 3, 3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, 5, 5, 5, 4, 5, -1, -1, 4, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 6, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, -1, -1, -1, 9, -1, -1, -1, 7, 8, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 35, 36, 37},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 48, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, 22, 20, -1, 19, 23, 18, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, 24, 25, 29, 30, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 27, 26, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, 32, -1, -1, 33, 33, 33, 33},
                {-1, 49, 49, 49, 49, 49, 49, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 49, 49, -1, -1, -1, -1, -1, 49, -1, -1, 49, -1, -1, -1, -1, -1, 49, 49, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 40, 40, 40, 40, 40, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, 40, -1, -1, -1, -1, -1, 40, -1, -1, 40, -1, -1, -1, -1, -1, 40, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, 45, -1, 45, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 46, -1, 47, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 53, 53, 53, 53, 53, 53, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 55, 54, -1, -1, -1, -1, -1, 56, -1, -1, 53, -1, -1, -1, -1, -1, 53, 53, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 57, 57, 57, 57, 57, 57, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 57, -1, -1, -1, -1, -1, 57, 57, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, 58, 58, -1, 59, 58, 58, 59, 59, -1, -1, -1, -1, 59, -1, 59, 59, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, 63, -1, -1, 60, 61, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 64, 64, 64, 64, 64, 64, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 64, -1, -1, -1, -1, -1, 64, 64, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 68, 68, 68, 68, 68, 68, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 68, -1, -1, -1, -1, -1, 68, 68, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 72, 72, 72, 72, 72, 72, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 72, -1, -1, -1, -1, -1, 72, 72, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 73, -1, -1, -1, -1, -1, -1, -1, -1, 73, 73, -1, 73, 73, 73, 73, 73, 73, 73, 73, 73, 73, 74, 73, 73, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 75, 76, 77, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 78, 79, 80, 82, 83, 81, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 84, -1, -1, -1, -1, -1, 85, 86, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 52, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 52, -1, -1, 50, 51, -1, -1, -1, -1, 52, -1, 52, 52, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 67, -1, -1, -1, -1, -1, -1, -1, -1, 67, 67, -1, 67, 67, 67, 67, 67, 65, 66, -1, -1, 67, -1, 67, 67, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 71, -1, -1, -1, -1, -1, -1, -1, -1, 71, 71, -1, 71, 71, 71, 71, 71, 71, 71, 69, 70, 71, -1, 71, 71, -1, -1, -1}
            };

    int[][] PRODUCTIONS
            = {
                {50, 8, 56, 21},
                {51},
                {0},
                {58, 44, 57},
                {56},
                {0},
                {59},
                {61},
                {62},
                {63},
                {64},
                {11, 52},
                {54, 53},
                {52},
                {0},
                {65, 55},
                {45, 66, 44},
                {46, 67, 44},
                {14},
                {12},
                {10},
                {15},
                {9},
                {13},
                {3},
                {4},
                {23},
                {22},
                {7},
                {5},
                {6},
                {2, 68},
                {42, 2, 68},
                {0},
                {65, 60},
                {46, 69},
                {47, 69},
                {48, 69},
                {24, 32, 65, 33},
                {25, 32, 70, 33},
                {69, 71},
                {42, 69, 71},
                {0},
                {20, 69, 45, 56, 72, 73, 21},
                {18, 69, 45, 56, 72},
                {0},
                {19, 56},
                {0},
                {16, 56, 17, 45, 69, 21},
                {74, 84},
                {36, 74, 84},
                {37, 74, 84},
                {0},
                {75},
                {23},
                {22},
                {29, 74},
                {78, 76},
                {77, 78},
                {0},
                {34},
                {35},
                {30},
                {31},
                {79, 85},
                {38, 79, 85},
                {39, 79, 85},
                {0},
                {80, 86},
                {40, 80, 86},
                {41, 80, 86},
                {0},
                {83, 81},
                {0},
                {43, 82},
                {26},
                {27},
                {28},
                {2},
                {3},
                {4},
                {7},
                {5},
                {6},
                {32, 69, 33},
                {38, 83},
                {39, 83}
            };

    String[] PARSER_ERROR
            = {
                "",
                //        "Era esperado fim de programa",
                "encontrado ¨ esperado EOF",
                //        "Era esperado id",
                "encontrado ¨ esperado identificador",
                //        "Era esperado cte_int",
                "encontrado ¨ esperado constante inteira",
                //        "Era esperado real",
                "encontrado ¨ esperado constante real",
                //        "Era esperado cte_bin",
                "encontrado ¨ esperado constante binária",
                //        "Era esperado cte_hexa",
                "encontrado ¨ esperado constante hexa",
                //        "Era esperado cte_str",
                "encontrado ¨ esperado constante string",
                //        "Era esperado principal",
                "encontrado ¨ esperado main",
                //        "Era esperado dec_bin",
                "encontrado ¨ esperado bin",
                //        "Era esperado dec_bool",
                "encontrado ¨ esperado bool",
                //        "Era esperado dec_def",
                "encontrado ¨ esperado def",
                //        "Era esperado dec_float",
                "encontrado ¨ esperado float",
                //        "Era esperado dec_hexa",
                "encontrado ¨ esperado hexa",
                //        "Era esperado dec_int",
                "encontrado ¨ esperado int",
                //        "Era esperado dec_str",
                "encontrado ¨ esperado str",
                //        "Era esperado laco_do",
                "encontrado ¨ esperado do",
                //        "Era esperado laco_whileFalse",
                "encontrado ¨ esperado whileFalse",
                //        "Era esperado cond_elif",
                "encontrado ¨ esperado elif",
                //        "Era esperado cond_else",
                "encontrado ¨ esperado else",
                //        "Era esperado cond_if",
                "encontrado ¨ esperado if",
                //        "Era esperado fim_end",
                "encontrado ¨ esperado end",
                //        "Era esperado bool_false",
                "encontrado ¨ esperado false",
                //        "Era esperado bool_true",
                "encontrado ¨ esperado true",
                //        "Era esperado com_listen",
                "encontrado ¨ esperado listen",
                //        "Era esperado com_speak",
                "encontrado ¨ esperado speak",
                //        "Era esperado com_toInt",
                "encontrado ¨ esperado toInt",
                //        "Era esperado com_toBin",
                "encontrado ¨ esperado toBin",
                //        "Era esperado com_toHexa",
                "encontrado ¨ esperado toHexa",
                //        "Era esperado \"!\"",
                "encontrado ¨ esperado !",
                //        "Era esperado \"<\"",
                "encontrado ¨ esperado <",
                //        "Era esperado \">\"",
                "encontrado ¨ esperado >",
                //        "Era esperado \"(\"",
                "encontrado ¨ esperado (",
                //        "Era esperado \")\"",
                "encontrado ¨ esperado )",
                //        "Era esperado \"==\"",
                "encontrado ¨ esperado ==",
                //        "Era esperado \"!=\"",
                "encontrado ¨ esperado !=",
                //        "Era esperado \"&\"",
                "encontrado ¨ esperado &",
                //        "Era esperado \"|\"",
                "encontrado ¨ esperado |",
                //        "Era esperado \"+\"",
                "encontrado ¨ esperado +",
                //        "Era esperado \"-\"",
                "encontrado ¨ esperado -",
                //        "Era esperado \"*\"",
                "encontrado ¨ esperado *",
                //        "Era esperado \"/\"",
                "encontrado ¨ esperado /",
                //        "Era esperado \",\"",
                "encontrado ¨ esperado ,",
                //        "Era esperado \".\"",
                "encontrado ¨ esperado .",
                //        "Era esperado \";\"",
                "encontrado ¨ esperado ;",
                //        "Era esperado \":\"",
                "encontrado ¨ esperado :",
                //        "Era esperado \"=\"",
                "encontrado ¨ esperado =",
                //        "Era esperado \"+=\"",
                "encontrado ¨ esperado +=",
                //        "Era esperado \"-=\"",
                "encontrado ¨ esperado -=",
                //        "<forma_geral_prog> inv�lido",
                "encontrado ¨ esperado main def",
                //"<declaracao_ou_nao> inv�lido",
                "encontrado ¨ esperado main def",
                //"<declaracao> inv�lido",
                "encontrado ¨ esperado def",
                //"<declaracao_de_variaveis> inv�lido",
                "encontrado ¨ esperado identificador",
                //"<declaracao_de_variaveis1> inv�lido",
                "encontrado ¨ esperado identificador main",
                //"<variavel> inv�lido",
                "encontrado ¨ esperado identificador",
                //"<variavel1> inv�lido",
                "encontrado ¨ esperado : =",
                //"<lista_comando> inv�lido",
                "encontrado ¨ esperado identificador do if listen speak",
                //"<lista_comando1> inv�lido",
                "encontrado ¨ esperado identificador do whileFalse elif else if end listen speak",
                //"<comando> inv�lido",
                "encontrado ¨ esperado identificador do if listen speak",
                //"<comando_atribuicao> inv�lido",
                "encontrado ¨ esperado identificador",
                //              "<comando_atribuicao1> inv�lido",
                "encontrado ¨ esperado operador de atribuição",
                //                "<entrada_dados> inv�lido",
                "encontrado ¨ esperado listen",
                //                "<saida_dados> inv�lido",
                "encontrado ¨ esperado speak",
                //                "<comando_selecao> inv�lido",
                "encontrado ¨ esperado if",
                //                "<comando_repeticao> inv�lido",
                "encontrado ¨ esperado do",
                //                "<lista_id> inv�lido",
                "encontrado ¨ esperado identificador",
                //                "<tipo> inv�lido",
                "encontrado ¨ esperado tipo",
                //                "<valor> inv�lido",
                "encontrado ¨ esperado uma constante",
                //                "<mais_id> inv�lido",
                "encontrado ¨ esperado ) , : operador de atribuição",
                //                "<expressao> inv�lido",
                "encontrado ¨ esperada uma expressão",
                //                "<lista_expressoes> inv�lido",
                "encontrado ¨ esperada uma expressão",
                //                "<mais_expressoes> inv�lido",
                "encontrado ¨ esperado ) ,",
                //                "<elif> inv�lido",
                "encontrado ¨ esperado elif else end",
                //                "<else> inv�lido",
                "encontrado ¨ esperado else end",
                //                "<elemento> inv�lido",
                "encontrado ¨ esperada uma expressão",
                //                "<relacional> inv�lido",
                "encontrado ¨ esperada uma expressão",
                //                "<relacional1> inv�lido",
                "encontrado ¨ esperada uma expressão",
                //                "<operador_relacional> inv�lido",
                "encontrado ¨ esperada uma expressão",
                //                "<aritmetica> inv�lido",
                "encontrado ¨ esperada uma expressão",
                //                "<termo> inv�lido",
                "encontrado ¨ esperada uma expressão",
                //                "<fator> inv�lido",
                "encontrado ¨ esperada uma expressão",
                //                "<fator1> inv�lido",
                "encontrado ¨ esperada uma expressão",
                //                "<fator2> inv�lido",
                "encontrado ¨ esperada uma expressão",
                //                "<membro> inv�lido",
                "encontrado ¨ esperada uma expressão",
                //                "<expressao1> inv�lido",
                "encontrado ¨ esperada uma expressão",
                //                "<aritmetica1> inv�lido",
                "encontrado ¨ esperada uma expressão",
                //                "<termo1> inv�lido"
                "encontrado ¨ esperada uma expressão",};
}
