import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Scanner;
public class MOJO {


    String Name;
    int Age;
    int Salary;
       //Getter and Setter
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }


    public static void  main(String args[])
    {
        MOJO[] MojObj = new MOJO[3];
        String Name;
        int Age,Salary;
        ArrayList<MOJO> Employe= new ArrayList<>();
        Scanner sc = new Scanner(System.in);


            for (int i=0; i<2 ; i++) {
                MojObj[i] = new MOJO();
                System.out.println("Enter Name"+ i+":");
                Name = sc.next();
                MojObj[i].setName(Name);
                System.out.println("Enter Age"+ i+":");
                Age = sc.nextInt();
                MojObj[i].setAge(Age);
                System.out.println("Enter Salary"+i+":");
                Salary = sc.nextInt();
                MojObj[i].setSalary(Salary);
                //Normal Display Data using Get Data Method
               // MojObj[i].GetData();
                //Coverting Object to ArrayList
                Employe.add(MojObj[i]);
                
                System.out.println("Data Inserted Successfully********");
            }
            //ArrayList to Json File Using GSON lib
        final GsonBuilder gsonBuilder = new GsonBuilder();
        final Gson gson = gsonBuilder.create();
            String json =gson.toJson(Employe);
        System.out.println("ArrayList to Json**********");
           System.out.println(json);
           //Json to Object List
         MOJO[] Mojobj = gson.fromJson(json, MOJO[].class);
         System.out.println("Json to Object**********");
         for (int i=0;i<Mojobj.length;i++)
        {
            System.out.println(Mojobj[i].getName()+" "+Mojobj[i].getAge()+" "+Mojobj[i].getSalary());
        }






    }
    void GetData()
    {        //Getter Use to Get Values
       System.out.println(getName());
       System.out.println(getAge());
       System.out.println(getSalary());
    }



}

