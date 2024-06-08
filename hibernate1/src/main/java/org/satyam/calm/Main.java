package org.satyam.calm;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        // Create employee
        Employee employee = new Employee(11l,"John Doe", "Developer");
        employeeDAO.saveEmployee(employee);
       
        // Read employees
        List<Employee> employees = (List<Employee>) employeeDAO.getEmployees();
        employees.forEach(emp -> System.out.println(emp.getName()));

        // Update employee
        Employee existingEmployee = employeeDAO.getEmployee(employee.getId());
        System.out.println("existingEmployeexxxxxxxxxxxxxxxxxxxxxxxxxx"+existingEmployee.getName());
        Employee existingEmployee1 = employeeDAO.getEmployee(employee.getId());
        System.out.println("existingEmployeeyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy"+existingEmployee1.getName());
        existingEmployee.setRole("Senior Developer");
        employeeDAO.updateEmployee(existingEmployee);

        // Delete employee
       // employeeDAO.deleteEmployee(employee.getId());
    }
}
