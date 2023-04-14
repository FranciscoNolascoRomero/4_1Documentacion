/**
 * Esta es una clase para probar a documentar, con esta clase podemos crear objetos empleado
 * donde se guardaran de cada uno de ellos el nombre, apellido, poblaciom, oficuio, salario y departamento
 * 
*/
package ies;
/**
 * @author Francisco Nolasco
 * @version 0.0
 * @since 1.0
 * @serial s
 */
public class Empleado {
	private int emp_no;
	private String nombre;
	private String apellido;
	private String pobla;
	private String oficio;
	private Double salario;
	private Departamento dept;

	/**
	 * Constructor que necesita saber todos los atributos para que se pueda crear el objeto
	 * /"@throws" NullException (es un ejemplo de como se pondria ya que en nuestro caso no tenemos excepciones)
	 */
	public Empleado(int emp_no, String nombre, String apellido, String pobla, String oficio,
			Double salario, Departamento dept) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pobla = pobla;
		this.oficio = oficio;
		this.salario = salario;
		this.dept = dept;
	}
	/**
	 * Constructor que necesita saber el emp_no, nombre , salario y departamento para que se 
	 * pueda crear el objeto
	 */
	public Empleado(int emp_no, String nombre, Double salario, Departamento dept) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.salario = salario;
		this.dept = dept;
	}
	/**
	 * Metodo con el cual podemos ver el atributo emp_no
	 * @return retorna  un int que es el valor del atributo emp_no
	 * */ 
	public int getEmp_no() {
		return emp_no;
	}
	/**
	 * Metodo con el cual podemos cambiar el valor de emp_no
	 * @param Se le pasa el parametro emp_no que se lo pasara el usuario
	 * @deprecated Esta clase puede que desaparezca en versiones posteriores ya que emp_no es como una clave(es un ejemplo)
	 * 
	 * */ 
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
 	/** Metodo con el cual podemos ver el nombre
	 * @return retorna  un String que es el atributo nombre
	 * */ 
	public String getNombre() {
		return nombre;
	}
	/**
	 * Metodo con el cual podemos cambiar el nombre
	 * @param se le pasa como parametro el nombre que se lo pasara el usuario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Metodo que devuelve la poblacion
	 * @return retorna un string que sera la poblacion
	 */
	public String getPobla() {
		return pobla;
	}

	public void setPobla(String pobla) {
		this.pobla = pobla;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	/**
	 * Metodo que nos devuelve un objeto departamento
	 * @return nos devuelve el departamento
	 */
	public Departamento getDept() {
		return dept;
	}
	/**
	 * Metodo con el cual cambiamos el departamento 
	 * @param se le pasa como parametro el departamento
	 */
	public void setDept(Departamento dept) {
		this.dept = dept;
	}
	/**
	 * Metodo que calcula la subida del salario
	 * @param se le pasa como parametro la subida
	 * @"see" setDept(Es un ejemplo, lo que hace es asociar este metodo
	 *  con el metodo que le pasamos osea ser consetDept)
	 */
	public void subidasalario(Double subida) {
		salario = salario + subida;
	}
	
	/**
	 * Metodo con el cual comprobamos si el nombre esta vacio o no
	 * @return retorna un boolean
	 */
	private boolean comprobar(){
		if (nombre.equals("")){
			
			return false;
		}
		return true;
	}
}