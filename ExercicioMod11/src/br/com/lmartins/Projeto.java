package br.com.lmartins;

import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;


public class Projeto {


	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		String nome, parar;
		char genero;
//		String homem = "Homem";
//		String mulher = "Mulher";
		String resp;
		int idade;
		
		Scanner ler = new Scanner(System.in);

		
		System.out.println("Vamos criar dois grupos.");
		Thread.sleep(500);
		System.out.println("Um grupo masculimo (M) e um grupo feminino (F).");
		Thread.sleep(500);
				
		System.out.println("Vamos adicionar uma pessoa a lista.");
		Thread.sleep(500);
		
	 	List<Pessoa> pessoas = new ArrayList<>();
		 	
		 	while (true) {
	            System.out.println("Se deseja parar, digite 'p'; caso contrário, digite o nome:");
	            nome = ler.nextLine();
	            
	            if (nome.equalsIgnoreCase("p")) {
	            	System.out.println("Até a próxima!");
	            	break;
	               
	            }
	            
	            System.out.println("Gênero. Digite 'M' (masculino) ou 'F' (feminino):");
	            genero = ler.next().charAt(0);
	            System.out.println("Idade:");
	            idade = ler.nextInt();
//	            idade = Integer.parseInt(ler.nextLine());

	            pessoas.add(new Pessoa(nome, genero, idade));
	            ler.nextLine(); // limpar o buffer
	        }

	        List<Pessoa> homem1 = new ArrayList<>();
	        List<Pessoa> mulher1 = new ArrayList<>();

	        for (Pessoa pessoa : pessoas) {
		            if (pessoa.getGenero() == 'M' || pessoa.getGenero() == 'm'){	            	
		            	homem1.add(pessoa);
		            } 
		            
		            else if (pessoa.getGenero() == 'F' || pessoa.getGenero() == 'f') {
		                mulher1.add(pessoa);
		            }
		               
		            else {
		            break;
		                }
	          	        
	        }
	        Collections.sort(homem1);
	        Collections.sort(mulher1);

	        System.out.println("\nHomens:\n");
	        for (Pessoa homem : homem1) {
	            System.out.println(homem.getNome() + " (" + homem.getIdade() + ")");
	        }

	        System.out.println("\nMulheres:\n");
	        for (Pessoa mulher : mulher1) {
	            System.out.println(mulher.getNome() + " (" + mulher.getIdade() + ")");
	        }
	    }
	}

		 	
		 	
		 	
		 	
		 	
//		 	
//			 		while (true) {
//			 		
//			 		
//			 				System.out.println("Se deseja parar difite 'p' ou digite um nome para cantinuar:");
//			 				nome = ler.nextLine();
//			    			
//			    			if(nome.equals("P") && nome.equals("p")) {
//			    			break;		    			
//			    			}
//			    			
//			    			System.out.println("Gênero: digite 'M' (masculino) ou 'F' (feminino)");
//			    			genero = ler.next().charAt(0);
//			    			System.out.println("Idade:");
//			    			idade = Integer.parseInt(ler.nextLine());
//			    		    
//			    			
//			    			pessoas.add(new Pessoa(nome, genero, idade));
//			    			ler.nextLine(); // limpar buffer
//			 		}
//		 		
//				List<Pessoa> homem1= new ArrayList<>();
//				List<Pessoa> mulher1= new ArrayList<>();
//		 		
//		    			
//		    			
//		    				for(Pessoa pessoa : pessoas) {
//		    					
//		    					if (pessoa.getGenero() == 'M') {
//		    						homens.add(pessoa);
//		    						
//		    					}
//		    					
//		    					else {
//		    		                mulheres.add(pessoa);
//		    		                
//		    					}
//		    					
//		    				}
//		    				
//		    				System.out.println("Homens:");
//		    		        for (Pessoa homem : homens) {
//		    		            System.out.println(homem.getNome() + " (" + homem.getIdade() + ")");
//		    		        }
//		    		        
//		    		        System.out.println("Mulheres:");
//		    		        for (Pessoa mulher : mulheres) {
//		    		            System.out.println(mulher.getNome() + " (" + mulher.getIdade() + ")");
//		    		        }
//		    		    }
//		    		}
//			
//    	
//		