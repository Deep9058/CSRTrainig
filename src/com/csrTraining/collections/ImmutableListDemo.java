package com.csrTraining.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class ImmutableListDemo{


    static void main(String[] args) {
        Logger logger= Logger.getLogger(ImmutableListDemo.class.getName());
        List<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(58);
        list.add(264);
        list.add(100);
//        list= Collections.unmodifiableList(list);
//        addTenDollar(list);   //
        System.out.println("Original List is: "+ String.valueOf(list));
        Collections.sort(list);
        System.out.println("Ascending order sorted List is: "+ String.valueOf(list));
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("descending order sorted List is: "+ String.valueOf(list));

    }


    private static List<String> addTenDollar(List<String>list)
    {
        Logger logger= Logger.getLogger(ImmutableListDemo.class.getName());
        try
        {
            list.add(0,"Prakhar");
            for (String name :list)
            {
                System.out.println("Name is : "+ name);
            }
        }
        catch (Exception e)
        {
            logger.info("You can not modify Immutable List. ");
        }
        finally {
            System.out.println("Program Executed Successfully.");
        }

        return list;
    }

}
