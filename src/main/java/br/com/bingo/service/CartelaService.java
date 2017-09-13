package br.com.bingo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;

import org.springframework.stereotype.Service;

import br.com.bingo.dominio.Cartela;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class CartelaService{

	private String path; //Caminho base
	private String pathToReportPackage; // Caminho para o package onde estão armazenados os relatorios Jarper
	
	private static List<Integer> b = new ArrayList<Integer>();
	private static List<Integer> i = new ArrayList<Integer>();
	private static List<Integer> n = new ArrayList<Integer>();
	private static List<Integer> g = new ArrayList<Integer>();
	private static List<Integer> o = new ArrayList<Integer>();
	private static final int TOTAL_CARTELAS = 10;
	
	private static int[] gerarNumeracao(Cartela c, List<Integer> letra){
		int[] vetor = new int[5]; 
		Collections.shuffle(letra);
		
		int cont = 0;
		for (Integer valor : letra) {
			vetor[cont] = valor;
			if(cont == 4)
				break;
			cont++;
		}
		ordenarVetor(vetor);
		return vetor;
	}
	
	
	public List<Cartela> gerarCartelas(){
		
		ArrayList<Cartela> cartelas = new ArrayList<Cartela>();
		preencherNumeracao();
		int total = 1;
		for (int j = 0; j < TOTAL_CARTELAS; j++) {
			
			Cartela c = new Cartela();
			c.setNumero(total++);
			
			int[] vetorB = gerarNumeracao(c, b);
			
			c.setB1(vetorB[0]);
			c.setB2(vetorB[1]);
			c.setB3(vetorB[2]);
			c.setB4(vetorB[3]);
			c.setB5(vetorB[4]);
			
			int[] vetorI = gerarNumeracao(c, i);
			
			c.setI1(vetorI[0]);
			c.setI2(vetorI[1]);
			c.setI3(vetorI[2]);
			c.setI4(vetorI[3]);
			c.setI5(vetorI[4]);
			
			int[] vetorN = gerarNumeracao(c, n);
			
			c.setN1(vetorN[0]);
			c.setN2(vetorN[1]);
			c.setN3(vetorN[2]);
			c.setN4(vetorN[3]);
			c.setN5(vetorN[4]);
			
			int[] vetorG = gerarNumeracao(c, g);
			
			c.setG1(vetorG[0]);
			c.setG2(vetorG[1]);
			c.setG3(vetorG[2]);
			c.setG4(vetorG[3]);
			c.setG5(vetorG[4]);
			
			
			int[] vetorO = gerarNumeracao(c, o);
			
			c.setO1(vetorO[0]);
			c.setO2(vetorO[1]);
			c.setO3(vetorO[2]);
			c.setO4(vetorO[3]);
			c.setO5(vetorO[4]);
			
			
			cartelas.add(c);
			System.out.println("");
		}
		
		return cartelas;
	}
	
	private static void preencherNumeracao(){
		for(int ftb=1; ftb<=15; ftb++){
		    b.add(ftb);
		}
		for(int fti=16; fti<=30; fti++){
		    i.add(fti);
		}
		for(int ftn=31; ftn<=45; ftn++){
		    n.add(ftn);
		}
		for(int ftg=46; ftg<=60; ftg++){
		    g.add(ftg);
		}
		for(int fto=61; fto<=75; fto++){
		    o.add(fto);
		}
	}
	
	private static void ordenarVetor(int [] vetor){
        int aux = 0;
        for (int i = 0; i < vetor.length; i++){
            for (int j = 0; j < vetor.length; j++){
                if (vetor[i] < vetor[j]){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
	}
	
	@SuppressWarnings("unchecked")
	public void imprimir(List<Cartela> cartelas, String path) throws Exception{
		this.path = this.getClass().getClassLoader().getResource("").getPath();
		this.pathToReportPackage = this.path + "br/com/bingo/jasper/";
		System.out.println(path);
		
		Map parametros = new HashMap(); 
		ImageIcon gto = new ImageIcon(getClass().getResource("/br/com/bingo/jasper/atracao_musical.png"));
		parametros.put("atracaoMusical", gto.getImage());
		
		ImageIcon trevo = new ImageIcon(getClass().getResource("/br/com/bingo/jasper/trevo.jpg"));
		parametros.put("trevo", trevo.getImage());
		
		System.out.println("Loading JRXML..");
		JasperReport report = JasperCompileManager.compileReport(this.getPathToReportPackage() + "Cartela.jrxml");
		
		JasperPrint print = JasperFillManager.fillReport(report, parametros, new JRBeanCollectionDataSource(cartelas));
 
		JasperExportManager.exportReportToPdfFile(print, "C:/AmbDesenv/workspace/Bingo/src/br/com/bingo/jasper/Cartela.pdf");	
		System.out.println("PDF has been generated.");
	}
 
	public String getPathToReportPackage() {
		return this.pathToReportPackage;
	}
	
	public String getPath() {
		return this.path;
	}
	
}
