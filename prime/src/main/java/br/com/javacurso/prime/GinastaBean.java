package br.com.javacurso.prime;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.HorizontalBarChartModel;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

@ManagedBean
@ViewScoped
public class GinastaBean {
	
	private GinastaFacade facade = new GinastaFacade();
	private Ginasta ginastaAtual = facade.novoGinasta();
	private List<Ginasta> ginastas;
	private String oid;
	private boolean novo = true;
	private boolean podeEditar = true;
	private String message;
	private LineChartModel lineModel1;
	private LineChartModel lineModel2;
	private LineChartModel zoomModel;
	private BarChartModel barModel;
    private HorizontalBarChartModel horizontalBarModel;
    private List<String> images;
	
	///////////////// Inicio de charts//////////////////////
    
	@PostConstruct
    public void init() { // usado tanto para os charts quanto para as imagens
        createLineModels();
        createBarModels();
        images = new ArrayList<String>();
        for (int i = 1; i <= 2; i++) {
            images.add("paisa" + i + ".jpg");
        }
    }
	
	public LineChartModel getLineModel1() {
        return lineModel1;
    }
	
    public LineChartModel getLineModel2() {
        return lineModel2;
    }
 
    public LineChartModel getZoomModel() {
        return zoomModel;
    }
	
	private LineChartModel initCategoryModel() {
        LineChartModel model = new LineChartModel();
 
        ChartSeries azul = new ChartSeries();
        azul.setLabel("Azul");
        azul.set("2014", 120);
        azul.set("2015", 100);
        azul.set("2016", 44);
        azul.set("2017", 150);
        azul.set("2018", 25);
 
        ChartSeries laranja = new ChartSeries();
        laranja.setLabel("Laranja");
        laranja.set("2014", 52);
        laranja.set("2015", 60);
        laranja.set("2016", 110);
        laranja.set("2017", 90);
        laranja.set("2018", 120);
 
        model.addSeries(azul);
        model.addSeries(laranja);
 
        return model;
    }
	
	private void createLineModels() {
        lineModel1 = initLinearModel();
        lineModel1.setTitle("Estouro de pipoca conforme temperatura da panela - em %");
        lineModel1.setLegendPosition("e");
        Axis yAxis = lineModel1.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(100);
 
        lineModel2 = initCategoryModel();
        lineModel2.setTitle("Uso de Cores");
        lineModel2.setLegendPosition("e");
        lineModel2.setShowPointLabels(true);
        lineModel2.getAxes().put(AxisType.X, new CategoryAxis("Anos"));
        yAxis = lineModel2.getAxis(AxisType.Y);
        yAxis.setLabel("Uso");
        yAxis.setMin(0);
        yAxis.setMax(200);
 
        zoomModel = initLinearModel();
        zoomModel.setTitle("Estouro de pipoca conforme temperatura da panela - em %");
        zoomModel.setZoom(true);
        zoomModel.setLegendPosition("e");
        yAxis = zoomModel.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(100);
    }
	
	private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();
 
        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Pipoca Salgada");
 
        series1.set(90, 40);
        series1.set(100, 50);
        series1.set(125, 75);
        series1.set(150, 90);
        series1.set(180, 95);
 
        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Pipoca Doce");
 
        series2.set(90, 15);
        series2.set(100, 30);
        series2.set(125, 60);
        series2.set(150, 75);
        series2.set(180, 85);
 
        model.addSeries(series1);
        model.addSeries(series2);
 
