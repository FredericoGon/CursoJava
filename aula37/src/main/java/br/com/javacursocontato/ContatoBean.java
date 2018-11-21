package br.com.javacursocontato;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class ContatoBean {
	
	private ContatoFacade facade = new ContatoFacade();
	private Contato contatoAtual = facade.novoContato();
	private List<Contato> contatos;
	private String oid;
	private boolean novo = true;
	private boolean podeEditar = true;
	
	public boolean isPodeEditar() {
		return podeEditar;
	}
	
	public String getOid(){
		return oid;
	}
	
	public void setOid(String oid){
		this.oid = oid;
		if("novo".equals(oid)){
			novo();
		}else{
			try{
				Integer id = Integer.parseInt(oid);
				contatoAtual = facade.carregarContato(id);
				novo = false;
			}catch(NumberFormatException ex){
				FacesContext context= FacesContext.getCurrentInstance();
				FacesMessage message = new FacesMessage("id inválido");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage(null, message);
			}
		}
	}
	
	public Integer getId() {
		return contatoAtual != null ? contatoAtual.getId() : null;
	}
	
	public void setId(Integer id) {
		if(contatoAtual != null){
			contatoAtual.setId(id);
		}
	}

	public String getNome() {
		return contatoAtual != null ? contatoAtual.getNome() : "";
	}

	public void setNome(String nome) {
		if (contatoAtual != null) {
			contatoAtual.setNome(nome);
		}
	}

	public String getEmail() {
		return contatoAtual != null ? contatoAtual.getEmail() : "";
	}

	public void setEmail(String email) {
		if (contatoAtual != null) {
			contatoAtual.setEmail(email);
		}
	}

	public String getTelefone() {
		return contatoAtual != null ? contatoAtual.getTelefone() : "";
	}

	public void setTelefone(String telefone) {
		if (contatoAtual != null) {
			contatoAtual.setTelefone(telefone);
		}
	}

	public TipoContato getTipo() {
		return contatoAtual != null ? contatoAtual.getTipo() : null;
	}

	public void setTipo(TipoContato tipo) {
		if (contatoAtual != null) {
			contatoAtual.setTipo(tipo);
		}
	}
	
	public TipoContato[] getTipos(){
		return TipoContato.values();
	}
	
	public String listar(){
		novo();
		return "./lista.jsf";
	}
	
	public void salvar(){
		boolean ok = false;
		if(contatoAtual != null){
			ok = facade.salvar(contatoAtual);
		}
		if(ok){
			addMensagem("Contato salvo com sucesso", FacesMessage.SEVERITY_INFO);
			novo = false;
			podeEditar = false;
		}else{
			addMensagem("Não foi possível salvar o contato", FacesMessage.SEVERITY_ERROR);
		}
	}
	
	public void remover(){
		boolean ok = false;
		if(contatoAtual != null && !novo){
			ok = facade.removerContato(contatoAtual);
			if(ok){
				addMensagem("Contato removido com sucesso", FacesMessage.SEVERITY_INFO);
				novo();
			}else{
				addMensagem("Não foi posspivel remover o contato.", FacesMessage.SEVERITY_ERROR);
			}
		}
	}
	
	public void editar(){
		this.podeEditar = true;		
	}
	
	public void novo(){
		this.contatoAtual = facade.novoContato();
		novo = true;
		editar();
	}
	
	public List<Contato> getContatos(){
		if(contatos == null || contatos.isEmpty()){
			contatos = facade.carregarContatos();
		}
		return contatos;
	}
	
	private void addMensagem(String mensagem, Severity severidade){
		FacesContext context= FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(mensagem);
		message.setSeverity(severidade);
		context.addMessage(null, message);		
	}
	
}
