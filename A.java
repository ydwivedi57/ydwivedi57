import java.util.*;
class A
{public static void main(String a[])
	{int ca[]=new int[4];
	int cb[]=new int[4];
	int cc[]=new int[4];
	int cd[]=new int[4];
	int da[]=new int[4];
	int db[]=new int[4];
	int dc[]=new int[4];
	int dd[]=new int[4];
	Scanner cin=new Scanner(System.in);
	System.out.println("enter code of tower of A");
	for(int i=0;i<4;i++)
	{ca[i]=cin.nextInt();}
	System.out.println("enter code of tower of B");
	for(int i=0;i<4;i++)
	{cb[i]=cin.nextInt();}
	System.out.println("enter code of tower of C");
	for(int i=0;i<4;i++)
	{cc[i]=cin.nextInt();}
	System.out.println("enter code of tower of D");
	for(int i=0;i<4;i++)
	{cd[i]=cin.nextInt();}
	System.out.println("enter data of tower of A");
	for(int i=0;i<4;i++)
	{da[i]=cin.nextInt();
	if(da[i]==0)
		{da[i]=-1;}
		}
	System.out.println("enter data of tower of B");
	for(int i=0;i<4;i++)
	{db[i]=cin.nextInt();
	if(db[i]==0)
		{db[i]=-1;}
		}
	System.out.println("enter data of tower of C");
	for(int i=0;i<4;i++)
	{dc[i]=cin.nextInt();
	if(dc[i]==0)
		{dc[i]=-1;}
		}
	System.out.println("enter data of tower of D");
	for(int i=0;i<4;i++)
	{dd[i]=cin.nextInt();
	if(dd[i]==0)
		{dd[i]=-1;}
		}
	int ma[]=new int[4];
	int mb[]=new int[4];
	int mc[]=new int[4];
	int md[]=new int[4];
	int s[]=new int[4];
	int sum=0;
	
	int re[]=new int[4];
	for(int i=0;i<4;i++)
		{
		ma[i]=da[i]*ca[i];
		mb[i]=db[i]*cb[i];
		mc[i]=dc[i]*cc[i];
		md[i]=dd[i]*cd[i];
		s[i]=ma[i]+mb[i]+mc[i]+md[i];
		}
	int ch=0;
	while(ch!=5)
	{System.out.println("enter choice");
	System.out.println("1.tower A");
	System.out.println("2.tower B");
	System.out.println("3.tower C");
	System.out.println("4.tower D");
	System.out.println("5.exit");
	ch=cin.nextInt();
	switch(ch)
		{case 1:
				for(int i=0;i<4;i++)
				{re[i]=ca[i]*s[i];
				sum=sum+re[i];}
				if(sum>0)
				{System.out.println("tower A is good");}
				else
				{System.out.println("tower A is not good");}
				break;
		case 2:sum=0;
				for(int i=0;i<4;i++)
				{re[i]=cb[i]*s[i];
				sum=sum+re[i];}
				if(sum>0)
				{System.out.println("tower B is good");}
				else
				{System.out.println("tower B is not good");}
				break;
		case 3:sum=0;
				for(int i=0;i<4;i++)
				{re[i]=cc[i]*s[i];
				sum=sum+re[i];
				}
				if(sum>0)
				{System.out.println("tower C is good");}
				else
				{System.out.println("tower C is not good");}
				break;
		case 4:sum=0;
				for(int i=0;i<4;i++)
				{re[i]=cd[i]*s[i];
				sum=sum+re[i];}
				if(sum>0)
				{System.out.println("tower D is good");}
				else
				{System.out.println("tower D is not good");}
				break;
		default:System.out.println("invalid choice");
				
				
		}
	}
	}
}