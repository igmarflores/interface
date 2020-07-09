public class Bycicle implements CarbonFootprint {

    String material;

    public Bycicle(String material) {
        this.material = material;
        

    }
    public double getCarbonFootprint(){
        
            return  2.5;
        

    }
    
}