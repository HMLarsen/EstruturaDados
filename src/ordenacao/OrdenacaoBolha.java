package ordenacao;

/**
 *
 * @author hugo
 */
public class OrdenacaoBolha<T extends Comparable> extends OrdenacaoAbstract<T> {

    @Override
    public void ordenar() {
        int n = getInfo().length;
        boolean trocou;

        for (int i = n - 1; i >= 1; i--) {
            trocou = false;

            for (int j = 0; j <= i - 1; j++) {
                if (getInfo()[j].compareTo(getInfo()[j + 1]) > 0) {
                    trocar(j, j + 1);
                    trocou = true;
                }
            }

            if (!trocou) {
                return;
            }
        }
    }

}
