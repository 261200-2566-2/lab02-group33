public class Lab02 {

    public static void main(String[] args){

        AirPurifier p = new AirPurifier("Xiaomi","Air Purifier 4 Pro",1,"Fiberglass",60,50,"White");
        AirPurifier pt = new AirPurifier("Xiaomi","Air Purifier 4 Pro",1,"UV");
        AirPurifier pq = new AirPurifier("Xiaomi","Air Purifier 4 Pro",45,"ULPA");
        System.out.println("The total price of all air purifiers is " + AirPurifier.totalPrice);
        AirPurifier px = new AirPurifier("VEVA","8000",100000,"Washable");
        AirPurifier pk = new AirPurifier("VEVA","8000",0,"Spun Glass");
        AirPurifier pp = new AirPurifier("VEVA","8000",50,"Electrostatic");
        AirPurifier py = new AirPurifier("Levoit","Vital 200S",50,"HEPA");
        System.out.println("The total price of all air purifiers is " + AirPurifier.totalPrice);
        AirPurifier pz = new AirPurifier("Winix","5500-2",60,"HEPA");
        AirPurifier pa = new AirPurifier("Levoit","Core 300",65,"Pleated");
        AirPurifier pb = new AirPurifier("Coway Airmega","200M",3,"Media");
        System.out.println("The total price of all air purifiers is " + AirPurifier.totalPrice);
        p.replaceFilter();
        px.replaceFilter();
        py.replaceFilter();
        pz.replaceFilter();
        p.showDetail();
        px.showDetail();
        py.showDetail();
        pz.showDetail();
        pa.showDetail();
        pb.showDetail();
        p.turnOn();
        p.turnOn();
        p.turnOff();
        p.turnOff();
        p.turnOn();
        px.turnOn();
        System.out.println();
        System.out.println("There are "+ AirPurifier.totalCount + " air purifiers");
        System.out.println("The average price of all air purifiers is " + AirPurifier.getAveragePrice());
        System.out.println("The average weight of all air purifiers is " + AirPurifier.getAverageWeight());
        System.out.println(AirPurifier.getBrandCount("CoWaY aiRmegA"));
        System.out.println(AirPurifier.getBrandCount("      veva      "));
        System.out.println(AirPurifier.getBrandCount("veva      "));
        System.out.println(AirPurifier.getBrandCount("      veva"));
        System.out.println(AirPurifier.getBrandCount("LevOit "));
        System.out.println(AirPurifier.getBrandCount("wInIX"));
        System.out.println("The lowest cost of all air purifiers is " + AirPurifier.getMinPrice());
        System.out.println("The highest cost of all air purifiers is " + AirPurifier.getMaxPrice());
        System.out.println("The lowest weight of all air purifiers is " + AirPurifier.getMinWeight());
        System.out.println("The highest weight of all air purifiers is " + AirPurifier.getMaxWeight());
        System.out.println(AirPurifier.getBrandCount("aksDksdks"));
        p.showAQI();
        px.showAQI();
        py.showAQI();
        pp.showAQI();
        pk.showAQI();
        pa.showAQI();
        pb.showAQI();
        pt.showAQI();
        pq.showAQI();
        pq.replaceFilter();
        pt.replaceFilter();
        pt.turnOn();
        pt.replaceFilter();


        AirPurifier.showAllAirPurifiers();


    }

    @Override
    public String toString() {
        return "Lab02 []";
    }
}

