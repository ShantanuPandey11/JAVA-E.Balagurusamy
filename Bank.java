import java.util.Scanner;
class Bank
{
    String name;
    long ACCOUNT_NUMBER;
    String acType;
    double currentBalance;

    void setData(String ... accountHolder)
    {
        name = accountHolder[0];
        ACCOUNT_NUMBER = Long.parseLong(accountHolder[1]);
        acType = accountHolder[2];
        currentBalance = 0;
    }

    String deposit(long accountNumber, double amount)
    {
        if(ACCOUNT_NUMBER == accountNumber)
        {
            currentBalance+=amount;
        }
        else
            return "Error incorrect AC NO";
        
        return Double.toString(currentBalance);
    }

    String withdraw(long accountNumber,double amount)
    {
        if(ACCOUNT_NUMBER == accountNumber)
        {
            if(currentBalance>=amount)
            {
                currentBalance-=amount;
                return Double.toString(currentBalance);
            }
            else
                return "Insuffient Balance";
        }

        else
            return "Error incorrect AC NO";

    }

    String[] getData(long accountNumber)
    {
        if(ACCOUNT_NUMBER == accountNumber)
        {
            String data[] = new String[]{name,Long.toString(ACCOUNT_NUMBER),""+acType,Double.toString(currentBalance)};
            return data;
        }
        
        String []error = new String[]{"Invalid A/c No."}; 
        return error;
    }

}

