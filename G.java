import java.util.*;
class G{
	
	public static void main(String []args){
	System.out.println("");
	G.Welcome();
	G.MainMenu();
	}
	static void Welcome(){
		System.out.println(
			"\u001B[38;5;89m__/\\\\\\______________/\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\____________________/\\\\\\\\\\\\\\\\\\_______/\\\\\\\\\\_______/\\\\\\\\____________/\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_        \u001B[0m"+
			"\n\u001B[38;5;90m _\\/\\\\\\_____________\\/\\\\\\_\\/\\\\\\///////////__\\/\\\\\\_________________/\\\\\\////////______/\\\\\\///\\\\\\____\\/\\\\\\\\\\\\________/\\\\\\\\\\\\_\\/\\\\\\///////////__       \u001B[0m"+
			"\n\u001B[38;5;91m  _\\/\\\\\\_____________\\/\\\\\\_\\/\\\\\\_____________\\/\\\\\\_______________/\\\\\\/_____________/\\\\\\/__\\///\\\\\\__\\/\\\\\\//\\\\\\____/\\\\\\//\\\\\\_\\/\\\\\\_____________      \u001B[0m"+
			"\n\u001B[38;5;92m   _\\//\\\\\\____/\\\\\\____/\\\\\\__\\/\\\\\\\\\\\\\\\\\\\\\\_____\\/\\\\\\______________/\\\\\\______________/\\\\\\______\\//\\\\\\_\\/\\\\\\\\///\\\\\\/\\\\\\/_\\/\\\\\\_\\/\\\\\\\\\\\\\\\\\\\\\\_____     \u001B[0m"+
			"\n\u001B[38;5;93m    __\\//\\\\\\__/\\\\\\\\\\__/\\\\\\___\\/\\\\\\///////______\\/\\\\\\_____________\\/\\\\\\_____________\\/\\\\\\_______\\/\\\\\\_\\/\\\\\\__\\///\\\\\\/___\\/\\\\\\_\\/\\\\\\///////______    \u001B[0m"+
			"\n\u001B[38;5;99m     ___\\//\\\\\\/\\\\\\/\\\\\\/\\\\\\____\\/\\\\\\_____________\\/\\\\\\_____________\\//\\\\\\____________\\//\\\\\\______/\\\\\\__\\/\\\\\\____\\///_____\\/\\\\\\_\\/\\\\\\_____________   \u001B[0m"+
			"\n\u001B[38;5;98m      ____\\//\\\\\\\\\\\\//\\\\\\\\\\_____\\/\\\\\\_____________\\/\\\\\\______________\\///\\\\\\___________\\///\\\\\\__/\\\\\\____\\/\\\\\\_____________\\/\\\\\\_\\/\\\\\\_____________  \u001B[0m"+
			"\n\u001B[38;5;97m       _____\\//\\\\\\__\\//\\\\\\______\\/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_\\/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\____\\////\\\\\\\\\\\\\\\\\\____\\///\\\\\\\\\\/_____\\/\\\\\\_____________\\/\\\\\\_\\/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_ \u001B[0m"+
			"\n\u001B[38;5;96m        ______\\///____\\///_______\\///////////////__\\///////////////________\\/////////_______\\/////_______\\///______________\\///__\\///////////////__\u001B[0m"
		);
		System.out.println(
			"\n\u001B[38;5;82m @@@@@@@   @@@@@@   @@@@@@@@@@   @@@@@@@@@@    @@@@@@   @@@  @@@  @@@@@@@   @@@  @@@  @@@   @@@@@@@@     \u001B[0m"+
			"\n\u001B[38;5;76m@@@@@@@@  @@@@@@@@  @@@@@@@@@@@  @@@@@@@@@@@  @@@@@@@@  @@@@ @@@  @@@@@@@@  @@@  @@@@ @@@  @@@@@@@@@     \u001B[0m"+
			"\n\u001B[38;5;83m!@@       @@!  @@@  @@! @@! @@!  @@! @@! @@!  @@!  @@@  @@!@!@@@  @@!  @@@  @@!  @@!@!@@@  !@@           \u001B[0m"+
			"\n\u001B[38;5;77m!@!       !@!  @!@  !@! !@! !@!  !@! !@! !@!  !@!  @!@  !@!!@!@!  !@!  @!@  !@!  !@!!@!@!  !@!           \u001B[0m"+
			"\n\u001B[38;5;84m!@!       @!@  !@!  @!! !!@ @!@  @!! !!@ @!@  @!@!@!@!  @!@ !!@!  @!@  !@!  !!@  @!@ !!@!  !@! @!@!@     \u001B[0m"+
			"\n\u001B[38;5;85m!!!       !@!  !!!  !@!   ! !@!  !@!   ! !@!  !!!@!!!!  !@!  !!!  !@!  !!!  !!!  !@!  !!!  !!! !!@!!     \u001B[0m"+
			"\n\u001B[38;5;86m:!!       !!:  !!!  !!:     !!:  !!:     !!:  !!:  !!!  !!:  !!!  !!:  !!!  !!:  !!:  !!!  :!!   !!:     \u001B[0m"+
			"\n\u001B[38;5;80m:!:       :!:  !:!  :!:     :!:  :!:     :!:  :!:  !:!  :!:  !:!  :!:  !:!  :!:  :!:  !:!  :!:   !::     \u001B[0m"+
			"\n\u001B[38;5;87m ::: :::  ::::: ::  :::     ::   :::     ::   ::   :::   ::   ::   :::: ::   ::   ::   ::   ::: ::::     \u001B[0m"+
			"\n\u001B[38;5;81m :: :: :   : :  :    :      :     :      :     :   : :  ::    :   :: :  :   :    ::    :    :: :: :      \u001B[0m"
		);
			
		System.out.println(
			"\n\u001B[38;5;50m			 	@@@@@@@ @@@  @@@ @@@@@@@@\u001B[0m"+
			"\n\u001B[38;5;49m			 	  @@!   @@!  @@@ @@!     \u001B[0m"+
			"\n\u001B[38;5;48m			 	  @!!   @!@!@!@! @!!!:!  \u001B[0m"+
			"\n\u001B[38;5;47m			 	  !!:   !!:  !!! !!:     \u001B[0m"+
			"\n\u001B[38;5;46m				   :     :   : : : :: :::\u001B[0m"
		);
		System.out.println(
			"\n\u001B[38;5;82m @@@@@@@   @@@@@@   @@@  @@@  @@@  @@@   @@@@@@    @@@@@@   		\u001B[0m"+""+
			"\n\u001B[38;5;76m@@@@@@@@  @@@@@@@@  @@@@ @@@  @@@  @@@  @@@@@@@@  @@@@@@@   		\u001B[0m"+""+
			"\n\u001B[38;5;83m!@@       @@!  @@@  @@!@!@@@  @@!  @@@  @@!  @@@  !@@       @!@	\u001B[0m"+"\u001B[38;5;52m      db                            db       .M\"\"\"bgd   .g8\"\"\"bgd `7MMF'`7MMF'\u001B[0m"+
			"\n\u001B[38;5;77m!@!       !@!  @!@  !@!!@!@!  !@!  @!@  !@!  @!@  !@!       !@!	\u001B[0m"+"\u001B[38;5;53m     ;MM:                          ;MM:     ,MI    \"Y .dP'     `M   MM    MM  \u001B[0m"+
			"\n\u001B[38;5;84m!@!       @!@!@!@!  @!@ !!@!  @!@  !@!  @!@!@!@!  !!@@!!    !:!	\u001B[0m"+"\u001B[38;5;54m    ,V^MM.    `7MMpMMMb.          ,V^MM.    `MMb.     dM'       `   MM    MM  \u001B[0m"+
			"\n\u001B[38;5;85m!!!       !!!@!!!!  !@!  !!!  !@!  !!!  !!!@!!!!   !!@!!!       \u001B[0m"+"\u001B[38;5;55m   ,M  `MM      MM    MM         ,M  `MM      `YMMNq. MM            MM    MM  \u001B[0m"+
			"\n\u001B[38;5;86m:!!       !!:  !!!  !!:  !!!  :!:  !!:  !!:  !!!       !:!  :!:	\u001B[0m"+"\u001B[38;5;56m   AbmmmqMA     MM    MM         AbmmmqMA   .     `MM MM.           MM    MM  \u001B[0m"+
			"\n\u001B[38;5;80m:!:       :!:  !:!  :!:  !:!   ::!!:!   :!:  !:!      !:!   :::	\u001B[0m"+"\u001B[38;5;57m  A'     VML    MM    MM        A'     VML  Mb     dM `Mb.     ,'   MM    MM  \u001B[0m"+
			"\n\u001B[38;5;87m ::: :::  ::   :::   ::   ::    ::::    ::   :::  :::: ::   :::	\u001B[0m"+"\u001B[38;5;63m.AMA.   .AMMA..JMML  JMML.    .AMA.   .AMMA.P\"Ybmmd\"    `\"bmmmd'  .JMML..JMML.\u001B[0m"+
			"\n\u001B[38;5;81m :: :: :   :   : :  ::    :      :       :   : :  :: : :    		\u001B[0m"+""+
		"\n");
		System.out.println(
			"\n\t\t\t\t\t\t\t\t\u001B[38;5;196m                         ,,                                               \u001B[0m"+
			"\n\t\t\t\t\t\t\t\t\u001B[38;5;196m       .g8\"\"8q.        `7MM                                               \u001B[0m"+
			"\n\t\t\t\t\t\t\t\t\u001B[38;5;160m     .dP'    `YM.        MM                                               \u001B[0m"+
			"\n\t\t\t\t\t\t\t\t\u001B[38;5;197m     dM'      `MM   ,M\"\"bMM `7M'   `MF',pP\"Ybd ,pP\"Ybd  .gP\"Ya `7M'   `MF'\u001B[0m"+
			"\n\t\t\t\t\t\t\t\t\u001B[38;5;161m     MM        MM ,AP    MM   VA   ,V  8I   `\" 8I   `\" ,M'   Yb  VA   ,V  \u001B[0m"+
			"\n\t\t\t\t\t\t\t\t\u001B[38;5;198m     MM.      ,MP 8MI    MM    VA ,V   `YMMMa. `YMMMa. 8M\"\"\"\"\"\"   VA ,V   \u001B[0m"+
			"\n\t\t\t\t\t\t\t\t\u001B[38;5;162m     `Mb.    ,dP' `Mb    MM     VVV    L.   I8 L.   I8 YM.    ,    VVV    \u001B[0m"+
			"\n\t\t\t\t\t\t\t\t\u001B[38;5;199m       `\"bmmd\"'    `Wbmd\"MML.   ,V     M9mmmP' M9mmmP'  `Mbmmd'    ,V     \u001B[0m"+
			"\n\t\t\t\t\t\t\t\t\u001B[38;5;200m                               ,V                                 ,V      \u001B[0m"+
			"\n\t\t\t\t\t\t\t\t\u001B[38;5;201m                            OOb\"                               OOb\"       \u001B[0m"
		);
		System.out.println(
			"\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t"+"\u001B[38;5;230mBy:"+"\t   '||'                   ||  '||     '||''|.   '||''|.   \u001B[0m"+
			"\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u001B[38;5;229m    ||    ....  .. ...   ...   ||      ||   ||   ||   ||  \u001B[0m"+
			"\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u001B[38;5;228m    ||  .|...||  ||  ||   ||   ||      ||    ||  ||'''|.  \u001B[0m"+
			"\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u001B[38;5;227m    ||  ||       ||  ||   ||   ||      ||    ||  ||    || \u001B[0m"+
			"\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u001B[38;5;226m|| .|'   '|...' .||. ||. .||. .||.    .||...|'  .||...|'  \u001B[0m"+
			"\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u001B[38;5;226m '''                                                      \u001B[0m"
		);
	}
	static void MainMenu(){
		boolean T=true;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("\u001B[38;5;196m"+
			"\n+============================================================================================================================================================================+"+
			"\n|          .         .                                                                                  .         .                                                          |"+
			"\n|         ,8.       ,8.                   .8.           8888  8888 b.             8                    ,8.       ,8.          8 8888888888   b.             8 8 8888      88 |"+
			"\n|        ,888.     ,888.                 .888.          8888  8888 888o.          8                   ,888.     ,888.         8 8888         888o.          8 8 8888      88 |"+
			"\n|       .`8888.   .`8888.               :88888.         8888  8888 Y88888o.       8                  .`8888.   .`8888.        8 8888         Y88888o.       8 8 8888      88 |"+
			"\n|      ,8.`8888. ,8.`8888.             . `88888.        8888  8888 .`Y888888o.    8                 ,8.`8888. ,8.`8888.       8 8888         .`Y888888o.    8 8 8888      88 |"+
			"\n|     ,8'8.`8888,8^8.`8888.           .8. `88888.       8888  8888 8o. `Y888888o. 8                ,8'8.`8888,8^8.`8888.      8 888888888888 8o. `Y888888o. 8 8 8888      88 |"+
			"\n|    ,8' `8.`8888' `8.`8888.         .8`8. `88888.      8888  8888 8`Y8o. `Y88888o8               ,8' `8.`8888' `8.`8888.     8 8888         8`Y8o. `Y88888o8 8 8888      88 |"+
			"\n|   ,8'   `8.`88'   `8.`8888.       .8' `8. `88888.     8888  8888 8   `Y8o. `Y8888              ,8'   `8.`88'   `8.`8888.    8 8888         8   `Y8o. `Y8888 8 8888      88 |"+
			"\n|  ,8'     `8.`'     `8.`8888.     .8'   `8. `88888.    8888  8888 8      `Y8o. `Y8             ,8'     `8.`'     `8.`8888.   8 8888         8      `Y8o. `Y8 ` 8888     ,8P |"+
			"\n| ,8'       `8        `8.`8888.   .888888888. `88888.   8888  8888 8         `Y8o.`            ,8'       `8        `8.`8888.  8 8888         8         `Y8o.`   8888   ,d8P  |"+
			"\n|,8'         `         `8.`8888. .8'       `8. `88888.  8888  8888 8            `Yo           ,8'         `         `8.`8888. 8 888888888888 8            `Yo    `Y88888P'   |"+
			"\n+============================================================================================================================================================================+\u001B[0m"
			);	
			System.out.println("\t\t\t\t\t\t_____________________________________________________________________________");
			System.out.println("\n\t\t\t\t\t\tStory 1");
			System.out.println("\t\t\t\t\t\t*Monarch vs. Predator:Duel of Dominance*"+"\t A Bravery Tale");
			System.out.println("\t\t\t\t\t\t_____________________________________________________________________________");
			System.out.println("\n\t\t\t\t\t\tStory 2");
			System.out.println("\t\t\t\t\t\t*Tale of the Enchanted Cipher*"+"\t\t\t A Friction Fantasy");
			System.out.println("\t\t\t\t\t\t_____________________________________________________________________________");
			System.out.println("\n\t\t\t\t\t\tStory 3");
			System.out.println("\t\t\t\t\t\t*The Tale of the Moonlit Kingdom*"+"\t\t A Fairytale ");
			System.out.println("\t\t\t\t\t\t_____________________________________________________________________________");
			System.out.println("\n\t\t\t\t\t\tStory 4");
			System.out.println("\t\t\t\t\t\t*The Digital Odyssey*"+"\t\t\t\t A Science Friction Adventure");
			System.out.println("\t\t\t\t\t\t_____________________________________________________________________________");
			System.out.println("\t\t\t\t\t\t5 For Exit.");
			System.out.print("\n\t\t\t\t\t\t");
			int choice=sc.nextInt();
			switch (choice){
				case 1:Story1 S1=new Story1();
				break;
				case 2:Story2 S2=new Story2();
				break;
				case 3:Story3 S3=new Story3();
				break;
				case 4:Story4 S4=new Story4();
				break;
				case 5:T=false;
				break;
				default:System.out.println("Default");
				break;
			}
		}while(T);
		if (T==false)
			System.exit(0);
	}
}

