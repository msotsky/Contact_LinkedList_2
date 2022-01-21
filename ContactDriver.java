import java.util.*;
import java.io.*;
public class ContactDriver {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("No file given");
            System.out.println(1);
        }


        File readIn = new File(args[0]);

        LinkedList lisr = new LinkedList();

        try{
            Scanner scan = new Scanner(readIn);

            while(scan.hasNext()){
                String name = scan.next();
                int month = scan.nextInt();
                int day = scan.nextInt();
                Contact temp = new Contact(name, month, day);
                System.out.println(temp);
                
                list.addEnd(temp);
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        System.out.println(list);
    }
}
