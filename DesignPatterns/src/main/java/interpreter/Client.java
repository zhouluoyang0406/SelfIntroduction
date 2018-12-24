package interpreter;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        String ex="a+b-c";
        HashMap<String,Integer> var=new HashMap<String, Integer>();
        var.put("a",3);
        var.put("b",4);
        var.put("c",1);
        Calculator cal=new Calculator(ex);//封装成一棵树
        System.out.println(cal.run(var));

    }
}
