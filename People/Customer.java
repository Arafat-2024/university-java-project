package People;
import java.io.*;

public class Customer 
{
  private   String name;
  private    String mobileNumber;
  private  String password;
  private   String email;

    private static int registrationCounter = 0;
    private static final int MAX_REGISTRATIONS = 100;
    // Constructor
    public Customer(String name, String password, String mobileNumber, String email) 
    {
        this.name = name;
        this.password = password;
        this.mobileNumber = mobileNumber;
       // this.password = password;
        this.email= email;
    }

    public void setname(String name)
	{
		this.name=name;
	}


    public void setpassword(String password)
	{
		this.password=password;
	}

    public void setmobileNumber(String mobileNumber)
	{
		this.mobileNumber=mobileNumber;
	}

    

    public void setemail(String email)
	{
		this.email=email;
	}
    // Getter methods
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getemail() {
        return email;
    }


    public void addCustoomer() {
        if (registrationCounter < MAX_REGISTRATIONS) 
        {
            try (FileWriter writer = new FileWriter("people.txt", true);
                 BufferedWriter bw = new BufferedWriter(writer);
                 PrintWriter out = new PrintWriter(bw)) 
                {

                    out.println(name + ":" +  password );

                   registrationCounter++;

                } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
         else
         {
            System.out.println("Registration limit reached. Cannot register more users.");
        }
    }

}
