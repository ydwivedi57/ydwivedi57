import java.util.*;
class ver
	{
	String a="abcdefghijklmnopqrstuvwxyz";
	public StringBuffer encry(String pt,String key)
		{int k=0,p=0;
		int pos[]=new int[pt.length()];
		StringBuffer cip=new StringBuffer(pt.length());
		for(int i=0;i<pt.length();i++)
			{char x=pt.charAt(i);
			char y=key.charAt(i);
			for(int j=0;j<a.length();j++)
				{
				char e=a.charAt(j);
				if(e==x)
				{p=j+1;
					}
				if(e==y)
				{k=j+1;
					}
				}
			pos[i]=((p+k)-2)%26;
			}
		for(int i=0;i<pos.length;i++)
			{
			cip.append(a.charAt(pos[i]));
			}
		return cip;
		}
		public StringBuffer decry(StringBuffer pt,String key)
		{int k=0,p=0;
		int pos[]=new int[pt.length()];
		StringBuffer cip=new StringBuffer(pt.length());
		for(int i=0;i<pt.length();i++)
			{char x=pt.charAt(i);
			char y=key.charAt(i);
			for(int j=0;j<a.length();j++)
				{
				char e=a.charAt(j);
				if(e==x)
				{p=j+1;
					}
				if(e==y)
				{k=j+1;}
				}
				if((p-k)>0)
				{pos[i]=((p-k))%26;}
				else if((p-k)<0)
				{pos[i]=((p-k)+26)%26;}
				}
		for(int i=0;i<pos.length;i++)
			{
			cip.append(a.charAt(pos[i]));
			}
		return cip;
		}
	public static void main(String agrs[])
		{
		ver v=new ver();
		StringBuffer cip=v.encry("attac","lemon");
		System.out.println(cip);
		StringBuffer pt=v.decry(cip,"lemon");
		System.out.println(pt);
		}
	}