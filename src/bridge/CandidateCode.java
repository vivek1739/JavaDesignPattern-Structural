package bridge;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateCode {

	public static int nochange_bits(String input1, int input2, int input3) {
		char[] c = input1.toCharArray();
		int len = c.length;
		
		if (input2 <= 0 || input2 > len || input3 <= 0 || input3 > len) {
			return -1;
		}

		List<String> list = new ArrayList<>();
		for (int i=0; i<len; i++) {
			list.add(c[i] + ",nochange");
		}
	
		String val=null;
		String subval=null;
		String newval=null;
		int x=input2;
		while(input2< len)
		{
			
				val=list.get(input2-1);
				
				if(val.contains("1")){
					newval="1";
					subval="0";
				}
				else{ 
					subval="1";
					newval="0";
				}
				
			list.set(input2-1, subval+",done");
			
			input2=input2+x;
		}
		
		val=null;
		subval=null;
		newval=null;
		while(input3<=list.size())
		{
			
				val=list.get(input3-1);
				
				if(val.contains("1")){
						newval="1";
						subval="0";
					}
					else{ 
						subval="1";
						newval="0";
					}
			
			
			if(list.get(input3-1).contains(newval))
			{
				if(list.get(input3-1).equals(newval+",nochange"))
				{
					list.set(input3-1, subval+",done");
				}
				else
					list.set(input3-1, subval+",nochange");
			}
			
			input3+=input3;
		}
	
		
		int count=0;
		for(String s:list)
		{
			if(s.contains(",nochange"))
				count++;
		}

		
		return count;
	}


	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int output = 0;
		String ip1 = in.nextLine().trim();
		int ip2 = Integer.parseInt(in.nextLine().trim());
		int ip3 = Integer.parseInt(in.nextLine().trim());
		output = nochange_bits(ip1, ip2, ip3);
		System.out.println(String.valueOf(output));
	}
}
