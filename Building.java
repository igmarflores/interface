public class Building implements CarbonFootprint{
    
    int altura;
    boolean EnergiSolar;

    public Building(int altura, boolean EnergiSolar){
        this.altura = altura;
        this.EnergiSolar = EnergiSolar;


    }
    
    public double getCarbonFootprint(){
        if (EnergiSolar) {
            return altura * 1.7;
        } else return 2.7*altura;

    }
    
}