/**
 * @Author: alexandre.gaia
 */

package br.com.alexandreG;

import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Do you wanna see how is your average?");
        String answer = s.next();

        while(answer.equalsIgnoreCase("yes")){
            System.out.println("Insert the first grade: ");
            int grade_1 = s.nextInt();
            System.out.println("Insert the second grade: ");
            float grade_2 = s.nextInt();
            System.out.println("Insert the third grade: ");
            float grade_3 = s.nextInt();
            System.out.println("Insert the fourth grade: ");
            float grade_4 = s.nextInt();

            float gradesAverage = (grade_1 + grade_2 + grade_3 + grade_4) / 4 ;

            if(gradesAverage >= 7){
                System.out.println("You've been approved");
            } else if (gradesAverage >=5) {
                System.out.println("You're on the hook");
            }else{
                System.out.println("You've failed.");
            }

            System.out.println("Do you wanna see it again?");
            answer = s.next();
        }
        System.out.println("Thank you for using our platform!");
    }


}
