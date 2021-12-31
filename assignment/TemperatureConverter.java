class TemperatureConverter{
    public static void main(String[] args){
        float c = Float.parseFloat(args[0]);

        float f = c * 1.8f + 32;
        float k = c + 273.15f;

        System.out.println("Converting "+c+" Degree Celcius to Fahrenheit and Kelvin...");
        System.out.printf("Fahrenheit: %.2f \n", f);
        System.out.printf("Kelvin: %.2f \n", k);        
    }
}