





public class Hello

{

	public static void main(String[] args){
		 System.out.println("\033[2J"); // '/'- 이스케이프문자 033 - 8진수(ASCII 코드표에서 ESC임.) 
		 System.out.println("\u001B[2J");		
		System.out.println("\033[31m");  
		System.out.println("\033[44m");  
		System.out.print("\033[10;20H");	
		System.out.println("Hellow Java");  

		System.out.println("Hellow Java");  

		
		System.out.println("\033[34m");  
		System.out.println("\033[41m");  
		System.out.print("\033[5;10H");	
		System.out.println("Hello JavaScript");  


		System.out.println("\033[31m");  
		System.out.println("\033[44m");  
		System.out.print("\033[18;3H");	
		System.out.println("Hello HTML");  


		System.out.println("\033[34m");  
		System.out.println("\033[41m");  
		System.out.print("\033[13;35H");	
		System.out.println("Hello SQL");  
                
		System.out.println("\033[0m");
	}
 }

