package parcialtres;

public class Conexion {
	
	private String nombre;
	private int puerto;
	private String host;
	private String usuario;
	private String password;
	private String tipo;
	protected double tamano = 8.0;
	private String adm;
	protected String procesador_para_windows = adm;
	private String windows;
	protected String sistema_operativo_windows = windows;
	private String ubuntu;
	protected String sistema_operativo_linux = ubuntu;
	
	
	public Conexion(String nombre, int puerto, String host, String usuario, String password, String tipo) {
		
		this.nombre = nombre;
		this.puerto = puerto;
		this.host = host;
		this.usuario = usuario;
		this.password = password;
		this.tipo = tipo;
	}


	public Conexion(String nombre, int puerto, String host, String tipo) {
		
		this.nombre = nombre;
		this.puerto = puerto;
		this.host = host;
		this.tipo = tipo;
	}
	

	public Conexion(String nombre, String host, String usuario, String password) {
	
		this.nombre = nombre;
		this.host = host;
		this.usuario = usuario;
		this.password = password;
	}
	
	
	public Conexion() {
	
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPuerto() {
		return puerto;
	}


	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}


	public String getHost() {
		return host;
	}


	public void setHost(String host) {
		this.host = host;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


}