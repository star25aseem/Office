import java.util.Scanner;
//all the classes are in same package
public class Ques1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         Manager M=new Manager();
         M.Name="Monty";
         Employee E=new Employee();
         E.Name="Elizabeth";
        System.out.println("Please enter 1 for Manager and 2 for Employee : ");
        int choice=s.nextInt();
        switch (choice) {
            case 1:
        System.out.print("Enter the name of manager : "+"Monty"+'\n');
        String z=s.nextLine();
        System.out.println("Enter the address of manager : ");
        M.Address=s.nextLine();
        System.out.println("Enter the phone number of manager");
        M.Phone_number=s.nextLine();
        System.out.println("Enter the age of manager");
        int x=s.nextInt();
        M.setAge(x);
        System.out.println("Enter the salary of manager");
        M.Salary=s.nextInt();
        M.PrintSalary();
                System.out.println('\n');
        System.out.println("Enter the task code");
        M.FM=s.nextInt();
        switch (M.FM) {
            case 1:
            System.out.println("Enter the Task_Weitage");
            int p=s.nextInt();
            M.Assign_task(E,p);
            break;
            case 2:
            M.Check_Performance(E);
            break;
            case 3:
               M.Give_bonus(E);
               break;
             case 4:  
                M.Off();
                break;
              case 5:
              M.Checked_In_Office();
              case 6:
              M.Checked_out_Office();  
                break;
        }
        break;
        
            case 2:
        System.out.println("Enter the name of employee : "+'\n'+"elizabeth");
        E.Name=s.nextLine();
        System.out.println("Enter the address of employee : ");
        E.Address=s.nextLine();
        System.out.println("Enter the phone number of employee : ");
        E.Phone_number=s.nextLine();
        System.out.println("Enter the age of employee");
        int y=s.nextInt();
        E.setAge(y);
        System.out.println("Enter the salary of employee");
        E.Salary=s.nextInt();
        E.PrintSalary();
                System.out.println("\n");
        switch (E.FE) {
            case 1:
            System.out.println("Enter the task weightage");
            int e=s.nextInt();
            E.Complete_Task(e);
            break;
            case 2:
            E.Off();
            break;
            case 3:
            int days=s.nextInt();
            E.Off(days);
            break;
            case 4:
            int h=s.nextInt();
            int d=s.nextInt();
            E.Ask_For_Overtime(h,d);
            break;
            case 5:
            E.Checked_In_Office();
            break;
            case 6:
            E.Checked_out_Office();
            break;

        }
                break;
        }
        

    }
}
