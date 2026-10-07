package Data.EXERCISE2;

class BMI{
    private String name;
    private int age;
    private double weight;
    private double height;

    // constructor with parameters

    public BMI( String name, int age, double weight, double height){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.height=height;
    };

    // constructor defual age=20
    public BMI( String name,  double weight, double height){
        this.name=name;
        this.age=20 ;
        this.weight=weight;
        this.height=height;

    }

    // getters
    public double getBMI(){
        return (weight*703)/(height*height);
    }

    public String getStatus(){
        double bmi=getBMI();
        if (bmi<18.5) return "UnderWeight";
        else if (bmi<25.0) return  "Normal";
        else if (bmi<30.0) return "OverWeight";
        else return "Obese";
    }

    public String getName() {
        return name; }
    public int getAge() {
        return age; }
    public double getWeight() {
        return weight; }
    public double getHeight() {
        return height; }
}

public class Exer4BMI {
    public static void main(String[] args) {

        // Waxaan abuuraynaa object isticmaalaya constructorka koowaad
        BMI bmi1 = new BMI("Axmed", 25, 190.0, 70.0);


        // Soo bandhigidda natiijada object 1aad
        System.out.println("--------------------");
        System.out.println("name: " + bmi1.getName());
        System.out.println("Age: " + bmi1.getAge());
        System.out.println("BMI: " + String.format("%.2f", bmi1.getBMI()));
        System.out.println("Status: " + bmi1.getStatus());

        System.out.println("---------------------------------------------------");

        //  Waxaan abuuraynaa object kale oo isticmaalaya constructorka labaad Age- waa default 20
        BMI bmi2 = new BMI("Faadumo", 140.0, 65.0);
        // Soo bandhigidda natiijada object 2aad
        System.out.println("-----------------------");
        System.out.println("Name: " + bmi2.getName());
        System.out.println("Age: " + bmi2.getAge()); // Wuxuu soo saari doonaa 20
        System.out.println("BMI: " + String.format("%.2f", bmi2.getBMI()));
            System.out.println("Status: " + bmi2.getStatus());
    }

}
