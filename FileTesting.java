package FileIO3;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

class TrythisFile{
    public static void writeFile(Integer id,String name,String classroom,String subject){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("TestFile.csv",true);
            String content = id + "," + name + "," + classroom + "," + subject + "\n";
            fileOutputStream.write(content.getBytes());
            fileOutputStream.close();
            System.out.println("Successfully wrote to the file");
        }catch(Exception ignore){}
    }
    public static void readFile(){
        try {
            BufferedReader fileInputStream = new BufferedReader(new FileReader("TestFile.csv"));
            String line;
            while((line=fileInputStream.readLine())!=null){
                System.out.println(line);
            }
            fileInputStream.close();
        }catch (Exception ignore){}
    }
}

public class FileTesting {
    public static void main(String[] args) {
        String[] arr = new String[]{"Python","Java","DevOps","CyberSecurity","WebDesign", "BlockChain"};
        Random random = new Random();
        String randomString = arr[random.nextInt(arr.length)];
        Scanner input = new Scanner(System.in);
        System.out.print("Name:");
        TrythisFile.writeFile(random.nextInt(100),input.nextLine(), "SV"+random.nextInt(12), randomString);
        TrythisFile.readFile();
    }
}

