public class Mains {
    public static void main(String[] args) {
        //task 1
        int width;
        int length;
        length = 2;
        width = 5;
        int area;
        area = length * width;
        System.out.println("T 1: area = " + area);

        //Task 2
        double weight = 62.9;
        double height = 1.64;
        double bodyMassIndex;
        bodyMassIndex = weight / ( height + height );
        System.out.println("T2: bodyMassIndex = " + bodyMassIndex);

        //Task 3
        double TempCelsius = 26;
        double TempFahrenheit ;
        double value1 = 9.0;
        double value2 = 5.0;
         TempFahrenheit = (value1/value2)* TempCelsius + 32;
        System.out.println("T3:TempFahrenheit = " + TempFahrenheit);

        //Task 4
        int VariableMax=2147483647;
        int VariableUnassign;
        VariableUnassign = VariableMax +1;
        System.out.println("T4:VariableUnassign = " +VariableUnassign);

        //Task 5
        double VarFractionalValue = 3.14;
        int Var;
        Var= (int) VarFractionalValue;
        System.out.println("T5:VarFractionalValue = " + VarFractionalValue);

        //Task 6
        int age1= 18;
        int age2= 50;
        boolean ValidAge = age1 >= age2;
        System.out.println("T6:ValidAge="+ ValidAge);
    }
}
