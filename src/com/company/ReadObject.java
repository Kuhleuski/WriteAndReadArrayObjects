package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person[] people = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(people));

            /**Ниже считывается циклом по одному объекту из массива*/
             /* int personCount= ois.readInt();
              Person[] people = new Person[personCount];

              for (int i=0;i<personCount;i++){
                  people[i]= (Person) ois.readObject();*/

            ois.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
