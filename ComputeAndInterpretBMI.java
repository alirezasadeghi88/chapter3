import java.util.Scanner;

 public class ComputeAndInterpretBMI {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

 
 System.out.print("Enter weight in pounds: ");
 double weight = input.nextDouble(); in inches
12 System.out.print("Enter height in inches: ");
13 double height = input.nextDouble();
14
15 final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
16 final double METERS_PER_INCH = 0.0254; // Constant
17
18 // Compute BMI
19 double weightInKilograms = weight * KILOGRAMS_PER_POUND;
20 double heightInMeters = height * METERS_PER_INCH;
21 double bmi = weightInKilograms /
22 (heightInMeters * heightInMeters);
23
24 // Display result
25 System.out.println("BMI is " + bmi);
26 if (bmi < 18.5)
27 System.out.println("Underweight");
28 else if (bmi < 25)
29 System.out.println("Normal");
30 else if (bmi < 30)
31 System.out.println("Overweight");
32 else
33 System.out.println("Obese");
34 }
35 }