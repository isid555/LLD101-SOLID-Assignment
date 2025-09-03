class EmployeeCSVadapter implements Employee{

   private EmployeeCSV employeeCSV;
    public EmployeeCSVadapter(EmployeeCSV employeeCSV){
        this.employeeCSV = employeeCSV;
    }


    //overide
    public String getId(){
        return employeeCSV.tokens()[0];
    }
    public  String getFirstName(){
        return employeeCSV.tokens()[1];
    }
   public String getLastName(){
       return employeeCSV.tokens()[2];
   }
    public String getEmail(){
        return employeeCSV.tokens()[3];
    }

}