class Stories extends G{//so that i can use this keyword like this.choice
	String choice;
	boolean A,B,A1,A2,B1,B2;
	void TheEnd(){
		System.out.println("\n"+
		"\n\t\t\t\t\t\t\t\t\u001B[38;5;196m  ::::::::::: :::    ::: ::::::::::          :::::::::: ::::    ::: ::::::::: "+
		"\n\t\t\t\t\t\t\t\t\u001B[38;5;160m     :+:     :+:    :+: :+:                 :+:        :+:+:   :+: :+:    :+: "+
		"\n\t\t\t\t\t\t\t\t\u001B[38;5;197m    +:+     +:+    +:+ +:+                 +:+        :+:+:+  +:+ +:+    +:+  "+
		"\n\t\t\t\t\t\t\t\t\u001B[38;5;161m   +#+     +#++:++#++ +#++:++#            +#++:++#   +#+ +:+ +#+ +#+    +:+   "+
		"\n\t\t\t\t\t\t\t\t\u001B[38;5;198m  +#+     +#+    +#+ +#+                 +#+        +#+  +#+#+# +#+    +#+    "+
		"\n\t\t\t\t\t\t\t\t\u001B[38;5;162m #+#     #+#    #+# #+#                 #+#        #+#   #+#+# #+#    #+#     "+
		"\n\t\t\t\t\t\t\t\t\u001B[38;5;199m###     ###    ### ##########          ########## ###    #### #########       "+
		"\n\t\t\t\t\t\t\t\t\u001B[38;5;200m______________________________________________________________________________\u001B[0m"
		);
	}
}
class Story1 extends Stories{
	Scanner sc=new Scanner(System.in);
//Instance Block
		{
		//System.out.println("Monarch vs. Predator:Duel of Dominance");	
		System.out.println(
		"\n\u001B[38;5;196m    ...     ..      ..                                                                                 \u001B[0m|   _            .x+=:.           "+
		"\n\u001B[38;5;196m  x*8888x.:*8888: -\"888:                                                                  .uef^\"       \u001B[0m|  u            z`    ^%        "+
		"\n\u001B[38;5;196m X   48888X `8888H  8888          u.      u.    u.                  .u    .             :d88E          \u001B[0m| 88Nu.   u.       .   <k         "+
		"\n\u001B[38;5;196mX8x.  8888X  8888X  !888>   ...ue888b   x@88k u@88c.       u      .d88B :@8c        .   `888E          \u001B[0m|'88888.o888c    .@8Ned8\"        "+
		"\n\u001B[38;5;196mX8888 X8888  88888   \"*8%-  888R Y888r ^\"8888\"\"8888\"    us888u.  =\"8888f8888r  .udR88N   888E .z8k     \u001B[0m| ^8888  8888  .@^%8888\"   "+
		"\n\u001B[38;5;196m'*888!X8888> X8888  xH8>    888R I888>   8888  888R  .@88 \"8888\"   4888>'88\"  <888'888k  888E~?888L    \u001B[0m|  8888  8888 x88:  `)8b.      "+
		"\n\u001B[38;5;196m  `?8 `8888  X888X X888>    888R I888>   8888  888R  9888  9888    4888> '    9888 'Y\"   888E  888E    \u001B[0m|  8888  8888 8888N=*8888        "+
		"\n\u001B[38;5;196m  -^  '888\"  X888  8888>    888R I888>   8888  888R  9888  9888    4888>      9888       888E  888E    \u001B[0m|  8888  8888  %8\"    R88       "+
		"\n\u001B[38;5;196m   dx '88~x. !88~  8888>   u8888cJ888    8888  888R  9888  9888   .d888L .+   9888       888E  888E    \u001B[0m| .8888b.888P   @8Wou 9%     .    "+
		"\n\u001B[38;5;196m .8888Xf.888x:!    X888X.:  \"*888*P\"    \"*88*\" 8888\" 9888  9888   ^\"8888*\"    ?8888u../  888E  888E    \u001B[0m|  ^Y8888*\"\"  .888888P`  "+
		"\n\u001B[38;5;196m:\"\"888\":~\"888\"     `888*\"     'Y\"         \"\"   'Y\"   \"888*\"\"888\"     \"Y\"       \"8888P'  m888N= 888>    \u001B[0m|     `Y\"      ` "+
		"\n\u001B[38;5;196m    \"~'    \"~        \"\"                               ^Y\"   ^Y'                  \"P'     `Y\"   888     \u001B[0m|                           "+
		"\n\u001B[38;5;196m                                                                                              J88\"     \u001B[0m|                                  "+
		"\n\u001B[38;5;196m                                                                                              @%       \u001B[0m|                                  "+
		"\n\u001B[38;5;196m                                                                                            :\"         \u001B[0m\u001B[0m|                                  ");
		System.out.print(
		"\n\t\u001B[38;5;21m    ....      ..                                ..                        s                                    \u001B[0m"+
		"\n\t\u001B[38;5;21m  +^\"\"888h. ~\"888h                            dF                         :8                                    \u001B[0m"+
		"\n\t\u001B[38;5;21m 8X.  ?8888X  8888f     .u    .              '88bu.                     .88           u.      .u    .          \u001B[0m"+"\t\t.s5SSSs.                                                           "+
		"\n\t\u001B[38;5;21m'888x  8888X  8888~   .d88B :@8c       .u    '*88888bu         u       :888ooo  ...ue888b   .d88B :@8c     .   \u001B[0m"+"\t\t      SS. .s    s.  .s5SSSs.  .s            .s5SSSs.  .s5SSSs.     "+
		"\n\t\u001B[38;5;21m'88888 8888X   \"88x: =\"8888f8888r   ud8888.    ^\"*8888N     us888u.  -*8888888  888R Y888r =\"8888f8888r   d8c  \u001B[0m"+"\t\tsS    S%S       SS.       SS.                     SS.              "+
		"\n\t\u001B[38;5;21m `8888 8888X  X88x.    4888>'88\"  :888'8888.  beWE \"888L .@88 \"8888\"   8888     888R I888>   4888>'88\"  ^*888% \u001B[0m"+"\t\tSS    S%S sS    S%S sS    `:; sS            sS    S%S sS           "+
		"\n\t\u001B[38;5;21m   `*` 8888X '88888X   4888> '    d888 '88%\"  888E  888E 9888  9888    8888     888R I888>   4888> '      \"8   \u001B[0m"+"\t\tSS    S%S SS    S%S SSSs.     SS            SS    S%S SSSs.        "+
		"\n\t\u001B[38;5;21m  ~`...8888X  \"88888   4888>      8888.+\"     888E  888E 9888  9888    8888     888R I888>   4888>             \u001B[0m"+"\t\tSS    S%S SS    S%S SS        SS            SS    S%S SS           "+
		"\n\t\u001B[38;5;21m   x8888888X.   `%8\"  .d888L .+   8888L       888E  888F 9888  9888   .8888Lu= u8888cJ888   .d888L .+      .   \u001B[0m"+"\t\tSS    `:; SS    `:; SS        SS            SS    `:; SS           "+
		"\n\t\u001B[38;5;21m  '%\"*8888888h.   \"   ^\"8888*\"    '8888c. .+ .888N..888  9888  9888   ^%888*    \"*888*P\"    ^\"8888*\"     .@8c  \u001B[0m"+"\t\tSS    ;,. SS    ;,. SS    ;,. SS    ;,.     SS    ;,. SS           "+
		"\n\t\u001B[38;5;21m  ~    888888888!`       \"Y\"       \"88888%    `\"888*\"\"   \"888*\"\"888\"    'Y\"       'Y\"          \"Y\"      '%888\" \u001B[0m"+"\t\t;;;;;;;:' `:;;;;;:' `:;;;;;:' `:;;;;;:'     `:;;;;;:' :;           "+
		"\n\t\u001B[38;5;21m       X888^\"\"\"                      \"YP'        \"\"       ^Y\"   ^Y'                                       ^*   \u001B[0m\u001B[0m"+
		"\n\t\u001B[38;5;21m       `88f                                                                                                    \u001B[0m"+
		"\n\t\u001B[38;5;21m        88                                                                                                     \u001B[0m"+
		"\n\t\u001B[38;5;21m        \"\"                                                                                                     \u001B[0m"
		);
		System.out.print(
		"\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t .s5SSSs.                                                                            \u001B[0m"+
		"\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t       SS. .s5SSSs.  .s5ssSs.  s.  .s    s.  .s5SSSs.  .s    s.  .s5SSSs.  .s5SSSs.  "+
		"\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t SS    S%S sS    S%S sS SS S%S S%S sSs.  S%S sS    S%S sSs.  S%S sS    `:; sS    `:; "+
		"\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t SS    S%S SS    S%S SS :; S%S S%S SS `S.S%S SSSs. S%S SS `S.S%S SS        SSSs.     "+
		"\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t SS    S%S SS    S%S SS    S%S S%S SS  `sS%S SS    S%S SS  `sS%S SS        SS        "+
		"\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t SS    `:; SS    `:; SS    `:; `:; SS    `:; SS    `:; SS    `:; SS        SS        \""+
		"\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t SS    ;,. SS    ;,. SS    ;,. ;,. SS    ;,. SS    ;,. SS    ;,. SS    ;,. SS    ;,. \""+
		"\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t ;;;;;;;:' `:;;;;;:' :;    ;:' ;:' :;    ;:' :;    ;:' :;    ;:' `:;;;;;:' `:;;;;;:' \n\n\n"
		);
		}
		
//Constructor Story1
		Story1(){
			System.out.println(
			"\n╔═╗"+"\t\t\t\t\t\t\t\t\u001B[38;5;196m ╔═╗┬ ┬┬─┐┌─┐┬  ┬┬ ┬┌─┐\u001B[0m"+
			"\n║ ║"+"\t\t\t\t\t\t\t\t\u001B[38;5;196m ╠═╣│ │├┬┘├┤ │  ││ │└─┐\u001B[0m"+"\t\t\t\t\t\t\u001B[38;5;21m  ╔═╗┌┐ ┌─┐┬┌┬┐┬┌─┐┌┐┌\u001B[0m"+
			"\n╚═╝"+"nce upon a time, in a mystical realm, a courageous king named"+"\u001B[38;5;196m ╩ ╩└─┘┴└─└─┘┴─┘┴└─┘└─┘\u001B[0m"+
			" ruled over a vast kingdom."+
			"\t\t\u001B[38;5;21m  ║ ║├┴┐└─┐│ │││├─┤│││\u001B[0m"+"\nThe land was known for its lush forests, towering mountains, and hidden caves. Within this kingdom lurked a legendary tiger named "+
			"\u001B[38;5;21m╚═╝└─┘└─┘┴─┴┘┴┴ ┴┘└┘\u001B[0m"+
			", \nwhose majestic black fur was said to absorb the moonlight.");
			System.out.println(
			"\n╔═╗"+
			"\n║ ║"+
			"\n╚═╝"+
			"ne fateful day, news spread that Obsidian had been spotted near the outskirts of the kingdom, causing unrest among the people. \nKing Aurelius, known for his valor, decided to confront the mighty tiger and ensure the safety of his realm.");
			System.out.println(
			"\n╦ ╦"+
			"\n╠═╣"+
			"\n╩ ╩"+"ere, the tale takes a unique turn. The destiny of the kingdom lies in the hands of the one making choices. \nThe king, demonstrating his strategic prowess, must decide the next steps in this gripping encounter.");
			System.out.println(
			"\u001B[38;5;46m"+
			"\n╔╗╔╗╔╗  ╔╗ ╔╗     ╔╗ ╔╗           "+
			"\n║║║║║║  ║║ ║║     ║║ ║║           "+
			"\n║║║║║║╔╗║║ ║║     ║╚═╝║╔══╗    ╔═╗"+
			"\n║║║╚╝║╠╣║║ ║║     ║╔═╗║║╔╗║    ╚═╝"+
			"\n║╚╝  ║║║║╚╗║╚╗    ║║ ║║║║═╣    ╔═╗"+
			"\n╚════╝╚╝╚═╝╚═╝    ╚╝ ╚╝╚══╝    ╚═╝\u001B[0m\n"
			);
			//A&B
			System.out.println(
			"\n     \\           |   _)                       \\       "+"\t\t\t\t\t\t   |"+"\t\t    \\           |   _)                    __ )     "+
			"\n    _ \\     __|  __|  |   _ \\   __ \\         _ \\    _)"+"\t\t\t\t\t\t   |"+"\t\t   _ \\     __|  __|  |   _ \\   __ \\       __ \\  _) "+
			"\n   ___ \\   (     |    |  (   |  |   |       ___ \\     "+"\t\t*# Approach the Tiger Directly #*  |"+"\t\t  ___ \\   (     |    |  (   |  |   |      |   |    "+"\t\t*# Invoke Ancient Magic #*"+
			"\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\  _)"+"\t\t\t\t\t\t   |"+"\t\t_/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/  _) "+
			"\n"
			 );
			 
			System.out.print("\t\t\t\t\t\t");
			choice = sc.nextLine();//sc.nextLine();
				if (this.choice.equalsIgnoreCase("Approach the Tiger Directly"))
					this.A=true;
				if (this.choice.equalsIgnoreCase("Invoke Ancient Magic"))
					this.B=true;
			nextPartA(A);
			nextPartB(B);
		}
		
