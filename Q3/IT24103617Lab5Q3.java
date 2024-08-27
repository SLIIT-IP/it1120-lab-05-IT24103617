import java.util.Scanner;
public class IT24103617Lab5Q3 {
    public static void main(String[] args) {
      Scanner n=new Scanner(System.in);
      System.out.print("enter Your st_date :-  ");
      int st_date=n.nextInt();
      
      Scanner m=new Scanner(System.in);
      System.out.print("enter Your end_date :-  ");
      int end_date=m.nextInt();
      int reserve;
      double total;
      double a=48000.0;
      if(st_date>1 && end_date<31){
         if(st_date<end_date){
           reserve=end_date - st_date;
            if (reserve<3){
             total=a*reserve;
             System.out.println();
             System.out.println("Room charge per day:-" +"Rs"+". "+a+"/=");
             System.out.println("Number of reserve day :- " +reserve);
        System.out.println("tottal bill payment :- " +"Rs"+". "+total+"/=");
            }
        if (reserve>=3 && reserve<=4){
             total=reserve*(a*90/100);
             System.out.println();
             System.out.println("Room charge per day:-" +"Rs"+". "+a+"/=");
             System.out.println("Number of reserve day :- " +reserve);
        System.out.println("tottal bill payment :- " +"Rs"+". "+total+"/=");
            }
            
        if (reserve>=5){
             total=reserve*(a*80/100);
             System.out.println();
             System.out.println("Room charge per day:-" +"Rs"+". "+a+"/=");
             System.out.println("Number of reserve day :- " +reserve);
        System.out.println("tottal bill payment :- " +"Rs"+". "+total+"/=");
            }
         }
        else{
            System.out.println();
          System.out.println("your"+" "+end_date+" is small than "+st_date);
        }
      }
 else{
    System.out.println();
    System.out.println("your"+" "+st_date+" and "+end_date+" not to matching");
      }
}
}