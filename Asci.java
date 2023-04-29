class Asci
{
	public void outPut(String s,int l,String res)
	{
		 for(int i=0; i<l; i++)
        {
            char arr = s.charAt(i);
            if(arr > 31 && arr < 127)
            {       
                int ascii = (int)arr;
                res = res + ascii;
                res = res + (char)32;

            }
        }
        System.out.println(res);
	}

	public static void main(String[] args)
	{
		Asci obj = new Asci();
		String s = "Sairam";
		int l = s.length();
		String res = "";
		obj.outPut(s,l,res);
	}
}