		void nextPartA(boolean A){
			while(A){
				System.out.println("\n* The king boldly strides forward to confront Obsidian face-to-face.");
				System.out.println(
				"\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ "+
				"\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  "+
				"\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] "+
				"\n\t- If the king chooses to approach directly, it sets the stage for a direct confrontation, potentially impacting the initial dynamics between him and Obsidian."+
				"\n\n");
				
				//A1 & A2
				System.out.println(
				"\n     \\           |   _)                       \\   _ |    "+"\t\t\t\t\t   |"+"\t\t     \\           |   _)                       \\    ___ \\     "+
				"\n    _ \\     __|  __|  |   _ \\   __ \\         _ \\    | _) "+"\t\t\t\t\t   |"+"\t\t    _ \\     __|  __|  |   _ \\   __ \\         _ \\      ) | _) "+
				"\n   ___ \\   (     |    |  (   |  |   |       ___ \\   |    "+"\t\t*# Brute Force #* \t   |"+"\t\t   ___ \\   (     |    |  (   |  |   |       ___ \\    __/     "+"\t\t*# Precision Strikes #*"+
				"\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\ _| _)"+"\t\t\t\t\t   |"+"\t\t _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\ _____| _) "
				);
				
				System.out.println(
				"\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ "+
				"\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  "+
				"\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] "+
				"\n\t- The choice between brute force and precision strikes determines the style of the battle, influencing the overall outcome."+
				"\n\n"
				);
				
				System.out.print("\t\t\t\t\t\t");
				choice=sc.nextLine();
				if (this.choice.equalsIgnoreCase("Brute Force"))
					this.A1=true;
				if (this.choice.equalsIgnoreCase("Precision Strikes"))
					this.A2=true;
				
				this.A1=nextPartA1(A1);
				this.A2=nextPartA2(A2);
				if(this.A1==false &&this.A2==false)
					G.MainMenu();
			}
		}
			boolean nextPartA1(boolean A1){
				while(A1){
					
					System.out.println(
					"\n\n\n    ______          ___                ___   ___ "+
					"\n   / ____/___  ____/ (_)___  ____ _   /   | <  / "+
					"\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / /| | / (_)"+
					"\n / /___/ / / / /_/ / / / / / /_/ /  / ___ |/ /   "+"\t\t\t Brute Force"+
					"\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_/  |_/_(_)  "+
					"\n                          /____/                 \n"
					);
					
					System.out.println("The king delivers a powerful blow that disarms Obsidian. Recognizing the king's valor, the tiger concedes, bowing before Aurelius. United through respect,"+
					"\nthe king and Obsidian forge an unprecedented alliance, creating a kingdom where humans and mystical creatures coexist in harmony.");
					this.TheEnd();
					return false;
				}			
					return false;
			}
			boolean nextPartA2(boolean A2){
				while(A2){
					System.out.println(
					"\n\n\n    ______          ___                ___   ___    "+
					"\n   / ____/___  ____/ (_)___  ____ _   /   | |__ \\ _ "+
					"\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / /| | __/ /(_)"+
					"\n / /___/ / / / /_/ / / / / / /_/ /  / ___ |/ __/_   "+"\t\t Precision Strikes"+
					"\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_/  |_/____(_)  "+
					"\n                          /____/                   \n"
					);
					
					System.out.println("With calculated precision, the king incapacitates Obsidian, leaving the mighty tiger humbled. Realizing the king's mercy, Obsidian chooses to serve as a guardian for the kingdom. The duo becomes legendary,"+
					"\ntheir tale told for generations as a symbol of diplomacy and strategic prowess.");
					this.TheEnd();
					return false;
				}
					return false;
			}
			
