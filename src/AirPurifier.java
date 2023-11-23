
//```
/*

[ข้อ 1]
    ♦Instance Variables
        String brand - ยี่ห้อ
        String model - รุ่น
        String filterType - ชนิด filter ที่จะไป replaceFilter
        double price - ราคา
        String color - สี
        int noiseLevel - ระดับความดัง
        boolean power - เอาไว้เก็บว่า ปิด หรือ เปิด
        int AQI - Air Quality Index (มี 0 ถึง 500)
        double weight - นํ้าหนัก
    ♦Instance Methods (อธิบายแต่ละ method ในข้อ 2 ครับ)
        public void turnOn()
        public void turnOff()
        public void showDetail()
        public void showAQI()
        public void replaceFilter()
    ♦Class Variables
        int totalCount - จํานวน AirPurifier ที่ instantiate ทั้งหมด
        double totalPrice - จํานวนราคาทั้งหมดรวมกันของ AirPurifier ที่ instantiate ทั้งหมด
        ArrayList<double> priceArray - Array ที่เอาไว้เก็บราคาของ AirPurifier ที่ instantiate ทั้งหมด
        ArrayList<double> weightArray - Array ที่เอาไว้เก็บนํ้าหนักของ AirPurifier ที่ instantiate ทั้งหมด
        HashMap<String,Integer> brandMap - (คล้ายๆ Dictionary) เอาไว้เก็บว่า brand นี้ instantiate มาทั้งหมดกี่ครั้งแล้ว
    ♦Class Methods (อธิบายแต่ละ method ในข้อ 2 ครับ)
        static double getAveragePrice()
        static double getAverageWeight()
        static int getBrandCount()
        static double getMinPrice()
        static double getMaxPrice()
        static double getMinWeight()
        static double getMaxWeight()
        static void showAllAirPurifiers()


[ข้อ 2]
    ♦Instance Methods
        public void turnOn() - ใช้สําหรับ เปิด AirPurifier object โดย power set to true [ไม่มี input, output เป็นการ print ว่าเปิดแล้ว]
        public void turnOff() - ใช้สําหรับ ปิด AirPurifier object โดย power set to false [ไม่มี input, output เป็นการ print ว่าปิดแล้ว]
        public void showDetail() - ใช้สําหรับดูข้อมูลต่างๆ ของ object [ไม่มี input, output เป็นการ print รายละเอียดต่างๆ ของ object นั้น]
        public void showAQI() - ใช้สําหรับดู AQI (Air Quality Index) โดยค่าที่ได้มาจากการสุ่ม 0 - 500 (AQI Range) เพราะอยาก Simulate เฉยๆ โดย จะใช้ method นี้ได้ต้องไปใช้ turnOn() object นั้นก่อน ไม่งั้น showAQI() จะไม่ทํางาน และมี status ว่า AQI ตอนนี้อยู่ระดับไหน [ไม่มี input, output เป็นการ print เลข 1 ตัว ระหว่าง 0 - 500 โดยการสุ่ม]
        public void replaceFilter() - ใช้สําหรับเปลี่ยน filter ใหม่ เข้าไปใน AirPurifier object โดยการใช้ method นี้ จะต้อง turnOff() object นั้นก่อน ไม่งั้นจะ เปลี่ยน filter ไม่ได้ [ไม่มี input, output จะเป็นการ print ว่าเปลี่ยนแล้วหรือไม่ก็บอกว่ายังเปิดเครื่องอยู่ให้ปิดก่อนไม่งั้นจะเปลี่ยน filter ไม่ได้]

    ♦Class Methods
        static double getAveragePrice() - เอาไว้หาค่าเฉลี่ยของราคา AirPurifier ที่ instantiate มาทั้งหมด [ไม่มี input, output จะคือ ค่าเฉลี่ยของราคา]
        static double getAverageWeight() - เอาไว้หาค่าเฉลี่ยของราคา AirPurifier ที่ instantiate มาทั้งหมด [ไม่มี input, output จะคือ ค่าเฉลี่ยของนํ้าหนัก]
        static int getBrandCount() - เอาไว้หาว่าเรา instantiate แบรนด์นี้ไปกี่ครั้งแล้ว โดยจะใช้ toLowerCase() ทําให้ String เป็น lowercase แล้วจะ trim() เพื่อลบ whitespace [input เป็น brand ที่เราอยากหาจํานวน output เป็น จํานวนของ brand]
        static double getMinPrice() - หาราคาที่ถูกที่สุด ของ AirPurifier ที่ instantiate มาทั้งหมด [ไม่มี input, output จะคือ ราคาที่ตําที่สุดของ AirPurifier ที่เรา instantiate มาทั้งหมด]
        static double getMaxPrice() - หาราคาที่แพงที่สุด ของ AirPurifier ที่ instantiate มาทั้งหมด [ไม่มี input, output คือ ราคาที่เยอะที่สุดของ AirPurifier ที่เรา instantiate มาทั้งหมด]
        static double getMinWeight() - หานํ้าหนักที่เบาที่สุด ของ AirPurifier ที่ instantiate มาทั้งหมด [ไม่มี input, output คือ นํ้าหนักที่น้อยที่สุดของ AirPurifier ที่เรา instantiate มาทั้งหมด]
        static double getMaxWeight() - หานํ้าหนักที่หนักที่สุด ของ AirPurifier ที่ instantiate มาทั้งหมด  [ไม่มี input, output คือ นํ้าหนักที่เยอะที่สุดของ AirPurifier ที่เรา instantiate มาทั้งหมด]
        static void showAllAirPurifiers() - print AirPurifier ทั้งหมด ที่ instantiate โดยบอก brand และจํานวนของ brand [ไม่มี input, output คือ ชื่อ brand ทุกอัน และจํานวนของ brand ทุกอัน]
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AirPurifier {
    String brand;
    String model;
    String filterType;
    double price;
    String color;
    int noiseLevel;
    boolean power;
    int AQI;
    double weight;
    static int totalCount;
    static double totalPrice;
    static ArrayList<Double> priceArray = new ArrayList<Double>();
    static ArrayList<Double> weightArray = new ArrayList<Double>();
    static HashMap<String, Integer> brandMap = new HashMap<String, Integer>();

    public AirPurifier(String brand, String model, double price, String filterType, int noiseLevel, double weight,
                       String color) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.filterType = filterType;
        this.noiseLevel = noiseLevel;
        this.weight = weight;
        this.color = color;
        System.out.println("You recently purchased a " + this.brand + " " + this.model);
        totalCount++;
        totalPrice += price;
        priceArray.add(price);
        weightArray.add(weight);
        brand = brand.toLowerCase().trim();
        int count = brandMap.containsKey(brand) ? brandMap.get(brand) + 1 : 1;
        brandMap.put(brand, count);

    }

    public AirPurifier(String brand, String model, double price, String filterType) {
        this(brand, model, price, filterType, 60, 50, "white");
        System.out.println("You recently purchased a " + this.brand + " " + this.model);
        totalCount++;
        totalPrice += price;
        priceArray.add(price);
        weightArray.add(weight);
        brand = brand.toLowerCase().trim();
        int count = brandMap.containsKey(brand) ? brandMap.get(brand) + 1 : 1;
        brandMap.put(brand, count);

    }

    public void turnOn() {
        if (power)
            System.out.println("It is already turned on");
        else
            System.out.println("Turned on " + brand + " " + model);
        power = true;

    }

    public void turnOff() {
        if (!power)
            System.out.println("It is already turned off");
        else
            System.out.println("Turned off " + brand + " " + model);
        power = false;
    }

    public void showAQI() {
        if (power) {
            AQI = (int) (Math.random() * 501);
            String status;
            if (AQI <= 50)
                status = "HEALTHY";
            else if (AQI <= 100)
                status = "MODERATE";
            else if (AQI <= 150)
                status = "UNHEALTHY FOR SENSITIVE GROUPS";
            else if (AQI <= 200)
                status = "UNHEALTHY";
            else if (AQI <= 300)
                status = "VERY UNHEALTHY";
            else
                status = "HAZARDOUS";
            System.out.println("The AQI of the " + brand + " " + model + " was " + AQI + " [" + status + "]");
        } else {
            System.out.println(brand + " " + model + " is currently turned off. to use this feature, turn it on");
        }
    }

    public void showDetail() {
        System.out.println("---------- Details ----------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Filter Type: " + filterType);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("Noise Level: " + noiseLevel);
        System.out.println("Price: " + price);
        System.out.println("-----------------------------");
    }

    public void replaceFilter() {
        if (power) {
            System.out.println("Please turn off " + brand + " " + model + " before replacing a new filter");
        } else {
            System.out.println("You recently changed the " + brand + " " + model + "'s " + filterType + " filter");
        }
    }

    static double getAveragePrice() {
        int size = priceArray.size();
        double sum = 0;
        for (double d : priceArray) {
            sum += d;
        }
        return sum / size;
    }

    static double getAverageWeight() {
        int size = weightArray.size();
        double sum = 0;
        for (double d : weightArray) {
            sum += d;
        }
        return sum / size;
    }

    static int getBrandCount(String brand) {
        String brandLower = brand.toLowerCase().trim();
        if (brandMap.containsKey(brandLower))
            return brandMap.get(brandLower);
        return 0;
    }

    static double getMinPrice() {
        double min = priceArray.get(0);
        for (double d : priceArray) {
            if (min > d)
                min = d;
        }
        return min;
    }

    static double getMaxPrice() {
        double max = priceArray.get(0);
        for (double d : priceArray) {
            if (max < d)
                max = d;
        }
        return max;
    }

    static double getMinWeight() {
        double min = weightArray.get(0);
        for (double d : weightArray) {
            if (min > d)
                min = d;
        }
        return min;
    }

    static double getMaxWeight() {
        double max = weightArray.get(0);
        for (double d : weightArray) {
            if (max > d)
                max = d;
        }
        return max;
    }

    static void showAllAirPurifiers() {
        System.out.println("----- List of air purifiers' brand and amount -----");
        for (Map.Entry<String, Integer> entry : brandMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            key = key.substring(0, 1).toUpperCase() + key.substring(1).toLowerCase();
            System.out.println(key + " | Qty: " + value);
        }
        System.out.println("------------------------------------------------");
    }

}

// ```