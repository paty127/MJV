package myapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import myapp.cadastros.CD;
import myapp.cadastros.Cadastro;
import myapp.cadastros.Empresa;
import myapp.factory.FabricaCadastro;
import myapp.pedidos.Pedido;
import myapp.pedidos.PedidoItem;

public class Application {
	public static void main(String[] args) {
		//REQUISITO
		//1 CRIAR OBJETOS QUE RELACIONANDO-SE EU TEREI UMA PESRPECTIVA DE TER UM PEDIDO COM
		//TODAS AS INFORMA��ES
		//2 IMPRIMIR ESTE PEDIDO NO ESTILO CUPOM
		
		
		Cadastro artista = FabricaCadastro.criarCadastro("BRUCE DICKSON", "a@a", 989089090L);
			
		CD p1 = new CD(); // Livro()
		p1.setCodigoBarras("989789789");
		p1.setTitulo("IRON MAIDEN");
		p1.setValorVenda(199.90);
		p1.setFaixa(10);
		p1.setArtista(artista);
		
		artista = FabricaCadastro.criarCadastro("PINK FLOYD", null, 989089090L);
		
		CD p2 = new CD(); // Livro()
		p2.setCodigoBarras("989789789");
		p2.setTitulo("THE WALL");
		p2.setValorVenda(157.90);
		p2.setFaixa(8);
		p2.setArtista(artista);
		
		Empresa empresa = new Empresa(908098L,9080981L);
		Cadastro cadEmpresa= new Cadastro();
		cadEmpresa.setCpfCnpj("99999999000101");
		cadEmpresa.setEmail("pedido@pedidos.com");
		cadEmpresa.setNome("IFOOD PEDIDOS");
		cadEmpresa.setTelefone(11984108729L);
		cadEmpresa.setEndereco("Avenida Paulista", "100", "S�o Paulo", "SP");
		cadEmpresa.setCadastro(cadEmpresa);
		
		
		Pedido pedido = new Pedido();
		pedido.setEmpresa(empresa);
		Cadastro comprador= FabricaCadastro.criarCadastro("Gleyson", "b@ob", 868789L);
		
		pedido.setComprador(comprador);
		pedido.setData(new Date(2021,06,19));
		pedido.setValorTotal(325.0);
		pedido.setId(23234);
		
		List<PedidoItem> itens = new ArrayList<>();
		PedidoItem item  =new PedidoItem();
		item.setProduto(p1);
		item.setQuantidade(2.0);
		item.setValorVenda(p1.getValorVenda());
		item.setValorTotal(item.getQuantidade()*item.getValorVenda());
		
		itens.add(item);
		
		item.setProduto(p2);
		item.setQuantidade(4.0);
		item.setValorVenda(p2.getValorVenda());
		item.setValorTotal(item.getQuantidade()*item.getValorVenda());
		
		itens.add(item);
		
		
		
		
	}
}
		
		
				
		
		
		
		
		
		