public class Employee extends Member {
    public static int Number_of_Employee_in_the_office;
    private int Bonus;
    int FE=1;
    public int getBonus() {
        return Bonus;
    }
    public void setBonus(int bonus) {
        Bonus = bonus;
    }
    private String specialization;
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    //Every task has a unique Task_Weightage
    //FE1
    public int Complete_Task(int Task_Weightage){
        System.out.println(this.Name+"has completed the assigned task"+Task_Weightage);
        this.Performance_checker_points+=2*Task_Weightage;
        this.FE=1;
        return FE;
    }
    @Override
    //FE2
    public int Off(){
        if(Off==-1){
            System.out.println(this.Name+"Enjoyed the holiday");
            Off++;
        }
        this.FE=2;
        return FE;
    }
    //FE3
    public int Off(int days){
        System.out.println(this.Name+"has asked for leave of"+days+"days");
        this.Performance_checker_points-=5*days;
        this.FE=3;
        return FE;
    }
    //FE4
    public int Ask_For_Overtime(int hours,int days){
        System.out.println(this.Name+"has asked for overtime of"+hours+"hours for"+days+"days");
        this.Performance_checker_points+=hours*days;
        this.FE=4;
        return FE;
    }
    //FE5
    public int Checked_In_Office(){
        super.Checked_In_Office();
         Employee.Number_of_Employee_in_the_office++;
         this.FE=5;
         return FE;
     }
     //FE6
     public int Checked_out_Office(){
       super.Checked_out_Office();
        Employee.Number_of_Employee_in_the_office--;
        this.FE=6;
        return FE;
     }
    
}
