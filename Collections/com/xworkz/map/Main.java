package com.xworkz.map;

import com.xworkz.map.dto.DepartmentDTO;
import com.xworkz.map.dto.EmployeeDTO;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        List all methods of Map
//        Perform operations using DTO & DTO as key and values
//        Find Difference between HashTable vs HashMap vs LinkedHashMap vs TreeMap

        Map<DepartmentDTO, EmployeeDTO> hashMap = new HashMap<>();
        Map<DepartmentDTO, EmployeeDTO> linkedHashMap = new LinkedHashMap<>();
        Map<DepartmentDTO, EmployeeDTO> treeMap = new TreeMap<>();

        DepartmentDTO dept1 = new DepartmentDTO("IT", "Bangalore", 50, 5000000);
        DepartmentDTO dept2 = new DepartmentDTO("HR", "Mumbai", 20, 2000000);
        DepartmentDTO dept3 = new DepartmentDTO("Finance", "Delhi", 30, 3000000);
        DepartmentDTO dept4 = new DepartmentDTO("Marketing", "Chennai", 25, 2500000);
        DepartmentDTO dept5 = new DepartmentDTO("Operations", "Pune", 40, 4000000);
        DepartmentDTO dept6 = new DepartmentDTO("Sales", "Hyderabad", 35, 3500000);
        DepartmentDTO dept7 = new DepartmentDTO("R&D", "Bangalore", 60, 6000000);
        DepartmentDTO dept8 = new DepartmentDTO("Legal", "Delhi", 15, 1500000);
        DepartmentDTO dept9 = new DepartmentDTO("Support", "Mumbai", 45, 4500000);
        DepartmentDTO dept10 = new DepartmentDTO("Admin", "Chennai", 10, 1000000);

        EmployeeDTO emp1 = new EmployeeDTO(1, "Rahul", "rahul@xworkz.com", "IT");
        EmployeeDTO emp2 = new EmployeeDTO(2, "Priya", "priya@xworkz.com", "HR");
        EmployeeDTO emp3 = new EmployeeDTO(3, "Amit", "amit@xworkz.com", "Finance");
        EmployeeDTO emp4 = new EmployeeDTO(4, "Sneha", "sneha@xworkz.com", "Marketing");
        EmployeeDTO emp5 = new EmployeeDTO(5, "Vikram", "vikram@xworkz.com", "Operations");
        EmployeeDTO emp6 = new EmployeeDTO(6, "Neha", "neha@xworkz.com", "Sales");
        EmployeeDTO emp7 = new EmployeeDTO(7, "Raj", "raj@xworkz.com", "R&D");
        EmployeeDTO emp8 = new EmployeeDTO(8, "Kavita", "kavita@xworkz.com", "Legal");
        EmployeeDTO emp9 = new EmployeeDTO(9, "Suresh", "suresh@xworkz.com", "Support");
        EmployeeDTO emp10 = new EmployeeDTO(10, "Anita", "anita@xworkz.com", "Admin");

        hashMap.put(dept1, emp1);
        hashMap.put(dept2, emp2);
        hashMap.put(dept3, emp3);
        hashMap.put(dept4, emp4);
        hashMap.put(dept5, emp5);
        hashMap.put(dept6, emp6);
        hashMap.put(dept7, emp7);
        hashMap.put(dept8, emp8);
        hashMap.put(dept9, emp9);
        hashMap.put(dept10, emp10);

        linkedHashMap.put(dept1, emp1);
        linkedHashMap.put(dept2, emp2);
        linkedHashMap.put(dept3, emp3);
        linkedHashMap.put(dept4, emp4);
        linkedHashMap.put(dept5, emp5);
        linkedHashMap.put(dept6, emp6);
        linkedHashMap.put(dept7, emp7);
        linkedHashMap.put(dept8, emp8);
        linkedHashMap.put(dept9, emp9);
        linkedHashMap.put(dept10, emp10);

        treeMap.put(dept1, emp1);
        treeMap.put(dept2, emp2);
        treeMap.put(dept3, emp3);
        treeMap.put(dept4, emp4);
        treeMap.put(dept5, emp5);
        treeMap.put(dept6, emp6);
        treeMap.put(dept7, emp7);
        treeMap.put(dept8, emp8);
        treeMap.put(dept9, emp9);
        treeMap.put(dept10, emp10);




        DepartmentDTO newDept = new DepartmentDTO("Quality", "Kolkata", 12, 1200000);
        EmployeeDTO newEmp = new EmployeeDTO(11, "Deepak", "deepak@xworkz.com", "Quality");
        hashMap.put(newDept, newEmp);
        System.out.println("Added new entry: " + newDept + " -> " + newEmp);


        EmployeeDTO retrievedEmp = hashMap.get(dept1);
        System.out.println("Employee for IT department: " + retrievedEmp);


        EmployeeDTO removedEmp = hashMap.remove(dept10);
        System.out.println("Removed: " + removedEmp);
        System.out.println("Size after removal: " + hashMap.size());


        System.out.println("Contains IT department: " + hashMap.containsKey(dept1));
        System.out.println("Contains Admin department: " + hashMap.containsKey(dept10));


        System.out.println("Contains emp1: " + hashMap.containsValue(emp1));
        System.out.println("Contains emp10: " + hashMap.containsValue(emp10));


        System.out.println("HashMap size: " + hashMap.size());
        System.out.println("LinkedHashMap size: " + linkedHashMap.size());
        System.out.println("TreeMap size: " + treeMap.size());


        System.out.println("HashMap is empty: " + hashMap.isEmpty());
        Map<DepartmentDTO, EmployeeDTO> emptyMap = new HashMap<>();
        System.out.println("Empty map is empty: " + emptyMap.isEmpty());

        System.out.println("HashMap keys: " + hashMap.keySet());


        System.out.println("HashMap values: " + hashMap.values());


        System.out.println("HashMap entries:");
        for (Map.Entry<DepartmentDTO, EmployeeDTO> entry : hashMap.entrySet()) {
            System.out.println("  " + entry.getKey() + " = " + entry.getValue());
        }




        Map<DepartmentDTO, EmployeeDTO> targetMap = new HashMap<>();
        targetMap.putAll(hashMap);
        System.out.println("TargetMap size after putAll: " + targetMap.size());


        DepartmentDTO testDept = new DepartmentDTO("IT", "Bangalore", 50, 5000000);
        EmployeeDTO testEmp = new EmployeeDTO(99, "Test", "test@xworkz.com", "IT");
        hashMap.putIfAbsent(testDept, testEmp);
        System.out.println("putIfAbsent on existing key - value unchanged: " + hashMap.get(dept1));
        hashMap.putIfAbsent(newDept, testEmp);
        System.out.println("putIfAbsent on new key - value added");


        EmployeeDTO defaultEmp = hashMap.getOrDefault(dept10, new EmployeeDTO(0, "Default", "default@xworkz.com", "None"));
        System.out.println("getOrDefault for removed key: " + defaultEmp);


        EmployeeDTO replacedEmp = hashMap.replace(dept1, new EmployeeDTO(1, "Rahul Updated", "rahul.updated@xworkz.com", "IT"));
        System.out.println("Replaced employee: " + replacedEmp);
        System.out.println("New value: " + hashMap.get(dept1));


        boolean removed = hashMap.remove(dept2, emp2);
        System.out.println("Removed dept2 with emp2: " + removed);
        boolean notRemoved = hashMap.remove(dept3, emp2);
        System.out.println("Removed dept3 with emp2 (wrong value): " + notRemoved);
        /*
        putIfAbsent(key, value): Only puts if key is absent
        replace(key, value): Only replaces if key exists
        remove(key): Only removes if key exists
        remove(key, value): Only removes if both key AND value match
         */


    }
}
