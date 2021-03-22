package br.com.dio.intermediario.testes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class MinhaPrimeiraClasse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int quantidadeValoresPositivos = 0;

        for(int i=1; i<= 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            if(!st.hasMoreTokens()) {
                continue;
            }

            double valorEntrada = Double.parseDouble(st.nextToken());

            if (valorEntrada >= 0) {
                quantidadeValoresPositivos++;
            }
        }

        System.out.println(quantidadeValoresPositivos + " valores positivos");
    }
}