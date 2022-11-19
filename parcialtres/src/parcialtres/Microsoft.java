package parcialtres;

public class Microsoft extends Conexion implements OperacionesConexion {

	private boolean isCloud;
	private String lenguajeConsultaOrrm;
	private int peticiones_concurrentes = 1500;
	
	public boolean isCloud() {
		return isCloud;
	}
	
	public void setCloud(boolean isCloud) {
		this.isCloud = isCloud;
	}
	
	public String getLenguajeConsultaOrrm() {
		return lenguajeConsultaOrrm;
	}
	
	public void setLenguajeConsultaOrrm(String lenguajeConsultaOrrm) {
		this.lenguajeConsultaOrrm = lenguajeConsultaOrrm;
	}
	

	public Microsoft(boolean isCloud, String lenguajeConsultaOrrm) {
		
		this.isCloud = isCloud;
		this.lenguajeConsultaOrrm = lenguajeConsultaOrrm;
	}

	public Microsoft() {
		
	}

	@Override
	public String devolverCapacidadRespuesta(String sistemaOperativo, int cantidadDePeticiones, String precesador) {
		
		return null;
	}


}