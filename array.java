package pocketmon;

public class array {
	static int N=26;
	static int M=5;
	static int index;
	
	static String[] pokemon= {"Bulbasaur",
			"Ivysaur",
			"Venusaur",
			"Charmander",
			"Charmeleon",
			"Charizard",
			"Squirtle",
			"Wartortle",
			"Blastoise",
			"Caterpie",
			"Metapod",
			"Butterfree",
			"Weedle",
			"Kakuna",
			"Beedrill",
			"Pidgey",
			"Pidgeotto",
			"Pidgeot",
			"Rattata",
			"Raticate",
			"Spearow",
			"Fearow",
			"Ekans",
			"Arbok",
			"Pikachu",
			"Raichu"};
	static Object[] quiz= {25, "Raichu", 3, "Pidgey", "Kakuna"};
	
	public static void main (String[] args) {
		for(int i=0;i<M;i++) {
			
			if(('A'<=quiz[i].toString().charAt(0))&&(quiz[i].toString().charAt(0)<='z')) {
				for(int j=0;j<N;j++) {
					if(quiz[i].equals(pokemon[j])) {
						System.out.println(j+1);
						break;
					}
				}
			}
				
			else {
			
				System.out.println(pokemon[(int)quiz[i]-1]);
			}
					
			
		}
	}
	
}