		void nextPartB(boolean B){
			while(B){
				System.out.println("\nThe king, aware of ancient enchantments within the kingdom, taps into mystical powers. He invokes spells to either pacify the tiger or enhance his own abilities for the impending confrontation.");
				//B1 & B2
				System.out.println(
				"\n\n\n     \\           |   _)                    __ ) _ |     "+"\t\t\t\t\t   |"+"\t\t    \\           |   _)                    __ ) ___ \\  "+
				"\n    _ \\     __|  __|  |   _ \\   __ \\       __ \\   | _)  "+"\t\t\t\t\t   |"+"\t\t   _ \\     __|  __|  |   _ \\   __ \\       __ \\    ) | _)"+
				"\n   ___ \\   (     |    |  (   |  |   |      |   |  |     "+"\t\t*# Harmony Magic #* \t   |"+"\t\t  ___ \\   (     |    |  (   |  |   |      |   |  __/  "+"\t\t*# Destruction Magic #*"+
				"\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/  _| _)  "+"\t\t\t\t\t   |"+"\t\t_/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/ _____| _)"
				);
				System.out.println(
				"\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ "+
				"\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  "+
				"\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] "+
				"\n\t- The choice between harmony and destruction magic sets the tone for the magical influence on Obsidian and affects the kingdom's fate."+
				"\n\n"
				);
				
				System.out.print("\t\t\t\t\t\t");
				choice=sc.nextLine();
				if (this.choice.equalsIgnoreCase("Harmony Magic"))
					this.B1=true;
				if (this.choice.equalsIgnoreCase("Destruction Magic"))
					this.B2=true;
				
				this.B1=nextPartB1(B1);
				this.B2=nextPartB2(B2);
				if(this.B1==false &&this.B2==false)
					G.MainMenu();
			}
		}
			boolean nextPartB1(boolean B1){
				while(B1){
					System.out.println(
					"\n\n\n    ______          ___                ____ ___"+
					"\n   / ____/___  ____/ (_)___  ____ _   / __ <  /"+
					"\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / __  / / "+
					"\n / /___/ / / / /_/ / / / / / /_/ /  / /_/ / /  "+"\t\t\t Harmony Magic"+
					"\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_____/_/   "+
					"\n                          /____/               "
					);
					System.out.println("The king delivers a powerful blow that disarms Obsidian. Recognizing the king's valor, the tiger concedes, bowing before Aurelius. United through respect,"+
					"\nthe king and Obsidian forge an unprecedented alliance, creating a kingdom where humans and mystical creatures coexist in harmony.");
					this.TheEnd();
					return false;
				}			
				return false;
			}
			boolean nextPartB2(boolean B2){
				while(B2){
					System.out.println(
					"\n\n\n    ______          ___                ____ ___    "+
					"\n   / ____/___  ____/ (_)___  ____ _   / __ )__ \\ _ "+
					"\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / __  |_/ /(_)"+
					"\n / /___/ / / / /_/ / / / / / /_/ /  / /_/ / __/_   "+"\t\t\t Destruction Magic"+
					"\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_____/____(_)  "+
					"\n                          /____/                   "
					);
					System.out.println("With calculated precision, the king incapacitates Obsidian, leaving the mighty tiger humbled. Realizing the king's mercy, Obsidian chooses to serve as a guardian for the kingdom. The duo becomes legendary,"+
					"\ntheir tale told for generations as a symbol of diplomacy and strategic prowess.");
					this.TheEnd();
					return false;
				}
				return false;	
			}
}
class Story2 extends Stories{
	Scanner sc=new Scanner(System.in);
//Instance Block2
		{
		System.out.println("\nStory 2\u001B[38;5;129m"+
		"\n\tsdSS_SSSSSSbs   .S_SSSs    S.        sSSs          sSSs_sSSs      sSSs        sdSS_SSSSSSbs   .S    S.     sSSs     "+
		"\n\tYSSS~S%SSSSSP  .SS~SSSSS   SS.      d%%SP         d%%SP~YS%%b    d%%SP        YSSS~S%SSSSSP  .SS    SS.   d%%SP     "+
		"\n\t     S%S       S%S   SSSS  S%S     d%S'          d%S'     `S%b  d%S'               S%S       S%S    S%S  d%S'       "+
		"\n\t     S%S       S%S    S%S  S%S     S%S           S%S       S%S  S%S                S%S       S%S    S%S  S%S        "+
		"\n\t     S&S       S%S SSSS%S  S&S     S&S           S&S       S&S  S&S                S&S       S%S SSSS%S  S&S        "+
		"\n\t     S&S       S&S  SSS%S  S&S     S&S_Ss        S&S       S&S  S&S_Ss             S&S       S&S  SSS&S  S&S_Ss     "+
		"\n\t     S&S       S&S    S&S  S&S     S&S~SP        S&S       S&S  S&S~SP             S&S       S&S    S&S  S&S~SP     "+
		"\n\t     S&S       S&S    S&S  S&S     S&S           S&S       S&S  S&S                S&S       S&S    S&S  S&S        "+
		"\n\t     S*S       S*S    S&S  S*b     S*b           S*b       d*S  S*b                S*S       S*S    S*S  S*b        "+
		"\n\t     S*S       S*S    S*S  S*S.    S*S.          S*S.     .S*S  S*S                S*S       S*S    S*S  S*S.       "+
		"\n\t     S*S       S*S    S*S   SSSbs   SSSbs         SSSbs_sdSSS   S*S                S*S       S*S    S*S   SSSbs     "+
		"\n\t     S*S       SSS    S*S    YSSP    YSSP          YSSP~YSSY    S*S                S*S       SSS    S*S    YSSP     "+
		"\n\t     SP               SP                                        SP                 SP               SP              "+
		"\n\t     Y                Y                                         Y                  Y                Y               \n"+
		"\n     sSSs   .S_sSSs      sSSs   .S    S.    .S_SSSs     .S_sSSs    sdSS_SSSSSSbs    sSSs   .S_sSSs            sSSs   .S   .S_sSSs     .S    S.     sSSs   .S_sSSs    "+
		"\n    d%%SP  .SS~YS%%b    d%%SP  .SS    SS.  .SS~SSSSS   .SS~YS%%b   YSSS~S%SSSSSP   d%%SP  .SS~YS%%b          d%%SP  .SS  .SS~YS%%b   .SS    SS.   d%%SP  .SS~YS%%b   "+
		"\n   d%S'    S%S   `S%b  d%S'    S%S    S%S  S%S   SSSS  S%S   `S%b       S%S       d%S'    S%S   `S%b        d%S'    S%S  S%S   `S%b  S%S    S%S  d%S'    S%S   `S%b  "+
		"\n   S%S     S%S    S%S  S%S     S%S    S%S  S%S    S%S  S%S    S%S       S%S       S%S     S%S    S%S        S%S     S%S  S%S    S%S  S%S    S%S  S%S     S%S    S%S  "+
		"\n   S&S     S%S    S&S  S&S     S%S SSSS%S  S%S SSSS%S  S%S    S&S       S&S       S&S     S%S    S&S        S&S     S&S  S%S    d*S  S%S SSSS%S  S&S     S%S    d*S  "+
		"\n   S&S_Ss  S&S    S&S  S&S     S&S  SSS&S  S&S  SSS%S  S&S    S&S       S&S       S&S_Ss  S&S    S&S        S&S     S&S  S&S   .S*S  S&S  SSS&S  S&S_Ss  S&S   .S*S  "+
		"\n   S&S~SP  S&S    S&S  S&S     S&S    S&S  S&S    S&S  S&S    S&S       S&S       S&S~SP  S&S    S&S        S&S     S&S  S&S_sdSSS   S&S    S&S  S&S~SP  S&S_sdSSS   "+
		"\n   S&S     S&S    S&S  S&S     S&S    S&S  S&S    S&S  S&S    S&S       S&S       S&S     S&S    S&S        S&S     S&S  S&S~YSSY    S&S    S&S  S&S     S&S~YSY%b   "+
		"\n   S*b     S*S    S*S  S*b     S*S    S*S  S*S    S&S  S*S    S*S       S*S       S*b     S*S    d*S        S*b     S*S  S*S         S*S    S*S  S*b     S*S   `S%b  "+
		"\n   S*S.    S*S    S*S  S*S.    S*S    S*S  S*S    S*S  S*S    S*S       S*S       S*S.    S*S   .S*S        S*S.    S*S  S*S         S*S    S*S  S*S.    S*S    S%S  "+
		"\n    SSSbs  S*S    S*S   SSSbs  S*S    S*S  S*S    S*S  S*S    S*S       S*S        SSSbs  S*S_sdSSS          SSSbs  S*S  S*S         S*S    S*S   SSSbs  S*S    S&S  "+
		"\n     YSSP  S*S    SSS    YSSP  SSS    S*S  SSS    S*S  S*S    SSS       S*S         YSSP  SSS~YSSY            YSSP  S*S  S*S         SSS    S*S    YSSP  S*S    SSS  "+
		"\n           SP                         SP          SP   SP               SP                                          SP   SP                 SP           SP          "+
		"\n           Y                          Y           Y    Y                Y                                           Y    Y                  Y            Y           \u001B[0m"
		);
		}
		
//Constructor Story2
		Story2(){
			System.out.println("\n\n\tIn the mystical realm of Eldoria, a land adorned with emerald forests and shimmering lakes, King Alaric ruled with wisdom and benevolence.\n"+
			"\n╦ ╦"+
			"\n╠═╣"+
			"\n╩ ╩"+"owever, a mysterious cipher, said to hold the key to ancient powers, began to emerge, casting a veil of uncertainty over the kingdom.");
			System.out.println("\n\n### Prologue: The Whispers of the Cipher"+
			"\n\tWhispers of the enchanted cipher reached King Alaric's ears. It was said that those who unraveled its secrets could command the very fabric of magic itself."+
			"\nEager to ensure the safety of his kingdom, the king embarked on a quest to find the source of the cryptic messages.\n");
			//A&B
			System.out.println(
			"\n     \\           |   _)                       \\       "+"\t\t\t\t\t\t        |"+"\t    \\           |   _)                    __ )     "+
			"\n    _ \\     __|  __|  |   _ \\   __ \\         _ \\    _)"+"\t\t\t\t\t\t        |"+"\t   _ \\     __|  __|  |   _ \\   __ \\       __ \\  _) "+
			"\n   ___ \\   (     |    |  (   |  |   |       ___ \\     "+"\t\t*# Journey into the Forgotten Woods #*  |"+"\t  ___ \\   (     |    |  (   |  |   |      |   |  "+"\t\t*# Consult the Oracle #*"+
			"\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\  _)"+"\t\t\t\t\t\t        |"+"\t_/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/  _) "+
			"\n"
			 );
			System.out.println(
				"\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ "+
				"\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  "+
				"\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] "+
				"\n\t- The choice influences the initial challenges and allies the king encounters in his quest."+
				"\n\n"); 
			System.out.print("\t\t\t\t\t\t");
			choice = sc.nextLine();//sc.nextLine();
				if (this.choice.equalsIgnoreCase("Journey into the Forgotten Woods"))
					this.A=true;
				if (this.choice.equalsIgnoreCase("Consult the Oracle"))
					this.B=true;
			nextPartA(A);
			nextPartB(B);
		}
		
