package pack1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.stringtemplate.v4.ST;

public class StringT {
	
	public static void main(String[] args) {
		
		final String sep="^";
		ST query=null;
		List<String> querylist=new ArrayList<String>();
		querylist.add("<1111>");
		querylist.add("kumar=<2222>");
		querylist.add("gupta=<3333>");
		query=new ST(String.join(sep, querylist));
		query.add("1111", "hello");
		query.add("2222", "how");
		System.out.println(query.render());
		
	}

}
