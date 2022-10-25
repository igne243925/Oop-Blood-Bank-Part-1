import java.util.*;

public class RunBloodData{
public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter blood type of patient: ");
    String i1 = s.nextLine();

    System.out.print("Enter the Rhesus factor (+ or -): ");
    String i2 = s.nextLine();

    if(i1.equals("O")){
    BloodData bd = new BloodData(i1,i2);
    
    if(i2.equals("+")){
    bd.display();
    }

    else if(i2.equals("-")){
    bd.display();
    }
    
    else{
    System.out.println("Invalid");
    }
}
    else if(i1.isEmpty()){
    BloodData bd = new BloodData();
    
    if(i2.isEmpty()){
    bd.display();
    }
    
    else{
    System.out.println("Invalid");
    }
 }


    else if(i1.equals("A") ){
    BloodData bd = new BloodData(i1,i2);
    
    if(i2.equals("+")){
    bd.display();
    }
    
    else if(i2.equals("-")){
    bd.display();
    }
    else{
    System.out.println("Invalid");
    }
}

    else if(i1.equals("B")){
    BloodData bd = new BloodData(i1,i2);
    
    if(i2.equals("+")){
    bd.display();
    }
    
    else if(i2.equals("-")){
    bd.display();
    }
   
    else{
    System.out.println("Invalid");
    }
}
    else if(i1.equals("AB")){
    BloodData bd = new BloodData(i1,i2);
    
    if(i2.equals("+")){
    bd.display();
    }
    
    else if(i2.equals("-")){
    bd.display();
    }
    
    else{
    System.out.println("Invalid");
        }
    }
    }
}