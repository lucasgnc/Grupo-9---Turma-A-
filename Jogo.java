package JOGO;

import java.util.Scanner;

public class Jogo {

  public static void main(String[] args){
  
	  Scanner menu = new Scanner (System.in);
  
         System.out.print("| Jogar        |\n");
         System.out.print("| Créditos     |\n");
         System.out.print("| Sair         |\n");
         System.out.print("|--------------|\n");
        

         int opcao = menu.nextInt();


         switch (opcao) {
         case 1:jogar();
             
             break;

         case 2:
             System.out.print("\nDesenvolvedores: \nLucas Silva \nJhonatan Silva \nHélio \nCélia\n");
             break;

         case 3:
             System.out.print("\nAté Mais\n");
             break;
            
        
          default:
             System.out.print("\nOpção Inválida!");
             menu.close();

        
          
                    
         }}





public static void jogar() {
	   
	    Scanner entrada = new Scanner (System.in);

	        String name;
	        double spurs=7, raiders=0, dantes = 3;



             System.out.println("Entre nessa jornada com Cleitin o humano e construa sua própria nação.");
             System.out.println("\n");
             System.out.println("No ano 5000, a terra vivia o auge da tecnologia…Os humanos estavam no ápice de "

             + "sua inteligência, \nporém cientistas malucos, com uma idéia de fundir a inteligência humana "

             + "com animais ocasionaram \numa explosão nuclear na qual levou quase toda a raça humana a "

             + "extinção…O plano por sua vez deu certo animais \nganharam inteligência, mas grande parte "

             + "se revoltou e começaram a construir \nsua própria civilização a fim de tornar o mundo um só "

             + "para sua raça.\n5 de novembro de 5000… Cleitin te encontra em uma caverna \nvocê com medo procura pegar pedras para se defender");

             System.out.println("\n");

             System.out.println("Cleitin: Ei calma… Eu sou um humano também - ele tenta te acalmar ");  

             System.out.println("\n");

             System.out.println("Cleitin: Me diga qual é o seu nome?");
              name = entrada.next();

             System.out.println("\n");

             System.out.println("Eu me chamo " + name);  

             System.out.println("\n");

             System.out.println("Cleitin olá " + name + "... estou em busca de um líder para reconstruir minha nação, você está aqui á quanto tempo?");

             System.out.println("\n");

             System.out.println(name + ": já não sei a quanto tempo estou aqui, vivo aqui sozinho noite após noite");

             System.out.println("\n");

             System.out.println("Cleitin: Venha comigo, não sei mas você parecer ter um espírito de líder… \nEstou tentando construir uma nação, mas a verdade é que não sei governar nada.");

             System.out.print("\n");

            
             Scanner s = new Scanner(System.in);

             System.out.println("Então me diz você aceita ser um líder? [sim/nao]");

             String lt= s.nextLine();


     if(lt.equals("nao")) {

             System.out.println("Cleitin: Que pena, Você seria um grande líder, Continuarei minha jornada em busca de alguém para ajudar meu povo ");

     }else if(lt.equals("sim")) {

             System.out.println("Tenho dúvidas sobre isso, mas acredito que seja melhor do que viver aqui sozinho.Vamos nessa!!");

             System.out.println("\n");

             System.out.println("Cleitin e " + name +" começam a caminhar, " + name + " logo percebe que Cleitin é um cara que não "
             		+ "\npara de falar e ama fazer uma piada com as situaçõe… Após longos, longos,"
             		+ "\nminutos andando, chegam ao pequeno vilarejo que Cleitin está construindo");

             System.out.println("\n");

             System.out.println(name + ":Nossa pensei que eu iria governar algo grandioso…");

             System.out.println("\n");

             System.out.println("Cleitin: Calma, Calma  isso é só um holograma… Temos que deixar a cidade disfarçada, somos muito fracos "
             		+ "\npara sofrer um ataque, não temos estrutura para isso");

             System.out.println("\n");

             System.out.println("Entendo, desculpa por me precipitar! ");

             System.out.println("\n");

             System.out.println("Cleitin entra primeiro, logo depois" + name + "vai atrás dele." + name + "fica admirado com tamanha "

             + "\nbeleza da cidade… Uma cidade, construída em volta de duas grandes "

             + "\nrochas ,com uma ponte ligando as duas rochas, logo abaixo na parte térrea um grande castelo, casas e "

             + "\npequenos prédios ainda destruídos por conta da explosão, mas, com pessoas e crianças "

             + "\nfelizes por ainda ter um lar… Essa foi a primeira visão de" + name + "sobre a cidade");
System.out.print("∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◣ \r\n"
		+ "∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇◣ \r\n"
		+ "∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇▇◣ \r\n"
		+ "∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇▇▇◣ \r\n"
		+ "∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▋ \r\n"
		+ "∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▋ \r\n"
		+ "∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵ ▋ \r\n"
		+ "∵∵∵∵◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▋∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◣ \r\n"
		+ "∵∵∵∵▇◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◢▇◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇◣ \r\n"
		+ "∵∵∵∵▇▇◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◢▇▇▇◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇▇◣ \r\n"
		+ "∵∵∵∵▇▇▇◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◢▇▇▇▇▇◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇▇▇◣ \r\n"
		+ "∵∵∵∵▊∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◥▇╭┯╮▇◤∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▊ \r\n"
		+ "∵∵∵∵▊∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇┠╂┨▇∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▊ \r\n"
		+ "∵∵∵∵▊∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇╰┷╯▇∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▊ \r\n"
		+ "∵∵∵◢▇◣∵∴∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◥▇▇▇◤∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◢▇◣ \r\n"
		+ "∵∵◢▇▇▇◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◢▇▇▇◣ \r\n"
		+ "∵◢▇▇▇▇▇◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵ ▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◢▇▇▇▇▇◣ \r\n"
		+ "∵◥▇╭┯╮▇◤∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◥▇╭┯╮▇◤ \r\n"
		+ "∵∵▇┠╂┨▇∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇┠╂┨▇ \r\n"
		+ "∵∵▇╰┷╯▇∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇╰┷╯▇ \r\n"
		+ "∵∵◥▇▇▇◤∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◥▇▇▇◤ \r\n"
		+ "∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉ \r\n"
		+ "∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉ \r\n"
		+ "∵∵∵▆▆▉∴∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉ \r\n"
		+ "∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉ \r\n"
		+ "∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉ \r\n"
		+ "∵∴◢▇▇▇◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◢▇▇▇◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◢▇▇▇◣ \r\n"
		+ "∵∵▉╭┯╮▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇╭┯╮▇∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇╭┯╮▇ \r\n"
		+ "∵∵▉┠╂┨▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇┠╂┨▇∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇┠╂┨▇ \r\n"
		+ "∵∵▉╰┷╯▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇╰┷╯▇∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇╰┷╯▇ \r\n"
		+ "∵∵◥▇▇▇◤∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◥▇▇▇◤∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◥▇▇▇◤ \r\n"
		+ "∵∵∵▆▆▇∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉ \r\n"
		+ "∵∵∵▆▆▇∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉ \r\n"
		+ "∵∵∵▆▆▇∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉ \r\n"
		+ "∵∵∵▆▆▇∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▆▆▉∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▆▆▉ \r\n"
		+ "∵∵∵▆▆▇∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▆▆▉∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▆▆▉ \r\n"
		+ "∵∵∵▆▆▇∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉∵▆▆▉∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▆▉ \r\n"
		+ "∵∵◢▆▆▇∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉∵▆▆▉∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉◣ \r\n"
		+ "∵∵▉▇▇▇▉▉┏┯┓▉┏┯┓▉┏┯┓▉┏┯┓▉▉▇▇▇▉▉┏┯┓▉┏┯┓▉┏┯┓▉┏┯┓▉▉▇▇▇▉ \r\n"
		+ "∵∵▉╭┯╮▉▉┠╂┨▉┠╂┨▉┠╂┨▉┠╂┨▉▉╭┯╮▉▉┠╂┨▉┠╂┨▉┠╂┨▉┠╂┨▉▉╭┯╮▉ \r\n"
		+ "∵∵▉┠╂┨▉▉┠╂┨▉┠╂┨▉┠╂┨▉┠╂┨▉▉┠╂┨▉▉┠╂┨▉┠╂┨▉┠╂┨▉┠╂┨▉▉┠╂┨▉ \r\n"
		+ "∵∵▉┠╂┨▉▉┠╂┨▉┠╂┨▉┠╂┨▉┠╂┨▉▉┠╂┨▉▉┠╂┨▉┠╂┨▉┠╂┨▉┠╂┨▉▉┠╂┨▉ \r\n"
		+ "∵∵▉╰┷╯▉▉┗┷┛▉┗┷┛▉┗┷┛▉┗┷┛▉▉╰┷╯▉▉┗┷┛▉┗┷┛▉┗┷┛▉┗┷┛▉▉╰┷╯▉ \r\n"
		+ "∵∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉ \r\n"
		+ "∵∵▉╭┯╮▉▉┏┯┓▉┏┯┓▉┏┯┓▉┏┯┓▉▉╭┯╮▉▉┏┯┓▉┏┯┓▉┏┯┓▉┏┯┓▉▉╭┯╮▉ \r\n"
		+ "∵∵▉┠╂┨▉▉┠╂┨▉┠╂┨▉┠╂┨▉┠╂┨▉▉┠╂┨▉▉┠╂┨▉┠╂┨▉┠╂┨▉┠╂┨▉▉┠╂┨▉ \r\n"
		+ "∵∵▉┠╂┨▉▉┠╂┨▉┠╂┨▉┠╂┨▉┠╂┨▉▉┠╂┨▉▉┠╂┨▉┠╂┨▉┠╂┨▉┠╂┨▉▉┠╂┨▉ \r\n"
		+ "∵∵▉╰┷╯▉▉┗┷┛▉┗┷┛▉┗┷┛▉┗┷┛▉▉╰┷╯▉▉┗┷┛▉┗┷┛▉┗┷┛▉┗┷┛▉▉╰┷╯▉ \r\n"
		+ "∵∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉ \r\n"
		+ "∵∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉ \r\n"
		+ "∵∵▉▉┏┯┓▉▉┏┯┓┏┯┓▉┏┯┓┏┯┓▉▉┏┯┯┯┓▉▉┏┯┓┏┯┓▉┏┯┓┏┯┓▉▉┏┯┓▉▉ \r\n"
		+ "∵∵▉▉┠╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂╂╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂┨▉▉ \r\n"
		+ "∵∵▉▉┠╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂╂╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂┨▉▉ \r\n"
		+ "∵∵▉▉┗┷┛▉▉┗┷┛┗┷┛▉┗┷┛┗┷┛▉▉┗┷┷┷┛▉▉┗┷┛┗┷┛▉┗┷┛┗┷┛▉▉┗┷┛▉▉ \r\n"
		+ "∵∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉ \r\n"
		+ "∵∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉ \r\n"
		+ "∵∵▉▉┏┯┓▉▉┏┯┓┏┯┓▉┏┯┓┏┯┓▉▉┏┯┯┯┓▉▉┏┯┓┏┯┓▉┏┯┓┏┯┓▉▉┏┯┓▉▉ \r\n"
		+ "∵∵▉▉┠╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂╂╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂┨▉▉ \r\n"
		+ "∵∵▉▉┠╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂╂╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂┨▉▉ \r\n"
		+ "∵∵▉▉┗┷┛▉▉┗┷┛┗┷┛▉┗┷┛┗┷┛▉▉┗┷┷┷┛▉▉┗┷┛┗┷┛▉┗┷┛┗┷┛▉▉┗┷┛▉▉ \r\n"
		+ "∵∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉ \r\n"
		+ "∵∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉ \r\n"
		+ "∵∵▉▉┏┯┓▉▉┏┯┓┏┯┓▉┏┯┓┏┯┓▉▉┏┯┯┯┓▉▉┏┯┓┏┯┓▉┏┯┓┏┯┓▉▉┏┯┓▉▉ \r\n"
		+ "∵∵▉▉┠╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂╂╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂┨▉▉ \r\n"
		+ "∵∵▉▉┠╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂╂╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂┨▉▉ \r\n"
		+ "∵∵▉▉┠╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂╂╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂┨▉▉ \r\n"
		+ "∵∵▉▉┠╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂╂╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂┨▉▉ \r\n"
		+ "∵∵▉▉┗┷┛▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┗┷┷┷┛▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┗┷┛▉▉ \r\n"
		+ "∵◢▉▉▉▉▉▉▉┗┷┛┗┷┛▉┗┷┛┗┷┛▉▉▉┏┯┓▉▉▉┗┷┛┗┷┛▉┗┷┛┗┷┛▉▉▉▉▉▉▉◣ \r\n"
		+ "◢▉▉▉▉▉▉▉▉▅▅▅▆▆▆▇▆▆▆▅▅▅▉▉▉┗┷┛▉▉▉▉▉▅▅▅▆▆▆▇▆▆▆▅▅▅▉▉▉▉▉▉▉▉◣ \r\n"
		+ "▅▅▅▅▅▅◢▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆☼▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆◣▅▅▅▅▅▅▅▅\r\n"
		+ "▅▅▅▅▅◢▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆☼▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆◣▅▅▅▅▅▅▅\r\n"
		+ "▅▅▅▅◢▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆☼▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆◣▅▅▅▅▅▅\r\n"
		+ "▅▅▅◢▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆☼▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆◣▅▅▅▅▅\r\n"
		+ "▅▅◢▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆☼▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆◣▅▅▅▅\r\n"
		+ "");
     
     System.out.println("\n");

     System.out.println("Cleitin: Gostou né? lolololol… Bem, nos nos chmamos raiders.Vamos andando quero te mostrar seus aposentos e "

             + "\nainda hoje te anunciar como novo líder de nossa nação");

     System.out.println("\n");

     System.out.println(name +":Confesso que estou um pouco animado, você disse que sou o escolhido, mas tenho "

             + "\nas minhas dúvidas… Talvez o povo não me aceite");

     System.out.println("\n");

     System.out.println("Cleitin: Vamos, seja um pouco otimista vai dar bom!");

     System.out.println("\n");

     System.out.println("Cleitin leva " + name + " para seus aposentos");

     System.out.println("\n");

     System.out.println(name  + ": Onde fica meus aposentos?");

     System.out.println("\n");

     System.out.println("Cleitin: Nas Rochas");

     System.out.println("\n");

     System.out.println(name + ":Orra, to importante lololo. Tem elevador né?");

     System.out.println("\n");

     System.out.println("Cleitin: Não");

     System.out.println("\n");

     System.out.println(name + ": a para de brincadeira");

     System.out.println("\n");

     System.out.println("Cleitin: Não é brincadeira");

     System.out.println("\n");

     System.out.println(name +" Pensando bem posso morar por aqui embaixo mesmo, pra que esse exagero né… Sempre gostei de voar baixo");

     System.out.println("\n");

     System.out.println("Cleitin: Você é muito preguiçoso, é claro que tem elevador lolololol. Vamos logo para de enrolar");

     System.out.println("\n");

     System.out.println("Após chegarem nos aposentos, Cleitin mostra a sala de reunião. Uma sala enorme, com uma grande mesa com "

             + "\numa capacidade de até 20 lugares, uma janela com uma vista para "

             + "\na cidade, do começo ao fim");

     System.out.println("\n");

     System.out.println(name + "Nossa pra que essa ignorância toda - se referindo a mesa");

     System.out.println("\n");

    System.out.println("Cleitin: Essa é a mesa de reunião dos líderes");

     System.out.println("\n");

     System.out.println(name + "E quantos líderes tem nessa cidade?");

     System.out.println("\n");

     System.out.println("Cleitin: Contando com você?");

     System.out.println("\n");

     System.out.println(name + " Sim!!!");

     System.out.println("\n");

     System.out.println("Cleitin: Só 1 ");

     System.out.println("\n");

     System.out.println(name + " Ué lolololol");

     System.out.println("\n");

     System.out.println("Cleitin: Mas pensa esse é só o começo, logo você não terá paciência para tanto falatório aqui");

     System.out.println("\n");

     System.out.println(name + ": Estou confiante. Me mostre a cidade, quero entender tudo");

     System.out.println("\n");

     System.out.println("?????: CLEITIN,CLEITIN,CLEITIN ESTÃO ATACANDO A NOSSA CIDADE!!!");

     System.out.println("\n");

     System.out.println("Cleitin: Calma, isso é impossível… Se fosse um ataque o meu sensor teria avisado");

     System.out.println("\n");

     System.out.println("????? Sério mesmo? Então me explique isso - Mostra pela janela para Cleitin, o ataque acontecendo");

     System.out.println("\n");

     System.out.println("Cleitin: Droga, vamos lá" + name + "!");

     System.out.println("\n");

     System.out.println("????? : Deixa pra lá, não vai adiantar… é sempre a mesma coisa, já até foram embora."

             + "\nAliás, quem é esse aí?");

     System.out.println("\n");

     System.out.println(name + "O-oi sou o novo Líder!");

     System.out.println("\n");

     System.out.println("????? : Duvido, estranho desse jeito… só vai afundar ainda mais a nossa cidade");

     System.out.println("\n");

     System.out.println("Cleitin: Acredite, ele tem capacidade para nos liderar");

     System.out.println("\n");

     System.out.println(name +": Me diga qual seu nome? ");
     System.out.println("\n");
     System.out.println("Me chamo Leona... sou tesoureira da cidade");
     System.out.println("\n");
     System.out.println(name +": Acho que vou precisar de voce...");
     System.out.println("\n");
     
     System.out.println("Deseja recrutar Leona como tesoureira ou deixar as finaças por sua conta? [sim/nao]" );
     
     }

     Scanner s3 = new Scanner(System.in);

     String lt3= s3.nextLine();


     if(lt3.equals("nao")) {

     System.out.println("Voce levou a cidade a ruina (As vezes é necessario trabalho em equipe para que seus negócios avance!");

     }

     else if(lt3.equals("sim")) {

        

     System.out.println("Leona é sua nova tesoureira!! Leona estara presente em suas negociações");
     System.out.println("\n");
     System.out.println(name +": Já quero começar agir");        
     System.out.println("\n");
     System.out.println("Cleitin: Gosto assim. E o que você quer fazer primeiro?");
     System.out.println("\n");
     System.out.println("Leona: Droga!!! Os animais estão vindo de novo");
     System.out.println("\n");
     System.out.println(name +":Acho que minha primeira atitude deve ser falar com eles");
     System.out.println("\n");
     
     System.out.println("Entao" + name + " se dirige ao comandante dos animais.. com muito medo obiviamente. Em uma jogada estratégica ele propoem uma troca");
     System.out.println("\n");
     System.out.println(name+"Qual é seu nome?");
     System.out.println("\n");
     System.out.println("Me chamo Ganicos!! Sai da minha frente ou seja destruido junto com sua cidade!");
     System.out.println("\n");
     System.out.println(name+": É o seguinte Ganicos, eu sou o novo lider desta cidade! E estou cansdo de ver você "
     		+ "\nnos atacando só hoje foram dois ataques... Quero te propor um acordo!");
     System.out.println("\n");
     System.out.println("Ganicos: E qual seria? Seu verme");
     System.out.println("\n");
     System.out.println(name +": Temos recursos e você tem homens... Nossa cidade tem rochas podemos escavar e te dar "
     		+ "\nrecuros e você me da alguns homens" );
     System.out.println("\n");
     System.out.println("Ganicos: E se você nos der recursos e nós te damos paz e proteção");
     System.out.println("\n");
     System.out.println("Qual opção voce deseja? Digite 1 para aceitar a proposta de Ganicos ou 2 Para a sua Idéia!");
     }

     Scanner s2 = new Scanner(System.in);
     String lt2= s2.nextLine();


     if(lt2.equals("1")) {

     System.out.println("Você cumpriu com sua parte do acordo, porem Ganicos é desleal... Começou a escravisar seu povo e você foi a ruina"
     		+ "\n(Não se pode aceitar qualquer acordo, busque sempre um ponto seguro em suas negociações)");

     }

     else if(lt3.equals("sim")) {
     
    	 System.out.println("Voce foi insistente em sua decisão, Ganicos reconheceu sua atitude e cumpriu com o acordo "
     		+ "\n(Em adm. devemos percistit nas maiores dificuldades, pois só assim se garante um resultado");
     System.out.println("\n");
     System.out.println("Leona: Cramaba"+ name + " voce mandou muito bem! Nunca vi alguem enfrentar Ganicos desta maneira");
     System.out.println("\n");
     System.out.println(name + ":Obrigado Leona, mas agora  temos que decidir quantos deles se juntara a nos!) ");
     System.out.println("\n");
     System.out.println("Leona:" + name + ": Como tesoureia da cidade sugiro que voce pegue de 3 à 7."
     		+ "\nOs Spurs são uma raça que come muito durante o dia e nos ainda nao temos tantas reservas assim!");
     System.out.println("Escolha quantos Spurs(raça de Ganicos) se juntara a voce");
     
         Scanner s4 = new Scanner(System.in);
           spurs = entrada.nextDouble();
     
     
     System.out.println("O spurs é:" + spurs + "s");
     
     System.out.println("\n");
     
     System.out.println("Agora que temos os"  + spurs +  " Spurs com nos, oque vamos fazer?");
     
     System.out.println("\n");
     
     System.out.println("Cleitin: Devemos tomar uma decisão agora o que você quer fazer"  + name +  "?");
          
     System.out.println("\n");
     
     System.out.println("Você deve ecolher entre reconstuir a muralha envolta de sua ciade ou reconstruir casas destruidas");
     
     System.out.println("\n");
    
     System.out.println("AO RECONSTRUIR AS MURALHAS ENVOLTA DA CIDADE."
     		+ "        \n(Voce mostra ser um lider forte e seguro de suas decisões, alem de mostrar poder para outros reinos proximos)");
    
   
     System.out.println("\n");
   
     System.out.println("AO RECONSTRUIR CASAS DESTRUIDAS."
     		        + "\n(Você mostra ser um lider que se preucupa com seus suditos e forte diante de todas as situações)");
     System.out.println("\n");
     
     System.out.println("Cleitin: Qual sera sua decisão? Muralhas ou Casas Destruidas");
     
     System.out.println("\n");
     
     System.out.println("Digite Muralhas ou Casa para sua ddecisão");
     
     }
     
    Scanner s5 = new Scanner(System.in);
  
    String lt5= s5.nextLine();
    
       if(lt5.equals("muralhas")) {
    	 
    	   System.out.println("Cleitin: Confiamos na sua decisão!");
       
     
    	 if (lt5.equals("casas")) 
        
    		 System.out.println("Cleitin:Boa escolha, confiamos em ti!");
    	 
    	 {
       
    		 System.out.println("\n");
       
       System.out.println("Após meses negociando com Ganicos, voce ganha reconhecimento de outros Lords..."
       		+ "\nDentre eles Dantes, um animal muito inteligente e ganancioso. Com um reino maior que o seu e de Ganicos");
       
       System.out.println("\n");
       
       System.out.println("Cleitin:" + name + " recebi noticias que Dantes esta vindo... acredito que ele não quer paz!");
       
       System.out.println("\n");
       
       System.out.println(name + ": Chame os" + spurs + "Spurs para vir comigo, pode ser perigoso quero que fique aqui!");
       
       System.out.println("\n");
       
       System.out.println("Voce vai de encontro a Dantes, certo de que poderia acontecer algo..."
       		+ "\nMas tranquilo pois tinha" + spurs + "com voce");
       
       System.out.println("\n");
       
       System.out.println("Ao chegar de encontro com Dantes..."
       		+ "\nVoce se depara com um gigante extremamnete bruto, obviamnete um animal que sofreu mutação,"
       		+ "\nse parecia muito com um renoceronte. São conhecidos como Venezias");
       
       System.out.println("\n");
       
       System.out.println("Com uma voz muito grossa ele começa a falar");
       
       System.out.println("\n");
       
       System.out.println("Dantes:voce é" + name + "aquele que foi escolhido para refazer uma nação?");
       
       System.out.println("\n");
       
       System.out.println("Digiite [sim/nao]");
         
    	 }
       
    	 Scanner s6 = new Scanner(System.in);
       
       String lt6= s6.nextLine();
       
       if(lt6.equals("nao")) {
                
            	   System.out.println("Dantes, percebeu que voce era um covarde e o exterminou sem nem pensar"
                 		+ "\n(Voce levou sua cidade a ruina)");
                  }
                
               else if (lt6.equals("sim")) {
                	 
                	  System.out.println("Dantes viu coragem em ti e começou a falar");


                	  System.out.println("Dantes:Sei que tem uma alinça com Ganicos e fornece recursos a ele."
                	  		+ "\n Mas quero entrar nessa tambem, coloque seus homens para trabalahr para mim");
                	  
                	  System.out.println("\n");
                	  
                	  System.out.println(name + ": Não é assim que fuciona nao vou virar seu escravo!!!");
                	  
                	  System.out.println("\n");
                	  
                	  System.out.println("Dantes: Apartir de hoje sera assim! Sou maior e mais forte e quero expandir meu territorio");
                	  
                	  System.out.println("\n");
                	  
                	  System.out.println("Deseja confrontar Dantes? [sim/nao]");
               }
                	  Scanner s7 = new Scanner(System.in);
                      
                      String lt7= s7.nextLine();
                      if(lt7.equals("nao")) {
                    	  System.out.println("Que lider é voce que baixa a cabeça?(Por conta de sua decisao, seu povo foi escravisado");
                    	  
                    	  System.out.println("Ocasiões como essa exige pé no chão, ao adm. as coisas mostre ser decidido");

                      }
                      
                      else if (lt7.equals("sim")) {
                    	  System.out.println("Vejo que voce é muito arrogante, não vou fazer negocios com voce."
                    	  		+ "\nMas tenho interesse em seus aliados vão me servir de grande ajuda na minha cidade");
                    	  
                    	  System.out.println("\n");
                    	  
                    	  System.out.println("Dantes:Arrogante!? Como ousa falar assim comigo? Vamos fazer de tal manerira");
                    	  
                    	  System.out.println("\n");
                    	  
                    	  System.out.println("O meu melhor soldado contra seus Spurs, quando vencermos sua cidade sera minha se perdermos 10 dos meus sera seu!");
                    	  
                    	  System.out.println("\n");
                    	  
                    	  System.out.println(name + ":Não vou colocar minha cidade em risco desta maneira, ae perdemos te darei 2k de recurso meu");
                    	  
                    	  System.out.println("\n");
                    	  
                    	  System.out.println("Digite C para comçar o combate");
                     }
                   Scanner s8 = new Scanner(System.in);
                      
                      String lt8= s8.nextLine();
                      if(lt7.equals("sim")) {
                    	  raiders = (spurs - dantes);
                    	  
                    	  System.out.println("Voce ganhou  so braram " + raiders );
                    	  
                    	  System.out.println("\n");
                    	  
                    	  System.out.println("Uma batalha dura foi travada contra 1 venezia, o soldado mais forte de Dantes um ser com uma força de 3 homens");
                    	  
                    	  System.out.println("\n");
                    	  
                    	  System.out.println("Dantes:Voce foi muito estrategico trazendo " + spurs + "com voce. Tome leve o 10 com voce!"
                    	  		+ "\nMas saiba que isto nao acabou vou atras de voce!");
                    	  
                    	  System.out.println("\n");
                    	  
                    	  System.out.println("\n");
                    	  
                    	  System.out.println("Parabens!Voce ganhou 10 Venezias agora eles se tornaram Raiders!");
                    	 
                    	  System.out.println("\n");
                    	 
                    	  System.out.println("\n");
                    	  
                    	  System.out.println("Voce retorna a sua nação.E ninguem entende nada quando ve voce com mais 10 atras de ti");
                    	  
                    	  System.out.println("\n");
                    	  
                    	  System.out.println("Sua cidade esta ficando maior +++");
                    	  
                    	  System.out.println("\n");
                    	  
                    	  System.out.println("Cleitin: Olha só olha la. Parece que o grande " + name + "é cheio de estrategias");
                    	  
                    	  System.out.println("\n");
                    	  
                    	  System.out.println("Cleitin: me diga o que voce vai fazer agora?");
                    	  
                    	  System.out.println("\n");
                    	  
                    	  System.out.println(name + ": Temos que nos fortalecer, vamos atras de novas alianças e almentar nossos lucros");
                    	  
                    	  System.out.println("\n");
                    	  
                    	  System.out.println(name + ":Vamos parar de dar recursos ao Ganicos e começar a vender estamos "
                    	  		+ "\nfortes e precisamos fazer isso agora");
                    	  
                    	  System.out.println("Leona: Otima escolha" + name + "precisamos mudar nosso jeito de pensar");
                    	  
                    	  System.out.println("\n");
                    	  
                    	  System.out.println("(Em adm. é necessario mudar suas estrategias para que aquilo que voce esta "
                    	  		+ "\nfazendo tenha mais restorno ou seja mais lucro!)");
                      }
                  
                      
                      
                      
                      
                      
                      }               }}
