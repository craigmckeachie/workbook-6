package com.pluralsight.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {


    public static void printEmployee(Employee employee){
        System.out.println("My salary is: " + employee.getSalary());
    }

    public static void main(String[] args) {
        firstLambdaExample();

        List<String> states = getStateNames();

        String letter = "C";

        List<String> matchingStates1 = getMatchingStates1(states, letter);
        System.out.println(matchingStates1);

        List<String> matchingStates2 = getMatchingStates2(states, letter);

        System.out.println(matchingStates2);



        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

        List<Integer> tens = numbers.stream()
                .peek(number -> System.out.println(number))
                .map(number -> number*10)
                .collect(Collectors.toList());

        System.out.println(tens);


    }


    private static List<String> getMatchingStates1(List<String> states, String letter) {
        List<String> matchingStates = new ArrayList<>();
        for (String state: states){
            if(state.startsWith(letter)){
                matchingStates.add(state);
            }
        }
        return matchingStates;
    }

    private static List<String> getMatchingStates2(List<String> states, String letter) {
        List<String> matchingStates = states.stream()
                .filter(state -> state.startsWith(letter))
                .collect(Collectors.toList());
        return matchingStates;
    }



    private static List<String> getStateNames() {
        List<String> states = Arrays.asList(
                "Alabama", "Alaska", "Arizona", "Arkansas",
                "California", "Colorado", "Connecticut", "Delaware",
                "Florida", "Georgia", "Hawaii", "Idaho",
                "Illinois", "Indiana", "Iowa", "Kansas",
                "Kentucky", "Louisiana", "Maine", "Maryland",
                "Massachusetts", "Michigan", "Minnesota", "Mississippi",
                "Missouri", "Montana", "Nebraska", "Nevada",
                "New Hampshire", "New Jersey", "New Mexico", "New York",
                "North Carolina", "North Dakota", "Ohio", "Oklahoma",
                "Oregon", "Pennsylvania", "Rhode Island", "South Carolina",
                "South Dakota", "Tennessee", "Texas", "Utah",
                "Vermont", "Virginia", "Washington", "West Virginia",
                "Wisconsin", "Wyoming"
        );
        return states;
    }

    private static void firstLambdaExample() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ezra", "Actor", 72750.0));
        employees.add(new Employee("Ian", "Banker", 252750.0));
        employees.add(new Employee("Siddalee", "Model", 1500000.0));
        employees.add(new Employee("Elisha", "Programmer", 103500.0));
        employees.add(new Employee("Pursalane", "Teacher", 697250.0));
        employees.add(new Employee("Zephaniah", "Engineer", 136000.0));

        //passing a full method
        employees.forEach(Program::printEmployee);

        //passing an inline method (lambda)
        employees.forEach( employee -> System.out.println("My salary in a lambda is:" + employee.getSalary()));
    }


}
