package factory;

public class Factory {
    public static Project getProject(String string){
        if (string.equals("Other")){
            return new OtherProject();
        }else if (string.equals("One")){
            return new OneProject();
        }else {
            return null;
        }

    }
}
