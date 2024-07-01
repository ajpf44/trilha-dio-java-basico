package funcionarioSalario;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		String[] candidates = {"Ronaldo", "Cabeção", "Marcola", "Piranmandir", "Abajour","Marquinho do Pneu","Shaloin", "Mariano do Inga","Martinho do porrete", "Nal do canal", "Mano manolo", "Sujeito very crazy","I'm the inevitable","Maven"};
		
		Employee[] emps = CandidatesOperations.selectedCandidates(candidates);
		
		CandidatesOperations.printEmployeeArray(emps);
		System.out.println("=========================");
		CandidatesOperations.reachCandidates(emps);
	}
	
	static void handleJobApply() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a expectativa de salário: ");
		double expectedSalary = sc.nextDouble();
		
		if(expectedSalary > 2000) {
			System.out.println("Abandonar candidatura");
			return;
		}
		
		if(expectedSalary == 2000) {
			System.out.println("Ligar com contraproposta");
			return;
		}
		
		System.out.println("Ligar oferencendo cargo");
	}
}
