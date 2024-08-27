package modelos;
import java.time.LocalDate;
import java.time.Year;
import enums.TipoComprobante;

public class ComprobantePago 
{
	private TipoComprobante tipoComprobante;
	private LocalDate fechaEmisionComprobante;
	private LocalDate fechaVencimientoComprobante;
	private String serie;
	private Proveedor proveedor;
	private Year annoEmisionDUA;


}
