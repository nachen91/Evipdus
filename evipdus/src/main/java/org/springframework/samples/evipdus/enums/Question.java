package org.springframework.samples.evipdus.enums;

public enum Question {


	Q1 {
		public String toString() {
			return "Tratamientos que impliquen perfilado o valoraci�n de sujetos, incluida la recogida de datos del sujeto en m�ltiples �mbitos de su vida (desempe�o en el trabajo, personalidad y comportamiento), que cubran varios aspectos de su personalidad o sobre sobre sus h�bitos.";
		}
	},
	Q2 {
		public String toString() {
			return "Tratamientos que impliquen la toma de decisiones automatizadas o que contribuyan en gran medida a la toma de tales decisiones, incluyendo cualquier tipo de decisi�n que impida a un interesado el ejercicio de un derecho o el acceso a un bien o un servicio o formar parte de un contrato.";
		}
	},
	Q3 {
		public String toString() {
			return "Tratamientos que impliquen la observaci�n, monitorizaci�n, supervisi�n, geolocalizaci�n o control del interesado de forma sistem�tica y exhaustiva, incluida la recogida de datos y metadatos a trav�s de redes, aplicaciones o en zonas de acceso p�blico, as� como el procesamiento de identificadores �nicos que permitan la identificaci�n de usuarios de servicios de la sociedad de la informaci�n como pueden ser los servicios web, TV interactiva, aplicaciones m�viles, etc.";
		}
	},
	Q4 {
		public String toString() {
			return "Tratamientos que impliquen el uso de categor�as especiales de datos a las que se refiere el art�culo 9.1 del RGPD, datos relativos a condenas o infracciones penales a los que se refiere el art�culo 10 del RGPD o datos que permitan determinar la situaci�n financiera o de solvencia patrimonial o deducir informaci�n sobre las personas relacionada con categor�as especiales de datos.";
		}
	},
	Q5 {
		public String toString() {
			return "Tratamientos que impliquen el uso de datos biom�tricos con el prop�sito de identificar de manera �nica a una persona f�sica.";
		}
	},
	Q6 {
		public String toString() {
			return "Tratamientos que impliquen el uso de datos gen�ticos para cualquier fin.";
		}
	},
	Q7 {
		public String toString() {
			return "Tratamientos que impliquen el uso de datos a gran escala. Para determinar si un tratamiento se puede considerar a gran escala se considerar�n los criterios establecidos en la gu�a WP243 �Directrices sobre los delegados de protecci�n de datos (DPD)� del Grupo de Trabajo del Art�culo 29.";
		}
	},
	Q8 {
		public String toString() {
			return "Tratamientos que impliquen la asociaci�n, combinaci�n o enlace de registros de bases de datos de dos o m�s tratamientos con finalidades diferentes o por responsables distintos.";
		}
	},
	Q9{
		public String toString() {
			return "Tratamientos de datos de sujetos vulnerables o en riesgo de exclusi�n social, incluyendo datos de menores de 14 a�os, mayores con alg�n grado de discapacidad, discapacitados, personas que acceden a servicios sociales y v�ctimas de violencia de g�nero, as� como sus descendientes y personas que est�n bajo su guardia y custodia.";
			}
	},
	Q10{
		public String toString() {
			return "Tratamientos que impliquen la utilizaci�n de nuevas tecnolog�as o un uso innovador de tecnolog�as consolidadas, incluyendo la utilizaci�n de tecnolog�as a una nueva escala, con un nuevo objetivo o combinadas con otras, de forma que suponga nuevas formas de recogida y utilizaci�n de datos con riesgo para los derechos y libertades de las personas.";
		}
	},
	Q11 {
		public String toString() {
			return "Tratamientos de datos que impidan a los interesados ejercer sus derechos, utilizar un servicio o ejecutar un contrato, como por ejemplo tratamientos en los que los datos han sido recopilados por un responsable distinto al que los va a tratar y aplica alguna de las excepciones sobre la informaci�n que debe proporcionarse a los interesados seg�n el art�culo 14.5 (b,c,d) del RGPD.";
		}
	},
	Q12 {
		public String toString() {
			return "�Se van a tratar categor�as especiales de datos?";
		}
	},
	Q13 {
		public String toString() {
			return "�Se van a tratar categor�as especiales de datos a gran escala?";
		}
	},
	Q14 {
		public String toString() {
			return " �El tratamiento involucra datos de menores de edad en materia de Protecci�n de Datos (14 a�os seg�n la LOPDGDD)?";
		}
	},
	Q15 {
		public String toString() {
			return "�La finalidad del tratamiento implica el uso espec�fico de datos de personas con discapacidad o cualquier otro colectivo en situaci�n de especial vulnerabilidad?";
		}
	},
	Q16 {
		public String toString() {
			return "�Con las operaciones de tratamiento, se pueden determinar h�bitos, comportamientos, preferencias, gustos, intereses, etc. de personas identificadas o identificables?";
		}
	},
	Q17 {
		public String toString() {
			return "Los tratamientos evaluados se amparan en la adhesi�n a un c�digo de conducta dentro de los l�mites fijados por el RGPD";
		}
	},
	Q18 {
		public String toString() {
			return "�Se van a tratar datos personales para elaborar perfiles, categorizar/segmentar, hacer ratings/scoring o para la toma de decisiones?";
		}
	},
	Q19 {
		public String toString() {
			return "A partir del tratamiento de los datos, �se toman decisiones que pueden afectar significativamente o perjudicar de alguna manera a las personas afectadas ?";
		}
	},
	Q20 {
		public String toString() {
			return "�Se tratan datos de clientes para realizar labores de gesti�n de morosidad o utilizando como referencia ficheros externos, tales como ASNEF o CIRBE?";
		}
	},
	Q21{
		public String toString() {
			return "�Se van a tratar datos relativos a la observaci�n sistem�tica a gran escala de zonas de acceso p�blico ?";
		}
	},
	Q22 {
		public String toString() {
			return "�El tratamiento implica que un elevado n�mero de personas (m�s all� de las necesarias para llevar a cabo el mismo) tenga acceso a los datos personales tratados? Por ejemplo, un departamento que no participe en el tratamiento.";
		}
	},
	Q23 {
		public String toString() {
			return "�Para llevar a cabo este tratamiento, �se combinan conjuntos de datos utilizados por otros responsables de tratamiento cuya finalidad diste en exceso de las expectativas del interesado ?";
		}
	},
	Q24 {
		public String toString() {
			return " �Se utilizan datos de car�cter personal anonimizados de forma no irreversible?";
		}
	},
	Q25 {
		public String toString() {
			return "�La base legal del tratamiento es el consentimiento?";
		}
	},
	Q26 {
		public String toString() {
			return "��Se prev� el uso de tecnolog�as que se pueden percibir como inmaduras, de reciente creaci�n o salida al mercado o con elevado riesgo para el acceso no autorizado ?";
		}
	},
	Q27 {
		public String toString() {
			return "�Se ha delegado alguna de las tareas que compone el tratamiento a un proveedor externo a la entidad? (en caso afirmativo detallar cuales)";
		}
	},
	Q28 {
		public String toString() {
			return "�Se realizan cesiones de datos a otras entidades, ya sean del mismo grupo o proveedores externos al mismo? (en caso afirmativo detallar cuales)";
		}
	},
	Q29 {
		public String toString() {
			return "�Se realizan transferencias internacionales de datos a pa�ses fuera de la Uni�n Europea y que no cuenten con medidas de protecci�n de datos de car�cter personal similares a las establecidas por la Autoridad de Control? (en caso afirmativo detallar cu�les)";
		}
	},
	Q30 {
		public String toString() {
			return "�Se considera, con independencia de las preguntas indicadas en este formulario, que es recomendable realizar un an�lisis de los posibles riesgos para los datos de car�cter personal a lo largo del ciclo de vida del tratamiento (recogida, almacenamiento/clasificaci�n, uso/tratamiento y destrucci�n)?";
		}
	},
	Q31 {
		public String toString() {
			return "�Tiene el tratamiento su base jur�dica en el derecho de la Uni�n Europea o de un Estado miembro y la EIPD ya se ha realizado en este contexto?";
		}
	},
	
	
}
