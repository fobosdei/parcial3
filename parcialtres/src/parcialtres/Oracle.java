package parcialtres;
public class Oracle extends Conexion implements OperacionesConexion {
	
	private boolean plsql;
	private int cantidadDeUsuariosPermitidos;
	private int peticiones_concurrentes = 1000;
	
	
	public boolean isPlsql() {
		return plsql;
	}
	
	public void setPlsql(boolean plsql) {
		this.plsql = plsql;
	}
	
	public int getCantidadDeUsuariosPermitidos() {
		return cantidadDeUsuariosPermitidos;
	}
	
	public void setCantidadDeUsuariosPermitidos(int cantidadDeUsuariosPermitidos) {
		this.cantidadDeUsuariosPermitidos = cantidadDeUsuariosPermitidos;
	}
	
	
	public Oracle(boolean plsql, int cantidadDeUsuariosPermitidos) {
	
		this.plsql = plsql;
		this.cantidadDeUsuariosPermitidos = cantidadDeUsuariosPermitidos;
	}
	
	public Oracle() {
	
	}

	@Override
	public String devolverCapacidadRespuesta(String sistemaOperativo, int cantidadDePeticiones, String precesador) {
    
     
		return null;
	}

	public int getPeticiones_concurrentes() {
		return peticiones_concurrentes;
	}

	public void setPeticiones_concurrentes(int peticiones_concurrentes) {
		this.peticiones_concurrentes = peticiones_concurrentes;
	}
}