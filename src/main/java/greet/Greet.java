package greet;

import java.util.HashMap;
import java.util.Locale;

public class Greet {

    HashMap<String, Integer> list = new HashMap<>();

    public void greetPerson(String name, int lang) {
        String lName = name.toLowerCase(Locale.ROOT);
        if(this.list.containsKey(lName)) {
            int incr = this.list.get(lName) +1;
            this.list.replace(lName,incr);
        }else{
            this.list.put(lName, 1);
        }

        switch (lang){
            case 1 :
                System.out.println("Molo "+ lName);
                break;
            case 2 :
                System.out.println("Hello "+ lName);
                break;
            case 3 :
                System.out.println("Sawubona "+ lName);
                break;
            default:
                System.out.println("Molo "+ lName);
                break;
        }


    }

    public void greeted(){
        System.out.println(this.list);
    }

    public int greeted(String name){
        String lName = name.toLowerCase(Locale.ROOT);

        return this.list.get(lName);
    }

    public int counter(){
        return this.list.size();
    }

    public void clear(){
        this.list.clear();
    }

    public void clear(String name){
        String lName = name.toLowerCase(Locale.ROOT);
        this.list.remove(lName);
    }

    public void exit(){
        System.exit(0);
    }

    public void help(){

    }

}
