import java.io.*;

public class Main
{
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str[]=br.readLine().split(" ");
		int N=Integer.parseInt(str[0]);
		int P=Integer.parseInt(str[1]);
		int sum=N;
		while(N>1)
		{
		    N=N-(N*P)/100;
		    sum=sum+N;
		}
		System.out.println(sum);
	}
}
