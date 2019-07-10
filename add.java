import java.util.Scanner;
class add{
public static void main(String[]args){
Scanner tt=new Scanner(System.in);
int n,s=0,a;
System.out.println("enter the number:");
n=tt.nextInt();
for(a=1;a<=n;a++){
s=s+a;
}
System.out.println(s);
}
}
