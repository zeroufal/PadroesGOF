package br.gof.estruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        ItemArquivo arquivoWord = new Arquivo("MeuArquivo.doc");
        List<ItemArquivo> listaArquivos = new ArrayList<>();
        listaArquivos.add(arquivoWord);
        ItemArquivo pastaDocumentos = new Pasta("Documentos", listaArquivos);

        ItemArquivo arquivoExcel = new Arquivo("arquivo.xls");
        List<ItemArquivo> listaExcel = new ArrayList<>();
        listaExcel.add(arquivoExcel);
        ItemArquivo pastaDownloads = new Pasta("Downloads", listaExcel);

        List<ItemArquivo> listaPasta = new ArrayList<>();
        listaPasta.add(pastaDownloads);
        listaPasta.add(pastaDocumentos);

        ItemArquivo pastaHome = new Pasta("Home", listaPasta);
        pastaHome.executar("");

    }
}
