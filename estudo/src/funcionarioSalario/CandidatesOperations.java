package funcionarioSalario;

import java.util.concurrent.ThreadLocalRandom;

public class CandidatesOperations {
	public static Employee[] selectedCandidates(String[] candidates) {
		Employee[] selecteds = new Employee[5];
		int countSelecteds = 0;
		for(int i =0; i < candidates.length && countSelecteds < 5; ++i) {
			double salary = getRandomSalary();
			String formatedSalary = String.format("%.2f", salary);
			
			if(salary < 2000) {
				selecteds[countSelecteds++] = new Employee(candidates[i], salary);
				System.out.printf("O candidato %s, com o salário de %s está contratado\n", candidates[i], formatedSalary);
			}else {
				System.out.printf("Infelizmente o candidato %s, com o salário de %s, não será incorporado pela empresa\n", candidates[i], formatedSalary);
			}
		}
		return selecteds;
	}
	
	static double getRandomSalary() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	
	static void printEmployeeArray(Employee[] emps) {
		System.out.println("Esses são os funcionários");
		for(int i =0 ; i < emps.length ; ++i) {
			if(emps[i] == null) break;
			System.out.println("==================");
			System.out.printf("Funcionário %d\n", i+1);
			System.out.printf("Nome: %s\nSalário: R$ %.2f\n\n", emps[i].getName(), emps[i].getSalary());
		}
	}
	
	static void reachCandidates(Employee[] emps) {
		for(int i =0; i < emps.length; ++i) {
			if(emps[i] == null) break;
			int timesCalling = 0;
			
			do{
				timesCalling++;
				if( cadidateRespond()) {
					break;
				}
			}while(timesCalling <= 3);
			
			if(timesCalling <= 3) {
				System.out.println("Conseguimos contato com o candidato " + emps[i].getName() + " após " + timesCalling+ " tentivas");
			}else {
				System.out.println("Não conseguimos contato com o candidato " + emps[i].getName());
			
			}
		}
	}
	
	static boolean cadidateRespond() {
		return ThreadLocalRandom.current().nextBoolean();
	}
	
}
