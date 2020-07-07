package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessadorDeInput {
    public static List<String> inputDiasReserva(){
        Scanner console = new Scanner(System.in);
        String data;
        List<String> datas = new ArrayList<>();
        int valor;
        boolean continuar = true;

        System.out.println("Digite o dia, mês, ano e dia. Exemplo: '16Mar2009(seg)'");

        do{
            data = console.next();
            datas.add(data);
            System.out.println("Deseja inserir outra data? 1 - sim, 2 - não");

            valor = console.nextInt();
            if (Validador.ValidaValor(valor)) {
                if (Validador.ValidaInput(valor)) {
                    continuar = true;
                    System.out.println("Digite outro dia: ");
                } else {
                    continuar = false;
                }
            }else{
                System.out.println("Valor inválido. Digite 1 ou 2");
            }
        }while(continuar);


//            Criar classe de Data, verificar a data no validador, instanciar uma nova data no do/while, passar elas na lista que está na reserva

//            if(continuar != 1 && continuar != 2){
//                System.out.println("Valor inválido. Digite 1 ou 2");
//                continuar = console.nextInt();
//            } else if(continuar == 2){
//                continuar = 0;
//            } else{
//                continuar = 1;
//            }

        return datas;
    }

    public static Cliente inputCliente(){
        Scanner console = new Scanner(System.in);
        Cliente cliente = new Cliente();

        int tipo;
        boolean continuar = true;

        System.out.println("Digite o tipo do cliente. 1 - Regular, 2 - Fidelidade");
        tipo = console.nextInt();

        do {
            if (tipo != 1 && tipo != 2) {
                System.out.println("Valor inválido. Digite 1 ou 2");
                tipo = console.nextInt();
            }else if(tipo == 1){
                cliente.setTipo(TipoDoCliente.REGULAR);
                continuar = false;
            }else{
                cliente.setTipo(TipoDoCliente.FIDELIDADE);
                continuar = false;
            }
        }while(continuar);

        return cliente;
    }
}
