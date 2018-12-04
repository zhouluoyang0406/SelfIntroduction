package proto;

import java.util.ArrayList;

public class Thing implements Cloneable {
    String name;
    String address;
    Integer age;
    ArrayList<String> oldnames;
    @Override
    public Thing clone(){
        Thing thing=null;
        try {
            thing=(Thing)super.clone();
            thing.oldnames=(ArrayList<String>)thing.oldnames.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return thing;
    }
}
