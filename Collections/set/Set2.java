package set;

import set.dto.SnackDTO;

import java.io.Serializable;
import java.util.*;
import java.util.Set;
import java.util.stream.Collectors;

public class Set2 {


    public static void main(String[] args) {

        //Create HashSet of 5 SnackDTO objects
        //Add duplicate snack and verify it's not added
        HashSet<SnackDTO> snacksset=new HashSet<>();
        snacksset.add(new SnackDTO("sweet","chocolate",10.0,100.0));
        snacksset.add(new SnackDTO("sweet","chocolate",10.0,100.0));
        snacksset.add(new SnackDTO("sweet","chocolate",10.0,100.0));
        snacksset.add(new SnackDTO("sweet","chocolate",10.0,100.0));
        snacksset.add(new SnackDTO("sweet","chocolate",10.0,100.0));

        snacksset.forEach(System.out::println);

       // Remove a snack by creating new object with same values
        snacksset.remove(new SnackDTO("sweet","chocolate",10.0,100.0));
        System.out.println(snacksset.size());
        snacksset.add(new SnackDTO("sweet","chocolate",10.0,100.0));
        //Check if snack exists using contains()
        System.out.println(snacksset.contains(new SnackDTO("sweet","chocolate",10.0,100.0)));
        System.out.println(snacksset.contains(new SnackDTO("salty","chips",20.0,50.0)));
        snacksset.clear();
        System.out.println(snacksset.size());
        if(snacksset.isEmpty()){
            System.out.println("set is empty");
        }
       snacksset.add(new SnackDTO("sweet","chocolate",10.0,100.0));
       snacksset.add(new SnackDTO("salty","chips",20.0,50.0));
       snacksset.add(new SnackDTO("sweet","candy",15.0,200.0));
       snacksset.add(new SnackDTO("sweet","candy",15.0,200.0));
       snacksset.add(new SnackDTO("sweet","candy",15.0,200.0));
        SnackDTO[] snacksarray=snacksset.toArray(new SnackDTO[1]);
       snacksset.forEach((item)->{
           System.out.println(item);
       });

        Iterator<SnackDTO> snacksit=snacksset.iterator();
        while(snacksit.hasNext()){
            System.out.println(snacksit.next());

        }
        System.out.println(snacksset.size());
       snacksset.removeIf((snack)->snack.getPrice()>10);
       System.out.println(snacksset.size());


       HashSet<SnackDTO> setWithInitailCapacity=new HashSet<>(10);
       //load factor grow when 0.5 part of capacity is filled
        HashSet<SnackDTO> setWithInitailCapacityAndLoadFactor=new HashSet<>(10,0.5f);

        setWithInitailCapacityAndLoadFactor.addAll(snacksset);
        System.out.println(setWithInitailCapacityAndLoadFactor.size());

        setWithInitailCapacityAndLoadFactor.retainAll(snacksset);
        System.out.println(setWithInitailCapacityAndLoadFactor.size());

        setWithInitailCapacityAndLoadFactor.removeAll(snacksset);
        System.out.println(setWithInitailCapacityAndLoadFactor.size());

        System.out.println(setWithInitailCapacityAndLoadFactor.containsAll(snacksset));

        List<SnackDTO> snacksList=new ArrayList<>();
        snacksList.addAll(snacksset);
        System.out.println(snacksList.size());

        HashSet<SnackDTO> setFromList=new HashSet<>(snacksList);
        System.out.println(setFromList.size());

        HashSet<SnackDTO> setFromArray = new HashSet<>(Arrays.asList(snacksarray));
        System.out.println(setFromArray.size());

       SnackDTO maxPriceSnack = setFromArray.stream().reduce((snack1, snack2)->snack1.getPrice()>snack2.getPrice()?snack1:snack2).get();
       System.out.println(maxPriceSnack);

       long count=setFromArray.stream().filter((snack)->snack.getFlavor().equals("sweet")).count();

        System.out.println(count);

        int totalweight=(int) setFromArray.stream().mapToDouble(SnackDTO::getWeight).sum();
        System.out.println(totalweight);

        Map<String, Set<SnackDTO>> group=setFromArray.stream().collect(Collectors.groupingBy((snack)->snack.getFlavor(),Collectors.toSet()));
        System.out.println(group);


        HashSet<SnackDTO> copyset=(HashSet<SnackDTO>) setFromArray.clone();
        System.out.println(copyset);


        TreeSet<SnackDTO> treeSet=new TreeSet<>();

        treeSet.add(new SnackDTO("snack1", "salty", 10.0, 50.0));
        treeSet.add(new SnackDTO("snack2", "sweet", 20.0, 100.0));
        treeSet.add(new SnackDTO("snack3", "salty", 30.0, 150.0));
        treeSet.add(new SnackDTO("snack4", "sweet", 40.0, 200.0));
        treeSet.add(new SnackDTO("snack5", "sweet", 50.0, 250.0));

        System.out.println(treeSet);

        TreeSet<SnackDTO> treeSet2=new TreeSet<>((snack1,snack2)->snack1.getName().compareTo(snack2.getName()));
        treeSet2.addAll(treeSet);
        System.out.println(treeSet2);


        SnackDTO lowestSnack=treeSet2.stream().sorted((snack1,snack2)->Double.compare(snack1.getPrice(),snack2.getPrice())).findFirst().orElse(null);
        System.out.println(lowestSnack);
        System.out.println(treeSet2.headSet(new SnackDTO("snack1", "salty", 10.0, 50.0)));
        System.out.println(treeSet2.tailSet(new SnackDTO("snack5", "sweet", 50.0, 250.0)));
        System.out.println( treeSet2.subSet(new SnackDTO("snack1", "salty", 10.0, 50.0), new SnackDTO("snack5", "sweet", 50.0, 250.0)));



        
    }


}