        return model;
    }
	
	public void itemSelect(ItemSelectEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
                "Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());
 
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	
	public BarChartModel getBarModel() {
        return barModel;
    }
 
    public HorizontalBarChartModel getHorizontalBarModel() {
        return horizontalBarModel;
    }
    
    private BarChartModel initBarModel() {
        BarChartModel model = new BarChartModel();
 
        ChartSeries boys = new ChartSeries();
        boys.setLabel("Garotos");
        boys.set("2004", 120);
        boys.set("2005", 100);
        boys.set("2006", 44);
        boys.set("2007", 150);
        boys.set("2008", 25);
 
        ChartSeries girls = new ChartSeries();
        girls.setLabel("Garotas");
        girls.set("2004", 52);
        girls.set("2005", 60);
        girls.set("2006", 110);
        girls.set("2007", 135);
        girls.set("2008", 120);
 
        model.addSeries(boys);
        model.addSeries(girls);
 
        return model;
    }
 
    private void createBarModels() {
        createBarModel();
        createHorizontalBarModel();
    }
 
    private void createBarModel() {
        barModel = initBarModel();
 
        barModel.setTitle("Gráfico em barras");
        barModel.setLegendPosition("ne");
 
        Axis xAxis = barModel.getAxis(AxisType.X);
        xAxis.setLabel("Gênero");
 
        Axis yAxis = barModel.getAxis(AxisType.Y);
        yAxis.setLabel("Nascimentos");
        yAxis.setMin(0);
        yAxis.setMax(200);
    }
 
    private void createHorizontalBarModel() {
        horizontalBarModel = new HorizontalBarChartModel();
 
        ChartSeries boys = new ChartSeries();
        boys.setLabel("Garotos");
        boys.set("2004", 50);
        boys.set("2005", 96);
        boys.set("2006", 44);
        boys.set("2007", 55);
        boys.set("2008", 25);
 
        ChartSeries girls = new ChartSeries();
        girls.setLabel("Garotas");
        girls.set("2004", 52);
        girls.set("2005", 60);
        girls.set("2006", 82);
        girls.set("2007", 35);
        girls.set("2008", 120);
 
        horizontalBarModel.addSeries(boys);
        horizontalBarModel.addSeries(girls);
 
        horizontalBarModel.setTitle("Horizontal e acumulado");
        horizontalBarModel.setLegendPosition("e");
        horizontalBarModel.setStacked(true);
 
        Axis xAxis = horizontalBarModel.getAxis(AxisType.X);
        xAxis.setLabel("Nascimentos");
        xAxis.setMin(0);
        xAxis.setMax(200);
 
        Axis yAxis = horizontalBarModel.getAxis(AxisType.Y);
        yAxis.setLabel("Gênero");
    }
	
	///////////////// Fim de charts//////////////////////

    public List<String> getImages() {
        return images;
    }
    
    ///////////////// Inicio de messages//////////////////////
    
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
    
    public void saveMessage() {
        FacesContext context = FacesContext.getCurrentInstance();
         
        context.addMessage(null, new FacesMessage("Successuuu!",  "Sua mensagem foi: " + message) );
        context.addMessage(null, new FacesMessage("Segunda mensagem", "Detalhes da segunda mensagem"));
    }
    
    public void info() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Você foi informado!"));
    }
     
    public void warn() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning!", "Você foi repreendido."));
    }
     
    public void error() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Você cometeu um erro."));
    }
     
    public void fatal() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Fatal!", "Você cometeu um erro fatal!"));
    }
	
    ///////////////// Fim de messages//////////////////////
    
    ///////////////// Inicio de Cadastro//////////////////////
	public boolean isPodeEditar() {
		return podeEditar;
	}
	
	public String getOid(){ //não implementado ainda
		return oid;
	}
	
	public void setOid(String oid){ //não implementado ainda
		this.oid = oid;
		if("novo".equals(oid)){
			novo();
		}else{
			try{
				Integer id = Integer.parseInt(oid);
				ginastaAtual = facade.carregarGinasta(id);
				novo = false;
			}catch(NumberFormatException ex){
				FacesContext context= FacesContext.getCurrentInstance();
				FacesMessage message = new FacesMessage("id inválido");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage(null, message);
			}
		}
	}
	
	public void novo(){
		this.ginastaAtual = facade.novoGinasta();
		novo = true;
		editar();
	}
	
	public void editar(){ //não implementado ainda
		this.podeEditar = true;		
	}
	
	public Integer getId() {
		return ginastaAtual != null ? ginastaAtual.getId() : null;
	}
	
	public void setId(Integer id) {
		if(ginastaAtual != null){
			ginastaAtual.setId(id);
		}
	}
	
	public String getNome() {
		return ginastaAtual != null ? ginastaAtual.getNome() : "";
	}

	public void setNome(String nome) {
		if (ginastaAtual != null) {
			ginastaAtual.setNome(nome);
		}
	}
	
	public String getClube() {
		return ginastaAtual != null ? ginastaAtual.getClube() : "";
	}

	public void setClube(String clube) {
		if (ginastaAtual != null) {
			ginastaAtual.setClube(clube);
		}
	}
	
	public Integer getIdade() {
		return ginastaAtual != null ? ginastaAtual.getIdade() : null;
	}
	
	public void setIdade(Integer idade) {
		if(ginastaAtual != null){
			ginastaAtual.setIdade(idade);
		}
	}
	
	public String listar(){ //não implementado ainda
		novo();
		return "./lista.jsf";
	}
	
	public void salvar(){
		boolean ok = false;
		if(ginastaAtual != null){
			ok = facade.salvar(ginastaAtual);
		}
		if(ok){
			addMensagem("Contato salvo com sucesso", FacesMessage.SEVERITY_INFO);
			novo = false;
			podeEditar = false;
		}else{
			addMensagem("Não foi possível salvar o contato", FacesMessage.SEVERITY_ERROR);
		}
	}
	
	public void remover(){ //não implementado ainda
		boolean ok = false;
		if(ginastaAtual != null && !novo){
			ok = facade.removerGinasta(ginastaAtual);
			if(ok){
				addMensagem("Contato removido com sucesso", FacesMessage.SEVERITY_INFO);
				novo();
			}else{
				addMensagem("Não foi posspivel remover o contato.", FacesMessage.SEVERITY_ERROR);
			}
		}
	}
	
	public List<Ginasta> getGinastas(){
		if(ginastas == null || ginastas.isEmpty()){
			ginastas = facade.carregarGinastas();
		}
		return ginastas;
	}
	
	private void addMensagem(String mensagem, Severity severidade){
		FacesContext context= FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(mensagem);
		message.setSeverity(severidade);
		context.addMessage(null, message);		
	}
	
	///////////////// Fim de Cadastro//////////////////////
	
}
