import java.io.IOException;
import java.util.ArrayList;

public class PruebaArrayList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("INI");
		
		String txt="Texto de prueba para alamacenar en un arrayList aafadsfa dfadsf asdfasdf asdfasdf sdfasdf asdf asdf asdf adfafadfaggagoaidgoaigoaidfo a a oafiaosidfoaisu doa  i faosiuf oasiudf oooaiu oaiufo oi  uo iuoiaufoaisudfoaisu osoi uoisufdoaiusfdoiausfoi";

				
				
				ArrayList<String>l=new ArrayList<String>();
			int MAX=10000;
		
		for(int i=0;i<MAX;i++)
				{
			
			l.add(txt);
			System.out.println(i+"\n");
			
		
			
				}
		
		System.in.read();
		
		
		System.out.println(l);
		
		
		System.out.println("FIN");
				
				
	}

}
