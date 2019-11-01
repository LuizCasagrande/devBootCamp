package exercicio9;

import java.util.List;

public interface EspecieUtil {
    public List<Animal> filtraEspecie(List<Animal> animais, EspecieAnimal especieFiltrar);
    public List<EspecieAnimal> classificaEspecies(List<Animal> animais);


}
