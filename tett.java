class tett
{   public  void encrypt(String text,int s)
	{	String a;
		a="abcdefghijklmnopqrstuvwxyz";
		System.out.println("hello");
		StringBuffer result=new StringBuffer(text.length());
		for(int i=0;i<text.length();i++)		 //runs loop from a to e
			{char k=text.charAt(i);
			int count=0;
			System.out.print(k);
			for(int j=0;j<a.length();j++)		 // runs loop for a from a to z
				{if(k==a.charAt(j))		 //check for repeation in of alphabet in text 
					{count++;
					System.out.println(count);
					if(count>1)
						{ char e = (char)(((int)k +(count+s) -97) % 26 + 97); //perform ciesar cipher alphabet
						result.insert(j,e);				      //add char to result		
						System.out.println(e);
						}
					
					else
						{char e= (char)(((int)k +s - 97) % 26 + 97);	      //perform ciesar cipher alphabet
						result.insert(j,e);				      //add char to result
						System.out.println(e);
						}
					}
				}
			}
		System.out.println(result); 
	}
    public static void main(String[] args) 
		{ 
 	       String text = "ATTACKATONCE"; 
	        int s = 4; 
		tett ob=new tett();
	        System.out.println("Text  : " + text); 
	        System.out.println("Shift : " + s); 
		ob.encrypt(text,s);
		} 
} 