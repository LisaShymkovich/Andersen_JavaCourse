package org.example;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Иванов Иван", "Инженер", "ivivan@почта.рф", "892312312", 30000, 30);
        employeeArray[1] = new Employee("Петров Петр", "Менеджер", "petrov@почта.рф", "89112223344", 40000, 45);
        employeeArray[2] = new Employee("Сидоров Сидор", "Аналитик", "sidorov@почта.рф", "89005556677", 35000, 42);
        employeeArray[3] = new Employee("Смирнова Анна", "Дизайнер", "anna.smirnova@почта.рф", "89103334455", 32000, 26);
        employeeArray[4] = new Employee("Кузнецов Алексей", "Разработчик", "alex.kuznetsov@почта.рф", "89229998877", 50000, 40);

        for(int i=0; i< employeeArray.length; i++){
            if(employeeArray[i].getAge()>40){
                employeeArray[i].printEmployee();
            }
        }
    }
}