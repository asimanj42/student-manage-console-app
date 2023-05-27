/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.management.RuntimeErrorException;

/**
 *
 * @author ASUS
 */
public class FileUtility {

    public static Object readFileDeserialize(String name) {

        Object obj = null;

        try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream(name))) {
            obj = in.readObject();
        } finally {
            return obj;
        }

    }

    public static boolean writeObjectToFile(Object object, String name) throws RuntimeException {

        try ( FileOutputStream fout = new FileOutputStream(name)) {
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(object);
            return true;
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }
}
