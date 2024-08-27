package enums;

public enum TipoDocumentoIdentidad 
{
	OTROS_TIPOS_DE_DOCUMENTOS('0',"OTROS TIPOS DE DOCUMENTOS"),
	DOCUMENTO_NACIONAL_DE_IDENTIDAD_('1',"DOCUMENTO NACIONAL DE IDENTIDAD (DNI)"),
	CARNET_DE_EXTRANJERIA('4',"CARNET DE EXTRANJERIA"),
	REGISTRO_UNICO_DE_CONTRIBUYENTES('6',"REGISTRO ÚNICO DE CONTRIBUYENTES"),
	PASAPORTE('7',"PASAPORTE"),
	CEDULA_DIPLOMATICA_DE_IDENTIDAD('A',"CÉDULA DIPLOMÁTICA DE IDENTIDAD");

	private final Character numero;
	private final String descripcion;
	TipoDocumentoIdentidad(Character numero,String descripcion)
	{
		this.numero=numero;
		this.descripcion=descripcion;
	}
}
