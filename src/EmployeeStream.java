import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStream {

    public static void main(String[] args) {
        Stream<Employee> empStream=Stream.of(new Employee(21,21000l,"khan"),

                new Employee(22,22000l,"nawaz"),
                new Employee(28,28000l,"shahnawaz"));
        empStream.sorted().forEach(System.out::println);




       Double avgAge= Stream.of(new Employee(21,21000l,"khan"),

                new Employee(22,22000l,"nawaz"),
                new Employee(28,28000l,"shahnawaz")).collect(Collectors.averagingInt(e->e.getAge()));
        System.out.println("avg age of all given employees is "+avgAge);


        Map<Long, List<Employee>> mapofemps= Stream.of(new Employee(21,21000l,"khan"),

                new Employee(22,21000l,"nawaz"),
                new Employee(28,28000l,"shahnawaz")).collect(Collectors.groupingBy(e->e.getSalary()));

        Iterator itr=mapofemps.keySet().iterator();
        while (itr.hasNext()){
            Long key=(long)itr.next();
            System.out.println("key is "+key);
            System.out.println(mapofemps.get(key));
            System.out.println("###############3");
        }

IntSummaryStatistics s= Stream.of(new Employee(21,21000l,"khan"),

                new Employee(22,22000l,"nawaz"),
                new Employee(28,28000l,"shahnawaz")).collect(Collectors.summarizingInt(e->e.getAge()));
        System.out.println(s);






       Optional<Employee> emp = Stream.of(new Employee(21,21000l,"khan"),

                new Employee(22,22000l,"nawaz"),
                new Employee(28,28000l,"shahnawaz"),
        new Employee(29,28000l,"shah")
       ).collect(Collectors.maxBy((e1,e2)->e1.getAge()-e2.getAge()));
        System.out.println(emp.get());
    }
}
