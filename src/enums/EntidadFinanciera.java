package enums;

public enum EntidadFinanciera 
{
	CENTRAL_RESERVA_DEL_PERU("01","CENTRAL RESERVA DEL PERU"),
	DE_CREDITO_DEL_PERU("02","DE CREDITO DEL PERU"),
	INTERNACIONAL_DEL_PERU("03","INTERNACIONAL DEL PERU"),
	LATINO("05","LATINO"),
	CITIBANK_DEL_PERU_SA("07","CITIBANK DEL PERU S.A."),
	STANDARD_CHARTERED("08","STANDARD CHARTERED"),
	SCOTIABANK_PERU("09","SCOTIABANK PERU"),
	CONTINENTAL("11","CONTINENTAL"),
	DE_LIMA("12","DE LIMA"),
	MERCANTIL("16","MERCANTIL"),
	NACION("18","NACION"),
	SANTANDER_CENTRAL_HISPANO("22","SANTANDER CENTRAL HISPANO"),
	DE_COMERCIO("23","DE COMERCIO"),
	REPUBLICA("25","REPUBLICA"),
	NBK_BANK("26","NBK BANK"),
	BANCOSUR("29","BANCOSUR"),
	FINANCIERO_DEL_PERU("35","FINANCIERO DEL PERU"),
	DEL_PROGRESO("37","DEL PROGRESO"),
	INTERAMERICANO_FINANZAS("38","INTERAMERICANO FINANZAS  "),
	BANEX("39","BANEX"),
	NUEVO_MUNDO("40","NUEVO MUNDO"),
	SUDAMERICANO("41","SUDAMERICANO"),
	DEL_LIBERTADOR("42","DEL LIBERTADOR"),
	DEL_TRABAJO("43","DEL TRABAJO"),
	SOLVENTA("44","SOLVENTA"),
	SERBANCO_SA("45","SERBANCO SA."),
	BANK_OF_BOSTON("46","BANK OF BOSTON"),
	ORION("47","ORION"),
	DEL_PAIS("48","DEL PAIS"),
	MI_BANCO("49","MI BANCO"),
	BNP_PARIBAS("50","BNP PARIBAS"),
	AGROBANCO("51","AGROBANCO"),
	HSBC_BANK_PERU_SA("53","HSBC BANK PERU S.A."),
	BANCO_FALABELLA_SA("54","BANCO FALABELLA S.A."),
	BANCO_RIPLEY("55","BANCO RIPLEY"),
	BANCO_SANTANDER_PERU_SA("56","BANCO SANTANDER PERU S.A."),
	BANCO_AZTECA_DEL_PERU("58","BANCO AZTECA DEL PERU"),
	OTROS("99","OTROS");
	private final String numero;	private final String descripcion;
	EntidadFinanciera(String numero,String descripcion)
	{
		this.numero=numero;
		this.descripcion=descripcion;
	}
}
