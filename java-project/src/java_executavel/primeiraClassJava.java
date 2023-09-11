package java_executavel;

import javax.swing.JOptionPane;

public class primeiraClassJava {
	
	//variavel global acessivel a todos 
	static int maiorIdade = 18;
	
	//O metodo main é o unico que pode ser executado em java
	public static void main(String[] args) {
		//variavel pertencente apenas para esse metodo
		int a = 9, b = 9, c = 9, d = 9, e = 9;
		
		//entrada de dados pelo java
		String idade = JOptionPane.showInputDialog("Digite sua idade");
		//convertendo texto em numero
		int age = Integer.parseInt(idade);
		if(age < 18) {
			System.out.println("idade muito baixa");
		}else {
			System.out.println("bem- vindo");
		}
		
		System.out.println( "Hello World");
		System.out.println("My besto friendo");  
			
		System.out.println("testando o atalho ctrl + f11");
		maiorIdade();
		teste();
		System.out.println(Mate());
		/*While();
		DoWhile();
		For();
		ForBreak();
		ForContinue();
		ModD();*/
		Media();
		
		
	}
	
	
	//metodos voids são metodos que nãp retornam valores, vomo o próprio nome diz, "vazio" 
	public static void  maiorIdade(){
		int idadeAtual = 18;
		if(idadeAtual < maiorIdade) {
			System.out.println("Acesso negado devida a baiza idade "+idadeAtual);
		}
		else {
			System.out.println("acesso liberado " );
		}
	}
	
	public static void teste() {
		String quest = JOptionPane.showInputDialog("Digite um numero de 1 a 7 para se referir a um dia da semana: ");
		int dia = Integer.parseInt(quest);
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda- feira");
			break;
		case 3:
			System.out.println("Terça- feira");
			break;
		case 4:
			System.out.println("Quarta - feira");
			break;
		case 5:
			System.out.println("Quinta- feira");
			break;
		case 6:
			System.out.println("Sexta- feira");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("erro ao quantificar");
			break;
		}
	}
	
	public static int Mate(){
		//apenas um teste 
		int a = 3;
		int b = 4;
		int c = a + b;
		
		if(c >= 7) {
			 c+= 3;
			return c;
		}else {
			return 0;
		}
		
	}
	
	public static void While() {
		String quest = JOptionPane.showInputDialog("Digite um numero para fazer sua contagem decresente: ");
		int repet = Integer.parseInt(quest);
		
		while(repet > 0) {
			repet--;
			System.out.println("contagem em: " +repet);
		}
	}
	
	public static void DoWhile() {
		int repit = 5;
		do {
			System.out.println("Contagem com Do While em: " +repit);
			repit--;
		}while(repit > 0);
	}
	
	public static void For() {
		for(int number = 0; number <=10; number++) {
			System.out.println("|Contagem utilizando o for em: " +number);
		}
	}
	//o uso do break é usado para fazer com que o loop pare após um valor ser encontrado
	public static void ForBreak(){
		for (int breaker = 0; breaker <= 10; breaker++) {
			if(breaker == 10) {
				System.out.println("O nome do breaker é "+breaker);
				break;
			}
		}
	}
	
	//com o continue, ele acha o dado de processamento e continua o processamento do looping
	public static void ForContinue() {
		for(int count = 0; count <= 10; count++) {
			if(count ==  3 || count == 6 || count == 9) {
				System.out.println("o dado atual é "+count);
				continue;
			}
		}
	}
	
	public static void ModD() {
		String car = JOptionPane.showInputDialog("digite o numero de carros ");
		String person = JOptionPane.showInputDialog("digite o numero de pessoas: ");
		double car_number = Double.parseDouble(car);
		double person_number = Double.parseDouble(person);
		int div = (int) (car_number / person_number);
		double resto = car_number % person_number; 
		//this function is used to make a confirm dialog box that returns us an integer value, yes = 0, no = 1, cancel = 2
		int result =JOptionPane.showConfirmDialog(null, "do you want to see the result? ");
		if(result ==  0 ) {
			//when it's used, it shows a message box to the user
			JOptionPane.showMessageDialog(null,"the divison of " + car_number + " cars to each " +  person_number + " people is " + div +" and the remainder is " +resto);
		}else {
			System.out.println("obrigado por usar o programa");
		}		
	}
	
	public static void Media() {
		String grade1 = JOptionPane.showInputDialog("enter the value of the first grade ");
		String grade2 = JOptionPane.showInputDialog("enter the value of the second grade ");
		String grade3 = JOptionPane.showInputDialog("enter the value of the third grade ");
		String grade4 = JOptionPane.showInputDialog("enter the value of the fourth grade ");
		
		double convertGrade1 = Double.parseDouble(grade1);
		double convertGrade2 = Double.parseDouble(grade2);
		double convertGrade3 = Double.parseDouble(grade3);
		double convertGrade4 = Double.parseDouble(grade4);
		
		int media = (int) (convertGrade1 + convertGrade2 + convertGrade3 + convertGrade4)/4;
		
		int quest =JOptionPane.showConfirmDialog(null, "do you want to see the media?");
		if(quest == 0) {
			if(media > 4) {
				if(media > 5 && media < 7) {
					System.out.println("the student is going to summer school so that he can move on the next grade ");
				}else {
					if(media >= 8) {
						 JOptionPane.showMessageDialog(null, "aproved! "+media);
					}
				}
			}else {
				System.out.println("reproved!");	
			}
		}else {
			JOptionPane.showMessageDialog(null,"thank you for using our system");
		}
	}
}



