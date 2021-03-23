package br.gof.estruturais.facade;

public class Cliente {
    public static void main(String[] args) {
        CRUDFacade crudFacade = new CRUDFacadeImpl();
        SegurancaFacade segurancaFacade = new SegurancaFacadeImpl();

        crudFacade.inserirPessoa("Marcos");
        segurancaFacade.inserirUsuario("Marcos", "123");
        System.out.println("Testando login: " + segurancaFacade.login("Marcos", "123"));
        System.out.println("Listando pessoas: " + crudFacade.listarTodasAsPessoas());
    }
}