		void nextPartA(boolean A){
			while(A){
				System.out.println("\n* King Alaric decides to explore the mystical, uncharted woods rumored to be the origin of the cipher.");
				System.out.println("\n\n* King Alaric ventures into the heart of the forgotten woods, where ancient spirits and magical creatures dwell.");
				//A1 & A2
				System.out.println(
				"\n     \\           |   _)                       \\   _ |    "+"\t\t\t\t\t   |"+"\t     \\           |   _)                       \\    ___ \\     "+
				"\n    _ \\     __|  __|  |   _ \\   __ \\         _ \\    | _) "+"\t\t\t\t\t   |"+"\t    _ \\     __|  __|  |   _ \\   __ \\         _ \\      ) | _) "+
				"\n   ___ \\   (     |    |  (   |  |   |       ___ \\   |   "+"\t*# Follow the Luminescent  \t   |"+"\t   ___ \\   (     |    |  (   |  |   |       ___ \\    __/     "+"\t*# Listen to the Whispering  "+
				"\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\ _| _)"+"\t\t Butterflies \t#*\t   |"+"\t _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\ _____| _) "+"\t\t Trees #*"
				);
				
				System.out.println(
				"\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ "+
				"\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  "+
				"\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] "+
				"\n\t- The choice determines the nature of the challenges in the woods and the knowledge gained about the cipher."+
				"\n\n"
				);
				
				System.out.print("\t\t\t\t\t\t");
				choice=sc.nextLine();
				if (this.choice.equalsIgnoreCase("Follow the Luminescent Butterflies"))
					this.A1=true;
				if (this.choice.equalsIgnoreCase("Listen to the Whispering Trees"))
					this.A2=true;
				
				this.A1=nextPartA1(A1);
				this.A2=nextPartA2(A2);
				if(this.A1==false &&this.A2==false)
					G.MainMenu();
			}
		}
			boolean nextPartA1(boolean A1){
				while(A1){
					
					System.out.println(
					"\n\n\n    ______          ___                ___   ___ "+
					"\n   / ____/___  ____/ (_)___  ____ _   /   | <  / "+
					"\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / /| | / (_)"+
					"\n / /___/ / / / /_/ / / / / / /_/ /  / ___ |/ /   "+"\t\t\t Follow the Luminescent Butterflies"+
					"\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_/  |_/_(_)  "+
					"\n                          /____/                 \n"
					);
					
					System.out.println("Following the butterflies, King Alaric discovers a hidden glade where the cipher reveals itself in a burst of ethereal light."+
					"\nThe butterflies, enchanted protectors of the cipher, pledge their allegiance to the king, granting him their magical guidance."
					);
					this.TheEnd();
					return false;
				}			
				return false;
			}
			boolean nextPartA2(boolean A2){
				while(A2){
					System.out.println(
					"\n\n\n    ______          ___                ___   ___    "+
					"\n   / ____/___  ____/ (_)___  ____ _   /   | |__ \\ _ "+
					"\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / /| | __/ /(_)"+
					"\n / /___/ / / / /_/ / / / / / /_/ /  / ___ |/ __/_   "+"\t\t Whispers of the Trees"+
					"\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_/  |_/____(_)  "+
					"\n                          /____/                   \n"
					);
					
					System.out.println("Listening to the whispering trees, the king gains profound knowledge about the cipher's history."+
					"The ancient trees, grateful for his respect, imbue Alaric with their wisdom, becoming allies in his quest."
					);
					this.TheEnd();
					return false;
				}
				return false;
			}
			
