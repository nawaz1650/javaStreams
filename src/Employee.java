public class Employee implements Comparable<Employee> {
    private int age;
    private Long salary;
    private String name;

    public Employee(int age, Long salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public Employee() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return (int)(this.salary-o.salary);
    }
}
