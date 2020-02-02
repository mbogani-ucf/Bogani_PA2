/*
 Main calls BMI calculator:
 >BMI calculator calls readUserdata
 >readUserData the calls both
 >readUnitType & readMeasurementData
 >The user is then prompted to enter
 text indicating the measurement type
 >The program only detects either type
 >Depending on the type the user will
 be asked to enter either metric or
 Imperial units of measurement for both
 Height and Weight.
 >calculateBmi gets called and uses the 
 input data.
 >calculateBmi detects unit type and 
 calculates accordingly.
 >getBmi gets called to print BMI
 >displayBmi gets called to display 
 user's BMI category.
 >Finally displayBmi gets called to 
 display all BMI categories.
 * 
 */

import java.util.Scanner;

public class BMICalculator{

		public static void main(String[] args){
	       BMICalculator app = new BMICalculator();
	       app.readUserData();
	       app.calculateBmi();
	       app.displayBmi();
	   }
		
   static Scanner in = new Scanner(System.in);
   private double inputWeight;
   private double inputHeight;
   private double bmiCalculation;
   private String measureUnitType;
      
   public double getWeight(){
       return (inputWeight);
   }
   
   private void setWeight(double weight){
       this.inputWeight = weight;
   }
   
   public double getHeight(){
       return (inputHeight);
   }
   
   private void setHeight(double height){
       this.inputHeight = height;
   }
   
   public void readUserData(){
       readUnitType();
       readMeasurementData();
   }
   
   static final String METRIC = "METRIC";
   static final String IMPERIAL = "IMPERIAL";
   
   private void readUnitType(){
       System.out.print("Please enter the Unit Type (" + IMPERIAL + "/" + METRIC + "): ");
       String selectedunit = in.nextLine().trim().toUpperCase();       
       if (selectedunit.equals(IMPERIAL)||selectedunit.equals(METRIC)){           
           this.measureUnitType = selectedunit;
       } else{           
           System.out.print("Invalid input, please enter Imperial or Metric\n");
           readUnitType();
       	}
   }
   
   private void readMeasurementData(){      
       if (measureUnitType.equals(IMPERIAL)){
           readImperialData();
       }    
       else {
           readMetricData();
       }
   }
   
   private void readMetricData(){
       System.out.print("*****************************"
       + "***********************\nEnter weight (kilograms): ");
       setWeight(in.nextDouble());
       if (getWeight() < 0){
           System.exit(1);
       }
       
       System.out.print("Enter height in (meters): ");
       setHeight(in.nextDouble());
       if (getHeight() < 0){
           System.exit(1);
       }
   }
   
   private void readImperialData(){       
	   System.out.print("****************************" 
	   +"*************************\nEnter weight (pounds): ");
       setWeight(in.nextDouble());       
       if (getWeight() < 0){
           System.exit(1);
       }
       
       System.out.print("Enter height (inches): ");
       setHeight(in.nextDouble());       
       if (getHeight() < 0) {
           System.exit(1);
       }
   }
   
   public void calculateBmi(){
       bmiCalculation = inputWeight / (Math.pow(inputHeight,2));
       if (measureUnitType.equals(IMPERIAL)){
           bmiCalculation *= 703;
       }           
   }

   public double getBmi(){
       return (bmiCalculation);
   }

   public String getBMIcategory(){       
        if (bmiCalculation < 18.5)
            return ("Underweight");
        else if (bmiCalculation <= 24.9)
            return ("Normal weight");
        else if (bmiCalculation <= 29.9)
            return ("Overweight");
        else
            return ("Obese");
    }

   public void displayBmi(){
       System.out.print("******************************************************\n");
       System.out.printf("\nBMI: %.1f", getBmi());
       System.out.print("\nYou are " + getBMIcategory());       
       System.out.print("\n\n****************");
       System.out.print("\n*BMI Categories*");
       System.out.print("\n****************");
       System.out.print("\nUnderweight:\t< 18.5");
       System.out.print("\nNormal weight:\t18.5 – 24.9");
       System.out.print("\nOverweight:\t25 – 29.9");
       System.out.print("\nObese:\t\t30 or greater");
       System.out.print("\n****************");
   }

}