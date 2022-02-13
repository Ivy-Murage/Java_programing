package com.Question1;
import java.util.*;
public class Question1 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        //Ask for user input
        System.out.println("Enter the number you would like to reverse: ");
        int num = userInput.nextInt();
        System.out.println(num);
        System.out.println(reverse_num(num));
    }

    static int reverse_num(int num)
        {

            int reverse = 0; int reminder;
            // the iteration continues until this condition is false
            while(num != 0)
            {
                //Finds the reminder of the number after dividing by 10
               reminder = num % 10;
               //Takes the number that is stored in the reverse variable and multiples it by 10 and the reminder is added
               reverse = reverse * 10 + reminder;
               //The number passed is divided by 10 to the number without the reminder
               num /= 10;
            }
            //Returns the reversed number to the calling function
            return reverse;
        }
    }