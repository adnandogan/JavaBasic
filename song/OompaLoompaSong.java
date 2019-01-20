package song;
import java.lang.String;
import java.util.Random;
import java.util.Scanner;


public class OompaLoompaSong{
	
	private int lines;
	
	public OompaLoompaSong(int lines){
		this.lines = lines;
	}
	
	public int getLines(){
		return this.lines;
	}
	
	public String sing(){
		String[] LoompaSongLines = {
		"Oompa loompa doompety doo",
		"I've got a perfect puzzle for you",
		"Oompa loompa doompety dee",
		"If you are wise you'll listen to me",
		"What do you get when you guzzle down sweets",
		"Eating as much as an elephant eats",
		"What are you at, getting terribly fat",
		"What do you think will come of that",
		"I don't like the look of it",
		"Oompa loompa doompety da",
		"If you're not greedy, you will go far",
		"You will live in happiness too",
		"Like the Oompa Loompa Doompety do",
		"Doompety do",
		"Oompa loompa doompety doo",
		"I've got another puzzle for you",
		"Oompa loompa doompeda dee",
		"If you are wise you'll listen to me",
		"Gum chewing's fine when it's once in a while",
		"It stops you from smoking and brightens your smile",
		"But it's repulsive, revolting and wrong",
		"Chewing and chewing all day long",
		"The way that a cow does"};
		
		Random rIndex = new Random();
		int rLine;
		System.out.println("How many lines: ");
		Scanner sc = new Scanner(System.in);
		lines = sc.nextInt();
		String song="";

		for (int i = 0; i < lines; ++i)
		{
			rLine = rIndex.nextInt(22);
			song = song.concat(LoompaSongLines[rLine]);
			song = song.concat("\n");
		}
		return song;
	}
}
