import java.util.Scanner;
public class IT24103617Lab5Q1 {
    public static void main(String[] args) {
        int c1=1;
        int c2=2;
        int c3=3;
      Scanner n=new Scanner(System.in);
      System.out.print("enter Your " +c1+ " num :- ");
      int a=n.nextInt();
      
      Scanner m=new Scanner(System.in);
      System.out.print("enter Your " +c2+ " num :- ");
      int b=m.nextInt();
      
      Scanner v=new Scanner(System.in);
      System.out.print("enter Your " +c3+ " num :- ");
      int c=v.nextInt();
      System.out.println();
      
      if(a<b){
          if(a<c){
              System.out.println("ent number :- " +a+" "+b+" "+c);
              System.out.println("min num :- " +a);
          }
          else{
              System.out.println("ent number :- " +a+" "+b+" "+c);
              System.out.println("min num :- " +c);
          }
      }
      else{
          if(b<c){
              System.out.println("ent number :- " +a+" "+b+" "+c);
              System.out.println("min num :- " +b);
          }
          else{
              System.out.println("ent number :- " +a+" "+b+" "+c);
              System.out.println("min num :- " +c);
          }
        }
      
      if(a>b){
          if(a>c){
              System.out.println("max num :- " +a);
          }
          else{
              System.out.println("max num :- " +c);
          }
      }
      else{
          if(b>c){
              System.out.println("max num :- " +b);
          }
          else{
              System.out.println("max num :- " +c);
          }
        }
      
    }
}
