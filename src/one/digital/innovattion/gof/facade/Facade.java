package one.digital.innovattion.gof.facade;

import subsistema2.CepApi;
import subsitema.crm.CrmService;

public class Facade {

    public void migrarCliente(String nome, String cep){

        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarCidade(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
