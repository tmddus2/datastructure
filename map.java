package pocketmon;

import java.util.HashMap;

public class map {
	static HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
	static int N=26;
	static int M=5;
	static int i=0;
	
	static String[] pocketmon= {"Bulbasaur",
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<N;i++) {
			hashMap.put(i+1,pocketmon[i]);
		}
		
		for(int i=0;i<M;i++) {
			if(!('A'<=quiz[i].toString().charAt(0))&&(quiz[i].toString().charAt(0)<='z')) {
				System.out.println(hashMap.get(quiz[i]));
			}
			else{
				for(Object o:hashMap.keySet()) {
					if(hashMap.get(o).equals(quiz[i]))
						System.out.println((int)o);
				}
			}
		}
		
	}

}
