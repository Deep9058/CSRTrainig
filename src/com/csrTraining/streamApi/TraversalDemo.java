package com.csrTraining.streamApi;
import com.packages.MyClass;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class TraversalDemo {
    static void main(String[] args) {

        Logger logger= Logger.getLogger(MyClass.class.getName());
        ArrayList<String> list= new ArrayList<>();
        list.add("Supply");
        list.add("HR");
        list.add("Sales");
        list.add("Development");
        list.add("Testing");

        Stream<String> listStream = list.stream();
       try{
           listStream.forEach(System.out::println);  //      Stream traversal successfully   //
           listStream.forEach(System.out::println);  //      Runtime Exception (IllegalStateException) because it allows only once   //
       }
       catch (Exception e)
       {
           logger.warning(e.getMessage());      //  IllegalStateException-> "stream has already been operated upon or closed" //
       }
    }
}
