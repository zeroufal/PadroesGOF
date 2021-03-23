package br.gof.estruturais.proxy;

public class Cliente {
    public static void main(String[] args) {
        Persistencia persistencia;

        System.out.println("Teste persistencia padrao: ");
        persistencia = new PersistenciaPadrao();
        persistencia.save("Marcos");
        persistencia.remove("Marcos");
        persistencia.get("1");

        System.out.println("\nTeste persistencia protegida: ");
        persistencia = new PersistenciaSegura(new PersistenciaPadrao());
        persistencia.save("Marcos");
        persistencia.remove("Marcos");
        persistencia.get("1");

        System.out.println("\nTeste persistencia smart transacional: ");
        persistencia = new PersistenciaComTransacao(new PersistenciaPadrao());
        persistencia.save("Marcos");
        persistencia.remove("Marcos");
        persistencia.get("1");

        System.out.println("\nTeste persistencia remota: ");
        persistencia = new PersistenciaRMI(new PersistenciaPadrao());
        persistencia.save("Marcos");
        persistencia.remove("Marcos");
        persistencia.get("1");

        System.out.println("\nTeste persistencia virtual com lazy load: ");
        persistencia = new PersistenciaVirtual(new PersistenciaPadrao());
        persistencia.save("Marcos");
        persistencia.remove("Marcos");
        persistencia.get("1");
    }
}
