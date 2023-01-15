import java.util.*;

public class message {
	public static void main(String[] args) {
		String ans = "Sakshi";
		String yes = "Yes";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String name = sc.nextLine();
		boolean tes;
		tes = ans.equals(name);
		if (tes == true) {
			hello();
		} else {
			System.out.println(
					"Kya aap Sakshi nahi Ho :(\nAgar aap sakshi Ho to 'Yes' Type karo otherwise kuch bhi dal ke enter kar do\nAnd ha age vale sabhi ma bhi yes hoga to Yes type kar dena nah hoga to kuch bhi dal ke enter kar dena");
			String ch = sc.nextLine();
			tes = yes.equals(ch);
			if (tes == true) {
				hello();
			} else {
				System.out.println(
						"Ohh Sorry:(\nYou are not a Persone Which I am looking for\nThank You For Giving Your Valuable Time\nHave a good Day :)");
			}
		}
	}

	static void hello() {
		Scanner sc = new Scanner(System.in);
		String yes = "Yes";
		boolean tes;
		System.out.println("Hello Mam!!!\nAre youGrilfrind of Harshit?");
		String ch = sc.nextLine();
		tes = yes.equals(ch);
		if (tes == true) {
			System.out.println(
					"And ha Harshit mhanje Harshit Raul ha\nAnd Harshit Raul mhanje IT branch madhala pid:-EU1204002\nRight na");
			ch = sc.nextLine();
			tes = yes.equals(ch);
			if (tes == true) {
				game();
			} else {
				System.out.println("Mar khaycha ahe ka\nTu mazich ahe chup chap yes kar bagh tu!!!");
				ch = sc.nextLine();
				tes = yes.equals(ch);
				if (tes == true) {
					game();
				} else {
					System.out.println(
							"Ohh Sorry:(\nYou are not a Persone Which I am looking for\nThank You For Giving Your Valuable Time\nHave a good Day :)");
				}

			}
		} else {
			System.out.println("Mar khaycha ahe ka\nTu mazich ahe chup chap yes kar bagh tu!!!");
			ch = sc.nextLine();
			tes = yes.equals(ch);
			if (tes == true) {
				game();
			} else {
				System.out.println(
						"Ohh Sorry:(\nYou are not a Persone Which I am looking for\nThank You For Giving Your Valuable Time\nHave a good Day :)");
			}
		}
	}

	static void game() {
		Scanner sc = new Scanner(System.in);
		String yes = "Yes";
		boolean tes;
		System.out.println(
				"Ha aata he sarv mi confirmation sathi karat hoto nahitar ekahadi dusrich patun jaychi.\nJoke a part.\n First of all\nI LOVE YOU\n");
		System.out.println(
				"aata thoad fun time. Tp sathi jar pahije asel tar Yes tak nahitar kahi pan tak and enter kar.\n");

		String ch = sc.nextLine();
		tes = yes.equals(ch);
		if (tes == true) {
			System.out.println(
					"Mahitey he thoad vichitra ahe but still kar\nAsach quiz ahe.\nAshech questions ahet tuze and mazya related ohk ready.\nFirst question jara easy ahe so chill kar\nAns nay ale tari not n issue chill kar pahije asel tar retry kar nahitar next question ghe");
			Q1();
		} else {
			mess();
		}
	}

	static void Q1() {
		Scanner sc = new Scanner(System.in);
		String ans = "07022022";
		String yes = "Rq";
		boolean tes;
		System.out.println("1. Tula Pataval tevhachi Date kay?\n(DDMMYYYY)hya format madhe lih\nAns:- ");
		String mans = sc.nextLine();
		tes = ans.equals(mans);
		if (tes == true) {
			System.out.println("Right Answer!!!!");
			Q2();
		} else {
			System.out.println(
					"Ohh hard luck kay nahi Chill kar.\nParat try karaych ahe ka karaych ael tar Rq as type kar. Nahitar next sathi kahi pan takun Enter kar");
			String ch = sc.nextLine();
			tes = yes.equals(ch);
			if (tes == true) {
				Q1();
			} else {
				Q2();
			}
		}

	}

