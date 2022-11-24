import java.lang.*;
import java.util.*;
class student
{
String usn,name;
int marks[]=new int[50];
int credits[]=new int[50];
int gradepoints[]=new int[50];
int n,num=0,denom=0,i;
double sgpa;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter student name and usn");
name=sc.next();
usn=sc.next();
System.out.println("enter number of subjects");
n=sc.nextInt();
for(i=0;i<n;i++)
{
System.out.println("enter subjects"+" "+(i+1)+" "+"marks");
marks[i]=sc.nextInt();
System.out.println("enter subjects"+" "+(i+1)+" "+"credits");
credits[i]=sc.nextInt();
}
}
void calculate()
{
for(i=0;i<n;i++)
{
if(marks[i]>=90)
gradepoints[i]=10;
else if((marks[i]>=80)&&(marks[i]<90))
gradepoints[i]=9; 
else if((marks[i]>=70)&&(marks[i]<80))
gradepoints[i]=8;
else if((marks[i]>=60)&&(marks[i]<70))
gradepoints[i]=7;  
else if((marks[i]>=50)&&(marks[i]<60))
gradepoints[i]=6;
else if((marks[i]>=40)&&(marks[i]<90))
gradepoints[i]=4;  
else if(marks[i]<40)
gradepoints[i]=0;

num+=credits[i]*gradepoints[i];
denom+=credits[i];
}
sgpa=num/denom;
}
void display()
{
System.out.println("student details");
System.out.println("name:"+name+" "+"usn:"+usn);
System.out.println("marks\tcredits");
for(i=0;i<n;i++)
{
System.out.println(marks[i]+"\t"+credits[i]);
System.out.println("\n");
}
System.out.println("SGPA="+sgpa);
}
}
class studentdemo
{
public static void main(String args[])
{
student ob=new student();
ob.accept();
ob.calculate();
ob.display();
}
}
