package myapp;

import java.text.SimpleDateFormat;

import myapp.cadastros.Empresa;
import myapp.pedidos.Pedido;

public class PrinterApp {
	public static void imprimirPedido(Pedido pedido) {
		Empresa empresa = pedido.getEmpresa();
		
		StringBuilder sb = new StringBuilder();
		sb.append(empresa.getCadastro().getNome()+"\n");
		sb.append(empresa.getCadastro().getEndereco()+"\n");
		sb.append(String.format("Cnpj%s \n", empresa.getCadastro().getCpfCnpj()) );
		sb.append(String.format("IE: %d\nIM: %d\n", empresa.getIe(), empresa.getIm()));
		sb.append("-----------------------------------------------------------------\n");
		
		
		SimpleDateFormat formatador= new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		String dataFormatada = formatador.format(pedido.getData());
		sb.append(dataFormatada);
		
		
		sb.append("-------------------------------------------------------------------");
		sb.append(String.format("TOTAL %.2f", pedido.getValorTotal()));
		
		System.out.println(sb.toString());
		
		
	}

}
