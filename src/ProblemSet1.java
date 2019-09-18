/**
 * Problem Set 1.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 * 
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet1 {
    
    public static void main(String[] args) {
        
        final double LENGTH = 11 ;
        final double WIDTH = 8.5 ;
        final double CONVERSIONmm = 25.4 ;
        final double CONVERSIONcm = 2.54;
        
      

        /*
         * Exercise 1.
         * 
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */
        
        
    
        double LENGTHmm = LENGTH * CONVERSIONmm ;
        double WIDTHmm = WIDTH * CONVERSIONmm ;
        double AREAmm = LENGTHmm * WIDTHmm ;
       

        
       System.out.printf("%,.2f square millimeters. \n", AREAmm );
        
        /*
         * Exercise 2.
         * 
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
        
        final double CONVERSIONcm = 2.54;

        double LENGTHcm = LENGTH * CONVERSIONcm;
        double WIDTHcm = WIDTH * CONVERSIONcm;
        double PERIMETER = LENGTHcm + LENGTHcm + WIDTHcm + WIDTHcm;

        

        
       System.out.printf("%,.2f centimeters. \n", PERIMETER );
        
        /*
         * Exercise 3.
         * 
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */
        
        double DIAGONAL = Math.hypot(LENGTH, WIDTH);


        

        
       System.out.printf("%,.2f inches. \n", DIAGONAL );

        /*
         * Exercise 4.
         * 
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */
        
        final double quizWeight = .35;
        final double homeworkWeight = .15;
        final double testWeight = .5;

        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;
        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;
        int test1 = 74;
        int test2 = 87;
        int test3 = 82;
        
        double allHomeworks = (homework1 + homework2 + homework3)/ 3.00 * homeworkWeight;
        double allQuizzes = (quiz1 + quiz2 + quiz3 ) / 3.00 * quizWeight;
        double allTests = (test1 +test2 + test3)/ 3.00 * testWeight;

        double grade = allHomeworks + allQuizzes + allTests;

        System.out.printf("%,.2f%% \n", grade );
        
        /*
         * Exercise 5.
         * 
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

        final double hourlyWage = 12.50;

        double hoursWorked = 7.5+8+10.5+9.5+6+11.5;
        double wageThisWeek = hoursWorked * hourlyWage;        

        
        System.out.printf("$%,.2f \n", wageThisWeek );
        
        /*
         * Exercise 6.
         * 
         * What is my take-home pay each check?
         */
        

        //SYNTAX IS ALL GOOD THE ONLY PART MISSING IS THE MATH

        double federalTax = .240;
        double stateTax = .0637;
        double FourZeroOneK = .070;
        double salaryYearly = 117000;


        double afterFourZeroOneK =  (1.000 - FourZeroOneK) * salaryYearly ;
        double takeHomePay = afterFourZeroOneK * (1-federalTax);
        takeHomePay = takeHomePay * (1-stateTax);
        takeHomePay= takeHomePay / 24;


    

        
       System.out.printf("$%,.2f \n", takeHomePay );
        
        /*
         * Exercise 7.
         * 
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */
        
        
        
        /*
         * Exercise 8.
         * 
         * What is the surface area of a standard Cornhole board?
         */
        
        
        
        /*
         * Exercise 9.
         * 
         * Are the years 2020, 2100, and 2400 leap years?
         */
        
        
        
        /*
         * Exercise 10.
         * 
         * What is the wind chill?
         */
        
        
        
    }
}