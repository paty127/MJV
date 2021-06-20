package myapp.cadastros;

public class Cadastro {
	//tipo + identificador = valor � opcional
	private Integer id;
	private String nome;
	private Long telefone;
	private String email;
	private String endereco;
	private String cpfCnpj;
	

	
	
	public String getEndereco() {
		return endereco;
	}
	
	
	public void setEndereco(String logradouro, String numero, String cidade, String estado) {
		
		this.setEndereco(logradouro, numero, cidade, estado);
	

	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	public Long getTelefone() {
		
		
		return telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private Integer getId() {
		return id;
	}
	private void setId(Integer id){
		this.id = id;
	}
	public void setCadastro(Cadastro cadEmpresa) {
		// TODO Auto-generated method stub
		
	}
	
}

