public class String1 {
    public static void main(String[] args) {
        
        String brand = "TFH";
        System.out.println(brand);
        brand.concat("Ram");
        System.out.println(brand);

        StringBuilder brand1 =new StringBuilder("TFH ");
        System.out.println(brand1);
        brand1.append("Ram");
        System.out.println(brand1);
    }
}
