import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStream {
    //All the code written below is intended to just get our hand dirty and get some familiarity with stream API
    public static void main(String[] args) {
        //creating the emp stream
        Stream<Employee> empStream=Stream.of(new Employee(21,21000l,"khan"),

                new Employee(22,22000l,"nawaz"),
                new Employee(28,28000l,"shahnawaz"));
        //sorting the element of stream on the basis of salary
        empStream.sorted().forEach(System.out::println);



    //making use of avergingInt function to get the avg age of employees
       Double avgAge= Stream.of(new Employee(21,21000l,"khan"),

                new Employee(22,22000l,"nawaz"),
                new Employee(28,28000l,"shahnawaz")).collect(Collectors.averagingInt(e->e.getAge()));
        System.out.println("avg age of all given employees is "+avgAge);

        //grouping the stream element on the basis of salary
        Map<Long, List<Employee>> mapofemps= Stream.of(new Employee(21,21000l,"khan"),

                new Employee(22,21000l,"nawaz"),
                new Employee(28,28000l,"shahnawaz")).collect(Collectors.groupingBy(e->e.getSalary()));
    //traversing the newly created map
        Iterator itr=mapofemps.keySet().iterator();
        while (itr.hasNext()){
            Long key=(long)itr.next();
            System.out.println("key is "+key);
            System.out.println(mapofemps.get(key));
            System.out.println("###############3");
        }
        //summarizing age param of all employees
IntSummaryStatistics s= Stream.of(new Employee(21,21000l,"khan"),

                new Employee(22,22000l,"nawaz"),
                new Employee(28,28000l,"shahnawaz")).collect(Collectors.summarizingInt(e->e.getAge()));
        System.out.println(s);





//getting the eldest employees from the stream
       Optional<Employee> emp = Stream.of(new Employee(21,21000l,"khan"),

                new Employee(22,22000l,"nawaz"),
                new Employee(28,28000l,"shahnawaz"),
        new Employee(29,28000l,"shah")
       ).collect(Collectors.maxBy((e1,e2)->e1.getAge()-e2.getAge()));
        System.out.println(emp.get());
    }

}
