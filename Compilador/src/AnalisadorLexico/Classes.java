package AnalisadorLexico;

import java.util.HashMap;
import java.util.Map;

public enum Classes {
    identificador(new String[] {"2", null}),
    constante_inteira(new String[] {"3", null}),
    constante_real(new String[] {"4", null}),
    constante_binária(new String[] {"5", null}),
    constante_hexadecimal(new String[] {"6", null}),
    constante_string(new String[] {"7", null}),
    principal(new String[] {"8", null}),
    dec_bin(new String[] {"9", null}),
    dec_bool(new String[] {"10", null}),
    dec_def(new String[] {"11", null}),
    dec_hexa(new String[] {"12", null}),
    dec_int(new String[] {"13", null}),
    dec_str(new String[] {"14", null}),
    dec_float(new String[] {"15", null}),
    laco_do(new String[] {"16", null}),
    laco_whileFalse(new String[] {"17", null}),
    cond_elif(new String[] {"18", null}),
    cond_else(new String[] {"19", null}),
    cond_if(new String[] {"20", null}),
    fim_end(new String[] {"21", null}),
    bool_false(new String[] {"22", null}),
    bool_true(new String[] {"23", null}),
    com_listen(new String[] {"24", null}),
    com_speak(new String[] {"25", null}),
    com_toInt(new String[] {"26", null}),
    com_toBin(new String[] {"27", null}),
    com_toHexa(new String[] {"28", null}),
    TOKEN_29(new String[] {"29", "!"}), //"!"
    TOKEN_30(new String[] {"30", "<"}), //"<"
    TOKEN_31(new String[] {"31", ">"}), //">"
    TOKEN_32(new String[] {"32", "("}), //"("
    TOKEN_33(new String[] {"33", ")"}), //")"
    TOKEN_34(new String[] {"34", "=="}), //"=="
    TOKEN_35(new String[] {"35", "!="}), //"!="
    TOKEN_36(new String[] {"36", "&"}), //"&"
    TOKEN_37(new String[] {"37", "|"}), //"|"
    TOKEN_38(new String[] {"38", "+"}), //"+"
    TOKEN_39(new String[] {"39", "-"}), //"-"
    TOKEN_40(new String[] {"40", "*"}), //"*"
    TOKEN_41(new String[] {"41", "/"}), //"/"
    TOKEN_42(new String[] {"42", ","}), //","
    TOKEN_43(new String[] {"43", "."}), //"."
    TOKEN_44(new String[] {"44", ";"}), //";"
    TOKEN_45(new String[] {"45", ":"}), //":"
    TOKEN_46(new String[] {"46", "="}), //"="
    TOKEN_47(new String[] {"47", "+="}), //"+="
    TOKEN_48(new String[] {"48", "-="}); //"-="
    
    private String[] codigo;

    Classes(String[] codigo) {
        this.codigo = codigo;
    }

    public String[] getCodigo() {
        return codigo;
    }

    //****** Reverse Lookup Implementation************//
    //Lookup table
    private static final Map<String, Classes> lookup = new HashMap<>();

    //Populate the lookup table on loading time
    static {
        for (Classes cls : Classes.values()) {
            lookup.put(cls.getCodigo()[0], cls);
        }
    }

    //This method can be used for reverse lookup purpose
    public static Classes get(String codigo) {
        
        return lookup.get(codigo);
    }
}
