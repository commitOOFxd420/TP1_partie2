import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Client {

	public String nom;
	static ArrayList<Client> clientList = new ArrayList<Client>();
	
	public Client(String nom){
		this.nom = nom;
	}
	
	public static void getClients() throws FileNotFoundException, IOException{
		String file = "commandes.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String line;
			while((line = br.readLine()) != "Plats :"){
				clientList.add(new Client(line));
			}
		}
	}
}
