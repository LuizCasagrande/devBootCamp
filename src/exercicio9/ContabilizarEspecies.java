package exercicio9;

import java.util.ArrayList;
import java.util.List;

public class ContabilizarEspecies implements EspecieUtil {

    @Override
    public List<Animal> filtraEspecie(List<Animal> animais, EspecieAnimal especieFiltrar) {
        List<Animal> especies = new ArrayList<>();

        for (Animal animailFiltrado : animais) {

            if (animailFiltrado.getEspecie().equals(especieFiltrar)) {
                especies.add(animailFiltrado);
            }
        }
        return especies;
    }

    @Override
    public List<EspecieAnimal> classificaEspecies(List<Animal> animais) {
        List<EspecieAnimal> especies = new ArrayList<>();
        for (Animal especieanimais : animais) {
            if (!especies.contains(especieanimais.getEspecie())) {
                especies.add(especieanimais.getEspecie());
            }
        }
        return especies;
    }

}
