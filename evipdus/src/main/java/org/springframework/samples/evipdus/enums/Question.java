package org.springframework.samples.evipdus.enums;

public enum Question {


	Q1 {
		public String toString() {
			return "Tratamientos que impliquen perfilado o valoración de sujetos, incluida la recogida de datos del sujeto en múltiples ámbitos de su vida (desempeño en el trabajo, personalidad y comportamiento), que cubran varios aspectos de su personalidad o sobre sobre sus hábitos.";
		}
	},
	Q2 {
		public String toString() {
			return "Tratamientos que impliquen la toma de decisiones automatizadas o que contribuyan en gran medida a la toma de tales decisiones, incluyendo cualquier tipo de decisión que impida a un interesado el ejercicio de un derecho o el acceso a un bien o un servicio o formar parte de un contrato.";
		}
	},
	Q3 {
		public String toString() {
			return "Tratamientos que impliquen la observación, monitorización, supervisión, geolocalización o control del interesado de forma sistemática y exhaustiva, incluida la recogida de datos y metadatos a través de redes, aplicaciones o en zonas de acceso público, así como el procesamiento de identificadores únicos que permitan la identificación de usuarios de servicios de la sociedad de la información como pueden ser los servicios web, TV interactiva, aplicaciones móviles, etc.";
		}
	},
	Q4 {
		public String toString() {
			return "Tratamientos que impliquen el uso de categorías especiales de datos a las que se refiere el artículo 9.1 del RGPD, datos relativos a condenas o infracciones penales a los que se refiere el artículo 10 del RGPD o datos que permitan determinar la situación financiera o de solvencia patrimonial o deducir información sobre las personas relacionada con categorías especiales de datos.";
		}
	},
	Q5 {
		public String toString() {
			return "Tratamientos que impliquen el uso de datos biométricos con el propósito de identificar de manera única a una persona física.";
		}
	},
	Q6 {
		public String toString() {
			return "Tratamientos que impliquen el uso de datos genéticos para cualquier fin.";
		}
	},
	Q7 {
		public String toString() {
			return "Tratamientos que impliquen el uso de datos a gran escala. Para determinar si un tratamiento se puede considerar a gran escala se considerarán los criterios establecidos en la guía WP243 “Directrices sobre los delegados de protección de datos (DPD)” del Grupo de Trabajo del Artículo 29.";
		}
	},
	Q8 {
		public String toString() {
			return "Tratamientos que impliquen la asociación, combinación o enlace de registros de bases de datos de dos o más tratamientos con finalidades diferentes o por responsables distintos.";
		}
	},
	Q9{
		public String toString() {
			return "Tratamientos de datos de sujetos vulnerables o en riesgo de exclusión social, incluyendo datos de menores de 14 años, mayores con algún grado de discapacidad, discapacitados, personas que acceden a servicios sociales y víctimas de violencia de género, así como sus descendientes y personas que estén bajo su guardia y custodia.";
			}
	},
	Q10{
		public String toString() {
			return "Tratamientos que impliquen la utilización de nuevas tecnologías o un uso innovador de tecnologías consolidadas, incluyendo la utilización de tecnologías a una nueva escala, con un nuevo objetivo o combinadas con otras, de forma que suponga nuevas formas de recogida y utilización de datos con riesgo para los derechos y libertades de las personas.";
		}
	},
	Q11 {
		public String toString() {
			return "Tratamientos de datos que impidan a los interesados ejercer sus derechos, utilizar un servicio o ejecutar un contrato, como por ejemplo tratamientos en los que los datos han sido recopilados por un responsable distinto al que los va a tratar y aplica alguna de las excepciones sobre la información que debe proporcionarse a los interesados según el artículo 14.5 (b,c,d) del RGPD.";
		}
	},
	Q12 {
		public String toString() {
			return "¿Se van a tratar categorías especiales de datos?";
		}
	},
	Q13 {
		public String toString() {
			return "¿Se van a tratar categorías especiales de datos a gran escala?";
		}
	},
	Q14 {
		public String toString() {
			return " ¿El tratamiento involucra datos de menores de edad en materia de Protección de Datos (14 años según la LOPDGDD)?";
		}
	},
	Q15 {
		public String toString() {
			return "¿La finalidad del tratamiento implica el uso específico de datos de personas con discapacidad o cualquier otro colectivo en situación de especial vulnerabilidad?";
		}
	},
	Q16 {
		public String toString() {
			return "¿Con las operaciones de tratamiento, se pueden determinar hábitos, comportamientos, preferencias, gustos, intereses, etc. de personas identificadas o identificables?";
		}
	},
	Q17 {
		public String toString() {
			return "Los tratamientos evaluados se amparan en la adhesión a un código de conducta dentro de los límites fijados por el RGPD";
		}
	},
	Q18 {
		public String toString() {
			return "¿Se van a tratar datos personales para elaborar perfiles, categorizar/segmentar, hacer ratings/scoring o para la toma de decisiones?";
		}
	},
	Q19 {
		public String toString() {
			return "A partir del tratamiento de los datos, ¿se toman decisiones que pueden afectar significativamente o perjudicar de alguna manera a las personas afectadas ?";
		}
	},
	Q20 {
		public String toString() {
			return "¿Se tratan datos de clientes para realizar labores de gestión de morosidad o utilizando como referencia ficheros externos, tales como ASNEF o CIRBE?";
		}
	},
	Q21{
		public String toString() {
			return "¿Se van a tratar datos relativos a la observación sistemática a gran escala de zonas de acceso público ?";
		}
	},
	Q22 {
		public String toString() {
			return "¿El tratamiento implica que un elevado número de personas (más allá de las necesarias para llevar a cabo el mismo) tenga acceso a los datos personales tratados? Por ejemplo, un departamento que no participe en el tratamiento.";
		}
	},
	Q23 {
		public String toString() {
			return "¿Para llevar a cabo este tratamiento, ¿se combinan conjuntos de datos utilizados por otros responsables de tratamiento cuya finalidad diste en exceso de las expectativas del interesado ?";
		}
	},
	Q24 {
		public String toString() {
			return " ¿Se utilizan datos de carácter personal anonimizados de forma no irreversible?";
		}
	},
	Q25 {
		public String toString() {
			return "¿La base legal del tratamiento es el consentimiento?";
		}
	},
	Q26 {
		public String toString() {
			return "¿¿Se prevé el uso de tecnologías que se pueden percibir como inmaduras, de reciente creación o salida al mercado o con elevado riesgo para el acceso no autorizado ?";
		}
	},
	Q27 {
		public String toString() {
			return "¿Se ha delegado alguna de las tareas que compone el tratamiento a un proveedor externo a la entidad? (en caso afirmativo detallar cuales)";
		}
	},
	Q28 {
		public String toString() {
			return "¿Se realizan cesiones de datos a otras entidades, ya sean del mismo grupo o proveedores externos al mismo? (en caso afirmativo detallar cuales)";
		}
	},
	Q29 {
		public String toString() {
			return "¿Se realizan transferencias internacionales de datos a países fuera de la Unión Europea y que no cuenten con medidas de protección de datos de carácter personal similares a las establecidas por la Autoridad de Control? (en caso afirmativo detallar cuáles)";
		}
	},
	Q30 {
		public String toString() {
			return "¿Se considera, con independencia de las preguntas indicadas en este formulario, que es recomendable realizar un análisis de los posibles riesgos para los datos de carácter personal a lo largo del ciclo de vida del tratamiento (recogida, almacenamiento/clasificación, uso/tratamiento y destrucción)?";
		}
	},
	Q31 {
		public String toString() {
			return "¿Tiene el tratamiento su base jurídica en el derecho de la Unión Europea o de un Estado miembro y la EIPD ya se ha realizado en este contexto?";
		}
	},
	
	
}
