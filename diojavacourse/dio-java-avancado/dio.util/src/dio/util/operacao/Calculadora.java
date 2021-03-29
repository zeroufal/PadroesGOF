package dio.util.operacao;

import dio.util.operacao.internal.DivisaoHelper;
import dio.util.operacao.internal.MultiplicacaoHelper;
import dio.util.operacao.internal.SomaHelper;
import dio.util.operacao.internal.SubtracaoHelper;

public class Calculadora {
    private SomaHelper somaHelper;
    private SubtracaoHelper subtracaoHelper;
    private MultiplicacaoHelper multiplicaacoHelper;
    private DivisaoHelper divisaoHelper;

    public Calculadora() {
        somaHelper = new SomaHelper();
        subtracaoHelper = new SubtracaoHelper();
        multiplicaacoHelper = new MultiplicacaoHelper();
        divisaoHelper = new DivisaoHelper();
    }

    public int somar(int a, int b) {
        return somaHelper.executar(a, b);
    }

    public int subtrair(int a, int b) {
        return subtracaoHelper.executar(a, b);
    }

    public int multiplicar(int a, int b) {
        return multiplicaacoHelper.executar(a, b);
    }

    public int dividir(int a, int b) {
        return divisaoHelper.executar(a, b);
    }
}
