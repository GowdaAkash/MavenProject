import java.io.IOException;
import java.util.ArrayList;

public class GettingData {

	public static void main(String[] args) throws IOException {
		
      dataDrivenCopy d = new dataDrivenCopy();
      ArrayList data=d.getData("Purchase");
      System.out.println(data.get(0));
      System.out.println(data.get(1));
      
		}

}
