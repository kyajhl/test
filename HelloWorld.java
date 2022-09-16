
import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class HelloWorld {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("@@" + i);

//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myJava//66.txt"));

        System.out.println(666);
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        stringIntegerHashMap.put("kkk", 20);
        Set<Map.Entry<String, Integer>> entries =
                stringIntegerHashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);
        }

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(20);
        integers.add(10);
        integers.add(30);
        integers.add(50);
        integers.add(40);
        integers.forEach(System.out::println);
        integers.stream().sorted().forEach(x -> System.out.println(x));

        InetAddress byName = InetAddress.getByName("LAPTOP-G62ERAV8");
        System.out.println(byName.getHostName());
        System.out.println(byName.getHostAddress());

//        Socket s = new Socket("192.168.2.3",10086);
//        ServerSocket ss = new ServerSocket();
//        Socket s1 = ss.accept();
        Iterator<Integer> iterator = integers.iterator();
    }
}