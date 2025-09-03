class EmployeeDBAdapter implements Employee{
    private EmployeeDB employeeDb;

   public EmployeeDBAdapter(EmployeeDB employeeDb){
        this.employeeDb= employeeDb;
    }


    public  String getId(){
        return String.valueOf(employeeDb.getId());
    }
    public  String getFirstName(){
            return employeeDb.getFirstName();
    }
    public  String getLastName(){
        return employeeDb.getSurname();
    }
    public String getEmail(){
        return employeeDb.getEmailAddress();
    }
}