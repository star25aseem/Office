public class Manager extends Member {
   public static int Number_of_Manager_in_the_office; 
   public int FM;
   private String department;
   public String getDepartment() {
    return department;
    }
 public void setDepartment(String department) {
    this.department = department;
   }
   //Every task has a unique Task_weightage
   //FM1
    public int Assign_task(Employee a,int Task_Weightage){
        a.Performance_checker_points-=Task_Weightage;
        this.FM=1;
        return FM;
    }
    //FM2
    public int Check_Performance(Employee a){
        int b=a.Performance_checker_points;
        if(b>0){
          System.out.println("Performance analysis shows that"+a.Name+" is performing Good");
        }
        if(b==0){
            System.out.println("Performance analysis shows that"+a.Name+"can perform better");
        }
        if(b<0){
            System.out.println("Performance analysis shows that"+a.Name+"'s Performance is bad");
        }
        this.Salary+=b*1000;
        a.Salary+=b*500;
        this.FM=2;
        return FM;
    }
    //FM3
    public int Give_bonus(Employee a){
       int b=a.Performance_checker_points;
       if(b>100){
        a.setBonus(50000);
       }
       this.FM=3;
       return FM;
    }
    @Override
    //FM4
    public int Off(){
        Off++;
        System.out.println("Today is Company Holiday");
        this.FM=4;
        return FM;
    }
    //FM5
    public int Checked_In_Office(){
        super.Checked_In_Office();
        Manager.Number_of_Manager_in_the_office++;
        this.FM=5;
        return FM;
     }
     //FM6
     public int Checked_out_Office(){
        super.Checked_out_Office();
        Manager.Number_of_Manager_in_the_office--;
        this.FM=6;
        return FM;
     }
}
