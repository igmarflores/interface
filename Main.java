public class main {
    public static void main(String[] args) {

        CarbonFootprint [] polu  = new CarbonFootprint [6];

        polu[0]= new Car(4, 1.8);
        polu[1]= new Bycicle("bambu");
        polu[2]= new Building(5, false);

        polu[3]= new Car(4, 1.8);
        polu[4]= new Bycicle("aco");
        polu[5]= new Building(6, true);

        for (CarbonFootprint carbonFootprint : polu) {
            System.out.println(carbonFootprint.getCarbonFootprint());
        }

       
        
    }
    
}