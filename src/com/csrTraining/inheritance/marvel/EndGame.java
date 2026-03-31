package com.csrTraining.inheritance.marvel;

public class EndGame {
    static void main() {
     IronMan iron= new IronMan();
     SpiderMan spider= new SpiderMan();
     CaptainAmerica cap=new CaptainAmerica();
     iron.usePower();
     spider.usePower();
     cap.usePower();
     iron.walk();
     cap.sleep();
     spider.eat("Chole bhatoore");

    }
}
