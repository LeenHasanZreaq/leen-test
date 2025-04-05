// new Program <Pizaa Restorant>.

import java.util.*;
public class ProjectForGitHup{
    
    //POTATO , SALAD , COLA . 
public static int Additions(String add , int cost ){
   
     switch(add.toUpperCase()){
    case "POTATO" : 
    cost+= 2 ;  
    break;  

    case "SALAD" : 
    cost+= 3 ; 
    break;


    case "COLA" : 
    cost+= 2 ; 
    break;

    default:
    System.out.println("you dont have this option .");
    break ;
}
    
    System.out.println("the cost is : "+ cost);
    return cost ;

}

 public static int PizaaSize(String Size , int cost  ){ // finction of pizaasize . 
  try (Scanner y = new Scanner(System.in)) {
      if(Size.equals("larg")  ){
    
        System.out.println("Enter Your Additions : Tomato or cheese or both (enter number 2 )");
       
        y.nextLine();
        cost+=17;
        System.out.println("If you want additions, enter what you want, and if you don't want them, press 1.");
        System.out.println("We have 3 options: POTATO , SALAD , COLA ==> Choos what you want : ");
        String add ;
       // Scanner g = new Scanner(System.in);
        add = y.nextLine();
        for(int i = 0 ; i<1 ; i++ ){
            if( add.equals("1")){
                break ; 
            }else{
          cost =  Additions(add , cost );
    }
        }
         
      }
      else if(Size.equals("medium")){
    
        System.out.println("Enter Your Additions : Tomato or cheese or both (enter number 2 )");
       // String Additions ; 
       y.nextLine();
        cost = cost + 15 ; 
        System.out.println("If you want additions, enter what you want, and if you don't want them, press 1.");
        System.out.println("We have 3 options: POTATO , SALAD , COLA ==> Choos what you want : ");
        String add ;
       // Scanner g = new Scanner(System.in);
        add = y.nextLine();
        for(int i = 0 ; i<1 ; i++ ){
            if( add.equals("1")){
                break ; 
            }else{
       cost = Additions(add , cost );
            }
      }
    }
      else if(Size.equals("small")){
    
        System.out.println("Enter Your Additions : Tomato or cheese or both (enter number 2 ) ");
        y.nextLine();
        cost = cost + 12 ; 
        System.out.println("If you want additions, enter what you want, and if you don't want them, press 1.");
        System.out.println("We have 3 options: POTATO , SALAD , COLA ==> Choos what you want : ");
        String add ; 
        //Scanner h = new Scanner(System.in);
        add = y.nextLine();
        for(int j = 0 ; j<1 ; j++ ){
            if( add.equals("1")){
                break ; 
            }else{
        cost = Additions(add , cost );
    
      }
      }
    }else{
        System.out.println("Our company does not have this option.");
      }
}
   return cost;
  
 }

  public static void main(String[] args) {      
        String size ;
        System.out.println("You have three options ==> MEDIUM , LARG , SMALL " );
        System.out.println("Choose the size you want : ");
      try (Scanner y = new Scanner(System.in )) {
        size = y.nextLine();
        int Cost = 0 ;  // enter the size
       Cost = PizaaSize(size , Cost ); // send the size and cost to pizaasize 
        System.out.println(" YOUR COST IS : " + Cost);
    }
         
    }
}