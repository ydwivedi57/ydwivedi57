import java.util.Scanner;
class mono{
String h="qwertyui}opa123s{d456fghjklzxcvb789nm QWERTYUI#OPASDFGHJKLZXCVBNM";
String e="abcdefg}hijk{lm123nop456q rstuvwxyzABCDEF#GHI789JKLMNOPQRSTUVWXYZ";
	public StringBuffer encrypt(String f,int key)
		{int g=0;
		int y[]=new int[f.length()];
		for(int i=0;i<f.length();i++)
			{char k=f.charAt(i);
			for(int j=0;j<h.length();j++)
				{char l=h.charAt(j);
				if(l==k)
					{y[g]=j;
					g++;
					}
				}
			}
		StringBuffer result=new StringBuffer(f.length());
		for(int i=0;i<y.length;i++)
			{int x=y[i]+key;
			char r=e.charAt(x);
			result.append(r);
			}
		return result;
		}
	public StringBuffer decrypt(StringBuffer f,int key)
		{int g=0;
		int y[]=new int[f.length()];
		for(int i=0;i<f.length();i++)
			{char k=f.charAt(i);
			for(int j=0;j<h.length();j++)
				{char l=e.charAt(j);
				if(l==k)
					{y[g]=j-key;
					g++;
					}
				}
			}
		StringBuffer result=new StringBuffer(f.length());
		for(int i=0;i<y.length;i++)
			{int x=y[i];
			char r=h.charAt(x);
			result.append(r);
			}
		return result;
		}
	public static void main(String a[])
		{
		Scanner cin=new Scanner(System.in);
		System.out.println("ENTER PLAIN TEXT");
		String s=cin.nextLine();
		System.out.println("ENTER KEY");
		int n=cin.nextInt();
		mono ob=new mono();
		StringBuffer b=ob.encrypt(s,n);
		StringBuffer w=ob.decrypt(b,n);
		System.out.println("encrypt:"+b);
		System.out.println("decrypt:"+w);
	}
}


