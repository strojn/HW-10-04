package org.example;

import org.example.deserialization.Animal;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("...");

        Animal animal = new Animal("stringDefault",
                "stringPublic", "stringProtected");
        Animal.stringPublicStatic = "stringPublicStatic";
        Animal.setStringPrivateStatic("stringPrivateStatic");

        String filename = "fileAnimal.ser";

        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(animal);

            out.close();
            file.close();

            System.out.println("Object has been serialized.");
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        Animal animal1 = null;

        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            animal1 = (Animal)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println(animal1);
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}