		void nextPartB(boolean B){
			while(B){
				System.out.println("\n* Seeking guidance, the king visits the ancient oracle, hoping to unravel the secrets through divine wisdom.");
				System.out.println("\n* King Alaric seeks counsel from the oracle, a wise and mysterious seer.");
				//B1 & B2
				System.out.println(
				"\n\n\n     \\           |   _)                    __ ) _ |     "+"\t\t\t\t\t   |"+"\t\t    \\           |   _)                    __ ) ___ \\  "+
				"\n    _ \\     __|  __|  |   _ \\   __ \\       __ \\   | _)  "+"\t\t\t\t\t   |"+"\t\t   _ \\     __|  __|  |   _ \\   __ \\       __ \\    ) | _)"+
				"\n   ___ \\   (     |    |  (   |  |   |      |   |  |     "+"\t   *# Seek a Vision in  \t   |"+"\t\t  ___ \\   (     |    |  (   |  |   |      |   |  __/  "+"\t\t*# Interpret the Oracle's "+
				"\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/  _| _)  "+"\t\t the Sacred Pool #*\t   |"+"\t\t_/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/ _____| _)"+"\t\t   Dream #*"
				);
				System.out.println(
				"\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ "+
				"\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  "+
				"\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] "+
				"\n\t- "+
				"\n\n"
				);
				
				System.out.print("\t\t\t\t\t\t");
				choice=sc.nextLine();
				if (this.choice.equalsIgnoreCase("Seek a Vision in the Sacred Pool"))
					this.B1=true;
				if (this.choice.equalsIgnoreCase("Interpret the Oracle's Dream"))
					this.B2=true;
				
				this.B1=nextPartB1(B1);
				this.B2=nextPartB2(B2);
				if(this.B1==false &&this.B2==false)
					G.MainMenu();
			}
		}
			boolean nextPartB1(boolean B1){
				while(B1){
					System.out.println(
					"\n\n\n    ______          ___                ____ ___"+
					"\n   / ____/___  ____/ (_)___  ____ _   / __ <  /"+
					"\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / __  / / "+
					"\n / /___/ / / / /_/ / / / / / /_/ /  / /_/ / /  "+"\t\t\t Vision of the Pool"+
					"\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_____/_/   "+
					"\n                          /____/               "
					);
					System.out.println("Gazing into the sacred pool, King Alaric sees a vision of the cipher guarded by mystical beings."+
					"\nThe oracle's blessing grants him insight, and a guardian spirit emerges to aid him on his quest.");
					this.TheEnd();
					return false;
				}			
				return false;
			}
			boolean nextPartB2(boolean B2){
				while(B2){
					System.out.println(
					"\n\n\n    ______          ___                ____ ___    "+
					"\n   / ____/___  ____/ (_)___  ____ _   / __ )__ \\ _ "+
					"\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / __  |_/ /(_)"+
					"\n / /___/ / / / /_/ / / / / / /_/ /  / /_/ / __/_   "+"\t\t\t Dreamweaver's Insight"+
					"\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_____/____(_)  "+
					"\n                          /____/                   "
					);
					System.out.println("Interpreting the oracle's dream, the king deciphers clues leading him to a hidden temple."+
					"\nThe dream unveils a guardian creature that pledges allegiance to Alaric, becoming a powerful ally.");
					this.TheEnd();
					return false;
				}
				return false;	
			}
}
class Story3 extends Stories{
	Scanner sc=new Scanner(System.in);
//Instance Block3
		{
		System.out.println("\nStory 3");
		System.out.println("\n\u001B[38;5;226m"+
		"\n\t████████╗██╗  ██╗███████╗    ████████╗ █████╗ ██╗     ███████╗     ██████╗ ███████╗  "+
		"\n\t╚══██╔══╝██║  ██║██╔════╝    ╚══██╔══╝██╔══██╗██║     ██╔════╝    ██╔═══██╗██╔════╝  "+
		"\n\t   ██║   ███████║█████╗         ██║   ███████║██║     █████╗      ██║   ██║█████╗    "+
		"\n\t   ██║   ██╔══██║██╔══╝         ██║   ██╔══██║██║     ██╔══╝      ██║   ██║██╔══╝    "+
		"\n\t   ██║   ██║  ██║███████╗       ██║   ██║  ██║███████╗███████╗    ╚██████╔╝██║       "+
		"\n\t   ╚═╝   ╚═╝  ╚═╝╚══════╝       ╚═╝   ╚═╝  ╚═╝╚══════╝╚══════╝     ╚═════╝ ╚═╝       "+
		"\n  ████████╗██╗  ██╗███████╗    ███╗   ███╗ ██████╗  ██████╗ ███╗   ██╗██╗     ██╗████████╗    ██╗  ██╗██╗███╗   ██╗ ██████╗ ██████╗  ██████╗ ███╗   ███╗"+
		"\n  ╚══██╔══╝██║  ██║██╔════╝    ████╗ ████║██╔═══██╗██╔═══██╗████╗  ██║██║     ██║╚══██╔══╝    ██║ ██╔╝██║████╗  ██║██╔════╝ ██╔══██╗██╔═══██╗████╗ ████║"+
		"\n     ██║   ███████║█████╗      ██╔████╔██║██║   ██║██║   ██║██╔██╗ ██║██║     ██║   ██║       █████╔╝ ██║██╔██╗ ██║██║  ███╗██║  ██║██║   ██║██╔████╔██║"+
		"\n     ██║   ██╔══██║██╔══╝      ██║╚██╔╝██║██║   ██║██║   ██║██║╚██╗██║██║     ██║   ██║       ██╔═██╗ ██║██║╚██╗██║██║   ██║██║  ██║██║   ██║██║╚██╔╝██║"+
		"\n     ██║   ██║  ██║███████╗    ██║ ╚═╝ ██║╚██████╔╝╚██████╔╝██║ ╚████║███████╗██║   ██║       ██║  ██╗██║██║ ╚████║╚██████╔╝██████╔╝╚██████╔╝██║ ╚═╝ ██║"+
		"\n     ╚═╝   ╚═╝  ╚═╝╚══════╝    ╚═╝     ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═══╝╚══════╝╚═╝   ╚═╝       ╚═╝  ╚═╝╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚═════╝  ╚═════╝ ╚═╝     ╚═╝\u001B[0m"
		);
		}
		
//Constructor Story3
		Story3(){
			System.out.println("\n\tIn a faraway land where stars danced in the night sky and flowers sang with the wind, there existed a kingdom bathed in the soft glow of moonlight."+
			"\nThis kingdom, ruled by Queen Seraphina, was a place of wonder and enchantment, where magic flowed through every corner.");
			System.out.println("\n\n### Prologue: The Midnight Dream"+
			"\n\tOne fateful night, as the moon cast its silvery rays upon the land, whispers of a hidden realm reached Queen Seraphina's ears."+
			"\nIntrigued by the possibility of uncovering new mysteries, she embarked on a journey into the moonlit forest, accompanied only by the gentle melody of the night.");
			//A&B
			System.out.println(
			"\n     \\           |   _)                       \\       "+"\t\t\t\t\t        |"+"\t    \\           |   _)                    __ )     "+
			"\n    _ \\     __|  __|  |   _ \\   __ \\         _ \\    _)"+"\t\t\t\t\t        |"+"\t   _ \\     __|  __|  |   _ \\   __ \\       __ \\  _) "+
			"\n   ___ \\   (     |    |  (   |  |   |       ___ \\     "+"\t\t*# Follow the Moonlit Path #*   |"+"\t  ___ \\   (     |    |  (   |  |   |      |   |  "+"\t*# Traverse the Whispering Woods #*"+
			"\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\  _)"+"\t\t\t\t\t        |"+"\t_/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/  _) "+
			"\n"
			 );
			System.out.println(
				"\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ "+
				"\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  "+
				"\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] "+
				"\n\t- The choice sets the stage for the queen's encounter with magical creatures and challenges in the enchanted forest."+
				"\n\n"); 
			
			System.out.print("\t\t\t\t\t\t");
			choice = sc.nextLine();//sc.nextLine();
				if (this.choice.equalsIgnoreCase("Follow the Moonlit Path"))
					this.A=true;
				if (this.choice.equalsIgnoreCase("Traverse the Whispering Woods"))
					this.B=true;
			nextPartA(A);
			nextPartB(B);
		}
		
