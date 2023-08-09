package com.workintech.company.main;

import com.workintech.company.model.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Mert", "Cenk"));
        employees.add(new Employee(1, "Mert", "Cenk"));
        employees.add(new Employee(2, "Melis", "Yılmaz"));
        employees.add(new Employee(2, "Melis", "Yılmaz"));
        employees.add(new Employee(3, "Ali", "Cenk"));
        employees.add(new Employee(3, "Ali", "Cenk"));

        Map<Integer, Employee> employeeMap = new HashMap<>();
        List<Employee> deletedEmployees = new ArrayList<>();

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if(employeeMap.containsKey(employee.getId())) {;
            deletedEmployees.add(employee);
        } else {
                employeeMap.put(employee.getId(), employee);
            }
        }

        System.out.println(employees);
        System.out.println(employeeMap);

    }
}