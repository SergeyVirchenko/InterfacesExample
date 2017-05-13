package serialization;

import java.io.*;

/**
 * Created by Sergey on 12-May-17.
 */
public class SerializationDemo {
    public static void main(String[] args) {
        try {
            // сериализация
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            Object objSave = new Integer(1);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(objSave);

            // смотрим, во что превратился сериализованный объект
            byte[] bArray = os.toByteArray();
            for (byte b : bArray) {
                System.out.print((char) b);
            }
            System.out.println();
// десериализация
            ByteArrayInputStream is = new ByteArrayInputStream(bArray);
            ObjectInputStream ois = new ObjectInputStream(is);
            Object objRead = ois.readObject();
            // проверяем идентичность объектов
            System.out.println("readed object is: " + objRead.toString());
            System.out.println("Object equality is: " + (objSave.equals(objRead)));
            System.out.println("Reference equality is: " + (objSave == objRead));
        } catch (NotSerializableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