		void nextPartA(boolean A){
			while(A){
				System.out.println("\n* Queen Seraphina chooses to follow the shimmering path illuminated by the moon's gentle touch.");
				System.out.println("\nQueen Seraphina follows the moonlit path, her heart filled with anticipation as she journeys deeper into the forest's embrace.");
				//A1 & A2
				System.out.println(
				"\n     \\           |   _)                       \\   _ |    "+"\t\t\t\t\t   |"+"\t     \\           |   _)                       \\    ___ \\     "+
				"\n    _ \\     __|  __|  |   _ \\   __ \\         _ \\    | _) "+"\t\t\t\t\t   |"+"\t    _ \\     __|  __|  |   _ \\   __ \\         _ \\      ) | _) "+
				"\n   ___ \\   (     |    |  (   |  |   |       ___ \\   |   "+"\t*# Greet the Moonlit Fae #* \t   |"+"\t   ___ \\   (     |    |  (   |  |   |       ___ \\    __/     "+"\t*# Follow the Silver Stream  #*"+
				"\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\ _| _)"+"\t\t\t\t\t   |"+"\t _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\ _____| _) "
				);
				
				System.out.println(
				"\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ "+
				"\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  "+
				"\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] "+
				"\n\t- The choice leads to encounters with mystical beings or discoveries of hidden treasures along the moonlit path."+
				"\n\n"
				);
				
				System.out.print("\t\t\t\t\t\t");
				choice=sc.nextLine();
				if (this.choice.equalsIgnoreCase("Greet the Moonlit Fae"))
					this.A1=true;
				if (this.choice.equalsIgnoreCase("Follow the Silver Stream"))
					this.A2=true;
				
				this.A1=nextPartA1(A1);
				this.A2=nextPartA2(A2);
				if(this.A1==false &&this.A2==false)
					G.MainMenu();
			}
		}
			boolean nextPartA1(boolean A1){
				while(A1){
					
					System.out.println(
					"\n\n    ______          ___                ___   ___ "+
					"\n   / ____/___  ____/ (_)___  ____ _   /   | <  / "+
					"\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / /| | / (_)"+
					"\n / /___/ / / / /_/ / / / / / /_/ /  / ___ |/ /   "+"\t\t\t Greet the Moonlit Fae"+
					"\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_/  |_/_(_)  "+
					"\n                          /____/                 \n"
					);
					
					System.out.println("* The queen extends a warm greeting to the mischievous moonlit fae, hoping to learn more about the hidden realm.");
					this.TheEnd();
					return false;
				}			
				return false;
			}
			boolean nextPartA2(boolean A2){
				while(A2){
					System.out.println(
					"\n\n    ______          ___                ___   ___    "+
					"\n   / ____/___  ____/ (_)___  ____ _   /   | |__ \\ _ "+
					"\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / /| | __/ /(_)"+
					"\n / /___/ / / / /_/ / / / / / /_/ /  / ___ |/ __/_   "+"\t\t Follow the Silver Stream"+
					"\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_/  |_/____(_)  "+
					"\n                          /____/                   \n"
					);
					
					System.out.println("* Entranced by the gentle melody of the silver stream, Queen Seraphina follows its meandering path, curious about where it may lead.");
					this.TheEnd();
					return false;
				}
				return false;
			}
			
		void nextPartB(boolean B){
			while(B){
				System.out.println("\n* Trusting in the guidance of the ancient trees, the queen ventures deeper into the whispering woods, where secrets are whispered on the breeze.");
				System.out.println("\nQueen Seraphina ventures deeper into the whispering woods, where ancient trees whisper secrets of forgotten realms.");
				//B1 & B2
				System.out.println(
				"\n\n\n     \\           |   _)                    __ ) _ |     "+"\t\t\t\t\t   |"+"\t\t    \\           |   _)                    __ ) ___ \\  "+
				"\n    _ \\     __|  __|  |   _ \\   __ \\       __ \\   | _)  "+"\t\t\t\t\t   |"+"\t\t   _ \\     __|  __|  |   _ \\   __ \\       __ \\    ) | _)"+
				"\n   ___ \\   (     |    |  (   |  |   |      |   |  |     "+"\t   *# Listen to the Song  \t   |"+"\t\t  ___ \\   (     |    |  (   |  |   |      |   |  __/  "+"\t\t*# Unravel the Riddle of "+
				"\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/  _| _)  "+"\t\t of the Nymphs #*\t   |"+"\t\t_/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/ _____| _)"+"\t\t   the Eldertree #*"
				);
				System.out.println(
				"\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ "+
				"\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  "+
				"\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] "+
				"\n\t- The choice leads to revelations about the hidden realm or challenges that test the queen's wisdom and resolve."+
				"\n\n"
				);
				
				System.out.print("\t\t\t\t\t\t");
				choice=sc.nextLine();
				if (this.choice.equalsIgnoreCase("Listen to the Song of the Nymphs"))
					this.B1=true;
				if (this.choice.equalsIgnoreCase("Unravel the Riddle of the Eldertree"))
					this.B2=true;
				
				this.B1=nextPartB1(B1);
				this.B2=nextPartB2(B2);
				if(this.B1==false &&this.B2==false)
					G.MainMenu();
			}
		}
			boolean nextPartB1(boolean B1){
				while(B1){
					System.out.println(
					"\n\n    ______          ___                ____ ___"+
					"\n   / ____/___  ____/ (_)___  ____ _   / __ <  /"+
					"\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / __  / / "+
					"\n / /___/ / / / /_/ / / / / / /_/ /  / /_/ / /  "+"\t\t\t Listen to the Song of the Nymphs"+
					"\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_____/_/   "+
					"\n                          /____/               "
					);
					System.out.println("* Enchanted by the ethereal melody of the nymphs, the queen pauses to listen, hoping to uncover clues about the hidden realm.");
					this.TheEnd();
					return false;
				}			
				return false;
			}
			boolean nextPartB2(boolean B2){
				while(B2){
					System.out.println(
					"\n\n    ______          ___                ____ ___    "+
					"\n   / ____/___  ____/ (_)___  ____ _   / __ )__ \\ _ "+
					"\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / __  |_/ /(_)"+
					"\n / /___/ / / / /_/ / / / / / /_/ /  / /_/ / __/_   "+"\t\t\t Unravel the Riddle of the Eldertree"+
					"\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_____/____(_)  "+
					"\n                          /____/                   "
					);
					System.out.println("* Intrigued by the wisdom of the ancient Eldertree, Queen Seraphina endeavors to solve its riddles, seeking guidance on her quest.");
					this.TheEnd();
					return false;
				}
				return false;	
			}
}
class Story4 extends Stories{
	Scanner sc=new Scanner(System.in);
//Instance Block4
		{
		System.out.println("\nStory 4");
		System.out.println("\n\u001B[38;5;21m"+
		"\n                                        ;                                                                                      ;                                                            "+
		"\n                                        ED.                                                                             :      ED.                                                          "+
		"\n                               ,;       E#Wi                                                                           t#,     E#Wi                          .        .        ,;           "+
		"\n           .    .            f#i        E###G.       t           .Gt t                                  i             ;##W.    E###G.                       ;W       ;W      f#i            "+
		"\n  GEEEEEEELDi   Dt         .E#t         E#fD#W;      Ej         j#W: Ej GEEEEEEEL         ..           LE            :#L:WE    E#fD#W;     f.     ;WE.     f#E      f#E    .E#t  f.     ;WE."+
		"\n  ,;;L#K;;.E#i  E#i       i#W,          E#t t##L     E#,      ;K#f   E#,,;;L#K;;.        ;W,          L#E           .KG  ,#D   E#t t##L    E#,   i#G     .E#f     .E#f    i#W,   E#,   i#G  "+
		"\n     t#E   E#t  E#t      L#D.           E#t  .E#K,   E#t    .G#D.    E#t   t#E          j##,         G#W.           EE    ;#f  E#t  .E#K,  E#t  f#f     iWW;     iWW;    L#D.    E#t  f#f   "+
		"\n     t#E   E#t  E#t    :K#Wfff;         E#t    j##f  E#t   j#K;      E#t   t#E         G###,        D#K.           f#.     t#i E#t    j##f E#t G#i     L##Lffi  L##Lffi:K#Wfff;  E#t G#i    "+
		"\n     t#E   E########f. i##WLLLLt        E#t    :E#K: E#t ,K#f   ,GD; E#t   t#E       :E####,       E#K.            :#G     GK  E#t    :E#K:E#jEW,     tLLG##L  tLLG##L i##WLLLLt E#jEW,     "+
		"\n     t#E   E#j..K#j...  .E#L            E#t   t##L   E#t  j#Wi   E#t E#t   t#E      ;W#DG##,     .E#E.              ;#L   LW.  E#t   t##L  E##E.        ,W#i     ,W#i   .E#L     E##E.      "+
		"\n     t#E   E#t  E#t       f#E:          E#t .D#W;    E#t   .G#D: E#t E#t   t#E     j###DW##,    .K#E                 t#f f#:   E#t .D#W;   E#G         j#E.     j#E.      f#E:   E#G        "+
		"\n     t#E   E#t  E#t        ,WW;         E#tiW#G.     E#t     ,K#fK#t E#t   t#E    G##i,,G##,   .K#D                   f#D#;    E#tiW#G.    E#t       .D#j     .D#j         ,WW;  E#t        "+
		"\n     t#E   f#t  f#t         .D#;        E#K##i       E#t       j###t E#t   t#E  :K#K:   L##,  .W#G                     G#t     E#K##i      E#t      ,WK,     ,WK,           .D#; E#t        "+
		"\n      fE    ii   ii           tt        E##D.        E#t        .G#t E#t    fE ;##D.    L##, :W##########Wt             t      E##D.       EE.      EG.      EG.              tt EE.        "+
		"\n       :                                E#t          ,;.          ;; ,;.     : ,,,      .,,  :,,,,,,,,,,,,,.                   E#t         t        ,        ,                   t          "+
		"\n                                        L:                                                                                     L:                                                           \u001B[0m"
		);
		}
		
//Constructor Story4
		Story4(){
			System.out.println("\n\tIn a bustling metropolis where skyscrapers kissed the clouds and neon lights painted the streets, there lived a young innovator named Maya."+
			"\nArmed with her laptop and boundless creativity, Maya navigated the digital landscape of the city, seeking to leave her mark on the world.");
			System.out.println("\n\n### Prologue: The Virtual Frontier"+
			"\n\tAmidst the sea of pixels and algorithms, rumors of a hidden digital realm captured Maya's imagination. Determined to uncover its secrets,"+
			"\nshe embarked on a journey through cyberspace, her fingers dancing across the keyboard in anticipation of the adventure that lay ahead.\n"
			);
			//A&B
			System.out.println(
			"\n     \\           |   _)                       \\       "+"\t\t\t\t\t        |"+"\t    \\           |   _)                    __ )     "+
			"\n    _ \\     __|  __|  |   _ \\   __ \\         _ \\    _)"+"\t\t\t\t\t        |"+"\t   _ \\     __|  __|  |   _ \\   __ \\       __ \\  _) "+
			"\n   ___ \\   (     |    |  (   |  |   |       ___ \\     "+"\t   *# Dive into the Virtual Matrix #*   |"+"\t  ___ \\   (     |    |  (   |  |   |      |   |  "+"\t*# Hack the Data Mainframe #*"+
			"\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\  _)"+"\t\t\t\t\t        |"+"\t_/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/  _) "+
			"\n"
			 );
			System.out.println(
				"\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ "+
				"\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  "+
				"\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] "+
				"\n\t- The choice sets the stage for Maya's encounters with virtual challenges and allies in her quest for discovery."+
				"\n\n"); 
			
			System.out.print("\t\t\t\t\t\t : ");
			choice = sc.nextLine();//sc.nextLine();
				if (this.choice.equalsIgnoreCase("Dive into the Virtual Matrix"))
					this.A=true;
				if (this.choice.equalsIgnoreCase("Hack the Data Mainframe"))
					this.B=true;
			nextPartA(A);
			nextPartB(B);
		}
		
