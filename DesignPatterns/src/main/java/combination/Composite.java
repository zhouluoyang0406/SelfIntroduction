package combination;

import java.util.ArrayList;
import java.util.List;

public  class Composite extends Component{
    private List<Component> componentArrayList=new ArrayList<Component>();
    public void add(Component component){
        componentArrayList.add(component);
    }
    public void remove(Component component){
        componentArrayList.remove(component);

    }
    public List<Component> getChildren(){
        return componentArrayList;
    }
}
