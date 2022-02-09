package subsistema2;

import one.digital.innovattion.gof.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia;

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "SP";
    }
}

