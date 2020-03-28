package json;

import json.list.*;
import java.io.File;
import java.util.Scanner;

/**
 * Implementasi Linkedlist di java
 * 
 * @author Aqil Fiqran Dzi'Ul Haq
 * @since 10-Maret-2020
 */
public class Main {
    public static void main(String q[]) {
        Linkedlist ll = new Linkedlist();

        try {
            File file = new File("json/file/data.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String data[] = sc.nextLine().split("::");
                ll.add(new Data(data[0]));
            }
            sc.close();
            ll.search(q[0]);
        } catch (Exception e) {
            System.out.println("file not found..");
        }

    }
}