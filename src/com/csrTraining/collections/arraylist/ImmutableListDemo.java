package com.csrTraining.collections.arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
//
//      addTenDollar(list);   //
        System.out.println("Original List is: "+ String.valueOf(list));
        Collections.sort(list);
        System.out.println("Ascending order sorted List is: "+ String.valueOf(list));
        list.sort(Comparator.reverseOrder());
        System.out.println("descending order sorted List is: "+ String.valueOf(list));
        list= Collections.unmodifiableList(list);
        addTenDollar(list);

    }


    private static int addTenDollar(List<Integer>list)
    {
        Logger logger= Logger.getLogger(ImmutableListDemo.class.getName());
        try
        {
            list.add(545);
            for (Integer name :list)
            {
                System.out.println("Name is : "+ name);
            }
        }
        catch (Exception e)
        {
            logger.warning("You can not modify Immutable List. ");
        }
        finally {
            System.out.println("Program Executed Successfully.");
        }

        return 0;
    }

}
