/**
 * Created by Pranith on 5/9/16.
 */

import java.io.*;
import java.util.*;

public class javaClass {

    public static void main(String[] args)
    {
        String fileName="data.csv";
        File file=new File(fileName);

        try {
            Scanner input=new Scanner(file);
            double sum=0;
            double totalSum=0;
            double count=0;

            input.next();

            while(input.hasNext())
            {

                String data=input.next();
                String[] values=data.split(",");
                System.out.println(values[1]);
                sum=Double.parseDouble(values[1]);
                totalSum+=sum;
                count++;
            }

            System.out.println("The average is: "+(totalSum)/count);
        }


        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
