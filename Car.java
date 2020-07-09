public class Car implements CarbonFootprint {

    int qntPortas;
    double rendimentoVeiculo;

    public Car(int qntPortas, double rendimentoVeiculo) {
        this.qntPortas = qntPortas;
        this.rendimentoVeiculo = rendimentoVeiculo;

    }
    public double getCarbonFootprint(){
        
            return rendimentoVeiculo * 2.5;
        

    }
    

}