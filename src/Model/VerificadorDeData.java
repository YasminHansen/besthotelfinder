package Model;

import java.util.List;

public class VerificadorDeData {

    public static void VerificaData(String data){

    }

    public static void VerificarDatas(List<String> dias){
        for(int i = 0; i < dias.size(); i++){
            VerificaData(dias.get(i));
        }
    }
}