	static void Q2() {
		Scanner sc = new Scanner(System.in);
		String ans = "08032022";
		String yes = "Rq";
		boolean tes;
		System.out.println("2. First Pic With You?\nAns:- ");
		String mans = sc.nextLine();
		tes = ans.equals(mans);
		if (tes == true) {
			System.out.println("Right Answer!!!!");
			Q3();
		} else {
			System.out.println(
					"Ohh hard luck kay nahi Chill kar.\nParat try karaych ahe ka karaych ael tar Rq as type kar. Nahitar next sathi kahi pan takun Enter kar");
			String ch = sc.nextLine();
			tes = yes.equals(ch);
			if (tes == true) {
				Q2();
			} else {
				Q3();
			}
		}
	}

	static void Q3() {
		Scanner sc = new Scanner(System.in);
		String ans = "08032022";
		String yes = "Rq";
		boolean tes;
		System.out.println("3. First kiss With You on check?\nAns:- ");
		String mans = sc.nextLine();
		tes = ans.equals(mans);
		if (tes == true) {
			System.out.println("Right Answer!!!!");
			Q4();
		} else {
			System.out.println(
					"Ohh hard luck kay nahi Chill kar.\nParat try karaych ahe ka karaych ael tar Rq as type kar. Nahitar next sathi kahi pan takun Enter kar");
			String ch = sc.nextLine();
			tes = yes.equals(ch);
			if (tes == true) {
				Q3();
			} else {
				Q4();
			}
		}
	}

	static void Q4() {
		Scanner sc = new Scanner(System.in);
		String ans = "24022022";
		String yes = "Rq";
		boolean tes;
		System.out.println("4. Pahilyanda tu kevha hath pakdala?\nAns:- ");
		String mans = sc.nextLine();
		tes = ans.equals(mans);
		if (tes == true) {
			System.out.println("Right Answer!!!!");
			Q5();
		} else {
			System.out.println(
					"Ohh hard luck kay nahi Chill kar.\nParat try karaych ahe ka karaych ael tar Rq as type kar. Nahitar next sathi kahi pan takun Enter kar");
			String ch = sc.nextLine();
			tes = yes.equals(ch);
			if (tes == true) {
				Q4();
			} else {
				Q5();
			}
		}
	}

	static void Q5() {
		Scanner sc = new Scanner(System.in);
		String ans = "04032022";
		String yes = "Rq";
		boolean tes;
		System.out.println("5. Mi Pahilyanda kadhi I love You bolo?\nAns:- ");
		String mans = sc.nextLine();
		tes = ans.equals(mans);
		if (tes == true) {
			System.out.println("Right Answer!!!!");
			Q6();
		} else {
			System.out.println(
					"Ohh hard luck kay nahi Chill kar.\nParat try karaych ahe ka karaych ael tar Rq as type kar. Nahitar next sathi kahi pan takun Enter kar");
			String ch = sc.nextLine();
			tes = yes.equals(ch);
			if (tes == true) {
				Q5();
			} else {
				Q6();
			}
		}
	}

	static void Q6() {
		Scanner sc = new Scanner(System.in);
		String ans = "19032022";
		String yes = "Rq";
		boolean tes;
		System.out.println("6. Tu Mazya ghari Pahilyanda kadhi ali hoti?\nAns:- ");
		String mans = sc.nextLine();
		tes = ans.equals(mans);
		if (tes == true) {
			System.out.println("Right Answer!!!!");
			Q7();
		} else {
			System.out.println(
					"Ohh hard luck kay nahi Chill kar.\nParat try karaych ahe ka karaych ael tar Rq as type kar. Nahitar next sathi kahi pan takun Enter kar");
			String ch = sc.nextLine();
			tes = yes.equals(ch);
			if (tes == true) {
				Q6();
			} else {
				Q7();
			}
		}
	}

	static void Q7() {
		Scanner sc = new Scanner(System.in);
		String ans = "04042022";
		String yes = "Rq";
		boolean tes;
		System.out.println("7. First Lip to Lip Kiss?\nAns:- ");
		String mans = sc.nextLine();
		tes = ans.equals(mans);
		if (tes == true) {
			System.out.println("Right Answer!!!!");
			Q8();
		} else {
			System.out.println(
					"Ohh hard luck kay nahi Chill kar.\nParat try karaych ahe ka karaych ael tar Rq as type kar. Nahitar next sathi kahi pan takun Enter kar");
			String ch = sc.nextLine();
			tes = yes.equals(ch);
			if (tes == true) {
				Q7();
			} else {
				Q8();
			}
		}
	}

