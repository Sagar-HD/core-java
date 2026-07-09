package com.xworkz;

import com.xworkz.dto.EmployeeDto;
import com.xworkz.dto.StudentDto;
import com.xworkz.dto.Version;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ///Employee nartural order by name length is same then by name
        //custom comparator by id
        EmployeeDto employeeDto = new EmployeeDto(1, "John");
        EmployeeDto employeeDto1 = new EmployeeDto(2, "A");
        EmployeeDto employeeDto2 = new EmployeeDto(3, "Bob");
        List<EmployeeDto> list=new ArrayList<>();
        list.add(employeeDto);
        list.add(employeeDto1);
        list.add(employeeDto2);


        Collections.sort(list); //natural order sort
        System.out.println(list);
        Collections.sort(list,(emp1,emp2)->Integer.compare(emp1.getId(),emp2.getId()));
        System.out.println(list);
        list.stream().sorted().forEach(System.out::println);
        list.stream().sorted((emp1,emp2)->Integer.compare(emp1.getId(),emp2.getId())).forEach(System.out::println);

        /*
        Student Ranking

Create a Student class with rollNo, name, and marks.

Natural order:

Marks descending
If marks are equal → name ascending
If names are equal → roll number ascending

Sort using both approaches.
        *
        *
        *
        * */
        StudentDto studentDto = new StudentDto(70, "Alice", 1);
        StudentDto studentDto1 = new StudentDto(75, "Bob", 2);
        StudentDto studentDto4 = new StudentDto(80, "SAM", 6);
        StudentDto studentDto3 = new StudentDto(80, "SAM", 5);
        StudentDto studentDto2 = new StudentDto(80, "Charlie", 3);
        List<StudentDto> studentDtoList=new ArrayList<>();
        studentDtoList.add(studentDto);
        studentDtoList.add(studentDto1);
        studentDtoList.add(studentDto4);
        studentDtoList.add(studentDto3);
        studentDtoList.add(studentDto2);

        Collections.sort(studentDtoList);
        System.out.println(studentDtoList);

        /*
        * Q6. Version Numbers

Create a Version class with major, minor, and patch.

Natural order:

major
then minor
then patch
        *
        * */
        Version version = new Version(1, 1, 1);
        Version version1 = new Version(2, 2, 2);
        Version version2 = new Version(1, 3, 3);
        Version version3 = new Version(1, 1, 4);
        List<Version> versionList=new ArrayList<>();
        versionList.add(version);
        versionList.add(version1);
        versionList.add(version2);
        versionList.add(version3);

        Collections.sort(versionList);
        System.out.println(versionList);

        ///

        //sort by major number
        Collections.sort(versionList,(v1,v2)->Integer.compare(v1.getMajorNumber(),v2.getMajorNumber()));

        //sort employee only based on name
        Collections.sort(list,(emp1,emp2)->emp1.getName().compareTo(emp2.getName()));
        System.out.println(list);

        //using streams
        list.stream().sorted((emp1,emp2)->emp1.getName().compareTo(emp2.getName())).forEach(System.out::println);

        //reusable comparator
        Comparator<EmployeeDto> nameComparator = (emp1, emp2)->emp1.getName().compareTo(emp2.getName());
        Collections.sort(list,nameComparator);
        System.out.println(list);

        list.stream().sorted(nameComparator).forEach(System.out::println);


        //Comparator chaining

        Comparator<EmployeeDto> tieBreakerComparator=Comparator.comparingInt((EmployeeDto emp)-> {
            return emp.getName().length();
        }).thenComparing(nameComparator);

        Collections.sort(list,tieBreakerComparator);
        System.out.println(list);


        //reversing a list
        Collections.reverse(list);
        System.out.println(list);

        //geting reverse order comparator of natural order
        Comparator<EmployeeDto> reverseCmp=Collections.reverseOrder();
        Collections.sort(list,reverseCmp);
        System.out.println(list);




    }
}
