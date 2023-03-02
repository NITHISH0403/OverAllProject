package org.example.Package.Frequency;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.logging.*;

public class Frequency {
        HashMap<String, Integer> map = new HashMap<>();
        String[] str;
        String line;
        StringBuilder text = new StringBuilder(" ");
        Logger l = Logger.getLogger("com.api.jar");

        public Frequency() throws IOException {
            //Open File in read mode
            FileReader file = new FileReader("C:\\Users\\Tringapps-user16\\OneDrive\\Documents\\TextFile.txt");
            BufferedReader br = new BufferedReader(file);
            //Reads each line
            while ((line = br.readLine()) != null) {
                text.append(line);
            }
        }
        public void read() {
            str = text.toString().split(" ");
            for (int i = 0; i < str.length; i++) {
                String val = str[i];
                l.log(Level.INFO, () -> val);
                //this method returns true if some keys equal to the key exits
                if (map.containsKey(str[i])) {
                    map.put(str[i], map.get(str[i]) + 1);
                } else {
                    map.put(str[i], 1);
                }
            }
            l.info("Sorted text....");
            PriorityQueue<Map.Entry<String, Integer>> p = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
            p.addAll(map.entrySet());
            while (!p.isEmpty()) {
                l.log(Level.INFO, () -> String.valueOf(p.poll()));
            }
        }
}