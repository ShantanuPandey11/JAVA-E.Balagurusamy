import java.util.Random;
import java.util.Scanner;

class AcManager extends Bank
{

public static void main(String[] args)
{
    Scanner inpt = new Scanner(System.in);
    Random random = new Random();
    System.out.println("Welocome To BOI");

    String newName;
    long newAcNo;
    String newacType;
    double newBalance;
    int operation = 0;
    String[] data;

    System.out.println("Enter no(1-3) te perform following operations: ");
    System.out.println("1 For Account openning.");
    System.out.println("2 For Account Enqurie.");
    System.out.println("3 For Deposit money.");
    System.out.println("4 For Money withdraw from account.");
    operation = inpt.nextInt();
    
        AcManager ac1 = new AcManager();
            newName = inpt.next();
            newacType = inpt.next();
            
            newAcNo = random.nextLong((999998-100000+1)+100000);
            ac1.setData(newName,""+newAcNo,newacType);
            ac1.getData(newAcNo);
            
    
    
    
        switch (operation) {
            case 1:
                long acno = 0;
                acno = inpt.nextLong();
                data = ac1.getData(newAcNo); //getData(newAcNo);
                for(int i=0;i<4;i++)
                    System.out.println(data[i]);
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
            default:
                System.out.println("Default");
                break;
        }
    

}

}