	static void Q8() {
		Scanner sc = new Scanner(System.in);
		String ans = "14042022";
		String yes = "Rq";
		boolean tes;
		System.out.println("8. jivadani la kadhi gelo hoto?\nAns:- ");
		String mans = sc.nextLine();
		tes = ans.equals(mans);
		if (tes == true) {
			System.out.println("Right Answer!!!!");
			mess();
		} else {
			System.out.println(
					"Ohh hard luck kay nahi Chill kar.\nParat try karaych ahe ka karaych ael tar Rq as type kar. Nahitar next sathi kahi pan takun Enter kar");
			String ch = sc.nextLine();
			tes = yes.equals(ch);
			if (tes == true) {
				Q8();
			} else {
				mess();
			}
		}
	}

	static void mess() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Khup zale question khup mhanje jast nahi zale mahitey mala pan sadhya itakecha ahet. Nantar ajun vadhavel tula avdal asel tar.\nHa code mi tula 5 Month complete zale mhanun denar hoto as gift means greeting mhanun. kanatle denar hoto but tu boli ki nako so he kel.\nmahitey he denya sathi mi late zalo ahe he kadhich dil pahije hoat tula tar pan tula mahitey kay problem te tya problem mule mala maza alas pana nahi lapvaycha ahe pan mi thoda alas pan pan kela. Sorry Gf Alas pana karnya sathi. Mi sagal kam late karto kadhi kadhi tuzya icha purn nahi karu shakat mahitey mala tyach tula kiti pan vait vatl tari tu sanganar nahi mala tula mi changalach olkhato\nPan hya reason mule kadhi jau nako mala sodun. Janar nahi mahitey mala but still nako jau and jevha prashan aplay lagnacha asel na tevha mi tham pane ubha rahil mage hatnar nay bus tu ready asli pahije mag mi ready ahe.\nAata mi kamvat nahi mhanun tula kuthe firayla vaigre,kay gift and kahi jast gheun nay det pan jya divashi kamvayla lagel na tevha tula gift pan deil, Firayla pan gheun jail.\nOye nahi rahvat g tuzya shivay nehami sobat rahavas vate.pan jav lagte ghari kay karnar.koni tula trass dete mala te nay avdat ajun tula kay kay boltat te pan mala nay avdat g and tula koni hat lavla tar te tula pan nay avdat vate bahutek karan aaj mi baghital shrey ne tula pathit maral tevha tuzya face varche reaction change zal hoat.\nMi tuuzi kadhi kadhi kalji ghyala kami padto tya sathi maf kar\nmaf kar tula kadhi mi ragat bolun jato kadhi kadhi\nMaf kar kadhi kadhi mi tuzi baju nahi ghet tya sathi\nMaf kar mala jar mi tula kadhi kay vait bola asel tar\nMaf kar jar kadhi mazyakadun kahi chuk zali asel tar\nand last sorry itaka vel sorry bolnya sathi anad Khali thanks bolo ahe tyachya sathi\nThank you mazya life madhe yenya sthi and mazi life itaki chan banavnya sathi\nThabk you mala sukh dukhat sath denya sathi\nThank you mala nehami samjun ghenya sathi\nThank you Mazi itaki kalji ghenya sathi\nThank you mazyavar itaka Vishavas thevnyasathi\nAnd last thank You Mazya var itak prem karnya sathi\n");
		System.out.println(
				"sakali Hya pagal ne tula ek chocalate dil asel na as bolun ki he Chocalate gf sathi Aata mam la rag aala asgf la dil and mam la nay dil mag ek kam kar aata tya pagal kade baghun hath pudhe kar\nAre aata shemdu la rag aala asel tila nay dil parat ekda bagh tya pagal kade\nAata bhoot la rag aala asel tila nay dil ummm ek kam kar parat tya pagal kade bagh and bagh ha pachka nako karu tyacha\nZale na sagale khus aata kay issue nay na???");
		String mans = sc.nextLine();
		System.out.println("Are ek jan rahi ki mazi bayko rahili parat bagh ekda tya pagal kade");
		System.out.println("oye I love you so much");
		for (int i = 1; i <= 2; i++) {
			for (int k = 1; k <= 2 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i; j++) {
				System.out.print("*");
			}
			for (int k = 1; k <= 2 * (2 - i + 1) - 1; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= i - 1; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * (5 - i + 1) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
