package dio.util.operacao.internal;

public class SubtracaoHelper implements Operacao {
    @Override
    public int executar(int x, int y) {
        return x - y;
    }
}
