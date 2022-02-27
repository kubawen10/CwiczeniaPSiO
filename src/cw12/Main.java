package cw12;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Student> studenci = new HashMap<Integer, Student>();
        Student s1= new Student("mariusz", "pudzian");
        Student s2= new Student("mariusz", "chudzian");
        studenci.put(1, s1);
        studenci.put(2, s2);
        System.out.println(studenci);
    }
}
