import java.util.Scanner;
class jav
{
    Scanner sc=new Scanner(System.in);
    String email,username,password;
    double amt=409000;
    void u_register()
    {
        System.out.println("REGISTRATION");
        System.out.println("Enter your email ID");
        email=sc.nextLine();
        System.out.println("Enter your name");
        username=sc.nextLine();
        System.out.println("Enter your password");
        password=sc.nextLine();
    }
    int login()
    {
        int flag=0;
        System.out.println("LOGIN");
        System.out.println("Enter username");
        String uname=sc.nextLine();
        System.out.println("Enter password");
        String pass=sc.nextLine();
        if(uname.equals(username) && pass.equals(password))
        {
            flag=1;
        }
        return flag;
    }
    double payment()
    {
        System.out.println("Enter the amount you will pay");
        double pay=sc.nextDouble();
        double diff=amt-pay;
        System.out.println("Remaining amount= "+diff);
        return diff;
    }
    void s_register()
    {
        System.out.println("Approve the payment slip from the finance department and submit the registration
        form to your section coordinator");
    }
    void logout()
    {
        System.out.println("LOGOUT");
    }
    public static void main(String [] args)
    {
        jav ob=new jav();
        ob.u_register();
        int x=ob.login();
        if(x==1)
        {
            System.out.println("LOGIN SUCCESSFUL");
            double df=ob.payment();
            if(df<amt)
            {
                ob.s_register();
                ob.logout();
            }
        }
    }
}