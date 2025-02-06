import java.util.Scanner;

public class Project_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Name
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        String[] arrN=name.split(" ",2);
        String f_name=arrN[0];
        String l_name=arrN[1];
        //Age
        System.out.println("Enter your date of birth: (dd/mm/yyyy)");
        String dateOfBirth = sc.nextLine();
        int birth_year = Integer.parseInt(dateOfBirth.split("/")[2]);
        int present_year=2025;
        int age=present_year-birth_year;

        //Gender
        System.out.println("Enter your gender: (m/f)");
        String gender = sc.nextLine();
        //Address
        System.out.println("Enter your address: ");
        String address = sc.nextLine();
        //10th grade
        System.out.println("Enter your 10th percentile: ");
        double marks_10=sc.nextDouble();
        //12th grade
        System.out.println("Enter your 12th percentile: ");
        double marks_12=sc.nextDouble();
        if(marks_10<85 || marks_12<85){
            System.out.println("Sorry! you are not eligible for this college.");
            System.out.println("Please try somewhere else.");
        }else{
            System.out.printf("Welcome, %s to our college.\nYou have told us you are %d years old, currently living in %s.\nYou had gotten %f grade in 10th and %f grade in 12th.\nHence you are eligible to enroll in our college. We look forward to our future together.\n Please leave us your contact for further communication.",name,age,address,marks_10,marks_12);
            String number= sc.next();
        }
    }
}