		void nextPartA(boolean A){
			while(A){
				System.out.println("\nMaya chooses to immerse herself in the virtual world, exploring its vast landscapes and encountering digital entities along the way.");
				System.out.println("\nMaya delves deep into the virtual matrix, her senses heightened by the endless possibilities of the digital realm.");
				//A1 & A2
				System.out.println(
				"\n     \\           |   _)                       \\   _ |    "+"\t\t\t\t\t   |"+"\t     \\           |   _)                       \\    ___ \\     "+
				"\n    _ \\     __|  __|  |   _ \\   __ \\         _ \\    | _) "+"\t\t\t\t\t   |"+"\t    _ \\     __|  __|  |   _ \\   __ \\         _ \\      ) | _) "+
				"\n   ___ \\   (     |    |  (   |  |   |       ___ \\   |   "+"\t*# Befriend the AI Companion #* \t   |"+"\t   ___ \\   (     |    |  (   |  |   |       ___ \\    __/     "+"\t*# Navigate the Cyber Labyrinth  #*"+
				"\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\ _| _)"+"\t\t\t\t\t   |"+"\t _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\ _____| _) "
				);
				
				System.out.println(
				"\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ "+
				"\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  "+
				"\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] "+
				"\n\t- The choice leads to alliances with digital entities or tests of Maya's skills in the virtual domain."+
				"\n\n"
				);
				
				System.out.print("\t\t\t\t\t\t : ");
				choice=sc.nextLine();
				if (this.choice.equalsIgnoreCase("Befriend the AI Companion"))
					this.A1=true;
				if (this.choice.equalsIgnoreCase("Navigate the Cyber Labyrinth"))
					this.A2=true;
				
				this.A1=nextPartA1(A1);
				this.A2=nextPartA2(A2);
				if(this.A1==false &&this.A2==false)
					G.MainMenu();
			}
		}
			boolean nextPartA1(boolean A1){
				while(A1){
					
					System.out.println(
					"\n\n\n    ______          ___                ___   ___ "+
					"\n   / ____/___  ____/ (_)___  ____ _   /   | <  / "+
					"\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / /| | / (_)"+
					"\n / /___/ / / / /_/ / / / / / /_/ /  / ___ |/ /   "+"\t\t\t Befriend the AI Companion"+
					"\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_/  |_/_(_)  "+
					"\n                          /____/                 \n"
					);
					
					System.out.println("* Maya encounters a friendly AI companion, who offers guidance and assistance on her journey through the virtual matrix.");
					this.TheEnd();
					return false;
				}			
				return false;
			}
			boolean nextPartA2(boolean A2){
				while(A2){
					System.out.println(
					"\n\n\n    ______          ___                ___   ___    "+
					"\n   / ____/___  ____/ (_)___  ____ _   /   | |__ \\ _ "+
					"\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / /| | __/ /(_)"+
					"\n / /___/ / / / /_/ / / / / / /_/ /  / ___ |/ __/_   "+"\t\t Follow the Silver Stream"+
					"\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_/  |_/____(_)  "+
					"\n                          /____/                   \n"
					);
					
					System.out.println("* Maya braves the twists and turns of the cyber labyrinth, relying on her intuition and problem-solving skills to navigate its complex pathways.");
					this.TheEnd();
					return false;
				}
				return false;
			}
			
		void nextPartB(boolean B){
			while(B){
				System.out.println("\n*Using her coding prowess, Maya hacks into the data mainframe, seeking clues that may lead her to the hidden digital realm.");
				System.out.println("\nMaya infiltrates the data mainframe, her fingers dancing across the keyboard as she deciphers its digital defenses.");
				//B1 & B2
				System.out.println(
				"\n\n\n     \\           |   _)                    __ ) _ |     "+"\t\t\t\t\t   |"+"\t\t    \\           |   _)                    __ ) ___ \\  "+
				"\n    _ \\     __|  __|  |   _ \\   __ \\       __ \\   | _)  "+"\t\t\t\t\t   |"+"\t\t   _ \\     __|  __|  |   _ \\   __ \\       __ \\    ) | _)"+
				"\n   ___ \\   (     |    |  (   |  |   |      |   |  |     "+"\t   *# Decrypt the Firewall Code    | "+"\t\t  ___ \\   (     |    |  (   |  |   |      |   |  __/  "+"\t\t*# Manipulate the Digital "+
				"\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/  _| _)  "+"\t\t\t\t\t   |"+"\t\t_/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/ _____| _)"+"\t\t   Security Protocols #*"
				);
				System.out.println(
				"\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ "+
				"\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  "+
				"\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] "+
				"\n\t- The choice leads to breakthroughs in Maya's investigation or encounters with digital adversaries seeking to thwart her progress."+
				"\n\n"
				);
				
				System.out.print("\t\t\t\t\t\t : ");
				choice=sc.nextLine();
				if (this.choice.equalsIgnoreCase("Decrypt the Firewall Code"))
					this.B1=true;
				if (this.choice.equalsIgnoreCase("Manipulate the Digital Security Protocols"))
					this.B2=true;
				
				this.B1=nextPartB1(B1);
				this.B2=nextPartB2(B2);
				if(this.B1==false &&this.B2==false)
					G.MainMenu();
			}
		}
			boolean nextPartB1(boolean B1){
				while(B1){
					System.out.println(
					"\n\n\n    ______          ___                ____ ___"+
					"\n   / ____/___  ____/ (_)___  ____ _   / __ <  /"+
					"\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / __  / / "+
					"\n / /___/ / / / /_/ / / / / / /_/ /  / /_/ / /  "+"\t\t\t Decrypt the Firewall Code"+
					"\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_____/_/   "+
					"\n                          /____/               "
					);
					System.out.println("* Maya focuses her efforts on decrypting the firewall code, using her coding expertise to bypass the mainframe's defenses.");
					this.TheEnd();
					return false;
				}			
				return false;
			}
			boolean nextPartB2(boolean B2){
				while(B2){
					System.out.println(
					"\n\n\n    ______          ___                ____ ___    "+
					"\n   / ____/___  ____/ (_)___  ____ _   / __ )__ \\ _ "+
					"\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / __  |_/ /(_)"+
					"\n / /___/ / / / /_/ / / / / / /_/ /  / /_/ / __/_   "+"\t\t\t Manipulate the Digital  Security Protocols"+
					"\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_____/____(_)  "+
					"\n                          /____/                   "
					);
					System.out.println("* Maya employs her social engineering skills to manipulate the digital security protocols, tricking the mainframe into revealing its secrets.");
					this.TheEnd();
					return false;
				}
				return false;	
			}
}