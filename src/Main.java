public class Main {
    int modelyear;
    String modelName;

    public Main(int year, String name) {
        modelyear = year;
        modelName = name;
    }

    public static void main (String []args) {
        Main myCar = new Main(1969, "Mustang");
        System.out.println(myCar.modelyear + " " + myCar.modelName);

    };




}