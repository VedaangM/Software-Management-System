import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        User currUser = new User();
        /* CODE NO LONGER WORKS
        Scholarship scholarship;
        scholarship = new Scholarship("Private University Scholarship","Chris Scholarship",10);
        System.out.println(scholarship);
        */
        
        

        int rewardies;
        String isAdminUserSelection;
        System.out.println("Is the current user an administrator? (y/n)");
        isAdminUserSelection = scnr.next();
    
        if (isAdminUserSelection.equals("y")) {
            System.out.println("Proceed further");
            
            currUser.GiveAdmin();
            if(currUser.GetAdmin()){
                String applicantInfo;
                System.out.println("Select the applicant to award the scholarship");
                applicantInfo = scnr.next();
                
               
        }
        else {
            System.out.println("Sorry do you not have authorization to proceed further!");
        }
    
    }
}