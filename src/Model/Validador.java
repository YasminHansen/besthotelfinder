package Model;

import java.util.Scanner;

public class Validador {

    public static boolean ValidaValor(int valor){
        if(valor != 1 && valor != 2){
            return false;
        }
        return true;
    }

    public static boolean ValidaInput(int valor){
        if(valor == 2){
            return false;
        } else{
            return true;
        }
    }
}
