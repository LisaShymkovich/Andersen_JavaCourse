package org.example;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployee(){
        System.out.println("ФИО:"+fullName+
                            "\nДолжность:"+ position +
                            "\nEmail:"+ email +
                            "\nТелефон:"+ phone+
                            "\nЗарплата:"+ salary+
                            "\nВозраст:"+ age+
                            "\n");
    }

    public int getAge() {
        return age;
    }


}
