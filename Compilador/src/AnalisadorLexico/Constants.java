package AnalisadorLexico;

public interface Constants extends ScannerConstants
{
    int EPSILON  = 0;
    int DOLLAR   = 1;

    int t_id = 2;
    int t_cte_int = 3;
    int t_real = 4;
    int t_cte_bin = 5;
    int t_cte_hexa = 6;
    int t_cte_str = 7;
    int t_principal = 8;
    int t_dec_bin = 9;
    int t_dec_bool = 10;
    int t_dec_def = 11;
    int t_dec_hexa = 12;
    int t_dec_int = 13;
    int t_dec_str = 14;
    int t_dec_float = 15;
    int t_laco_do = 16;
    int t_laco_whileFalse = 17;
    int t_cond_elif = 18;
    int t_cond_else = 19;
    int t_cond_if = 20;
    int t_fim_end = 21;
    int t_bool_false = 22;
    int t_bool_true = 23;
    int t_com_listen = 24;
    int t_com_speak = 25;
    int t_com_toInt = 26;
    int t_com_toBin = 27;
    int t_com_toHexa = 28;
    int t_TOKEN_29 = 29; //"!"
    int t_TOKEN_30 = 30; //"<"
    int t_TOKEN_31 = 31; //">"
    int t_TOKEN_32 = 32; //"#"
    int t_TOKEN_33 = 33; //"("
    int t_TOKEN_34 = 34; //")"
    int t_TOKEN_35 = 35; //"=="
    int t_TOKEN_36 = 36; //"!="
    int t_TOKEN_37 = 37; //"&"
    int t_TOKEN_38 = 38; //"|"
    int t_TOKEN_39 = 39; //"+"
    int t_TOKEN_40 = 40; //"-"
    int t_TOKEN_41 = 41; //"*"
    int t_TOKEN_42 = 42; //"/"
    int t_TOKEN_43 = 43; //","
    int t_TOKEN_44 = 44; //"."
    int t_TOKEN_45 = 45; //";"
    int t_TOKEN_46 = 46; //":"
    int t_TOKEN_47 = 47; //"="
    int t_TOKEN_48 = 48; //"+="
    int t_TOKEN_49 = 49; //"-="

}
