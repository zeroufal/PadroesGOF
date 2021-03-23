package br.gof.estruturais.proxy;

public class PersistenciaRMI implements Persistencia {
    private PersistenciaPadrao persistenciaPadrao;

    public PersistenciaRMI(PersistenciaPadrao persistenciaPadrao) {
        this.persistenciaPadrao = persistenciaPadrao;
    }

    @Override
    public void save(String valor) {
        System.out.println("Serializando objetos");
        System.out.println("Iniciando protocolos de rede");
        System.out.println("De-serializando objetos");
        System.out.println("Fazendo chamada remota");
        this.persistenciaPadrao.save(valor);
        System.out.println("Fechando chamada remota");
    }

    @Override
    public void remove(String valor) {
        System.out.println("Serializando objetos");
        System.out.println("Iniciando protocolos de rede");
        System.out.println("De-serializando objetos");
        System.out.println("Fazendo chamada remota");
        this.persistenciaPadrao.remove(valor);
        System.out.println("Fechando chamada remota");
    }

    @Override
    public void get(String id) {
        System.out.println("Serializando objetos");
        System.out.println("Iniciando protocolos de rede");
        System.out.println("De-serializando objetos");
        System.out.println("Fazendo chamada remota");
        this.persistenciaPadrao.get(id);
        System.out.println("Fechando chamada remota");
    }
}
