import java.util.Scanner;
class farming{
    int quan,cost,i,num;
    String name;
    Scanner sc=new Scanner(System.in);
    
    void seeds(farming obj[])
    {
System.out.println("1.Wheat");
obj[0].quan=100;obj[0].cost=50;obj[0].name="wheat               ";
System.out.println("2.paddy");obj[1].name="paddy               ";
obj[1].quan=100;obj[1].cost=60;
System.out.println("3.peas");obj[2].name="peas                ";
obj[2].quan=100;obj[2].cost=70;
System.out.println("4.groundnut");obj[3].name="groundnut           ";
obj[3].quan=100;obj[3].cost=200;
System.out.println("5.cotton");obj[4].name="cotton              ";
obj[4].quan=100;obj[4].cost=150;
System.out.println("6.potato");obj[5].name="potato              ";
obj[5].quan=100;obj[5].cost=160;
    }
    void fertilizers(farming obj[])
    {
        System.out.println("1.manure");obj[6].name="manure              ";
        obj[6].quan=100;obj[6].cost=100;
        System.out.println("2.urea");obj[7].name="urea                ";
        obj[7].quan=100;obj[7].cost=100;
        System.out.println("3.potassium nitrate");obj[8].name="potassium nitrate   ";
        obj[8].quan=100;obj[8].cost=100;
        System.out.println("4.bone meal");obj[9].name="bone meal         ";
        obj[9].quan=100;obj[9].cost=100;
    }
    void pesticides(farming obj[])
    {
        System.out.println("1.phortoxaphene cam");
obj[10].quan=100;obj[10].cost=101;obj[10].name="phortoxaphene cam   ";
        System.out.println("2.motox");
        obj[11].quan=100;obj[11].cost=135;obj[11].name="motox              ";
        System.out.println("3.toxakil");
        obj[12].quan=100;obj[12].cost=199;obj[12].name="toxon              "; 
    }
void bag(int total,int item[],int quantity[],int c,farming obj[]){
    System.out.println("         CHECKOUT");
    for(i=0;i<c;i++)
        {
            System.out.println(obj[item[i]].name+"     "+obj[item[i]].cost+"*"+quantity[i]);
        }
        System.out.println("                         -----");
        System.out.println("total                   "+total);
}
void payment(int total,farming obj[]){
    System.out.println("entre the money below");
    int pay=sc.nextInt();
    if(pay==total)
    {
        System.out.println("payment successful");
        System.out.println("*******thankyou*******");
    }
    else{
        System.out.println("payment not successful    try again");
        obj[99].payment(total,obj);
    }
}

    }
class oop{
    public static void main(String args[])
    {
        farming obj[]=new farming[100];
        int c=0,total=0;
        int item[]=new int[100];
        int quantity[]=new int[100];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<100;i++)
        {
            obj[i]=new farming();
        }
        char p;
     p='y';
      do{
    System.out.println("entre the number of kind");    
System.out.println("1.seeds");
System.out.println("2.fertilizers");
System.out.println("3.pesticides");
int t=sc.nextInt();
switch(t)
{
    case 1:
    {
               
       System.out.println("Enter the number of item");
       obj[0].seeds(obj);
       
       int num=sc.nextInt();
       System.out.println("Enter the quantity ");
       int s=sc.nextInt();
       obj[num-1].quan=obj[num-1].quan-s;
       item[c]=num-1;
       quantity[c]=s;
       total+=s*obj[num-1].cost;
       c++;
       break;
    }
    case 2:
    {
               
       System.out.println("Enter the number of item");
       obj[0].fertilizers(obj);
       
       int num=sc.nextInt();
       System.out.println("Enter the quantity ");
       int s=sc.nextInt();
       obj[num+5].quan=obj[num+5].quan-s;
       item[c]=num+5;
       quantity[c]=s;
       total+=s*obj[num+5].cost;
       c++;
       break;
    }
    case 3:
    {
               
       System.out.println("Enter the number of item");
       obj[0].pesticides(obj);
       int num=sc.nextInt();
       
       System.out.println("Enter the quantity ");
       int s=sc.nextInt();
       obj[num+9].quan=obj[num+9].quan-s;
       item[c]=num+9;
       quantity[c]=s;
       total+=s*obj[num+9].cost;
       c++;
       break;
    }
    default:
    break;
}
     System.out.println("Enter y if you want to buy more,n for checkout");
     p=sc.next().charAt(0);
      }while(p!='n');
      obj[99].bag(total,item,quantity,c,obj);
      obj[99].payment(total,obj);
    }
    }