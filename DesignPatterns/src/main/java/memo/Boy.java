package memo;

import lombok.Data;

/**
 * Created by appleluo on 2018/9/15.
 */
@Data
public class Boy {
    private String state ="";

   public Memento createMento(){
       return new Memento(this.state);
   }
    public void restoreMento(Memento memento){
         this.state=memento.getState();
    }
}
